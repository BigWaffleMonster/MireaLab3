package ru.mirea.lab3.num2;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0;
        length = 0;
        color = "white";
        filled = false;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "white";
        filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        double a = getArea();
        double b = getPerimeter();
        return "Area is " + a + ", Perimeter is " + b + ", Color is " + color +
                ", Filled is " + filled;
    }
}
