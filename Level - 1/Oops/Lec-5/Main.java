public class Main {

    public static class Phone {


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
            display();
            System.out.println("-----------------------");
        }

        public void display() {

            StringBuilder sb = new StringBuilder();
            sb.append("Brand : " + brand + "\n");
            sb.append("Model : " + model + "\n");
            sb.append("Ram : " + ram);

            System.out.println(sb);
            System.out.println("----------------------");
        }

        //Current class methods
        public void display2() {

            this.brand();
            this.model();
            this.ram();

        }

        public void brand() {

            System.out.println("Brand: " + this.brand);
        }

        public void model() {

            System.out.println("Model: " + this.model);
        }

        public void ram() {

            System.out.println("Ram : " + this.ram + "GB");
        }
    }

    public static void test1() {

        Phone p1 = new Phone("Samsung", "Galaxy Z Fold2 5G Mystic Bronze", 12);
        System.out.println(p1);

        Phone p2 = new Phone("Samsung", "Galaxy Z Fold2 5G Mystic Bronze", 24);
        System.out.println(p2);

        p1.display2();
        p2.display2();
    }

    public static void main(String... args) {

        test1();
    }
}