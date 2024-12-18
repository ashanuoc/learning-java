package com.jennylectures.inheritanceconcepts;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ankit");
        s1.setCourse("Java");
        s1.setAddress("India");
        s1.greet();
        System.out.println("Name: " + s1.getName());
    }
}
