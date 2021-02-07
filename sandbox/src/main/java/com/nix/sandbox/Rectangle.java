package com.nix.sandbox;

public class Rectangle {

    public double b;
    public double c;

    public Rectangle(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public double rectangleArea() {
        return this.b * this.c;
    }
}
