package Arrays.Easy;

public class _1304_Find_N_Unique_Integers_Sum_up_to_Zero_ {
	class Solution {
		public int[] sumZero(int n) {
			int x = n / 2;
			int[] arr = new int[n];

			for (int i = 0; i < n / 2; i++) {
				arr[i] = -x;
				arr[n - 1 - i] = x;
				x--;
			}

			return arr;
		}
	}
}
