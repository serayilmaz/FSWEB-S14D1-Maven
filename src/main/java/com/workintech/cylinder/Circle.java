package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(0, radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}