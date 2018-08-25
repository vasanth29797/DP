import java.util.*;

class LCS {
	public static void main(String[] args) {
		String a = "abab", b = "abeab";
		int m = a.length(), n = b.length();

		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (a.charAt(i - 1) == b.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else 
					dp[i][j] = max(dp[i][j - 1], dp[i - 1][j]);
			}
		}

		System.out.println(dp[m][n]);
	}

	static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
}