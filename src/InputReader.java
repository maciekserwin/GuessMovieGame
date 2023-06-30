import java.util.Scanner;

public class InputReader {

    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public char readGuess() {
        System.out.print("Enter your guess: ");
        String input = scanner.nextLine().toLowerCase();
        if (input.length() != 1) {
            System.out.println("Invalid guess. Please enter a single letter.");
            return readGuess();
        }
        char guess = input.charAt(0);
        if (!Character.isLetter(guess)) {
            System.out.println("Invalid guess. Please enter a letter.");
            return readGuess();
        }
        return guess;
    }
}
