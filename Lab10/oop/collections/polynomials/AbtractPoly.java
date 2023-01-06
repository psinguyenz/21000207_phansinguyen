package com.oop.collections.polynomials;
import java.util.Objects;
public abstract class AbtractPoly implements Poly{
    double[] derive() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
