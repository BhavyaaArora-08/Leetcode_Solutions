package Arrays.Easy;

public class _1313_Decompress_Run_Length_Encoded_List {
	class Solution {
		public int[] decompressRLElist(int[] nums) {

			int c = 0;

			for (int i = 0; i < nums.length; i += 2) {
				c += nums[i];
			}
			int[] ans = new int[c];
			int j = 0;
			for (int i = 0; i < nums.length; i += 2) {
				int freq = nums[i];
				int val = nums[i + 1];

				while (freq-- > 0) {
					ans[j++] = val;
				}
			}

			return ans;
		}
	}
}
