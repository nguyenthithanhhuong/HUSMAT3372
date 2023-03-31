package oop.lab06.ex2p1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(beginY, endY);
    }

    public String toString() {
        return "MyLine["
                + begin.toString()
                + "," + end.toString() + "]";
    }

    public Point getBegin() {
        return this.begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setXY(beginX, beginY);
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
