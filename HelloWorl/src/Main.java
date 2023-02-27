import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int number1;
        number1 = inputScanner.nextInt();

        switch (number1){
            case 1:
                System.out.println("You chose 1");

            case 2:
                System.out.println("You chose 2");

            case 3:
                System.out.println("You chose 3");

            default:
                System.out.println("You chose wrong");

        }

    }
}