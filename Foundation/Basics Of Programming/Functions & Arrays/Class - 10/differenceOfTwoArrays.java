import java.util.Scanner;

public class differenceOfTwoArrays {

    public static void differenceOfArrays(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;
        int k = b.length - 1;
        int[] dif = new int[k + 1];
        int borrow = 0;

        while (k >= 0) {

            int d1 = i >= 0 ? a[i] : 0;
            int d2 = b[j];
            int d = 0;

            if (d2 + borrow >= d1) {

                d = d2 + borrow - d1;
                borrow = 0;
            }

            else {

                d = d2 + 10 + borrow - d1;
                borrow = -1;
            }

            dif[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < dif.length) {

            if (dif[idx] != 0)
                break;

            idx++;
        }

        while (idx < dif.length) {

            System.out.println(dif[idx]);

            idx++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[] a = new int[n1];
        for (int i = 0; i < a.length; i++)
            a[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < b.length; i++)
            b[i] = scn.nextInt();

        differenceOfArrays(a, b);
        scn.close();
    }
}