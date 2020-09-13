package ru.mirea.lab3.num5;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, x2, y2, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x1, y1, x2, y2, xSpeed, ySpeed);
    }

    public void CheckSpeed() {
        if (topLeft.xSpeed != bottomRight.xSpeed && topLeft.ySpeed != bottomRight.ySpeed) {
            topLeft.xSpeed = bottomRight.xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed;
        }
    }

    @Override
    public void moveUp() {
        topLeft.y1 += topLeft.ySpeed;
        bottomRight.y2 += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y1 -= topLeft.ySpeed;
        bottomRight.y2 -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x1 -= topLeft.xSpeed;
        bottomRight.x2 -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x1 += topLeft.xSpeed;
        bottomRight.x2 += bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + "{" + topLeft.x1 + ", " + topLeft.y1 + "}" +
                ", bottomRight=" + "{" + bottomRight.x2 + ", " + bottomRight.y2 + "}" +
                '}';
    }
}
