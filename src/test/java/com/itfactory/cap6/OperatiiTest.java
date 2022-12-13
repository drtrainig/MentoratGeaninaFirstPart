package com.itfactory.cap6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatiiTest {

    private Operatii operatii;

    @Before
    public void init() {
        operatii = new Operatii();
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Test
    public void testSum() {
        int sum = operatii.sum(5, 10);
        assertEquals(15, sum);
    }

    @Test
    public void testDiff() {
        int diff = operatii.diff(5, 10);
        assertEquals(-5, diff);
    }

}
