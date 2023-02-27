import java.util.Scanner;
import java.util.ArrayList;

class Bank {
    ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void processTransactions() {
        Scanner scanner = new Scanner(System.in);

        for (Account account : this.accounts) {
            System.out.println("Processing transactions for account " + account);
            boolean done = false;

            while (!done) {
                System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to finish:");
                int choice = scanner.nextInt();
                if (choice == 3) {
                    done = true;
                } else {
                    System.out.println("Enter amount:");
                    double amount = scanner.nextDouble();
                    try {
                        if (choice == 1) {
                            account.deposit(amount);
                        } else {
                            account.withdraw(amount);
                        }
                    } catch (InsufficientFundsException e) {
                        System.out.println("Transaction failed: insufficient funds.");
                    }
                }
            }
        }
    }
}