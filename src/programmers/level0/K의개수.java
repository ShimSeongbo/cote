package programmers.level0;

public class K의개수 {

    public int solution(int i, int j, int k) {
        int result = 0;
        String target = Integer.toString(k);

        for (int n = i; n <= j; n++) {
            String s = Integer.toString(n);

            for (int l = 0; l < s.length(); l++) {
                if (s.charAt(l) == target.charAt(0)) {
                    result++;
                }
            }
        }

        return result;
    }
}
