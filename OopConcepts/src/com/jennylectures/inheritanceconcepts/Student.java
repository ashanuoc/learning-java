package com.jennylectures.inheritanceconcepts;

public class Student extends Person{
    private String course;
    private short rollno;


    public String getCourse() {
        return course;
    }

    public short getRollno() {
        return rollno;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void greet(){
        System.out.println("Radhe! Radhe!");
    }
}

