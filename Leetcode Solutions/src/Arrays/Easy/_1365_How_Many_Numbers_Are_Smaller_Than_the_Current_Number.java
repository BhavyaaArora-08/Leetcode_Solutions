package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
	class Solution {
		public int[] smallerNumbersThanCurrent(int[] nums) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int[] nums2 = Arrays.copyOf(nums, nums.length);
			Arrays.sort(nums2);
			int c = 1;

			for (int i = nums.length - 1; i >= 0; i--) {
				if (!map.containsKey(nums2[i])) {
					map.put(nums2[i], c++);
				}
			}

			System.out.println(map);

			for (int i = 0; i < nums.length; i++) {
				nums[i] = map.size() - map.get(nums[i]);
			}

			return nums;
		}
	}
}
