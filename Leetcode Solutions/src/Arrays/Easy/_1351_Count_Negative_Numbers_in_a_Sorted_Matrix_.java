package Arrays.Easy;

public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix_ {
	class Solution {
		public int countNegatives(int[][] grid) {
			int r = grid.length;
			int c = grid[0].length;

			int ans = 0;

			// TC: O(n2)
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (grid[i][j] < 0) {
						int below = (r - i - 1);
						int right = (c - j - 1);
						ans += below + right + 1;
						c--;
						break;
					}
				}
			}

			return ans;
		}
	}
}
