package programmers.level1;

public class 문자열다루기기본 {


    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("\\d+");
    }

    public boolean solution2(String s) {

        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return false;
    }
}
