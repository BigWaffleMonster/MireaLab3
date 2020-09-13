package ru.mirea.lab3.num5;

public class MovablePoint implements Movable{
    int x1;
    int y1;
    int x2;
    int y2;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y1 += ySpeed;
        y2 += ySpeed;
    }

    @Override
    public void moveDown() {
        y1 -= ySpeed;
        y2 -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x1 -= xSpeed;
        x2 -= xSpeed;
    }

    @Override
    public void moveRight() {
        x1 += xSpeed;
        x2 += xSpeed;
    }
}
