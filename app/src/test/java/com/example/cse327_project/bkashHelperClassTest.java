package com.example.cse327_project;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class bkashHelperClassTest {

    @Before
    public void setUp() throws Exception
    {
        bkashHelperClass b1 = new bkashHelperClass();
    }

    @Test
    public void getAccountNumber()
    {
        bkashHelperClass b1 = new bkashHelperClass();
        bkashHelperClass b2 = new bkashHelperClass();

        String actual = "7879";
        String expected, expectNew;

        b1.setAccountNumber(actual);
        expected = b1.getAccountNumber();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",b1==b2);
        assertNotNull("value is not null", expected);

        b2.setAccountNumber(null);
        expectNew = b2.getAccountNumber();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test
    public void setAccountNumber()
    {
        String actual = "7879";
        String expected, expectedNew;

        bkashHelperClass b1 = new bkashHelperClass();
        bkashHelperClass b2 = new bkashHelperClass();

        b1.setAccountNumber(null);
        expected = b1.getAccountNumber();
        assertNull("b1 is null", expected);

        b2.setAccountNumber(actual);
        expectedNew = b2.getAccountNumber();
        assertNotNull("b2 is not null", expectedNew);
        assertNotNull("b2 is not null", b2);

        assertFalse("not equal",expected==expectedNew);

        assertNotEquals(" both are not equal", expected, expectedNew);
        assertNotSame("not same", b1, b2);

        b1.setAccountNumber(actual);
        expected = b1.getAccountNumber();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);


    }

    @Test
    public void getPin()
    {
        bkashHelperClass b1 = new bkashHelperClass();
        bkashHelperClass b2 = new bkashHelperClass();

        String actual = "88888";
        String expected, expectNew;

        b1.setPin(actual);
        expected = b1.getPin();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",b1==b2);
        assertNotNull("value is not null", expected);

        b2.setPin(null);
        expectNew = b2.getPin();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test
    public void setPin()
    {
        String actual = "88888";
        String expected, expectedNew;

        bkashHelperClass b3 = new bkashHelperClass();
        bkashHelperClass b4 = new bkashHelperClass();

        b3.setPin(null);
        expected = b3.getPin();
        assertNull("b3 is null", expected);

        b3.setPin(actual);
        expectedNew = b3.getPin();
        assertNotNull("b3 is not null", expectedNew);
        assertNotNull("b3 is not null", b3);

        assertFalse("not equal",expected==expectedNew);

        assertNotEquals(" both are not equal", expected, expectedNew);
        assertNotSame("not same", b3, b4);

        b3.setPin(actual);
        expected = b3.getPin();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);


    }

    @Test
    public void getAmount()
    {
        bkashHelperClass b1 = new bkashHelperClass();
        bkashHelperClass b2 = new bkashHelperClass();

        String actual = "12000";
        String expected, expectNew;

        b1.setAmount(actual);
        expected = b1.getAmount();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",b1==b2);
        assertNotNull("value is not null", expected);

        b2.setAmount(null);
        expectNew = b2.getAmount();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test
    public void setAmount()
    {
        String actual = "12000";
        String expected, expectedNew;

        bkashHelperClass b5 = new bkashHelperClass();
        bkashHelperClass b6 = new bkashHelperClass();

        b5.setAmount(null);
        expected = b5.getAmount();
        assertNull("b5 is null", expected);

        b6.setAmount(actual);
        expectedNew = b6.getAmount();
        assertNotNull("b6 is not null", expectedNew);
        assertNotNull("b6 is not null", b6);

        assertFalse("not equal",expected==expectedNew);

        assertNotEquals(" both are not equal", expected, expectedNew);
        assertNotSame("not same", b5, b6);

        b5.setAmount(actual);
        expected = b5.getAmount();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
        
    }
}