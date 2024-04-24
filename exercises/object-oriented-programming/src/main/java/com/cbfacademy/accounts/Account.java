package com.cbfacademy.accounts;

public class Account {

    public int accountNumber;
    public double balance;
    
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double requested) {

        if (requested < 0) {
            return 0;
        }
        
        if (balance >= requested) {
            balance -= requested;
            return balance;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Account no: " + accountNumber + " , Balance: £" + String.format("%2f", balance);
    }



}
