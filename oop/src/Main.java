import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Please enter an age: ");
        int age = input.nextInt();
        Person myPerson = new Person(name,age);

        System.out.println("Your person's name is: "+"\n"+myPerson.getName()+"\nYour person's age is: "+"\n" +
                myPerson.getAge());
    }
}