package oop.lab10.adapter.ex1;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius =radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return (this.getRadius() >= roundPeg.getRadius());
    }
}
