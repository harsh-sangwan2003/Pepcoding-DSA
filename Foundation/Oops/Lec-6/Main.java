public class Main {

    public static class Sum {

        Sum() {

            this(0, 0);
        }

        Sum(int a, int b) {

            this(a, b, 0);
        }

        Sum(int a, int b, int c) {

            this(a, b, c, 0);
        }

        Sum(int a, int b, int c, int d) {

            System.out.println("Your addition result is: " + (a + b + c + d));
            System.out.println("-------------------------------------");
        }

    }

    public static void main(String[] args) {

        Sum s1 = new Sum();
        Sum s2 = new Sum(10, 20);
        Sum s3 = new Sum(10, 20, 30);
        Sum s4 = new Sum(10, 20, 30, 40);
    }
}