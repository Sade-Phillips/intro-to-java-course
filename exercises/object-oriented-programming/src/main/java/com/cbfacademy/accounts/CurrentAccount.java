package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double requested) {
        if (requested <=(getBalance() + overdraftLimit)) {
            this.balance -= requested;
            return requested;
        } else {
            return 0;
        }
    }

    
}
