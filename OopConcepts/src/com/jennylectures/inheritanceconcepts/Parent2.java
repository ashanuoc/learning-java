package com.jennylectures.inheritanceconcepts;

public class Parent2 {
    public static void main(String[] args) {
//        System.out.println("Parent.privateVar:" + Parent.privateVar); // error
        System.out.println("Parent.defaultVar:" + Parent.defaultVar); // package private
        System.out.println("Parent.protectedVar:" + Parent.protectedVar);
        System.out.println("Parent.publicVar:" + Parent.publicVar);
    }
}
