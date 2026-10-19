import java.util.Scanner;

public class BankingProgram {

    static double balance = 0.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        double amount, withdrawnAmount;
        boolean isExit = true;

        do {

            System.out.println("\n****************");
            System.out.println("Banking Program ");
            System.out.println("****************");
            System.out.println("Choose an option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your Option here: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("How much will you deposit?: ");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("You can't deposit negative or 0 amount!");
                } else {
                    deposit(amount);

                    System.out.printf("Successfully deposited $%.2f\n", amount);
                }
            } else if (option == 2) {
                System.out.print("How much will you withdraw?: ");
                withdrawnAmount = scanner.nextDouble();
                if (balance <= 0) {
                    System.out.println("You do not have any balance");
                } else if (withdrawnAmount > balance) {
                    System.out.println("You do not have enough balance");
                } else {
                    withdraw(withdrawnAmount);
                    System.out.printf("Successfully withdrawn $%.2f\n", withdrawnAmount);
                }
            } else if (option == 3) {
                System.out.printf("Your total balance is $%.2f\n", balance);
            } else if (option > 4 || option < 1) {
                System.out.println("Not a valid option!");
            } else if (option == 4) {
                break;
            }
        } while (isExit);

        scanner.close();
    }

    static void deposit(double amount) {
        balance += amount;
    }

    static void withdraw(double withdrawnAmount) {
        balance -= withdrawnAmount;
    }
}