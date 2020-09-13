package ru.mirea.lab3.num4;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        center  = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + " x = " + center.x + " y = " + center.y +
                '}';
    }

    @Override
    public void moveUp() {
        center.x += xSpeed;
        center.y += ySpeed;
    }

    @Override
    public void moveDown() {
        center.x -= xSpeed;
        center.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        center.y -= ySpeed;
    }
}
