package ru.mirea.lab3.num3;


public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius = 0;
        color = "white";
        filled = false;
    }

    public Circle(double radius){
        this.radius = radius;
        color = "white";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        double a = getArea();
        double b = getPerimeter();
        return "Area is " + a + ", Perimeter is " + b + ", Color is " + color +
                ", Filled is " + filled;
    }

}
