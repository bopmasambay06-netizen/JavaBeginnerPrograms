import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {

        Random random = new Random();

        String name;
        String isYes;
        double startingDeposit;
        int randomNumber, option;
        boolean isValidAmount = true;
        boolean doneProgram = true;

        // Random account number
        randomNumber = random.nextInt(0, 1000000);


        do {

            // Log in System

            System.out.println("==========Digital Bank==========\n");
            System.out.println("============Log In==============");
            System.out.print("Please Enter your Full Name: ");
            name = scanner.nextLine();

            while (isValidAmount) {
                System.out.print("Starting Deposit Amount: ");
                String rawInput = scanner.nextLine().trim();

                try {
                    startingDeposit = Double.parseDouble(rawInput);

                    if (startingDeposit < 0) {
                        System.out.println("You can't deposit negative numbers!");
                    } else {
                        balance += startingDeposit;
                        accountTier(balance);
                        isValidAmount = false;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number (e.g., 500 or 1250.50).");
                }
            }

            System.out.printf("\nHello %s! Welcome to Digital Banks!\n", name);

            boolean isSystemRunning = true;

            while (isSystemRunning) {

                // MENU
                System.out.println("==========Options==========");
                System.out.println("1. View Dashboard");
                System.out.println("2. Cash In/Deposit");
                System.out.println("3. Pay Bills");
                System.out.println("4. Check Investment Market History");
                System.out.println("5. Compute Future Projections");
                System.out.println("6. Change account");
                System.out.println("7. Exit");
                System.out.println("==========================");
                System.out.print("Enter your option (1-7): ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        boolean viewDashboard = true;
                        while (viewDashboard) {

                            dashboard(name, randomNumber, balance, accountTier(balance));
                            System.out.print("BACK (type yes): ");
                            isYes = scanner.next().trim().toLowerCase(Locale.ROOT);
                            System.out.println("==========================");

                            if (!isYes.equals("yes")) {
                                System.out.println("INVALID, TYPE YES IF YOU WANT TO EXIT");
                                continue;
                            } else {
                                viewDashboard = false;
                            }
                        }
                    }
                    case 2 -> {

                        double deposit;
                        boolean isExitDeposit = true;
                        while (isExitDeposit) {

                            System.out.println("==========================");
                            System.out.print("Enter the amount: ");
                            deposit = scanner.nextDouble();

                            if (deposit < 0) {
                                System.out.println("You can't deposit negative numbers");
                                continue;
                            } else {
                                balance += deposit;
                            }

                            System.out.printf("Successfully deposited ₱%,.2f!\n", deposit);
                            System.out.print("BACK (type yes): ");
                            isYes = scanner.next().trim().toLowerCase(Locale.ROOT);

                            if (!isYes.equals("yes")) {
                                System.out.println("INVALID, TYPE YES IF YOU WANT TO EXIT");
                                continue;
                            } else {
                                isExitDeposit = false;
                            }
                        }
                    }
                    case 3 -> {

                        boolean isExitBills = true;
                        while (isExitBills) {

                            if (balance >= 2750) {
                                balance -= 2750;
                                System.out.println("==========================");
                                System.out.println("Succesfully paid:");
                                System.out.println("Pag-Ibig: ₱200");
                                System.out.println("Meraclo: ₱2,400");
                                System.out.println("Maynilad: ₱150");
                                System.out.println("==========================");
                            } else {
                                System.out.println("==========================");
                                System.out.println("Not enough balance!");
                                System.out.println("==========================");
                                System.out.println("Bills:");
                                System.out.println("Pag-Ibig: ₱200");
                                System.out.println("Meraclo: ₱2,400");
                                System.out.println("Maynilad: ₱150");
                                System.out.println("==========================");
                                System.out.println("Total needed: ₱2750");
                                System.out.println("==========================");
                            }

                            System.out.print("BACK (type yes): ");
                            isYes = scanner.next().trim().toLowerCase(Locale.ROOT);

                            if (!isYes.equals("yes")) {
                                System.out.println("INVALID, TYPE YES IF YOU WANT TO EXIT");
                                continue;
                            } else {
                                isExitBills = false;
                            }
                        }
                    }
                    case 4 -> {

                        boolean isHistory = true;
                        while (isHistory) {

                            String[][] investmentHistory = {{"            | ", "1st year    |", "  2nd year   | ", " 3rd year   |"},
                                                            {"Tech Hub:   |     4.5%     |     5.8%     |      10%     |"},
                                                            {"Industrial: |     0.7%     |      1%      |      1.7%    |"}};

                            for(String[] rows : investmentHistory){
                                for(String column : rows){
                                    System.out.print(column + " ");
                                }
                                System.out.println();
                            }

                            System.out.print("BACK (type yes): ");
                            isYes = scanner.next().trim().toLowerCase(Locale.ROOT);

                            if (!isYes.equals("yes")) {
                                System.out.println("INVALID, TYPE YES IF YOU WANT TO EXIT");
                                continue;
                            } else {
                                isHistory = false;
                            }
                        }
                    }
                    case 5 ->{

                        boolean isExit = true;
                        double temporaryBalance = 0;
                        while (isExit) {

                            System.out.printf("Your current balance is: ₱%.2f\n", balance);
                            System.out.println("==========================");
                            System.out.print("Enter how many years you want to predict: ");
                            int yearsProjected = scanner.nextInt();
                            if(yearsProjected < 0){
                                System.out.println("You can't input negative numbers!!");
                                continue;
                            } else {
                                double totalInterestRate = 4.5 * yearsProjected;
                                temporaryBalance += balance;
                                temporaryBalance *= totalInterestRate;
                                System.out.println("==========================");
                                System.out.printf("Your total balance will be ₱%,.2f after %d year/s with 4.5 percent interest per year!\n", temporaryBalance, yearsProjected);
                                System.out.println("==========================");
                                isExit = false;
                            }

                            System.out.print("BACK (type yes): ");
                            isYes = scanner.next().trim().toLowerCase(Locale.ROOT);

                            if (!isYes.equals("yes")) {
                                System.out.println("INVALID, TYPE YES IF YOU WANT TO EXIT");
                                continue;
                            } else {
                                isExit = false;
                            }

                        }
                    }
                    case 6 -> {

                    }
                    case 7 -> {
                        doneProgram = false;
                        isSystemRunning = false;
                    }
                }
            }
        } while (doneProgram);
    }

    static String accountTier(double balance) {
        if (balance >= 50000) {
            return "PREMIUM VIP";
        } else {
            return "STANDARD";
        }
    }

    static void dashboard(String name, int randomNumber, double amount, String accountTier) {

        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Account Number: PH-" + randomNumber);
        System.out.printf("Balance: ₱%,.2f\n", amount);
        System.out.println("Tier: " + accountTier);
    }
}
