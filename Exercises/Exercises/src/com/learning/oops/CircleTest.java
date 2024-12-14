package com.learning.oops;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.setRadius(5);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());
    }
}
