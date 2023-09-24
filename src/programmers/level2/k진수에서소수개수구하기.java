package programmers.level2;

import java.util.*;

class k진수에서소수개수구하기 {

    private boolean isPrime(long n) {
        if(n < 2) return false;
        for(long i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public int solution(int n, int k) {
        int answer = 0;

        // 1. 주어진 n을 k진수로 변환한다.
        String kBase = "";
        while(n > 0) {
            kBase = (n % k) + kBase;
            n /= k;
        }

        // 2. 변환된 수에서 '0'을 기준으로 문자열을 나눈다.
        StringTokenizer st = new StringTokenizer(kBase, "0");

        // 3. 나눠진 각 문자열에서 소수인지 확인한다.
        while(st.hasMoreTokens()) {
            long num = Long.parseLong(st.nextToken());
            if(isPrime(num)) answer++;
        }

        return answer;
    }
}
