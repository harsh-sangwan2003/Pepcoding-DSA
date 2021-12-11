public class testingSb {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        int st = (int) System.currentTimeMillis();

        for (int i = 1; i <= 10000000; i++)
            str.append(i);

        int en = (int) System.currentTimeMillis();
        int diff = en - st;

        // System.out.println(str);
        System.out.println(diff);
    }
}