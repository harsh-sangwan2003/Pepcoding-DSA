import java.io.BufferedReader;
import java.io.InputStreamReader;

public class remove_last {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            // write your code here

            if (size == 0) {
                System.out.println("List is empty");
                return;
            }

            else if (size == 0) {
                head = tail = null;
            }

            else {

                head = head.next;
            }

            size--;
        }

        public int getFirst() {
            // write your code here

            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            return head.data;
        }

        public int getLast() {
            // write your code here

            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            return tail.data;
        }

        public int getAt(int idx) {
            // write your code here

            if (idx < 0 || idx >= size) {

                System.out.println("Invalid arguments");
                return -1;
            }

            else if (idx == 0)
                return getFirst();

            else if (idx == size - 1)
                return getLast();

            Node temp = head;

            for (int i = 0; i < idx; i++)
                temp = temp.next;

            return temp.data;
        }

        public void addFirst(int val) {
            // write your code here

            Node node = new Node();
            node.data = val;

            if (size == 0) {

                head = tail = node;
            }

            else {

                node.next = head;
                head = node;
            }

            size++;
        }

        public void removeLast() {
            // write your code here

            if (size == 0) {

                System.out.println("Invalid arguments");
                return;
            }

            else if (size == 1) {

                head = tail = null;
            }

            else {

                Node temp = head;

                for (int i = 0; i < size - 2; i++)
                    temp = temp.next;

                temp.next = null;
                tail = temp;
            }

            size--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            }
            str = br.readLine();
        }
    }
}