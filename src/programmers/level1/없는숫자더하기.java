package programmers.level1;

public class 없는숫자더하기 {

    public int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }

    public int solution2(int[] numbers) {
        boolean[] check = new boolean[10];
        for (int number : numbers) {
            check[number] = true;
        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!check[i]) {
                answer += i;
            }
        }

        return answer;
    }

}
