package programmers.level1;

public class 문자열내p와y의개수 {
    boolean solution(String inputString) {
        int countP = 0;
        int countY = 0;

        String lowerCaseString = inputString.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char currentChar = lowerCaseString.charAt(i);

            if (currentChar == 'p') {
                countP++;
            }

            if (currentChar == 'y') {
                countY++;
            }
        }

        return countP == countY;
    }

    boolean solution2(String inString) {
        String lowerCaseString = inString.toLowerCase();

        long countP = lowerCaseString.chars().filter(c -> c == 'p').count();
        long countY = lowerCaseString.chars().filter(c -> c == 'y').count();

        return countP == countY;
    }
}
