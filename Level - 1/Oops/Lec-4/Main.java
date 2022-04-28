public class Main {

    public static class Phone {

        // Current class instance variables
        String brand = "null";
        String model = "null";
        int ram = 0;

        public Phone() {

        }

        public Phone(String brand, String model, int ram) {

            this.brand = brand;
            this.model = model;
            this.ram = ram;

            System.out.println(this);
        }

        public void display() {

            StringBuilder sb = new StringBuilder();
            sb.append("Brand : " + brand + "\n");
            sb.append("Model : " + model + "\n");
            sb.append("Ram : " + ram);

            System.out.println(sb);
            System.out.println("----------------------");
        }
    }

    public static void test1() {

        Phone p1 = new Phone("Samsung", "Galaxy Z Fold2 5G Mystic Bronze", 12);
        System.out.println(p1);

        Phone p2 = new Phone("Samsung", "Galaxy Z Fold2 5G Mystic Bronze", 24);
        System.out.println(p2);

        p1.display();
        p2.display();
    }

    public static void main(String... args) {

        test1();
    }
}