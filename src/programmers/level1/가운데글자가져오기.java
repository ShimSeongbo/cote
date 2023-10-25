package programmers.level1;

public class 가운데글자가져오기 {

    public String solution(String s) {
        int middleNumber = s.length() / 2;
        String middleString = s.charAt(middleNumber) + "";

        if (isEvenString(s)) {
            return s.charAt(middleNumber - 1) + middleString;
        }

        return middleString;
    }

    static boolean isEvenString(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        return s.length() % 2 == 0;
    }
}
