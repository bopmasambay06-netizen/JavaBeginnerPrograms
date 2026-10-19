import java.util.Scanner;

public class GradeCalculator1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        double sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8;


        System.out.println("=====Grade Calculator=====");
        System.out.print("\nEnter Your Name: ");
        name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Type your name first");
        } else {
            System.out.printf("Hello %s! please enter your grade down below!\n", name);
        }

        System.out.print("First Subject: ");
        sub1 = scanner.nextDouble();
        System.out.print("Second Subject: ");
        sub2 = scanner.nextDouble();
        System.out.print("Third Subject: ");
        sub3 = scanner.nextDouble();
        System.out.print("Fourth Subject: ");
        sub4 = scanner.nextDouble();
        System.out.print("Fifth Subject: ");
        sub5 = scanner.nextDouble();
        System.out.print("Sixth Subject: ");
        sub6 = scanner.nextDouble();
        System.out.print("Seventh Subject: ");
        sub7 = scanner.nextDouble();
        System.out.print("Eigth Subject: ");
        sub8 = scanner.nextDouble();

        double totalGrade = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8;
        double aveGrade = totalGrade / 8;

        if (aveGrade <= 59.49) {
            System.out.printf("\nYour Average Grade is %.2f or 5.00, You Failed!", aveGrade);
        } else if (aveGrade >= 59.50 && aveGrade <= 64.99) {
            System.out.printf("\nYour Average Grade is %.2f or 3.00, You barely Passed!", aveGrade);
        } else if (aveGrade >= 65.00 && aveGrade <= 70.49) {
            System.out.printf("\nYour Average Grade is %.2f or 2.75, You Passed!", aveGrade);
        } else if (aveGrade >= 70.50 && aveGrade <= 75.99) {
            System.out.printf("\nYour Average Grade is %.2f or 2.50, You Passed!", aveGrade);
        } else if (aveGrade >= 76.00 && aveGrade <= 81.49) {
            System.out.printf("\nYour Average Grade is %.2f or 2.25, You Passed!", aveGrade);
        } else if (aveGrade >= 81.50 && aveGrade <= 86.49) {
            System.out.printf("\nYour Average Grade is %.2f or 2.00, You Passed!", aveGrade);
        } else if (aveGrade >= 86.50 && aveGrade <= 91.49) {
            System.out.printf("\nYour Average Grade is %.2f or 1.75, You Passed!", aveGrade);
        } else if (aveGrade >= 91.50 && aveGrade <= 94.49) {
            System.out.printf("\nYour Average Grade is %.2f or 1.50, You Passed!", aveGrade);
        } else if (aveGrade >= 94.50 && aveGrade <= 97.49) {
            System.out.printf("\nYour Average Grade is %.2f or 1.25, You Passed!", aveGrade);
        } else if (aveGrade >= 97.50 && aveGrade <= 100) {
            System.out.printf("\nYour Average Grade is %.2f or 1.00, You Passed!", aveGrade);
        } else {
            System.out.println("Your Grade is out of bounds");
        }

        scanner.close();
    }
}
