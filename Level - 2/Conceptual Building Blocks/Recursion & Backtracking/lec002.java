public class lec002 {

    // Every coin is given chance at every level
    public static int coinChangePermutationsInf(int[] coins, int tar, String asf) {

        if (tar == 0) {
            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int i = 0; i < coins.length; i++) {

            if (tar - coins[i] >= 0)
                count += coinChangePermutationsInf(coins, tar - coins[i], asf + coins[i]);
        }

        return count;

    }

    // Coins at idx & >idx are selected at every recusion level
    public static int coinChangeCombinationsInf(int[] coins, int idx, int tar, String asf) {

        if (tar == 0) {

            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int i = idx; i < coins.length; i++) {

            if (tar - coins[i] >= 0)
                count += coinChangeCombinationsInf(coins, i, tar - coins[i], asf + coins[i]);
        }

        return count;
    }

    public static int coinChangePermutationsSingle(int[] coins, int tar, String asf) {

        if (tar == 0) {

            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int i = 0; i < coins.length; i++) {

            if (coins[i] > 0 && tar - coins[i] >= 0) {

                coins[i] *= -1;
                count += coinChangePermutationsSingle(coins, tar - coins[i] * -1, asf + coins[i] * -1);
                coins[i] *= -1;
            }
        }

        return count;
    }

    public static int coinChangeCombinationsSingle(int[] coins, int idx, int tar, String asf) {

        if (tar == 0) {

            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int i = idx; i < coins.length; i++) {

            if (tar - coins[i] >= 0)
                count += coinChangeCombinationsSingle(coins, idx + 1, tar - coins[i], asf + coins[i]);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] coins = { 2, 3, 5, 7 };
        int tar = 10;

        int res = coinChangeCombinationsSingle(coins, 0, tar, "");
        System.out.println("Count is -> " + res);
    }
}