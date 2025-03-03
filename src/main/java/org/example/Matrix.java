package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private int size;
    private double[] simplearr;

    private boolean actualdeterminant = false;
    private double determinamt = 1;


    public double getIJ(int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            return simplearr[i * size + j];
        } else throw new IllegalArgumentException();

    }

    public void setIJ(int i, int j, double newelement) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            simplearr[i * size + j] = newelement;
            actualdeterminant = false;
        }
    }

    public void setArray(double[] array) {
//        for(int i=0; i<size;i++ )
//        {
//            for (int j=0; j<size;j++){
//                setIJ(i, j, elem);
//            }
//        }
        simplearr = array;
    }

    static void swap(double arr[], int size, int i1, int i2, int j1, int j2) {
        double bufer = arr[i1 * size + j1];
        arr[i1 * size + j1] = arr[i2 * size + j2];
        arr[i2 * size + j2] = bufer;
    }

    public double getDeterminamt() {
        if (!actualdeterminant) {
            actualdeterminant = true;
            determinamt = 1;
            int index;
            double[] copy = Arrays.copyOf(simplearr, size * size);
            double coef = 0;
            for (int i = 0; i < size - 1; i++) {
                index = i;
                while (index < size && copy[index * size + i] == 0) {
                    index++;
                }
                if (index == size) {
                    actualdeterminant = false;
                    determinamt = 0;
                    return determinamt;
                }
                if (index != i) {
                    for (int a = 0; a < size; a++) {
                        swap(copy, size, index, a, i, a);
                    }
                    determinamt *= Math.pow(-1, index - 1);
                }
                for (int j =i + 1; j < size; j++) {
                    coef = copy[j * size + i] / copy[i * size + i];
                    for (int b = 0; b < size; b++) {
                        copy[j * size + b] -= copy[i * size + b] * coef;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                determinamt *= copy[i * size + i];
            }
            return determinamt;
        }
        return determinamt;
    }


    public Matrix(int size) {// Конструктор при с условием положителльной размрености массива
        this.size = size;
        if (size > 0) {
            this.simplearr = new double[size * size];
        } else throw new IllegalArgumentException();
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return size == matrix.size && actualdeterminant == matrix.actualdeterminant && Double.compare(determinamt, matrix.determinamt) == 0 && Objects.deepEquals(simplearr, matrix.simplearr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.hashCode(simplearr), actualdeterminant, determinamt);
    }
}
