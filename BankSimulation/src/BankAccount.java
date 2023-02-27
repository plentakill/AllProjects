class BankAccount  implements Account {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber) {
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance < amount){
            throw new InsufficientFundsException();
        }
        else {
            this.balance -= amount;
        }
    }



}
