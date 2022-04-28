package Extra;

public class time {

    public static void main(String[] args) {

        int n = 100000;
        long start = System.currentTimeMillis();
        // 3157
        // String s = "";

        // 8
        StringBuilder s = new StringBuilder("");

        for (int i = 0; i < n; i++)
            s.append(i);

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
        // System.out.println(s);
    }
}
