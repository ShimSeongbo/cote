package chatgpt.stringmanipulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringCharacterSort {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry"};

        System.out.println(Arrays.toString(solution(strings)));
    }

    private static String[] solution2(String[] strings) {
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            char[] charArray = s.toCharArray();

            Character[] characters = new Character[charArray.length];
            for (int j = 0; j < charArray.length; j++) {
                characters[j] = charArray[j];
            }

            Arrays.sort(characters, Comparator.reverseOrder());

            StringBuilder sb = new StringBuilder();
            for (char c : characters) {
                sb.append(c);
            }

            String sortedString = sb.toString();

            result[i] = sortedString;
        }

        return result;
    }

    private static String[] solution(String[] strings) {
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];

            String sortedString = s.chars()
                    .mapToObj(c -> (char) c)
                    .sorted(Comparator.reverseOrder())
                    .collect(StringBuilder::new,
                            StringBuilder::append,
                            StringBuilder::append)
                    .toString();

            result[i] = sortedString;
        }

        return result;
    }
}
