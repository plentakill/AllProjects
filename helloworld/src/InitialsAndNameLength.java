import java.util.Scanner;

public class InitialsAndNameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        String firstnametrim = firstName.trim();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        String lastname = lastName.trim();

        int nameLength = firstnametrim.length() + lastname.length();

        System.out.printf("Your initials are %s%s and your full name has %d characters.",
                Character.toUpperCase(firstName.charAt(0)),
                Character.toUpperCase(lastName.charAt(0)),
                nameLength);
    }
}
