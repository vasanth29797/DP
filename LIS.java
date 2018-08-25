import java.util.*;

class LIS {
	public static void main(String[] args) {
		int[] arr = {0};
		int n = arr.length;

		if (arr.length == 0) {
			System.out.println(0);
			return;
		}

		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		int max = 0;

		for (int i = 0; i < n; i++) {
			if (max < dp[i])
				max = dp[i];
		}

		System.out.println(max);
	}
}