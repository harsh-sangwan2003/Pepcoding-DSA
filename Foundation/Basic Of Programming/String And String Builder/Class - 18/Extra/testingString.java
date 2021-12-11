public class testingString {

    public static void main(String[] args) {

        String str = "";
        int st = (int) System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++)
            str += i;

        int en = (int) System.currentTimeMillis();
        int diff = en - st;

        // System.out.println(str);
        System.out.println(diff);
    }
}