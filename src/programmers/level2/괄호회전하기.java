package programmers.level2;

import java.util.Stack;

public class 괄호회전하기 {

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public int solution(String s) {
        int validCount = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (isValid(s)) {
                validCount++;
            }
            s = rotateString(s);
        }

        return validCount;
    }

    private String rotateString(String s) {
        return s.substring(1) + s.charAt(0);
    }
}
