package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수 {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};


        System.out.println(solution(a, b));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] subArray = Arrays.copyOfRange(array, start, end);

            Arrays.sort(subArray);

            answer[i] = subArray[k];
        }

        return answer;
    }

    static class Solution {
        public int[] solution2(int[] array, int[][] commands) {
            int[] answer = {commands.length};

            StringBuilder sb = new StringBuilder();

            for (int i : array) {
                sb.append(i);
            }

            List<Integer> list = new ArrayList<>();

            for (int[] ints : commands) {
                String substring = sb.substring(ints[0] - 1, ints[1]);
                //정렬
                char[] charArray = substring.toCharArray();
                Arrays.sort(charArray);
                String s = new String(charArray);

                // 아스키코드로 반환.
                int c = s.charAt(ints[2] - 1);

                list.add(c);
            }

            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

}
