import java.util.*;

public class SlotMachine {

    static double balance = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"🤑", "🌶️", "⚡", "♠️", "🌺"};
        double bet;
        String isPlayAgain;
        boolean playAgain = true;

        do {

            System.out.println("Slot Machine");
            System.out.println("Symbols: 🤑, 🌶, ️⚡, ♠️, 🌺");
            System.out.printf("Your Balance are: $%.2f \n", balance);
            System.out.println("==========================");
            System.out.print("Place your bet: ");
            bet = scanner.nextDouble();

            if (bet > balance) {
                System.out.println("NOT ENOUGH MONEY");
                 continue;
            }

            System.out.println("Spinning...");

            int randomSymbol1 = random.nextInt(symbols.length);
            int randomSymbol2 = random.nextInt(symbols.length);
            int randomSymbol3 = random.nextInt(symbols.length);
            String symbol1 = symbols[randomSymbol1];
            String symbol2 = symbols[randomSymbol2];
            String symbol3 = symbols[randomSymbol3];

            System.out.println("=========");
            System.out.println(symbol1 + "|" + symbol2 + "|" + symbol3);
            System.out.println("=========");

            if (randomSymbol1 == randomSymbol2 && randomSymbol2 == randomSymbol3) {
                System.out.println("JACKPOT!!!");
                balance += bet * 10.0;
            } else if (randomSymbol1 == randomSymbol2 || randomSymbol2 == randomSymbol3 || randomSymbol1 == randomSymbol3) {
                System.out.println("LUCKY!!!");
                balance += bet * 1.5;
            } else {
                System.out.println("No Match!!!");
                balance -= bet;
                 if(balance <= 0){
                     System.out.println("GAME OVER, NO BALANCE LEFT!!!");
                     break;
                 }
            }

            System.out.printf("Your Balance is: $%.2f", balance);

            while (true) {

                System.out.println("\n=====================");
                System.out.print("Try again? (yes/no): ");
                isPlayAgain = scanner.next().toLowerCase();
                System.out.println("=====================");

                if ("yes".equals(isPlayAgain)) {
                    playAgain = true;
                    break;
                } else if ("no".equals(isPlayAgain)) {
                    playAgain = false;
                    break;
                } else {
                    System.out.println("INVALID");
                }

            }

        } while (playAgain);

        scanner.close();
    }
}
