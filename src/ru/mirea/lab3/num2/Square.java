package ru.mirea.lab3.num2;

public class Square extends Rectangle{
    public Square(){
        width = 0;
        length = 0;
        color = "white";
        filled = false;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
