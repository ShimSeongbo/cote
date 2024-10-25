package programmers.level0;

public class 문자열이몇번등장하는지세기 {

    public int solution(String myString, String pat) {
        int result = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String substring = myString.substring(i);
            if (substring.startsWith(pat)) result++;
        }

        return result;
    }
}
