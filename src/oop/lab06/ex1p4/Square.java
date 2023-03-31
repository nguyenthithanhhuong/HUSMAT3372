package oop.lab06.ex1p4;

public class Square extends Rectangle{
    public Square() {
        super();
        double side = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square["
                + super.toString()
                + ",width=" + super.getWidth()
                + ",length=" + super.getLength()
                + "]";
    }
}
