package programmers.level3;

import java.util.*;

public class 단어변환 {

    // 두 단어가 한 글자만 다른지 확인하는 함수
    private boolean isOneLetterDiff(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) {
                return false;
            }
        }
        return diffCount == 1;
    }

    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(begin);
        visited.add(begin);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(target)) {
                    return depth;
                }

                for (String word : words) {
                    if (!visited.contains(word) && isOneLetterDiff(currentWord, word)) {
                        queue.add(word);
                        visited.add(word);
                    }
                }
            }
            depth++;
        }
        return 0;
    }

    public static void main(String[] args) {
        단어변환 sol = new 단어변환();
        System.out.println(sol.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));  // Expected: 4
        System.out.println(sol.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"}));  // Expected: 0
    }
}
