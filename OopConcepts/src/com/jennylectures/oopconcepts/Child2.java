package com.jennylectures.oopconcepts;

import com.jennylectures.inheritanceconcepts.Parent;

public class Child2 {
    public static void main(String[] args) {
//        System.out.println("Parent.privateVar:" + Parent.privateVar); // error
//        System.out.println("Parent.defaultVar:" + Parent.defaultVar); // error
//        System.out.println("Parent.protectedVar:" + Parent.protectedVar); // error
        System.out.println("Parent.publicVar:" + Parent.publicVar);
    }
}
