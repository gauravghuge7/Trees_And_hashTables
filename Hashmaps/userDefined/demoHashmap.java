package userDefined;

import java.util.LinkedList;

public class demoHashmap {



    static class MyHashMap<K, V> {

        public static final int DEFAULT_CAPACITY = 4;

        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private int n=0;


        private class Node {
            K key;
            V val;

            Node(K key, V val) {

                this.val = val;
                this.key = key;
            }
        }

        public LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];

            for(int i=0; i<buckets.length; i++) {
                buckets[i] = new LinkedList<>();

            }

        }

        private int HashFunc(K key) {
            int hc = key.hashCode();

            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> LL, K key) {

            for(int i=0; i<LL.size(); i++) {
                if(LL.get(i).key == key) {
                    return 0;
                }
            }

            return -1;
        }


        private void put(K key, V val) {
            int bi = HashFunc(key);

            LinkedList<Node> currBucket = buckets[bi];

            int ei = searchInBucket(currBucket, key);


            if(ei != -1) {
                Node node = new Node(key, val);

                currBucket.add(node);

                n++;


            }
            else {

            
            
                Node currNode = currBucket.get(ei); 
        
            }
        }




        public V get(K key) {
            int bi = HashFunc(key);

            LinkedList<Node> currBucket = buckets[bi];

            int ei = searchInBucket(currBucket, key);

            if(ei != -1) {
                Node currNode = currBucket.get(ei);

                return currNode.val;
            }

            return null;
        }



        


    }








    public static void main(String[] args) {
        
        MyHashMap<Integer, String> hash = new MyHashMap<>();

        hash.put(10, "gaurav");
        hash.put(11, "vaibhav");
        hash.put(12, "nilesh");

        System.out.println(hash.get(12));

        
    }
}
