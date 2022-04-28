package Extra;

public class stringInterning {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        if (s1 == s2) {

            System.out.println("s1 & s2 are equal");
        }

        else {
            System.out.println("s1 & s2 are not equal");
        }

        if (s1 == s3) {

            System.out.println("s1 & s3 are equal");
        }

        else {
            System.out.println("s1 & s3 are not equal");
        }
    }
}
