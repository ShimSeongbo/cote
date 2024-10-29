package programmers.level0;

public class 공던지기 {

    public int solution(int[] numbers, int k) {
        int index = (k - 1) * 2;
        int i = index % numbers.length;

        return numbers[i];
    }
}
