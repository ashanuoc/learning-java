package com.jennylectures.inheritanceconcepts;

public class Employee extends Person{
    private float salary;
    private short empID;
    private String jobTitle;

    public Employee(String name, String jobTitle){
        super(name);
        this.jobTitle=jobTitle;
    }

    public void display(){
        System.out.println(name + " is an employee working as " + jobTitle);
    }

    public short getEmpID() {
        return empID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
