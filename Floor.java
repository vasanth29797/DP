//java program to find the minimum cost required to reach the top floor by climbing the stairs.

import java.util.*;

class Floor {
	public static void main(String[] args) {
		int[] arr = {16, 19, 10, 12, 18};//cost of each stair
		int n = arr.length, dp0 = 0, dp1 = 0, dp2 = 0;

		for (int i = 0; i < n; i++) {
			dp0 = arr[i] + Math.min(dp1, dp2);
			dp2 = dp1;
			dp1 = dp0;
		}

		System.out.println(Math.min(dp1, dp2));
	}
}