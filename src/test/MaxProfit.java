package test;

/**
 * 1. 왼쪽 기준 - 오른쪽에서 순차적으로 while(왼쪽 < 오른쪽) - (오른쪽 - 왼쪽)값 저장.
 *      1-1) 캐시에 저장
 *      1-2) minimum 값을 ArrayList 에 저장함.
 *
 * 2. 왼쪽++ (왼쪽 < 오른쪽 일 경우에만)
 *
 */
public class MaxProfit {

    public int maxProfit(int[] arr) {
        int left = 0;
        int right = arr.length - 1;


        return 0;
    }

    /**
     *
     * @param arr
     * @return
     *
     * Stock Buy Sell to Maximize Profit Algorithm
     *
     * Lets say we have array arr[] of stock prices.
     * We will track two variables :lowestPriceTillThatDayand maxProfit.
     *
     * - lowestPriceTillThatDay will be initialise to arr[0].
     * - Iterate over stock price array arr[]
     * - If current element is greater than lowestPriceTillThatDay
     *      - calculate profit.
     *      - If profit is greater than maxProfit then update the maxProfit.
     * - If current element is lesser than lowestPriceTillThatDay
     *      - update lowestPriceTillThatDay with current element.
     * - We will get maxProfit in the end.
     */
    public static int calculateMaxProfit(int[] arr) {
        int lowestPriceTillThatDay = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowestPriceTillThatDay) {
                profit = arr[i] - lowestPriceTillThatDay;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPriceTillThatDay = arr[i];
            }
        }
        return maxProfit;
    }

}
