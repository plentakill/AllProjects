import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        //Scanner for user input
        Scanner input = new Scanner(System.in);

        boolean quit = false;
        //The below loop will ask the user to input a number from 1 to 3.
        //The first options will create a new account.
        //The second option will show the balance of an account.
        //The 3rd option exits the program

        while (!quit) {
            System.out.println("1. Create new account");
            System.out.println("2. Show balance of an account");
            System.out.println("3. Quit");

            //Asks for the user choice in the menu
            int choice = input.nextInt();

            //Performs the function according to the input of the user
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    showBalance();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 3.");
                    break;
            }
        }
    }
    //This function will create a new account asking for a name and a balance.
    //Afterwards, a unique ID is assigned to the account
    private static void createAccount() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the account holder: ");
        String name = input.nextLine();

        System.out.println("Enter the initial balance of the account: ");
        double balance = input.nextDouble();

        Account account = new Account();
        account.setName(name);
        account.setAccountBalance(balance);

        accounts.add(account);

        System.out.println("Account created with ID: " + account.getId());
    }
    //This function shows the balance of an account by entering its ID.
    //It uses the function findAccountById to find the correct account according to the ID
    private static void showBalance() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ID of the account: ");
        int id = input.nextInt();

        Account account = findAccountById(id);

        if (account != null) {
            System.out.println("Account name: " + account.getName());
            System.out.println("Account balance: " + account.getAccountBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
    //This function will loop over all the accounts and find the account with the ID given by the user.
    private static Account findAccountById(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    class players{

    }
}