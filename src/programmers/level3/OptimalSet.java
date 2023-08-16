package programmers.level3;

public class OptimalSet {
    public int[] solution(int n, int s) {
        if (s < n) {
            return new int[]{-1}; // 불가능한 경우
        }

        int[] answer = new int[n];
        int quotient = s / n;
        int remainder = s % n;

        for (int i = 0; i < n; i++) {
            answer[i] = quotient;
        }

        // 나머지만큼 값을 1씩 추가한다. 이렇게하면 가장 큰 값을 최소화 할 수 있으므로 곱의 값이 최대가 된다.
        for (int i = n - 1; remainder > 0; i--, remainder--) {
            answer[i]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        OptimalSet solver = new OptimalSet();
        printArray(solver.solution(2, 9));  // Expected output: [4, 5]
        printArray(solver.solution(2, 1));  // Expected output: [-1]
        printArray(solver.solution(2, 8));  // Expected output: [4, 4]
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
