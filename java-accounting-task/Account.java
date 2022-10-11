import java.util.Scanner;
import java.util.Date;

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.12;
    Date dateCreated;

    public Account() {

    }

    public Account(int aId, double aBalance, double annualInterestRate) {
        id = aId;
        balance = aBalance;
        annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public void setID(int aId) {
        id = aId;
    }

    public int getID() {
        return id;
    }

    public void setBalance(double aBalance) {
        balance = aBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double aannualInterestRate) {
        annualInterestRate = aannualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class Main {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);

        account.setID(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);



        System.out.println("Account number: \n" + account.getID());
        System.out.println("The account balance is: $ \n" + account.getBalance());
        System.out.println("The Annual Interest Rate is: $ \n" + account.getAnnualInterestRate());
        account.deposit(150);
        System.out.println("The account balance is: $ \n" + account.getBalance());
        account.withdraw(50);
        System.out.println("The account balance is: $ \n" + account.getBalance());
        System.out.println("The monthly interest earned is: $ \n" + account.getBalance() * account.getAnnualInterestRate());
        System.out.println("The account was created on: \n" + account.getDateCreated());

    }
}
