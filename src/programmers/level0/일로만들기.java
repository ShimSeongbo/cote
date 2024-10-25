package programmers.level0;

public class 일로만들기 {

    public int solution(int[] num_list) {
        int answer = 0;

        for (int i : num_list) {
            while (!(i == 1)) {
                if (isEvenNumber(i)) {
                    i = i / 2;
                    answer++;
                } else {
                    i = (i - 1) / 2;
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}




