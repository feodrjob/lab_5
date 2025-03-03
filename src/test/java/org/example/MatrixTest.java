package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest {
    Matrix matrix1 = new Matrix(3);
    Matrix matrix2 = new Matrix(3);
    Matrix matrix3 = new Matrix(3);
    Matrix matrix4 = new Matrix(4);



    @Before
    public void setUp() throws Exception{
        matrix1.setArray( new double []{1,2,3,
                3,3,3,
                6,7,8}
        );
        matrix2.setArray(new double []{1,1,1,2,2,2,3,3,3});
        matrix3.setArray(new double []{1,2,3,4,5,6,7,8,9});
    }




    @Test
    public void getIJ(){
        Assert.assertEquals(3,matrix1.getIJ(1,0),000.1);
    }

    @Test
    public void setIJ()
    {
        matrix2.setIJ(0,0,5);
        Assert.assertEquals(5,matrix2.getIJ(0,0),0.001);
    }

    @Test
    public void getDeterminant()
    {
        Assert.assertEquals(0,matrix1.getDeterminamt(),0.001);
    }

    @Test
    public void ActualDeterminant()
    {
        matrix3.getDeterminamt();// 0
        matrix3.setIJ(0,0,5);
        Assert.assertEquals(5,matrix3.getIJ(0,0),0.001);
        Assert.assertEquals(-12,matrix3.getDeterminamt(),0.001);
    }

    @Test
    public void getSize()
    {
        Assert.assertEquals(3,matrix1.getSize(),0.001);
    }
}


