package oop.lab07.ex1p8;

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + this.x + "," + this.y
                + " speed=("
                + this.x + ", " + this.y + ")";
    }

    public void moveUp() {
        this.y -= ySpeed;
    }

    public void moveDown() {
        this.y += ySpeed;
    }

    public void moveLeft() {
        this.x -= xSpeed;
    }

    public void moveRight() {
        this.x += xSpeed;
    }

}
