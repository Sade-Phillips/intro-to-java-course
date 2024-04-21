package com.cbfacademy.shapes;

public class Paint {

    double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    } 

    public double getAmount(Shape shape) {
        return shape.getArea() * coverage;
    }
}
