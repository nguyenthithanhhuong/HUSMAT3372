package oop.lab05.ex1p7.service;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return this.real + "+" + this.imag + "i";
    }

    public boolean isReal() {
        if (Double.compare(this.imag, 0.0) == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (Double.compare(this.real, 0.0) == 0 && Double.compare(this.imag, 0.0) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
}
