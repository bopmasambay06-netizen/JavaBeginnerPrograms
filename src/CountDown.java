import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int amount;

        System.out.println("=====Count Down=====");

        System.out.print("How many seconds do you want to count down from?: ");
        amount = scanner.nextInt();

        for (int i = 1; i <= amount; amount--) {
            System.out.println(amount);
            Thread.sleep(1000);
        }

        System.out.println("Done.");

    }

}
