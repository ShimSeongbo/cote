package chatgpt.stringmanipulation;

public class RemoveCharacter {

    public static void main(String[] args) {
        String input = "banana";
        char ch = 'a';
        String result = removeCharacter(input, ch);
        System.out.println(result);
    }

    private static String removeCharacter(String s, char ch) {
        return s.chars()
                .filter(c -> c != ch)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    private String removeChar(String s, char ch) {
        return s.replace(String.valueOf(ch), "");
    }
}
