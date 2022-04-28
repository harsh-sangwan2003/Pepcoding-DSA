public class autoboxing_wrapperClass {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Integer[] brr = new Integer[5];

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();

        for (Integer val : brr)
            System.out.print(val + " ");

        // Integer i = new Integer(8);

        System.out.println();

        // System.out.println(i);

    }
}