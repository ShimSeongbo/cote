package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 최소직사각형 {

    class Solution {

        /**
         * 1. 배열 큰수 / 작은수 정렬
         * 2. return 가장 큰수 * 가장 큰수
         */
        public int solution(int[][] sizes) {
            int answer = 0;

            Set<Integer> leftSet = new HashSet();
            Set<Integer> rightSet = new HashSet();

            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] > sizes[i][1]) {
                    leftSet.add(sizes[i][0]);
                    rightSet.add(sizes[i][1]);
                } else if (sizes[i][0] < sizes[i][1]) {
                    leftSet.add(sizes[i][1]);
                    rightSet.add(sizes[i][0]);
                } else if (sizes[i][0] == sizes[i][1]) {
                    leftSet.add(sizes[i][1]);
                    rightSet.add(sizes[i][0]);
                }
            }

            return bigestNum(leftSet) * bigestNum(rightSet);
        }

        private static int bigestNum(Set<Integer> numSet) {
            int maxNum = 0;

            for (int num : numSet) {
                if (num > maxNum) {
                    maxNum = num;
                }
            }

            return maxNum;
        }
    }

    public int solution2(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);

            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        return maxHeight * maxWidth;
    }
}
