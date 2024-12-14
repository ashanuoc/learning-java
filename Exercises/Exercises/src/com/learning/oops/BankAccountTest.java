package com.learning.oops;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setAccountNumber("123456");
        bankAccount1.setAccountName("Chase");
        bankAccount1.setPhoneNumber(1234567890);

        bankAccount1.deposit(500);
        bankAccount1.withdraw(300.56);

        bankAccount1.displayDetails();

    }
}
