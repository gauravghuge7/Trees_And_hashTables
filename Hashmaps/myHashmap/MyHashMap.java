import java.util.LinkedList;

class MyHashMap<K, V> {

    class Node {
        K key;
        V value;
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }


    private final int DEFAULT_CAPACITY = 10;
    private final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int size;
    private LinkedList<Node>[] buckets;

    /**
     * 
     *  Private and Internal Functions 
     */

    private void initBuckets(int n) {

        buckets = new LinkedList[n];

        for(int i=0; i<n; i++) {
            buckets[i] = new LinkedList<Node>();
        }

    }

    public MyHashMap() {
        initBuckets(DEFAULT_CAPACITY);
    }

    private int HashFunc(K key) {

        int num = key.hashCode();

        return Math.abs(num % buckets.length);
    }

    private int searchInBucket(LinkedList<Node> list, K key) {

        for(int i=0; i<list.size(); i++) {
            if(key.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }   

    private void rehash() {
        LinkedList<Node>[]  oldBuckets = buckets;

        initBuckets(buckets.length * 2);
        size = 0;

        for(var buckets1 : buckets) {
            for(Node node : buckets1) {
                put(node.key,node.value);
            }
        }
    }

    /**
     * 
     *  Public and Basic Methods of the HashMaps 
     */


    public int capacity() {
        return DEFAULT_CAPACITY;
    }
    
    public int size() {
        return this.size;
    }


    public void put(K key, V value) {
        int current_hashcode = HashFunc(key);
        LinkedList<Node> list = buckets[current_hashcode];

        int currentIndex = searchInBucket(list, key);

        if(currentIndex == -1) {
            Node temp = new Node(key, value);
            list.add(temp);
            size++;
        } 
        else {
            Node currNode = list.get(currentIndex);
            currNode.value = value;
        }

        if(size >= (buckets.length % DEFAULT_LOAD_FACTOR)) {
            rehash();
        }
    }

    public V get(K key) {
        int currentIndex = HashFunc(key);
        LinkedList<Node> current_list = buckets[currentIndex];
        int index = searchInBucket(null, key);

        if(index != -1) {
            return current_list.get(index).value;
        }

        return null;
    }

    public V remove(K key) {
        int index = HashFunc(key);
        LinkedList<Node> currBucket = buckets[index];
        int ei = searchInBucket(currBucket, key);
        if(ei != -1) {
            // key exists in the list
            V value = currBucket.get(ei).value;
            currBucket.remove(ei);
            size--;
            return value;
        }
        return null;
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        System.out.println("Starting the hashmap");

        map.put("gaurav", 12);
        map.put("vaibhav", 11);
//        map.put("nilesh", 14);
//        map.put("nikhil", 18);

        System.out.println(map.size());


        System.out.println(map.get("gaurav"));

        map.remove("gaurav");
        System.out.println(map.size());

        System.out.println(map.get(("gaurav")));


        int a = 5;


    }

}


