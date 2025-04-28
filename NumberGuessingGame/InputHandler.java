import java.util.Scanner;

class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int getUserGuess() {
        System.out.print("Enter your guess: ");
        while (!scanner.hasNextInt()) {
            System.out.println("🚫 Invalid input! Enter a number between 1 and 100.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}