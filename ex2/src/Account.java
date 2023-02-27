import java.util.ArrayList;
import java.util.List;

public class Account {
    //Variable for the amount of instances of Account class called.
    static int instanceCounter = 0;

    //Variable for the account balance.
    private double accountBalance;

    //Variable for the amount of users.
    int counter = 0;
    //Variable for the name of the user
    private String name;
    //Variable of the ID of the user.
    private int id;

    //For each newly created account, add a unique id from 1 to 1000.
    Account(){
        instanceCounter++;
        counter = instanceCounter;
        id = instanceCounter % 1000;
    }

    //Function to get account name
    public String getName() {
        return name;
    }

    //Function to set account name
    public void setName(String name) {
        this.name = name;
    }

    //Function to get account balance
    public double getAccountBalance() {
        return accountBalance;
    }
    //Function to set account balance
    public void setAccountBalance(double accountBalance) {
        //Checks if the input of the balance is higher than 0, negatives are not allowed.
        if (accountBalance < 0){
            System.out.println("Balance too low");
        }
        else {
            this.accountBalance = accountBalance;
        }
    }

    //Function to get account id.
    public int getId() {
        return id;
    }


}