package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpTraingleMatrixTest {
    UpTraingleMatrix utm1 = new UpTraingleMatrix(3);
    UpTraingleMatrix utm2 = new UpTraingleMatrix(3);

    @Before
    public void setUp() throws Exception{
        utm1.setArray( new double[]{
                1,2,3,
                0,4,5,
                0,0,6
        });
        utm2.setArray(new double []{
                1,2,3,
                0,4,5,
                0,0,6
        });

    }

    @Test
    public void getIJ()
    {
        Assert.assertEquals(0,utm1.getIJ(1,0),0.001);
    }

    @Test
    public void setIJ1()
    {
        utm1.setIJ(0,0,0);
        Assert.assertEquals(0,utm1.getIJ(0,0),0.001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIdexOutOfBounds()
    {
        utm1.setIJ(3,1,1);
    }

    @Test
    public void getDeterminant()
    {
        Assert.assertEquals(24,utm2.getDeterminamt(),0.001);
    }

    @Test
    public void getSize()
    {
        Assert.assertEquals(3,utm1.getSize(),0.001);
    }
}
