import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap_Implementation {


    private static class MyHashMap<K, V> {

        private static final int DEFAULT_CAPACITY = 4;
        private static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;


        private void initBuckets(int N) {

            buckets = new LinkedList[N];

            for(int i=0; i<N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            /**
             * return the entries of the map
             */

            return n;
        }


        private int HashFunc(K key) {

            int b_index = key.hashCode();
            return Math.abs(b_index) % buckets.length;
        }


        private int searchInBucket(LinkedList<Node> ll, K key) {

            for(int i=0; i<ll.size(); i++) {
                 if(key.equals(ll.get(i).key)) {
                     return i;
                 }
            }
            return -1;
        }
        
        private void reHash() {
            LinkedList<Node>[] oldBuckets = buckets;

            initBuckets(buckets.length * 2);

            n = 0;
            for( var bucket : oldBuckets) {

                for(var node : bucket) {
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value) {

            int BI = HashFunc(key);

            LinkedList<Node> currBucket = buckets[BI];

            int ei = searchInBucket(currBucket, key);

            if(ei == -1) {
                Node temp = new Node(key, value);

                currBucket.add(temp);
                n++;
            }
            else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if(n >= DEFAULT_LOAD_FACTOR * buckets.length) {
                reHash();
            }
        }

        public V get(K key) {
            int index = HashFunc(key);
            LinkedList<Node> currBucket = buckets[index];
            int temp = searchInBucket(currBucket, key);
            if(temp != -1) {
                return currBucket.get(temp).value;
            }
            return  null;
        }

        public V remove(K key) {
            int index = HashFunc(key);
            LinkedList<Node> currBucket = buckets[index];
            int ei = searchInBucket(currBucket, key);
            if(ei != -1) {
                // key exists in the list
                V value = currBucket.get(ei).value;
                currBucket.remove(ei);
                n--;
                return value;
            }
            return null;
        }

        public int capacity() {
            return buckets.length;
        }

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
