import java.util.HashSet;

/*add, remove, get, size, find, update */

public class hashSet_demo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);

        // remove
        set.remove(30);
        System.out.println(set);

        // size
        System.out.println(set.size());

        // find
        boolean is_20 = set.contains(20);
        boolean is_100 = set.contains(100);
        System.out.println(is_20);
        System.out.println(is_100);
    }
}