import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int [] numbers = new int[10];
        int positiveSum = 0;
        int negativeCount = 0;
        int negativeSum = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            if ( numbers[i] < 0){
                negativeCount ++;
                negativeSum += numbers[i];
            }
            else if (numbers[i] > 0){
                positiveSum += numbers[i];
            }
        }
        System.out.println("The sum of the positive int's is " + positiveSum);
        if (negativeSum < 0){
            System.out.println(" The avarage of the negative integers is " + negativeSum / negativeCount);
        }
        else {
            System.out.println("There are no negative ints");
        }
        input.close();
    }
}