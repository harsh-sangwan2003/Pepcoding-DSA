import java.util.Scanner;

public class arrange_buildings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long oldBCount = 1;
        long oldSCount = 1;

        for (int i = 2; i <= n; i++) {

            long newBCount = oldSCount;
            long newSCount = oldBCount + oldSCount;

            oldBCount = newBCount;
            oldSCount = newSCount;
        }

        long ans = oldBCount + oldSCount;
        ans = ans * ans;

        System.out.println(ans);

        scn.close();
    }

}