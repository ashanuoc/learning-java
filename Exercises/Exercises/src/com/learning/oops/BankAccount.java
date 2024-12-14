/*
Create a class BankAccount with the following fields:

    accountNumber (String)
    accountName (String)
    balance (double)
    phoneNumber (long)

Add the following methods:

    deposit() to add money to the account
    withdraw() to subtract money from the account

Create getter & setter methods for each field.

Ensure that the withdraw() method doesn't allow withdrawal if the balance becomes negative.

Also, prevent depositing & withdrawing negative amounts.
*/
package com.learning.oops;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    public void deposit(int credit){
        if (credit > 0) {
            this.balance += credit;
        }
    }

    public void withdraw(int debit){
        if (debit > 0 && this.balance > debit){
            this.balance -= debit;
        }
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public String getAccountName(){
        return this.accountName;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setBalance(double balance){
        this.balance += balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void displayDetails(){
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.getBalance());
    }


}
