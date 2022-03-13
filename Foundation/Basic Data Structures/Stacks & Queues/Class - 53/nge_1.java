import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class nge_1 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);

        br.close();
    }

    public static int[] solve(int[] arr) {
        // solve
        int[] nge = new int[arr.length];
        Arrays.fill(nge, -1);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break;
                }
            }
        }

        return nge;
    }

}