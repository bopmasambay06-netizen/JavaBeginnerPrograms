import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        String operator;
        double answer1;
        double answer2;
        double answer3;
        double answer4;


        System.out.println("=====CALCULATOR=====");
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Choose an operator (+, -, *, /): ");
        operator = scanner.next();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();


        answer1 = num1 + num2;
        answer2 = num1 - num2;
        answer3 = num1 * num2;
        answer4 = num1 / num2;


        switch (operator){
            case "+" -> System.out.printf("%,.2f + %,.2f = %,.2f", num1, num2, answer1);
            case "-" -> System.out.printf("%,.2f - %,.2f = %,.2f", num1, num2, answer2);
            case "*" -> System.out.printf("%,.2f * %,.2f = %,.2f", num1, num2, answer3);
            case "/" -> System.out.printf("%,.2f / %,.2f = %,.2f", num1, num2, answer4);
            default -> System.out.println("That is not an operator");
        }

    }
}
