package ru.mirea.lab3.num2;

public class TestShapeNum2 {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(2, 4, "black", true);
        Shape square = new Square(1);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
