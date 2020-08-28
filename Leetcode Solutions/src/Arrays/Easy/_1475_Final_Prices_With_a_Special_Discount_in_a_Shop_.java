package Arrays.Easy;

public class _1475_Final_Prices_With_a_Special_Discount_in_a_Shop_ {
	class Solution {
	    public int[] finalPrices(int[] prices) {
	        int n = prices.length;

			for (int i = 0; i < n; i++)
				for (int j = i + 1; j < n; j++)
					if (prices[j] <= prices[i]) {
						prices[i] = prices[i]-prices[j];
						break;
					}
			
			
			return prices;
	    }
	}
}
