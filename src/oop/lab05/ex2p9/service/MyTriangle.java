package oop.lab05.ex2p9.service;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle["+ this.v1.toString()
                + "," + this.v2.toString()
                + "," + this.v3.toString() + "]";
    }

    public double getPerimeter() {
        return this.v1.distance(this.v2)
                + this.v1.distance(this.v3)
                + this.v2.distance(this.v3);
    }

    public String getType() {
        double dis12 = this.v1.distance(this.v2);
        double dis13 = this.v1.distance(this.v3);
        double dis23 = this.v2.distance(this.v3);

        if (dis12 == dis13 && dis13 == dis23) {
            return "Equilateral";
        }
        else if (dis12 == dis13 || dis12 == dis23 || dis13 == dis23) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
