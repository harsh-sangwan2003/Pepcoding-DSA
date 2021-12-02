import java.util.Scanner;

public class diffOfArray {

    public static void subArray(int[] a1, int[] a2) {

        int i = a1.length - 1;
        int j = a2.length - 1;
        int[] ans = new int[j+1];
        int borrow = 0;

        int k = ans.length - 1;

        while (j >= 0) {

            int d1 = i >= 0 ? a1[i] : 0;
            int d2 = a2[j];
            int d = 0;

            if (borrow + d2 - d1 >= 0) {
                d = borrow + d2 - d1;
                borrow = 0;
            }

            else {

                d = borrow + 10 + d2 - d1;
                borrow = -1;
            }

            ans[k] = d;
            i--;
            j--;
            k--;
        }

        
        int idx = 0;

        while(idx<ans.length){

            if(ans[idx]!=0)
            break;

            idx++;
        }
        
        if(idx==ans.length)
        System.out.println(0);
        
        while(idx<ans.length){

            System.out.println(ans[idx]);
            idx++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++)
            a1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < a2.length; i++)
            a2[i] = scn.nextInt();
        subArray(a1, a2);
        scn.close();
    }
}
