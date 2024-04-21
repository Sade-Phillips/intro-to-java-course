package com.cbfacademy.shapes;

public abstract class Shape {
    private String name;

    protected Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String getName() {
        return name;
    }
}