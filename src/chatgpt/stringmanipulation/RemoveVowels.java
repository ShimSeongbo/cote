package chatgpt.stringmanipulation;

public class RemoveVowels {

    public static void main(String[] args) {
        String input = "hello world";
        String result = removeVowels(input);
        System.out.println(result);
    }

    private static String removeVowels(String s) {
        String filtedString = s.chars().mapToObj(c -> (char) c)
                .filter(c -> c.equals("a"))
                .filter(c -> c.equals("e"))
                .filter(c -> c.equals("i"))
                .filter(c -> c.equals("o"))
                .filter(c -> c.equals("u"))
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();

        return filtedString;
    }
}
