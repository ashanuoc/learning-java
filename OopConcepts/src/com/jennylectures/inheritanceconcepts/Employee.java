package com.jennylectures.inheritanceconcepts;

public class Employee extends Person{
    private float salary;
    private short empID;

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
