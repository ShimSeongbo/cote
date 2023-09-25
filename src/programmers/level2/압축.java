package programmers.level2;

import java.util.*;

class 압축 {
    public int[] solution(String msg) {
        // Step 1: Initialize the dictionary with all uppercase English letters
        Map<String, Integer> dict = new HashMap<>();
        int index = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dict.put(String.valueOf(c), index++);
        }

        List<Integer> resultList = new ArrayList<>();

        // Step 2: Start iterating through the given message
        int i = 0;
        while (i < msg.length()) {
            String w = String.valueOf(msg.charAt(i));
            int j = i + 1;
            // Keep expanding the current substring until it's no longer in the dictionary
            while (j < msg.length() && dict.containsKey(w + msg.charAt(j))) {
                w += msg.charAt(j);
                j++;
            }

            // Add the value corresponding to the found substring to the result list
            resultList.add(dict.get(w));

            // Add the new substring to the dictionary
            if (j < msg.length()) {
                dict.put(w + msg.charAt(j), index++);
            }

            // Move the pointer past the found substring
            i = j;
        }

        // Convert the result list to an array and return
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        압축 sol = new 압축();
        System.out.println(Arrays.toString(sol.solution("KAKAO"))); // [11, 1, 27, 15]
        System.out.println(Arrays.toString(sol.solution("TOBEORNOTTOBEORTOBEORNOT"))); // [20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
        System.out.println(Arrays.toString(sol.solution("ABABABABABABABAB"))); // [1, 2, 27, 29, 28, 31, 30]
    }
}
