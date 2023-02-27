public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new BankAccount("123456"));
        bank.addAccount(new CheckingAccount("654321", 100.0));
        bank.processTransactions();
    }
}