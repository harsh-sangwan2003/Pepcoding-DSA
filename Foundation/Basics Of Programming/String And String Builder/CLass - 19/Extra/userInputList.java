package Extra;

import java.util.Scanner;
import java.util.ArrayList;

public class userInputList {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            list.add(scn.nextInt());

        System.out.println(list);

        scn.close();
    }
}
