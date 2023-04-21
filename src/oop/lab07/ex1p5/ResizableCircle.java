package oop.lab07.ex1p5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return "Resizable["
                + super.toString()
                + "]";
    }

    @Override
    public double resize(int percent) {
        return super.radius *= percent/100;
    }
}
