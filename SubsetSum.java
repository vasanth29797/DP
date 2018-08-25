import java.util.*;

class SubsetSum {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4};
		int sum = -1;
		int n = arr.length;

		if (n == 0) {
			System.out.println(false);
			return;
		}

		if (sum < 0) {
			System.out.println(false);
			return;
		}

		boolean[][] dp = new boolean[n][sum + 1];

		for (int i = 0; i < n; i++) {
			dp[i][0] = true;
		}

		if (arr[0] <= sum) {
			dp[0][arr[0]] = true;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= sum; j++) {
				if (arr[i] <= sum) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
 			}
		}

		System.out.println(dp[n - 1][sum]);
	}
}