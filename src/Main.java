import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letters only:");
        String userInput = scanner.nextLine();

        try {
            // Check if the input contains only letters
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(userInput);

            if (matcher.matches()) {
                System.out.println("Input only letters: " + userInput);
            } else {
                throw new IllegalArgumentException("Input contains non-letter characters.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
