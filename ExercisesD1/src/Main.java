import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account name");
        String name = input.nextLine();

        Account myAccount = new Account();
        myAccount.setName(name);

        System.out.printf("The new name is: "+myAccount.getName());

        myAccount.setName("test");
        System.out.println("\nThe added name is: "+myAccount.getName());

        System.out.println("Please enter your balance: ");
        double amount = input.nextDouble();
        myAccount.setBalance(amount);
        System.out.println("The balance on the account: "+myAccount.getBalance());
        input.close();

    }
}