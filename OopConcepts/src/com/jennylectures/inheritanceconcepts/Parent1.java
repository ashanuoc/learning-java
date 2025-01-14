package com.jennylectures.inheritanceconcepts;

public class Parent1 extends Parent{
    public static void main(String[] args) {
//        System.out.println("Parent.privateVar:" + Parent.privateVar); // error
        System.out.println("Parent.defaultVar:" + Parent.defaultVar);
        System.out.println("Parent.protectedVar:" + Parent.protectedVar);
        System.out.println("Parent.publicVar:" + Parent.publicVar);
    }
}
