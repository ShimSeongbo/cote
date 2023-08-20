package programmers.level2;

import java.util.Stack;

public class RemovePairs {
    public int solution(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (characterStack.isEmpty()) {
                characterStack.push(s.charAt(i));
            } else {
                if (characterStack.peek() == s.charAt(i)) {
                    characterStack.pop();
                } else {
                    characterStack.push(s.charAt(i));
                }
            }
        }

        return characterStack.isEmpty() ? 1 : 0;
    }

    public int solution2(String s) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!characterStack.isEmpty() && characterStack.peek() == currentChar) {
                characterStack.pop();
            } else {
                characterStack.push(currentChar);
            }
        }

        return characterStack.isEmpty() ? 1 : 0;
    }

}
