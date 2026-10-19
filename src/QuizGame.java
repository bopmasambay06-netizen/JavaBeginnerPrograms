import java.util.Arrays;
import java.util.Scanner;

public class QuizGame {

    static String[] questions = {"What is the sum of 68 + 30", "What country has a border with Philippines", "Which flag has stars", "What is a vehicle that has two tires", "What is the name of the developer of this Quiz"};
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {


        do {
            System.out.println("**********Quiz Game**********\n");
            System.out.print(questions[0]);
            System.out.println();
            answer1();

            System.out.println();
            System.out.print(questions[1]);
            System.out.println();
            answer2();

            System.out.println();
            System.out.print(questions[2]);
            System.out.println();
            answer3();

            System.out.println();
            System.out.print(questions[3]);
            System.out.println();
            answer4();

            System.out.println();
            System.out.print(questions[4]);
            System.out.println();
            answer5();

            System.out.println("\n**********FINISHED**********");
            System.out.printf("Your total score is %d over 5!", score);

            break;
        }
        while (true);

    }

    static void answer1() {

        int guess1;

        String[][] answer1;
        answer1 = new String[][]{{"1. 100"},
                {"2. 98"},
                {"3. 99"},
                {"4. 78"}};

        for (String[] numbers : answer1) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
        System.out.print("What is your answer: ");
        guess1 = scanner.nextInt();

        if (guess1 != 2) {
            System.out.println("\n*****WRONG*****");
        } else {
            System.out.println("\n*****CORRECT*****");
            score++;
        }

    }

    static void answer2() {

        int guess2;

        String[][] answer2;
        answer2 = new String[][]{{"1. USA"},
                {"2. China"},
                {"3. Indonesia"},
                {"4. None"}};

        for (String[] numbers : answer2) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
        System.out.print("What is your answer: ");
        guess2 = scanner.nextInt();

        if (guess2 != 4) {
            System.out.println("\n*****WRONG*****");
        } else {
            System.out.println("\n*****CORRECT*****");
            score++;
        }
    }
    static void answer3(){

        int guess3;

        String[][] answer3;
        answer3 = new String[][]{{"1. France"},
                {"2. South Korea"},
                {"3. Indonesia"},
                {"4. North Korea"}};

        for (String[] numbers : answer3) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
        System.out.print("What is your answer: ");
        guess3 = scanner.nextInt();

        if (guess3 != 4) {
            System.out.println("\n*****WRONG*****");
        } else {
            System.out.println("\n*****CORRECT*****");
            score++;
        }
    }
    static void answer4(){

        int guess4;

        String[][] answer4;
        answer4 = new String[][]{{"1. Truck"},
                {"2. Car"},
                {"3. Airplane"},
                {"4. Van"}};

        for (String[] numbers : answer4) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
        System.out.print("What is your answer: ");
        guess4 = scanner.nextInt();

        if (guess4 != 3) {
            System.out.println("\n*****WRONG*****");
        } else {
            System.out.println("\n*****CORRECT*****");
            score++;
        }
    }
    static void answer5(){

        int guess5;

        String[][] answer5;
        answer5 = new String[][]{{"1. Gabriel"},
                {"2. Jerome"},
                {"3. Gojo"},
                {"4. Doja"}};

        for (String[] numbers : answer5) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
        System.out.print("What is your answer: ");
        guess5 = scanner.nextInt();

        if (guess5 != 1) {
            System.out.println("\n*****WRONG*****");
        } else {
            System.out.println("\n*****CORRECT*****");
            score++;
        }
    }
}