import java.util.Objects;
import java.util.Scanner;

public class ShoppingBS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        double price;
        int amount;


        System.out.println("=====Menu=====");
        System.out.println("Siomai Rice: ₱45.99");
        System.out.println("Tuna Pasta: ₱79.99");
        System.out.println("Small Fries: ₱50");
        System.out.println("Medium Fries: ₱85");
        System.out.println("Big Fries: ₱109");
        System.out.println("1pc Chicken: ₱70.99");
        System.out.println("Family Pan Spaghetti: ₱250");

        System.out.print("\nWhat would you like to buy? ");
        name = scanner.nextLine();
        System.out.print("Please input the price: ");
        price = scanner.nextDouble();
        System.out.print("How many? ");
        amount = scanner.nextInt();

        price *= amount;

        System.out.printf("\nYou have bought %d %s/s for a total of ₱%.2f", amount, name, price);
        System.out.println("\nThank you for your order!");
        scanner.close();
    }
}
