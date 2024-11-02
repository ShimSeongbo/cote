package programmers.level0;

public class 조건문자열 {

    public int solution(String ineq, String eq, int n, int m) {
        if (eq.equals("=")) {
             if (ineq.equals(">")) return n >= m ? 1 : 0;
             if (ineq.equals("<")) return n <= m ? 1 : 0;
        }

        if (eq.equals("!")) {
            if (ineq.equals(">")) return n > m ? 1 : 0;
            if (ineq.equals("<")) return n < m ? 1 : 0;
        }

        return 0;
    }
}
