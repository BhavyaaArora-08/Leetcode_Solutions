package Arrays.Easy;

public class _832_Flipping_an_Image_ {
	class Solution {
		public int[][] flipAndInvertImage(int[][] A) {

			for (int i = 0; i < A.length; i++) {
				reverse(A[i]);
			}

			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[i].length; j++)
					A[i][j] = A[i][j] == 0 ? 1 : 0;
			}

			return A;
		}

		public void reverse(int[] arr) {
			int lo = 0, hi = arr.length - 1;

			while (lo < hi) {
				arr[lo] ^= arr[hi];
				arr[hi] ^= arr[lo];
				arr[lo] ^= arr[hi];
				lo++;
				hi--;
			}

		}
	}
}
