public class N개의최소공배수 {
    // Function to find GCD of two numbers
    public int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM of two numbers
    public int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Function to find LCM of an array
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        N개의최소공배수 s = new N개의최소공배수();
        System.out.println(s.solution(new int[]{2, 6, 8, 14})); // Output should be 168
        System.out.println(s.solution(new int[]{1, 2, 3})); // Output should be 6
    }
}
