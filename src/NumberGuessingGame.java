import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        double guess;
        int attempts = 0;
        String isPlayAgain;
        boolean tryAgain = true;
        int number;


        while (tryAgain) {
            clearScreen();
            number = random.nextInt(1, 101);
            attempts = 0;

            System.out.println("=====Number Guessing Game=====");
            System.out.println("Rules:");
            System.out.println("1. Only numbers from 1-100");
            System.out.println("2. You have to guess it in less than 10 tries");
            System.out.println("3. Only enter numbers");

            do {
                System.out.print("Guess the number: ");
                guess = scanner.nextDouble();
                attempts++;

                if (guess < number) {
                    System.out.println("Too Low!");
                } else if (guess > number) {
                    System.out.println("Too High!");
                }

            } while (number != guess);
            {
                System.out.println("You Guessed it!");
                System.out.printf("It took you %d tries to guess the number!\n", attempts);

                if (attempts >= 10) {
                    System.out.println("You failed!!!");
                } else {
                    System.out.println("You won, Congratulations!!!");
                }

                System.out.print("\nWould you like to play again? (yes or no): ");
                isPlayAgain = scanner.next();

                if (!isPlayAgain.equalsIgnoreCase("yes")) {
                    tryAgain = false;
                }
            }
        }
        scanner.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
