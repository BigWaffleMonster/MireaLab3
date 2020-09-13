package ru.mirea.lab3.num5;

public class TestMovableNum5 {
    public static void main(String[] args) {
        Movable rectangle = new MovableRectangle(1, 2, 1, 2, 2, 4);
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
