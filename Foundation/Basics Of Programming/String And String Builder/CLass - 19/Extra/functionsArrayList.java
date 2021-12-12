package Extra;

import java.util.Scanner;
import java.util.ArrayList;

public class functionsArrayList {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // Creation
        ArrayList<Integer> list = new ArrayList<>();

        // add value
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // get value
        int val = list.get(2);
        System.out.println(val);

        // delete
        int lastEle = list.remove(list.size() - 1);
        System.out.println(lastEle);

        // set
        list.set(1, 100);
        System.out.println(list);

        // display elements
        for (int ele : list)
            System.out.println(ele);

        System.out.println("-----------------");

        // display arraylist
        System.out.println(list);

        scn.close();
    }
}
