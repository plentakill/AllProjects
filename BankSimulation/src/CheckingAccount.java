class CheckingAccount extends BankAccount {
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance + this.overdraftLimit < amount) {
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }
}
