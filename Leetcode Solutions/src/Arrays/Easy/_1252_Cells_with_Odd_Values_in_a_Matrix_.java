package Arrays.Easy;

public class _1252_Cells_with_Odd_Values_in_a_Matrix_ {
	class Solution {
		public int oddCells(int n, int m, int[][] indices) {
			int ans = 0;
			int[][] mat = new int[n][m];

			for (int k = 0; k < indices.length; k++) {
				int row = indices[k][0];
				int col = indices[k][1];

				// for col
				for (int i = 0; i < n; i++) {
					mat[i][col]++;
				}

				// for rows
				for (int j = 0; j < m; j++) {
					mat[row][j]++;
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (mat[i][j] % 2 != 0)
						ans++;
				}
			}

			return ans;
		}
	}
}
