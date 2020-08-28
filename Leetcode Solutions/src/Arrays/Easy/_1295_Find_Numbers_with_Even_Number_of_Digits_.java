package Arrays.Easy;

public class _1295_Find_Numbers_with_Even_Number_of_Digits_ {
	class Solution {
		public int findNumbers(int[] nums) {
			int c = 0;
			for (int val : nums) {
				if ((val > 9 && val < 100) || (val > 999 && val < 10000) || val == 100000) {
					c++;

				}
			}
			return c;
		}
	}
}
