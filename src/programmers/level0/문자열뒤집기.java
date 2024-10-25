package programmers.level0;

public class 문자열뒤집기 {

    public String solution(String my_string, int s, int e) {
        String firstPart = my_string.substring(0, s);
        String middlePart = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        String lastPart = my_string.substring(e + 1);

        return firstPart + middlePart + lastPart;
    }
}
