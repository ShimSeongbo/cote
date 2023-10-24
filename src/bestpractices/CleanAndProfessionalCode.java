package bestpractices;

public class CleanAndProfessionalCode {

    public static void main(String[] args) {
        int score = 80;
        // Bad example: Magic number used directly in the code
        if (score >= 70) {
            System.out.println("Pass");
        }

        // Good example: Constants used for better readability
        final int PASS_THRESHOLD = 70;
        if (score >= PASS_THRESHOLD) {
            System.out.println("Pass");
        }
    }
}
