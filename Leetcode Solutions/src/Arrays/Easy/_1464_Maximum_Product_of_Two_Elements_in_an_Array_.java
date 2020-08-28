package Arrays.Easy;

public class _1464_Maximum_Product_of_Two_Elements_in_an_Array_ {
	class Solution {
		public int maxProduct(int[] nums) {

			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;

			for (int val : nums) {
				if (val > max1) {
					max2 = max1;
					max1 = val;
				} else if (val > max2) {
					max2 = val;
				}
			}

			return ((max1 - 1) * (max2 - 1));

		}
	}
}
