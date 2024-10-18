package programmers.level1;

public class 숫자문자열과영단어 {

    public enum NumberWord {
        ZERO("zero", "0"),
        ONE("one", "1"),
        TWO("two", "2"),
        THREE("three", "3"),
        FOUR("four", "4"),
        FIVE("five", "5"),
        SIX("six", "6"),
        SEVEN("seven", "7"),
        EIGHT("eight", "8"),
        NINE("nine", "9");

        private final String word;
        private final String digit;

        NumberWord(String word, String digit) {
            this.word = word;
            this.digit = digit;
        }

        public String getWord() {
            return word;
        }

        public String getDigit() {
            return digit;
        }
    }

    public static int solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        // enum을 이용해 각 영어 단어를 숫자로 변환
        for (NumberWord numberWord : NumberWord.values()) {
            while (sb.indexOf(numberWord.getWord()) != -1) {
                int index = sb.indexOf(numberWord.getWord());
                sb.replace(index, index + numberWord.getWord().length(), numberWord.getDigit());
            }
        }

        return Integer.parseInt(sb.toString());

//        for (NumberWord numberWord : NumberWord.values()) {
//               s = s.replace(numberWord.getWord(), numberWord.getDigit());
//        }
//
//        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solutionR1(s));
    }

    public static int solution2(String s) {
        String[] words = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
        };

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }

    public enum wordNum {
        ZERO("zero", "0"),
        ONE("one", "1"),
        TWO("two", "2"),
        THREE("three", "3"),
        FOUR("four", "4"),
        FIVE("five", "5"),
        SIX("six", "6"),
        SEVEN("seven", "7"),
        EIGHT("eight", "8"),
        NINE("nine", "9");

        private final String numberWord;
        private final String digit;

        wordNum(String numberWord, String digit) {
            this.numberWord = numberWord;
            this.digit = digit;
        }

        public String getNumberWord() {
            return numberWord;
        }

        public String getDigit() {
            return digit;
        }
    }

    public static int solutionR1(String s) {
        for (wordNum value : wordNum.values()) {
            s = s.replace(value.getNumberWord(), value.digit);
        }

        return Integer.parseInt(s);
    }
}
