package programmers.level1;

public class CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 대문자 처리
            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char)((ch - 'A' + n) % 26 + 'A');
                result.append(shifted);
            }
            // 소문자 처리
            else if (ch >= 'a' && ch <= 'z') {
                char shifted = (char)((ch - 'a' + n) % 26 + 'a');
                result.append(shifted);
            }
            // 공백 처리
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.solution("AB", 1)); // "BC"
        System.out.println(caesarCipher.solution("z", 1));  // "a"
        System.out.println(caesarCipher.solution("a B z", 4)); // "e F d"
    }
}

