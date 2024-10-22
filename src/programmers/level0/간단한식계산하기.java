package programmers.level0;

public class 간단한식계산하기 {

    public static void main(String[] args) {
        String binomial = "43 + 12";
        //                "0123456"
        solution(binomial);
    }


    public static int solution(String binomial) {
        int i1 = binomial.indexOf(" "); // 2
        int i2 = binomial.lastIndexOf(" "); // 4

        String a = binomial.substring(0, i1);
        String operator = binomial.substring(i1 + 1 , i2);
        String b = binomial.substring(i2 + 1, binomial.length());

        int r1 = Integer.parseInt(a);
        int r2 = Integer.parseInt(b);

        switch (operator) {
            case "+" -> {
                return (r1 + r2);
            }
            case "-" -> {
                return r1 - r2;
            }
            case "*" -> {
                return r1 * r2;
            }
        }

        return -1;
    }

    public int solution1(String binomial) {
        String[] split = binomial.split(" ");
        String s = split[0];
        String s1 = split[1];
        String s2 = split[2];

        return 0;
    }
}
