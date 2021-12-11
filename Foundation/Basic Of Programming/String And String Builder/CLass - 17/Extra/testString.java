public class testString {

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        if (a == b) {

            System.out.println("a & b are equal");
        }

        else {

            System.out.println("a & b are not equal");
        }

        if (a == c) {

            System.out.println("a & c are equal");
        }

        else {

            System.out.println("a & c are not equal");
        }
    }
}
