package programmers.level0;

public class 팩토리얼 {

    public int bestpractice(int n) {
        int factorial = 1;
        int i = 1;

        while (factorial <= n) {
            i++;
            factorial *= i;
        }

        return i - 1;
    }

    public int solution(int n) {
        int result = 0;
        int factorial = 1;

        while (factorial <= n) {
            result++;
            factorial *= result;
        }

        return result - 1;
    }
}
