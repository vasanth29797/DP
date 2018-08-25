import java.util.*;

class CoinChange {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int n = arr.length;
		int amount = 0;

		int[] dp = new int[amount + 1];
		Arrays.fill(dp, 0);

		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= amount; j++) {
				if (j >= arr[i]) {
					dp[j] += dp[j - arr[i]];
				}
			}
		}

		System.out.println(dp[amount]);
	}
}