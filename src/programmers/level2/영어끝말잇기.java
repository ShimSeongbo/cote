package programmers.level2;

import java.util.HashSet;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashSet<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);
        char lastCharWord = words[0].charAt(words[0].length() - 1);

        for (int i = 1; i < words.length; i++) {
            if (lastCharWord != words[i].charAt(0) || usedWords.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;

                return answer;
            }
            lastCharWord = words[i].charAt(words[i].length() - 1);
            usedWords.add(words[i]);
        }

        return new int[] {0,0};
    }
}
