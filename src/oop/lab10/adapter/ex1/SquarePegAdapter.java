package oop.lab10.adapter.ex1;

import oop.lab10.adapter.ex1.RoundPeg;
import oop.lab10.adapter.ex1.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg adaptee;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.adaptee = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) Math.sqrt(this.adaptee.getWidth() * this.adaptee.getWidth() / 2);
    }
}
