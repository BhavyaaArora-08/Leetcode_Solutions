package Arrays.Easy;

public class _1486_XOR_Operation_in_an_Array_ {
	class Solution {
		public int xorOperation(int n, int start) {
			int ans = 0;
			for (int i = 0; i < n; i++) {
				int x = start + (2 * i);
				ans ^= x;
			}

			return ans;
		}
	}
}
