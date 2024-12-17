package com.jennylectures.oopconcepts;

public class ConstructorIntroMain {
    public static void main(String[] args) {

        ConstructorIntro obj1 = new ConstructorIntro("jenny", "123456", 500.5, 9087654321523L);
//        ConstructorIntro obj1 = new ConstructorIntro(); // Default constructor is being called if not defined inside class
        obj1.displayDetails();

        ConstructorIntro obj2 = new ConstructorIntro("payal", "1234586", 5010.5);
        obj2.displayDetails();

//        ConstructorIntro obj3 = new ConstructorIntro();
//        obj3.displayDetails();
//        obj1.setAccountName("Jenny");
//        obj1.displayDetails();
//        System.out.println("Account Name: " + obj1.getAccountName());
    }
}
