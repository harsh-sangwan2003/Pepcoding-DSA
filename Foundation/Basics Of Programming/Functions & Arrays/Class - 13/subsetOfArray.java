import java.util.Scanner; 

public class subsetOfArray{

    public static void printSubset(int[] arr){

        int len = arr.length;

        for(int i=0; i<(Math.pow(2,len)); i++){

            int temp = i;
            String str = "";

            for(int j=arr.length-1; j>=0; j--){

                int ld = temp%2;
                temp/=2;

                if(ld==0)
                str = "-\t" + str;

                else 
                str = arr[j] + "\t" + str;
            }

            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        arr[i] = scn.nextInt();

        printSubset(arr);

        scn.close();
    }
}