package ru.mirea.lab3.num4;

import ru.mirea.lab3.num2.Circle;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1, 1, 1, 1);
        System.out.println(p);
        MovableCircle c = new MovableCircle(2, 3, 2, 2, 3);
        p.moveRight();
        System.out.println(c);
    }
}
