package programmers.level0;

public class 특정문자열로끝나는가장긴부분문자열찾기 {

    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);

        if (index != -1) {
            return myString.substring(0, index + pat.length());
        } else {
            return "";
        }
    }
}
