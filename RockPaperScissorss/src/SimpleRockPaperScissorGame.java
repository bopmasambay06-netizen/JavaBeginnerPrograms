import java.util.*;

public class SimpleRockPaperScissorGame {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String yesOrNo;
        boolean isPlayAgain = true;

        do {

            String[] computerChoices = {"Scissor", "Rock", "Paper"};
            int randomChoice = random.nextInt(computerChoices.length);
            String finalChoice = computerChoices[randomChoice];

            System.out.println("Rock Paper Scissor Game");
            System.out.print("Enter your choice (Rock, Paper, Scissor): ");
            String option = scanner.nextLine();
            System.out.println("The computer chose: " + finalChoice);

            if ("scissor".equalsIgnoreCase(option)) {
                if (randomChoice == 0) {
                    System.out.println("TIE!");
                } else if (randomChoice == 1) {
                    System.out.println("YOU LOSE!");
                } else {
                    System.out.println("YOU WON!");
                }
            } else if ("Rock".equalsIgnoreCase(option)) {
                if (randomChoice == 0) {
                    System.out.println("YOU WON!");
                } else if (randomChoice == 1) {
                    System.out.println("TIE!");
                } else {
                    System.out.println("YOU LOSE!");
                }
            } else if ("Paper".equalsIgnoreCase(option)) {
                if (randomChoice == 0) {
                    System.out.println("YOU LOSE!");
                } else if (randomChoice == 1) {
                    System.out.println("YOU WON!");
                } else {
                    System.out.println("TIE!");
                }
            } else {
                System.out.println("INVALID CHOICE");
            }

            while (true) {
                System.out.print("Would you like to play again? (yes/no): ");
                yesOrNo = scanner.nextLine();

                if ("yes".equalsIgnoreCase(yesOrNo)) {
                    isPlayAgain = true;
                    break;
                } else if ("no".equalsIgnoreCase(yesOrNo)) {
                    isPlayAgain = false;
                    break;
                } else {
                    System.out.println("INVALID");
                }
            }

        } while (isPlayAgain);

        scanner.close();
    }
}