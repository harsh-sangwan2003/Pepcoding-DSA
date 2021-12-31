package Extra;

import java.util.ArrayList;

public class arrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        list.add(10);
        System.out.println(list + " -> " + list.size());

        list.add(20);
        System.out.println(list + " -> " + list.size());

        list.add(30);
        System.out.println(list + " -> " + list.size());

        list.add(1, 1000);
        System.out.println(list + " -> " + list.size());

        int val = list.get(2);
        System.out.println(val);

        list.set(1, 4000);
        System.out.println(list + " -> " + list.size());

        list.remove(1);
        System.out.println(list + " -> " + list.size());
    }
}
