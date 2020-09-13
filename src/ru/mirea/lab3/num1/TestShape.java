package ru.mirea.lab3.num1;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(2, 4, "black", true);
        Shape square = new Square(1);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
