package com.jennylectures.oopconcepts;

public class RectangleTestDrive {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        obj1.setLength(3);
        obj1.setBreadth(5);

        obj1.displayDetails();

        obj2.setLength(13);
        obj2.setBreadth(15);

        obj2.displayDetails();

//        System.out.println("length: " + obj1.getLength());
//        System.out.println("breadth: " + obj1.getBreadth());
//        System.out.println(obj1.areaOfRectangle());

    }
}
