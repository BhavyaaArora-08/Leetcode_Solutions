package Arrays.Easy;

public class _1450_Number_of_Students_Doing_Homework_at_a_Given_Time_ {
	class Solution {
		public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

			int c = 0;
			for (int i = 0; i < startTime.length; i++) {
				if (endTime[i] >= queryTime && startTime[i] <= queryTime) {
					c++;
				}
			}

			return c;
		}
	}
}
