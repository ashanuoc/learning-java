package com.jennylectures.oopconcepts;

public class ConstructorIntro {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

// Constructor overloading
    public ConstructorIntro(String accountName, String accountNumber, double balance, long phoneNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public ConstructorIntro(String accountName, String accountNumber, double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public ConstructorIntro(){
        this.accountName = "Unknown";
        this.accountNumber = "Unknown";
        this.balance = 0.0;
        this.phoneNumber = 12345678910L;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails(){
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance);
    }
}
