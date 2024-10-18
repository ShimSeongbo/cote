package chatgpt;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutiveR2(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6})); // 출력: 7
//        System.out.println(longestConsecutiveR1(new int[]{100, 4, 200, 1, 1, 3, 2})); // 출력: 4
//        System.out.println(longestConsecutiveR1(new int[]{0, -1, 1, 2})); // 출력: 4
//        System.out.println(longestConsecutiveR1(new int[]{})); // 출력: 0
//        System.out.println(longestConsecutiveR1(new int[]{1})); // 출력: 1
    }

    /**
     * 1. 시간 복잡도 O(n)
     * 2. HashSet 활용
     */
    private static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    private static int longestConsecutiveR1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    private static int longestConsecutiveR2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 1;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(currentLength, maxLength);
            }
        }

        return maxLength;
    }
}
