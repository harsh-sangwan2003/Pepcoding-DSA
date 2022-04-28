import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.ArrayList;

public class create_hashmap {

    public static class HashMap<K, V> {
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        private int findBucketIdx(K key) {

            int hc = key.hashCode();
            int bi = Math.abs(hc) % buckets.length;

            return bi;
        }

        private int findDataInBucket(K key, int bi) {

            for (int i = 0; i < buckets[bi].size(); i++) {

                if (buckets[bi].get(i).key.equals(key))
                    return i;
            }

            return -1;
        }

        private void rehash() throws Exception {

            LinkedList<HMNode>[] prev = buckets;
            initbuckets(2 * prev.length);
            size = 0;

            for (int i = 0; i < prev.length; i++) {

                for (int j = 0; j < prev[i].size(); j++) {

                    HMNode curr = prev[i].get(j);
                    put(curr.key, curr.value);
                }
            }
        }

        public void put(K key, V value) throws Exception {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataInBucket(key, bi);

            if (di == -1) {

                LinkedList<HMNode> list = buckets[bi];
                HMNode node = new HMNode(key, value);

                list.add(node);
                size++;
            }

            else {

                LinkedList<HMNode> list = buckets[bi];
                HMNode node = list.get(di);
                node.value = value;
            }

            double lambda = (size * 1.0) / buckets.length;

            if (lambda > 2)
                rehash();

        }

        public V get(K key) throws Exception {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataInBucket(key, bi);

            if (di == -1)
                return null;

            else
                return buckets[bi].get(di).value;

        }

        public boolean containsKey(K key) {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataInBucket(key, bi);

            if (di == -1)
                return false;

            return true;
        }

        public V remove(K key) throws Exception {
            // write your code here

            int bi = findBucketIdx(key);
            int di = findDataInBucket(key, bi);

            if (di == -1)
                return null;

            else {

                HMNode node = buckets[bi].get(di);
                buckets[bi].remove(di);
                size--;
                return node.value;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            // write your code here
            ArrayList<K> list = new ArrayList<K>();

            for (int bi = 0; bi < buckets.length; bi++) {

                for (int i = 0; i < buckets[bi].size(); i++) {

                    list.add(buckets[bi].get(i).key);
                }
            }

            return list;
        }

        public int size() {
            // write your code here
            return this.size;
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}