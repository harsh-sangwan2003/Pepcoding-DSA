public class Main {

    public static class Phone {

        String companyName;
        String model;
        String color;
        int ram;
        int storage;
        int batteryPower;

        public String getInfo() {

            StringBuilder sb = new StringBuilder();
            sb.append("Company Name : " + this.companyName + "\n");
            sb.append("Model : " + this.model + "\n");
            sb.append("Color : " + this.color + "\n");
            sb.append("Ram : " + this.ram + "\n");
            sb.append("Storage : " + this.storage + "\n");
            sb.append("Battery Power : " + this.batteryPower + "\n");

            return sb.toString();
        }

        Phone() {

        }

        Phone(String companyName, String model, String color, int ram, int storage, int batteryPower) {

            this.companyName = companyName;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage = storage;
            this.batteryPower = batteryPower;
        }

    }

    public static void test1() {

        Phone p1 = new Phone();
        p1.companyName = "One Plus";
        p1.model = "9R 5G";
        p1.color = "Lake blue";
        p1.ram = 8;
        p1.storage = 128;
        p1.batteryPower = 4500;

        Phone p2 = new Phone();
        p2.companyName = "One Plus";
        p2.model = "9R 5G";
        p2.color = "Lake blue";
        p2.ram = 12;
        p2.storage = 256;
        p2.batteryPower = 4500;

        Phone p3 = new Phone();
        p3.companyName = "One Plus";
        p3.model = "9Pro 5G";
        p3.color = "Pine Green";
        p3.ram = 12;
        p3.storage = 256;
        p3.batteryPower = 4500;

        Phone p4 = new Phone("One Plus", "9Pro 5G", "Pine Green", 12, 256, 4500);
        // p4.companyName = "One Plus";
        // p4.model = "9Pro 5G";
        // p4.color = "Pine Green";
        // p4.ram = 12;
        // p4.storage = 256;
        // p4.batteryPower = 4500;

        System.out.println(p1);
        System.out.println(p1.getInfo());
        System.out.println("---------------------");

        System.out.println(p2);
        System.out.println(p2.getInfo());
        System.out.println("----------------------");

        System.out.println(p3);
        System.out.println(p3.getInfo());
        System.out.println("-----------------------");

        System.out.println(p4);
        System.out.println(p4.getInfo());
    }

    public static void main(String[] args) {

        test1();

    }
}