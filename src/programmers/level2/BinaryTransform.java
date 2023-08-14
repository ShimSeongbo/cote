package programmers.level2;

import java.util.Arrays;

class BinaryTransform {
    public int[] solution(String s) {
        int transformCount = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            int originalLength = s.length();

            // '0'의 개수를 구하고, '0'을 제거한다.
            s = s.replaceAll("0", "");
            zeroCount += (originalLength - s.length());

            // 제거된 후의 문자열의 길이를 구하고 2진법으로 변환한다.
            s = Integer.toBinaryString(s.length());

            transformCount++;
        }

        return new int[]{transformCount, zeroCount};
    }

    public static void main(String[] args) {
        BinaryTransform solution = new BinaryTransform();

        System.out.println(Arrays.toString(solution.solution("110010101001"))); // [3,8]
        System.out.println(Arrays.toString(solution.solution("01110"))); // [3,3]
        System.out.println(Arrays.toString(solution.solution("1111111"))); // [4,1]
    }
}
