package com.jennylectures.inheritanceconcepts;

public class Employee {
    private String name;
    private String address;
    private float salary;
    private short empID;
    private long phoneNo;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getSalary() {
        return salary;
    }

    public short getEmpID() {
        return empID;
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

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
