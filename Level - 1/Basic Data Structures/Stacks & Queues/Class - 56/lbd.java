import java.util.Arrays;

public class lbd {

    public static void main(String... args) {

        int[][] arr = { { 1, 3 }, { 6, 10 }, { -3, 13 }, { 5, 20 } };

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        for (int[] d : arr) {

            System.out.println(d[0] + " " + d[1]);
        }
    }
}