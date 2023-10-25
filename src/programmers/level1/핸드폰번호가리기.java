package programmers.level1;

public class 핸드폰번호가리기 {

    public String solution(String phone_number) {
        String answer = "";

        char[] chars = phone_number.toCharArray();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            chars[i] = '*';
        }

        return new String(chars);
    }
}
