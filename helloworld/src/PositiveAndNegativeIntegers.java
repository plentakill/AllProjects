import java.util.Scanner;

public class PositiveAndNegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] numbers = new int[10];
        int positiveSum = 0;
        int negativeCount = 0;
        double negativeSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            } else if (numbers[i] < 0) {
                negativeCount++;
                negativeSum += numbers[i];
            }
        }
        System.out.println("The sum of the positive integers is " + positiveSum + ".");
        if (negativeCount > 0) {
            System.out.println("The average of the negative integers is " + negativeSum / negativeCount + ".");
        } else {
            System.out.println("There are no negative integers.");
        }
    }
}