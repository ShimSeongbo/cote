package programmers.level1;

public class 부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += (price * i);
        }

        long result = answer - money;
        return result > 0 ? result : 0;
    }
}
