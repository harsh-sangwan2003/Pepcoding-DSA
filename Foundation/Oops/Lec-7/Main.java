public class Main {

    public static class Sum {

        Sum() {

            this(0, 0);
        }

        Sum(Rectangle r) {

            r.printDimension();
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

        public Sum returnYourself() {

            System.out.println(this);
            return this;
        }

        public int perimeter(Rectangle r) {

            int res = r.h * r.w;

            return res;
        }

        public int area(Rectangle r) {

            int res = r.h * r.w;

            return res;
        }

        public void rectangleInfo(Rectangle r) {

            System.out.println(perimeter(r));
            System.out.println(area(r));
            r.printDimension();
        }

    }

    public static class Rectangle {

        private int x = 0, y = 0, h = 0, w = 0;

        Rectangle() {

            this(1, 1);
        }

        Rectangle(int h, int w) {

            this(0, 0, h, w);
        }

        Rectangle(int x, int y, int h, int w) {

            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;

            // Passing this as an argument in constructor call
            Sum s = new Sum(this);
            System.out.println(s);
            Sum s2 = s.returnYourself();
            System.out.println(s2);
            // Passing this as an argument in the method call
            // Sum s = new Sum();
            // s.rectangleInfo(this);
        }

        public void printDimension() {

            System.out.println("Origin is : " + "(" + this.x + "," + this.y + ")");
            System.out.println("Size of rectangle is: " + this.h + "X" + this.w);

            System.out.println("-------------------------------------");
        }

    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        // Rectangle r2 = new Rectangle(2, 4);
        // Rectangle r3 = new Rectangle(1, 3, 7, 8);
    }
}
