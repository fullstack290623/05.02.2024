package com.company;

public class Circle {

    protected float radius;

    public static float PIE = 3.14f;
    public static float PIE1 = 3.14f;
    public static float PIE2 = 3.14f;
    public static float PIE3 = 3.14f;

    // from static method cannot access non static field
    //public static void printRadius() {
//        System.out.println(this.radius); // ERROR
//    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
