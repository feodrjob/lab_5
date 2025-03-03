package org.example;

public class UpTraingleMatrix extends Matrix {

    public UpTraingleMatrix(int size) {
        super(size);
    }

    @Override
    public double getIJ (int i, int j)
    {
        return super.getIJ(i,j);
    }

    @Override
    public void setIJ(int i, int j,double newelement)
    {
        if (j>=i)
        {
            super.setIJ(i,j,newelement);
        }
        else
        {
            throw new IndexOutOfBoundsException("You are trying to set an element below the main diagonal");
        }
    }

    @Override
    public double getDeterminamt()
    {
        return super.getDeterminamt();
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
