package oop.lab06.ex2p1;

public class LineSub extends Point{
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "MyLine["
                + super.toString()
                + "," + end.toString() + "]";

    }

    public Point getBegin() {
        Point begin = new Point(super.getX(), super.getY());
        return begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    public int getLength() {
        int xDiff = this.getBeginX() - this.getBeginY();
        int yDiff = this.getEndX() - this.getEndY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = this.getBeginX() - this.getBeginY();
        int yDiff = this.getEndX() - this.getEndY();
        return Math.atan2(yDiff, xDiff);
    }
}
