package com.jennylectures.inheritanceconcepts;

public class Person {
    protected String name;
    private String address;
    private long phoneNo;

//    public Person(){
//        System.out.println("Person Constructor called");
//    }
    public Person(String name){
        System.out.println("Person Constructor called");
    }
    public Person(String name, String address){
        System.out.println("Person Constructor called");
    }

    public void display(){
        System.out.println(name + "is a person");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void greet(){
//        System.out.println("Hi ");
//    }
}
