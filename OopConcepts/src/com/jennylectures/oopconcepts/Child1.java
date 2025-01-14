package com.jennylectures.oopconcepts;

import com.jennylectures.inheritanceconcepts.Parent;
import com.jennylectures.inheritanceconcepts.Parent1;

public class Child1 extends Parent {
    public static void main(String[] args) {

//        System.out.println("Parent.privateVar:" + Parent.privateVar); // error
//        System.out.println("Parent.defaultVar:" + Parent.defaultVar); // error
        System.out.println("Parent.protectedVar:" + Parent.protectedVar);
        System.out.println("Parent.publicVar:" + Parent.publicVar);
        System.out.println("Parent1.protectedVar:" + Parent1.protectedVar);
    }



}
