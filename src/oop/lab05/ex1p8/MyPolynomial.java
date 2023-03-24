package oop.lab05.ex1p8;

public class MyPolynomial {
    private int[] coeffs;

    public MyPolynomial(int ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public String toString() {
        StringBuilder poly = new StringBuilder("");
        for (int i = this.getDegree(); i >= 0; i++) {
            poly.append(coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        poly.delete(poly.length() - 3, poly.length());
        return poly.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int minDegree = Math.min(this.getDegree(), right.getDegree());
        int maxDegree = Math.max(this.getDegree(), right.getDegree());

        int[] addPolyCoeffs = new int[maxDegree + 1];
        for (int i = 0; i <= minDegree; i++) {
            addPolyCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }

        if (this.getDegree() > right.getDegree()) {
            for (int i = minDegree + 1; i <= maxDegree; i++) {
                addPolyCoeffs[i] = this.coeffs[i];
            }
        } else {
            for (int i = minDegree; i <= maxDegree; i++) {
                addPolyCoeffs[i] = right.coeffs[i];
            }
        }

        this.coeffs = addPolyCoeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int[] multiplyPolyCoeffs = new int[this.coeffs.length + right.coeffs.length - 1];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                multiplyPolyCoeffs[i + j] += this.coeffs[i] + right.coeffs[j];
            }
        }

        this.coeffs = multiplyPolyCoeffs;
        return this;
    }
}
