package chatgpt.stringmanipulation;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> result = getCharacterFrequency(input);

        System.out.println(result);
    }

    private static Map<Character, Integer> getCharacterFrequency(String string) {
        return string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.summingInt(c -> 1)
                ));
    }
}
