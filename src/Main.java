import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letters :");
        String userInput = scanner.nextLine();
        try {
            Pattern pattern = Pattern.compile("^[a-z A-Z]+$");
            Matcher matcher = pattern.matcher(userInput);

            if (matcher.matches()) {
                System.out.println("Your letters is: " + userInput);
            } else {
                throw new IllegalArgumentException("please input the letter!!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
