package programmers.level2;

class n진수게임 {

    // Convert a number to base-n
    private String convertToBase(int num, int base) {
        String chars = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        if(num == 0) {
            return "0";
        }

        while(num > 0) {
            result.insert(0, chars.charAt(num % base));
            num /= base;
        }

        return result.toString();
    }

    public String solution(int n, int t, int m, int p) {
        StringBuilder sequence = new StringBuilder();
        int num = 0;

        // Generate a long sequence
        while(sequence.length() < m * t) {
            sequence.append(convertToBase(num++, n));
        }

        StringBuilder answer = new StringBuilder();
        for(int i=0; i<t; i++) {
            answer.append(sequence.charAt(p-1 + i*m));
        }

        return answer.toString();
    }
}
