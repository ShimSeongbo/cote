package programmers.level2;

public class NextBiggerNumber {
    public int solution(int n) {
        int countOfOnes = countOnes(Integer.toBinaryString(n));

        while (true) {
            n++;
            if (countOfOnes == countOnes(Integer.toBinaryString(n))) {
                return n;
            }
        }
    }

    private int countOnes(String binaryString) {
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NextBiggerNumber solver = new NextBiggerNumber();
        System.out.println(solver.solution(78));  // Expected output: 83
        System.out.println(solver.solution(15));  // Expected output: 23
    }
}
