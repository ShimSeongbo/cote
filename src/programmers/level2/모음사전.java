package programmers.level2;

public class 모음사전 {

    public int solution(String word) {
        int[] eachPosition = {781, 156, 31, 6, 1}; // 5^4/4 + 5^3/4 + 5^2/4 + 5^1/4 + 5^0/4
        int answer = word.length(); // 단어의 길이를 더해줌으로써 단어의 수를 증가시킨다.

        for (int i = 0; i < word.length(); i++) {
            answer += "AEIOU".indexOf(word.charAt(i)) * eachPosition[i];
        }

        return answer;
    }

    public int solution2(String word) {
        int[] eachPosition = {781, 156, 31, 6, 1}; // 각 자리수마다 가능한 단어의 수
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        int answer = word.length(); // 단어의 길이만큼 더해준다.

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (word.charAt(i) == vowels[j]) {
                    answer += j * eachPosition[i];
                    break;
                }
            }
        }

        return answer;
    }
}
