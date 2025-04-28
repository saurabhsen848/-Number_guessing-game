import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        User user = new User();
        RNG rng = new RNG();
        Scorer scorer = new Scorer(rng.generateNumber());

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have 5 attempts.\n");

        while (!scorer.isGameOver()) {
            int guess = inputHandler.getUserGuess();
            user.setGuess(guess);

            if (scorer.checkAnswer(user.getGuess())) {
                System.out.println("🎉 Correct! You guessed the number!");
                break;
            } else {
                System.out.println(scorer.getHint(user.getGuess()));
            }

            if (scorer.isGameOver()) {
                System.out.println("❌ Game over! The number was " + rng.getNumber());
            }
        }

        System.out.println("👋 Thanks for playing!");
    }
}