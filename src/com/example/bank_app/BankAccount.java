package com.example.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;

    public BankAccount( double checkingOpeningDeposit , double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        checkingBalance+= checkingOpeningDeposit;
        savingsBalance+= savingsOpeningDeposit;
    }

    public double getCheckingBalance() {
        System.out.print("\nChecking Balance: " + this.checkingBalance + "\n");
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        System.out.print("\nSavings Balance: " + this.savingsBalance + "\n");
        return this.savingsBalance;
    }
    public void withdrawFromChecking(double amount) {
        if( (this.checkingBalance-amount ) >= 0 ) {
            this.checkingBalance -= amount;
            System.out.print("\nWithdrew From Checking: " + amount + "\n");
        }
        else {
            System.out.println("\nError: Insufficent funds please transfer from Savings Account! Transaction Voided!");
        }
    }
    public void withdrawFromSavings(double amount) {
        if ((this.savingsBalance - amount) >= 0) {
            this.savingsBalance -= amount;
            System.out.print("\nWithdrew From Savings: " + amount + "\n");
        } else {
            System.out.println("\nError: Insufficent funds please transfer from Checking Account! Transaction Voided!");
        }
    }

    public void transferToCheckingAccount ( double transferAmount ) {
        if ( ( this.savingsBalance - transferAmount ) >= 0) {
            this.savingsBalance -= transferAmount;
            this.checkingBalance += transferAmount;
            System.out.println("\nSuccess! Moving: " + transferAmount + " into Checking Account!");
            System.out.println("\nChecking Balance: " + this.checkingBalance + "\nSavings Balance: " + this.savingsBalance);
        } else {
            System.out.println("\nError: Amount exceeds Savings Account Amount! ");
        }
    }
    public void transferToSavingsAccount ( double transferAmount ) {
        if ( ( this.checkingBalance - transferAmount ) >= 0) {
            this.savingsBalance += transferAmount;
            this.checkingBalance -= transferAmount;
            System.out.println("\nSuccess! Moving: " + transferAmount + " into Savings Account!");
            System.out.println("\nChecking Balance: " + this.checkingBalance + "\nSavings Balance: " + this.savingsBalance);
        } else {
            System.out.println("\nError: Amount exceeds Checking Balance Amount!! ");
        }
    }

    public void addToCheckingBalance( double amount ) {
        this.checkingBalance += amount;
    }

    public void addtoSavingsBalance( double amount ) {
        this.savingsBalance += amount;
    }
}
