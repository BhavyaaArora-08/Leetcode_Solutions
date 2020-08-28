package Arrays.Easy;

import java.util.Arrays;

public class _1389_Create_Target_Array_in_the_Given_Order_ {
	class Solution {
		public int[] createTargetArray(int[] nums, int[] index) {
			int[] ans = new int[nums.length];
			Arrays.fill(ans, -1);

			for (int i = 0; i < nums.length; i++) {
				int idx = index[i];
				int val = nums[i];
				int kept = ans[idx];

				if (kept == -1) {
					ans[idx] = val;
				} else {
					int sky = ans[idx];
					ans[idx] = val;

					for (int j = idx + 1; j < nums.length; j++) {
						if (ans[j] == -1) {
							ans[j] = sky;
							break;
						} else {
							int temp = ans[j];
							ans[j] = sky;
							sky = temp;
						}

					}
				}
			}

			return ans;
		}
	}
}
