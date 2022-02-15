package com.example.bank_app;

public class BankApp {

    public static void main ( String [] args ) {
        BankAccount customerAcct = new BankAccount(100.00 , 200.00);
        customerAcct.getCheckingBalance();
        customerAcct.getSavingsBalance();
        customerAcct.withdrawFromChecking(125.00);
        customerAcct.getCheckingBalance();

        customerAcct.transferToCheckingAccount(200.00);
        customerAcct.transferToSavingsAccount(300.00D);

        customerAcct.addToCheckingBalance(1000.00);
        customerAcct.getCheckingBalance();
    }
}
