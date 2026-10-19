import java.util.Scanner;

public class Convertlbstokgs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double answer;
        double lbs;
        double kg;

        System.out.println("=====Weight Converter=====");
        System.out.println("1. KG to LBS");
        System.out.println("2. LBS to KG");
        System.out.print("Pick an option above: ");
        answer = scanner.nextDouble();

        if (answer == 1) {
            System.out.print("Input your weight in kg: ");
            kg = scanner.nextDouble();

            kg *= 2.20462;
            System.out.printf("\nYour weight in lbs will be: %.1flbs", kg);
        } else if (answer == 2) {
            System.out.print("Input your weight in lbs: ");
            lbs = scanner.nextDouble();

            lbs *= 0.4536;
            System.out.printf("\nYour weight in kg will be: %.1fkg", lbs);
        } else {
            System.out.println("Enter only 1 or 2!!2");

            scanner.close();
        }
    }
}