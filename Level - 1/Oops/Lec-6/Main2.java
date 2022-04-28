import org.w3c.dom.css.Rect;

public class Main2 {

    public static class Rectangle {

        private int x = 0, y = 0, h = 0, w = 0;

        Rectangle() {

            this(1, 1);
        }

        Rectangle(int h, int w) {

            this(0, 0, h, w);
        }

        Rectangle(int x, int y, int h, int w) {

            System.out.println("Origin is : " + "(" + this.x + "," + this.y + ")");
            System.out.println("Size of rectangle is: " + this.h + "X" + this.w);

            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 4);
        Rectangle r3 = new Rectangle(1, 3, 7, 8);
    }
}
