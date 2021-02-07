package com.nix.sandbox;

class TestProgram {
    public static void main(String[] args) {

        System.out.println("It's my test program");

        Square s = new Square(5);
        System.out.println("Area of square is: " + s.squareArea());

        Rectangle r = new Rectangle(10, 2.5);
        System.out.println("Area of rectangle is: " + r.rectangleArea());
    }
}