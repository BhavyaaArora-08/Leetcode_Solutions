package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class _1512_Number_of_Good_Pairs {
	class Solution {
		public int numIdenticalPairs(int[] nums) {
			Map<Integer, Integer> ints = new HashMap<Integer, Integer>();
			int pairs = 0;
			for (int i = 0; i < nums.length; i++) {
				if (ints.containsKey(nums[i])) {
					pairs += ints.get(nums[i]);
					ints.put(nums[i], ints.get(nums[i]) + 1);
				} else {
					ints.put(nums[i], 1);
				}
			}
			return pairs;
		}
	}
}
