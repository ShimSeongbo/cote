package programmers.level1;

import java.math.BigInteger;

class 크키가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;

        int length = p.length();
        BigInteger pNum = new BigInteger(p);

        for (int i = 0; i <= t.length() - length; i++) {
            String sub = t.substring(i, i + length);
            BigInteger subNum = new BigInteger(sub);

            if (subNum.compareTo(pNum) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}