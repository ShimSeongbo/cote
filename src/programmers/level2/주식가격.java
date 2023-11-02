package programmers.level2;

import java.util.Stack;

public class 주식가격 {

    public int[] solution2(int[] prices) {
        int[] answer = new int[prices.length];

        for (int j = 0; j < prices.length; j++) {
            int price = prices[j];
            int count = 0;

            for (int i = j + 1; i < prices.length; i++) {
                count++;
                if (price > prices[i]) {
                    break;
                }
            }

            answer[j] = count;
        }

        return answer;
    }

    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }

        return answer;
    }
}
