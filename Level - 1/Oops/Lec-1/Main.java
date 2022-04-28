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

    }

    public static void test1() {

        //Object - 1
        Phone p1 = new Phone();
        p1.companyName = "One Plus";
        p1.model = "9R 5G";
        p1.color = "Lake blue";
        p1.ram = 8;
        p1.storage = 128;
        p1.batteryPower = 4500;

        //Object - 2
        Phone p2 = new Phone();
        p2.companyName = "One Plus";
        p2.model = "9R 5G";
        p2.color = "Lake blue";
        p2.ram = 12;
        p2.storage = 256;
        p2.batteryPower = 4500;

        //Object - 3
        Phone p3 = new Phone();
        p3.companyName = "One Plus";
        p3.model = "9Pro 5G";
        p3.color = "Pine Green";
        p3.ram = 12;
        p3.storage = 256;
        p3.batteryPower = 4500;

        System.out.println(p1);
        System.out.println(p1.getInfo());
        System.out.println("---------------------");

        System.out.println(p2);
        System.out.println(p2.getInfo());
        System.out.println("----------------------");

        System.out.println(p3);
        System.out.println(p3.getInfo());
    }

    public static void main(String[] args) {

        test1();

    }
}