public class Account {
    private String name;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0)
            this.balance = balance;
        else {
            System.out.println("No negative values allowed.");
        }
    }

    private double balance;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




}
