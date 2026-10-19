import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        String answer;
        double finalTemp;

        System.out.println("=====Temperature Converter=====");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("What type would you like to convert this to? (C or F): ");
        answer = scanner.next().toUpperCase();

        finalTemp = (answer.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 1.8) + 32;

        System.out.printf("Converted: %.1f°%s", finalTemp, answer);

        scanner.close();

    }
}
