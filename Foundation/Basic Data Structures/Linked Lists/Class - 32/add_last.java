import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class add_last {

    public static class Node {

        int data;
        Node next;
    }

    public static class LinkedList {

        Node head;
        Node tail;
        int size;

        public void addLast(int val) {

            Node node = new Node();
            node.data = val;

            if (size == 0) {

                node.next = null;
                head = tail = node;
            }

            else {

                tail.next = node;
                node.next = null;
                tail = node;
            }

            size++;
        }
    }

    public static void testList(LinkedList list) {

        for (Node temp = list.head; temp != null; temp = temp.next) {

            System.out.println(temp.data);
        }

        System.out.println(list.size);

        if (list.size > 0)
            System.out.println(list.tail.data);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList list = new LinkedList();

        String str = br.readLine();

        while (!str.equals("quit")) {

            if (str.startsWith("addLast")) {

                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }

            str = br.readLine();
        }

        testList(list);
        br.close();
    }
}