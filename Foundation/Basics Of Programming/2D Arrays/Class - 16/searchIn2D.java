import java.util.Scanner;

public class searchIn2D {

    public static void search(int[][] arr, int target) {

        int r = 0;
        int c = arr[0].length - 1;

        while (true) {

            if (arr[r][c] == target) {

                System.out.println(r);
                System.out.println(c);
                return;
            }

            else if (arr[r][c] > target) {

                c -= 1;
            }

            else {

                r += 1;
            }

            if (r < 0 || c < 0 || r == arr.length || c == arr.length)
                break;
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();
        search(arr, target);
        scn.close();
    }
}