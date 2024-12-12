package com.jennylectures.oopconcepts;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        // length = length // ambiguity. instance and local variable equal
        this.length = length; // current instance
    }

    public int areaOfRectangle(){
//        area = this.length * this.breadth; // java is assigning this automatically here
        area = length * breadth;
        return area;
    }

    public void displayDetails(){
        System.out.println("length: " + this.length);
        System.out.println("breadth: " + breadth);
        System.out.println("area: " + this.areaOfRectangle());
        show(this);
    }

    public void show(Rectangle obj){
        System.out.println("Method calling using Object reference: " + obj);
    }
}
