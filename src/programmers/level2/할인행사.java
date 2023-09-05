package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> discountMap = new HashMap<>();

        // Initialize wantMap based on the items and their quantities that 정현이 wants to buy
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // Initialize the first 10 days of discountMap
        for (int i = 0; i < 10 && i < discount.length; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }

        // Check if 정현이 can buy all items he wants in the first 10 days
        if (canBuyAll(wantMap, discountMap)) {
            answer++;
        }

        // Slide the 10-day window and check each opportunity
        for (int i = 1; i <= discount.length - 10; i++) {
            // Remove the first element in the 10-day window from discountMap
            discountMap.put(discount[i-1], discountMap.get(discount[i-1]) - 1);
            if (discountMap.get(discount[i-1]) == 0) {
                discountMap.remove(discount[i-1]);
            }

            // Add the next element to the 10-day window in discountMap
            discountMap.put(discount[i+9], discountMap.getOrDefault(discount[i+9], 0) + 1);

            // Check if 정현이 can buy all items he wants in the current 10-day window
            if (canBuyAll(wantMap, discountMap)) {
                answer++;
            }
        }

        return answer;
    }

    // Helper function to check if all items can be bought
    private boolean canBuyAll(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String item : wantMap.keySet()) {
            if (!discountMap.containsKey(item) || discountMap.get(item) < wantMap.get(item)) {
                return false;
            }
        }
        return true;
    }
}
