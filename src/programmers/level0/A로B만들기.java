package programmers.level0;

import java.util.Arrays;

public class A로B만들기 {

    public static void main(String[] args) {
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        int answer = 0;
        int[] array = new int[26];

        for (int i = 0; i < before.length(); i++) {
            char c = before.charAt(i);
            array[c - 97] += 1;
        }

        for (int i = 0; i < after.length(); i++) {
            char c = after.charAt(i);
            array[c - 97] -= 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) return 0;
        }

        return 1;
    }

    public int solution2(String before, String after) {
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);

        for (int i = 0; i < beforeCharArray.length; i++) {
            if (beforeCharArray[i] != afterCharArray[i]) return 0;
        }

        return 1;
    }
}
