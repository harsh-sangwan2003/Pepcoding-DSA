class Main {

    int x = 10;

    void fn() {

        System.out.println("fn said hi");
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.fn();
        System.out.println(m.x);
    }

}