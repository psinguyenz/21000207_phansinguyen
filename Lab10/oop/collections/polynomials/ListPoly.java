package com.oop.collections.polynomials;
import java.util.*;

public class ListPoly extends AbtractPoly{
    List<Double> coefficients;
    public ListPoly (double[] coeffs) {
        for(int i=0; i<coeffs.length; i++) {
            coefficients.add(coeffs[i]);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] target = new double[coefficients.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = coefficients.get(i);
        }
        return target;
    }
}
