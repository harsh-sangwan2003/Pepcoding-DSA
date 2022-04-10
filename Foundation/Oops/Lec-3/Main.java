public class Main {

    public static class RectangularPair {

        int h, w, l;

        // Constructor Overloading
        public RectangularPair() {

            this.h = 0;
            this.w = 0;
            this.l = 0;
        }

        public RectangularPair(int h) {

            this.h = this.w = this.l = h;
        }

        public RectangularPair(int h, int w, int l) {

            this.h = h;
            this.w = w;
            this.l = l;
        }

        public int volume() {

            return h * w * l;
        }

        public int surfaceArea() {

            return 2 * (h * w + w * l + h * l);
        }

        public void print() {

            System.out.println("Volume is: " + volume());
            System.out.println("Surface Area is: " + surfaceArea());

            System.out.println("--------------------");
        }
    }

    public static void test1() {

        RectangularPair rp1 = new RectangularPair();
        RectangularPair rp2 = new RectangularPair(10);
        RectangularPair rp3 = new RectangularPair(10, 5, 12);

        rp1.print();
        rp2.print();
        rp3.print();
    }

    public static void main(String[] args) {

        test1();
    }
}