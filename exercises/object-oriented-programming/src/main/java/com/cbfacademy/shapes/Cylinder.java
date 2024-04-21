package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    double radius;
    double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * Math.PI * (Math.pow(radius, 2));
    }

}
