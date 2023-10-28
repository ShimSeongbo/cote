package programmers.level1;

public class 삼진법뒤집기 {

    public int solution(int n) {
        String ternary = Integer.toString(n, 3);

        String reversedTernary = new StringBuilder(ternary).reverse().toString();

        int i = Integer.parseInt(reversedTernary, 3);

        return i;
    }
}
