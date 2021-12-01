import java.util.Scanner;

public class sumOfTwoArrays {
    

    public static void sumArray(int[] a, int[] b){

        int i = a.length-1;
        int j = b.length-1;
        int[] sum = new int[i>j?i+1:j+1];
        int k = sum.length-1;
        int carry = 0;

        while(k>=0){

            int d1 = i>=0?a[i]:0;
            int d2 = j>=0?b[j]:0;

            int d = carry + d1 + d2;
            carry = d/10;
            d = d%10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if(carry!=0)
        System.out.println(carry);

        for(int x=0; x<sum.length; x++)
        System.out.println(sum[x]);

    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[] a = new int[n1];
        for(int i=0; i<n1; i++){

            a[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();

        int[] b = new int[n2];
        for(int i=0; i<n2; i++)
        {

            b[i] = scn.nextInt();
        }

        sumArray(a,b);
        
        scn.close();
    }
}
