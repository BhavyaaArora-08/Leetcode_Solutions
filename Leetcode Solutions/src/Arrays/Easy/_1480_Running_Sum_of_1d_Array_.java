package Arrays.Easy;

public class _1480_Running_Sum_of_1d_Array_ {
	
	// Solution 
	class Solution {
	    public int[] runningSum(int[] nums) {
	        
			for(int i=1;i<nums.length;i++) {
				nums[i]+=nums[i-1];
			}
			
			return nums;
	    }
	}

}
