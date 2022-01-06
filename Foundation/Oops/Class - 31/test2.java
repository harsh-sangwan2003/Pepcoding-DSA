public class test2 {

    int x = 10;

    void fn() {

        System.out.println("fn said hi");
    }

    public static void main(String[] args) {

        test2 m = new test2();
        m.fn();
        System.out.println(m.x);
    }

}