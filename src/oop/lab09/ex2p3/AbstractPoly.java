package oop.lab09.ex2p3;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        double[] thisCoefficients = coefficients();
        double[] thatCoefficients = ((AbstractPoly) o).coefficients();

        if (thisCoefficients.length != thatCoefficients.length) {
            return false;
        }

        for (int degree = 0; degree < thisCoefficients.length; degree++) {
            if (thisCoefficients[degree] != thatCoefficients[degree]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {

    }
}
