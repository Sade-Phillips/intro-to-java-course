package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate; 
    }

    public void applyInterest() {
        double interest = interestRate * getBalance();
        deposit(interest); 
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double newInterestRate) { 
        if(newInterestRate >= 0) {
            this.interestRate = newInterestRate; 
        }
         
    }
}

