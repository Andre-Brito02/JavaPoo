package entities;

public class BankAccount {
    private final int numberAccount;
    private String name;
    private double balance;

    public BankAccount(int numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public BankAccount(int numberAccount, String name, double initialValue){
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = initialValue;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double withdrawValue){
        this.balance -= (withdrawValue + 5.0);
    }

    public void deposit(double depositValue){
        this.balance += depositValue;
    }

    public String toString(){
        return "Account " + numberAccount +
                ", Holder: " + name +
                ", Balance: $ " + "%.2f".formatted(balance);
    }
}
