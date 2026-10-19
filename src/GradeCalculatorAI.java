import java.util.Scanner;

public class GradeCalculatorAI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades do you want to enter? ");
        int count = input.nextInt();

        double total = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter grade " + i + ": ");
            total += input.nextDouble();
        }

        double aveGrade = total / count;
        double equivalent = toEquivalent(aveGrade);

        System.out.printf("%nYour Average Grade is %.2f or %.2f, %s",
                aveGrade, equivalent, equivalent == 5.00 ? "You Failed!" : "You Passed!");

        input.close();
    }

    static double toEquivalent(double g) {
        if (g >= 97.50) return 1.00;
        else if (g >= 94.50) return 1.25;
        else if (g >= 91.50) return 1.50;
        else if (g >= 86.50) return 1.75;
        else if (g >= 81.50) return 2.00;
        else if (g >= 76.00) return 2.25;
        else if (g >= 70.50) return 2.50;
        else if (g >= 65.00) return 2.75;
        else if (g >= 59.50) return 3.00;
        else return 5.00;
    }
}
