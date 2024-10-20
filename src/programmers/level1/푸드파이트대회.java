package programmers.level1;

public class 푸드파이트대회 {

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int availableFoods = food[i] / 2;
            for (int j = 0; j < availableFoods; j++){
                sb.append(i);
            }
        }

        StringBuilder answer = new StringBuilder(sb);
        answer.append(0);
        answer.append(sb.reverse());

        return answer.toString();
    }
}
