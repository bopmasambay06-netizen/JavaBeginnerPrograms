import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String chars;

        System.out.print("Enter a character: ");
        chars = scanner.next();
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        char userInput = chars.charAt(0);

        for(int i = 1; i <= columns ; i++){
            for(int j = 1; j <= rows; j++){
                System.out.print(userInput + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
