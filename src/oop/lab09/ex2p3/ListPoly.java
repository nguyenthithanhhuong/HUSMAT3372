package oop.lab09.ex2p3;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListPoly extends AbstractPoly {
    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        super();
        this.coefficients = new LinkedList<>();
        for (double coefficient : coeffs) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {

    }

    @Override
    public double[] coefficients(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {

    }
}
