package oop.lab05.ex2p8.service;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[radius=" + this.radius
                + ",center=" + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public double Circumference() {
        return 2*Math.PI*this.radius;
    }

    public double distance(MyCircle another) {
        int xDiff = this.getCenterX() - another.getCenterX();
        int yDiff = this.getCenterY() - another.getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
