import java.util.Scanner;

public class NestedForLoopsExersize {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String userInput;

        System.out.print("Enter a character: ");
        userInput = scanner.nextLine();

        char displayChar = userInput.charAt(0);

        System.out.print("How many columns: ");
        columns = scanner.nextInt();
        System.out.print("How many rows: ");
        rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(displayChar + " ");
            }
            System.out.println(" ");

            scanner.close();
        }
    }
}