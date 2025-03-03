package org.example;

public class DiagMatrix extends Matrix {
    public DiagMatrix(int size) {
        super(size);
    }

    @Override
    public double getIJ(int i, int j) {
        return super.getIJ(i, j);
    }

    @Override
    public void setIJ(int i, int j, double newelement) {
        if (i == j)
        {
            super.setIJ(i, j, newelement);
        }
        else
        {
            throw new IndexOutOfBoundsException("You are trying to set an element up or down the main diagonal");

        }
    }

    @Override
    public void setArray(double[] array) {
        super.setArray(array);
    }

    @Override
    public double getDeterminamt() {
        return super.getDeterminamt();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
