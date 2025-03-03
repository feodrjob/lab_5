package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiagMatrixTest {
    DiagMatrix dmtr1 = new DiagMatrix(3);
    DiagMatrix dmtr2 = new DiagMatrix(3);


    @Before
    public void setUp() throws Exception
    {
        dmtr1.setArray(new double []{
                1,0,0,
                0,2,0,
                0,0,3
        });

        dmtr2.setArray(new double []{
                1,0,0,
                0,2,0,
                0,0,3
        });

    }

    @Test
    public void getIJ()
    {
        Assert.assertEquals(1,dmtr1.getIJ(0,0),0.001);
    }

    @Test
    public void setIJ()
    {
        dmtr1.setIJ(0,0,2);
        Assert.assertEquals(2,dmtr1.getIJ(0,0),0.001);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBound()
    {
        dmtr1.setIJ(0,1,1);
    }

    @Test
    public void getDeterminant()
    {
        Assert.assertEquals(6,dmtr2.getDeterminamt(),0.001);
    }
    
}
