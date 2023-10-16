package programmers.level1;

public class 하샤드수 {
    public boolean solution(int x) {
        int original = x;
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return original % sum == 0 && sum > 0;
    }
}
