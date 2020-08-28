package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {
	class Solution {
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> ll = new ArrayList<>();

			int max = Integer.MIN_VALUE;
			for (int val : candies) {
				max = Math.max(val, max);
			}

			for (int val : candies) {
				if (val + extraCandies < max) {
					ll.add(false);
				} else {
					ll.add(true);
				}
			}

			return ll;
	    }
	}
}
