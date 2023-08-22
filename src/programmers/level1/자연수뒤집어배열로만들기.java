package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
    }
}
