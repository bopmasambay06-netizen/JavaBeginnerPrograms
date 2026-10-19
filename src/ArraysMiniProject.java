public class ArraysMiniProject {

    public static void main(String[] args) {

        char[][] numbers = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        for (char[] number : numbers) {
            for (char numbs : number) {
                System.out.print(numbs + " ");
            }
            System.out.println();
        }

    }

}
