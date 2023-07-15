package Chapter4;

import java.util.Scanner;

public class Account {
    private String name;
    private double balance;
    private String pin;

    public Account(String name, String pin){
        this.name = name;
        this.pin = pin;
    }
        public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount, String pin){
        if (pin.equals(this.pin))balance = balance - amount;
    }
    public double getBalance(){
        return  balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account("IK", "1234");

        System.out.println("The initial balance is => " + account.getBalance());

        System.out.println("Enter amount you want to deposit");
        double amountDeposit = scanner.nextDouble();
        System.out.println(amountDeposit);

        System.out.println("How much would you like to withdraw:");
        double amountWithdraw = scanner.nextDouble();
        account.withdraw(amountWithdraw, "1234");
        System.out.println("your remaining balance is = " + account.getBalance());


    }
}
