import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1;
        String name2;
        String verb1;
        String verb2;
        String verb3;
        String place1;
        String place2;

        System.out.println("======Madlib=====");
        System.out.println(" ");

        System.out.print("Enter a Male name: ");
        name1 = scanner.nextLine();
        System.out.print("Enter a Female name: ");
        name2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another verb: ");
        verb2 = scanner.nextLine();
        System.out.print("Enter a verb that can be done with another person: ");
        verb3 = scanner.nextLine();
        System.out.print("Enter a place: ");
        place1 = scanner.nextLine();
        System.out.print("Enter a weird place: ");
        place2 = scanner.nextLine();

        System.out.println("\nWhen i got into " + place1 + " I saw " + name1 + " " + verb1 + ".");
        System.out.println("I then saw " + name2 + " " + verb2 + ".");
        System.out.println("After some time, i went to a " + place2 + ".");
        System.out.println("I was suprised to see " + name1 + " and " + name2 + " " + verb3 + " together.");


        scanner.close();
    }
}
