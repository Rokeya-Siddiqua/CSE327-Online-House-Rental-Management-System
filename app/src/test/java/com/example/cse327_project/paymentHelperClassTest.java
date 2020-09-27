package com.example.cse327_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class paymentHelperClassTest {

    @Before
    public void setUp() throws Exception
    {

    paymentHelperClass p1 = new paymentHelperClass();

    }
    @After
    public void tearDown() throws Exception
    {

    System.out.println("tests are completed");

    }


    @Test (expected = NullPointerException.class)
    public void getName()
    {
    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "Rimi";
    String expected, expectNew;

    p1.setName(actual);
    expected = p1.getName();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setName(null);
    expectNew = p2.getName();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setName()
    {

    String actual = "Rimi";
    paymentHelperClass p3 = new paymentHelperClass();
    paymentHelperClass p4 = new paymentHelperClass();

    p3.setName(null);
    assertNull("Name of object p3 is null", p3.getName());

    p4.setName(actual);
    assertNotNull("Name of object p4 is not null", p4.getName());
    assertNotNull("object p4 is not null", p4);

    assertFalse("Name of p3 and p4 is not equal",p3.getName() == p4.getName() );
    assertNotEquals("Name of both p3 and p4 are not same", p3.getName(), p4.getName());
    assertNotSame("p3 and p4 are not same", p3, p4);

    p3.setName(actual);
    String expected = p3.getName();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void getTime()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "2:40";
    String expected, expectNew;

    p1.setTime(actual);
    expected = p1.getTime();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setTime(null);
    expectNew = p2.getTime();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setTime()
    {

    String actual = "2:40";
    String expected, expectedNew;
    paymentHelperClass p5 = new paymentHelperClass();
    paymentHelperClass p6 = new paymentHelperClass();

    p5.setTime(null);
    expected = p5.getTime();
    assertNull("size of object p5 is null", expected);

    p6.setTime(actual);
    expectedNew = p6.getTime();
    assertNotNull("p6 is not null", expectedNew);
    assertNotNull("p6 is not null", p6);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p5, p6);

    p5.setTime(actual);
    expected = p5.getTime();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void getMail()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "nusrat@gmail.com";
    String expected, expectNew;

    p1.setMail(actual);
    expected = p1.getMail();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setMail(null);
    expectNew = p2.getMail();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setMail()
    {

    String actual = "nusrat@gmail.com";
    String expected, expectedNew;
    paymentHelperClass p7 = new paymentHelperClass();
    paymentHelperClass p8 = new paymentHelperClass();

    p7.setMail(null);
    expected = p7.getMail();
    assertNull("p7 is null", expected);

    p8.setMail(actual);
    expectedNew = p8.getMail();
    assertNotNull("p8 is not null", expectedNew);
    assertNotNull("p8 is not null", p8);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p7, p8);

    p7.setMail(actual);
    expected = p7.getMail();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void getDate()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "23/09/2020";
    String expected, expectNew;

    p1.setDate(actual);
    expected = p1.getDate();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setDate(null);
    expectNew = p2.getDate();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setDate()
    {

    String actual = "nusrat@gmail.com";
    String expected, expectedNew;
    paymentHelperClass p9 = new paymentHelperClass();
    paymentHelperClass p10 = new paymentHelperClass();

    p9.setDate(null);
    expected = p9.getDate();
    assertNull("p9 is null", expected);

    p10.setDate(actual);
    expectedNew = p10.getDate();
    assertNotNull("p10 is not null", expectedNew);
    assertNotNull("p10 is not null", p10);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p9, p10);

    p9.setDate(actual);
    expected = p9.getDate();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);


    }

    @Test (expected = NullPointerException.class)
    public void getTenantType()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "student";
    String expected, expectNew;

    p1.setTenantType(actual);
    expected = p1.getTenantType();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setTenantType(null);
    expectNew = p2.getTenantType();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setTenantType()
    {

    String actual = "student";
    String expected, expectedNew;
    paymentHelperClass p11 = new paymentHelperClass();
    paymentHelperClass p12 = new paymentHelperClass();

    p11.setTenantType(null);
    expected = p11.getTenantType();
    assertNull("p11 is null", expected);

    p12.setTenantType(actual);
    expectedNew = p12.getTenantType();
    assertNotNull("p12 is not null", expectedNew);
    assertNotNull("p12 is not null", p12);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p11, p12);

    p11.setTenantType(actual);
    expected = p11.getTenantType();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }


    @Test (expected = NullPointerException.class)
    public void getPhone()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "01788899999";
    String expected, expectNew;

    p1.setPhone(actual);
    expected = p1.getPhone();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setPhone(null);
    expectNew = p2.getPhone();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setPhone()
    {

    String actual = "01788899999";
    String expected, expectedNew;
    paymentHelperClass p13 = new paymentHelperClass();
    paymentHelperClass p14 = new paymentHelperClass();

    p13.setPhone(null);
    expected = p13.getPhone();
    assertNull("p13 is null", expected);

    p14.setPhone(actual);
    expectedNew = p14.getPhone();
    assertNotNull("p14 is not null", expectedNew);
    assertNotNull("p14 is not null", p14);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p13, p14);

    p13.setPhone(actual);
    expected = p13.getPhone();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void getBkash()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "Bkash";
    String expected, expectNew;

    p1.setBkash(actual);
    expected = p1.getBkash();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setBkash(null);
    expectNew = p2.getBkash();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setBkash()
    {

    String actual = "Bkash";
    String expected, expectedNew;
    paymentHelperClass p15 = new paymentHelperClass();
    paymentHelperClass p16 = new paymentHelperClass();

    p15.setBkash(null);
    expected = p15.getBkash();
    assertNull("p15 is null", expected);

    p16.setBkash(actual);
    expectedNew = p16.getBkash();
    assertNotNull("p16 is not null", expectedNew);
    assertNotNull("p16 is not null", p16);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p15, p16);

    p15.setBkash(actual);
    expected = p15.getBkash();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }

    @Test (expected = NullPointerException.class)
    public void getRocket()
    {

    paymentHelperClass p1 = new paymentHelperClass();
    paymentHelperClass p2 = new paymentHelperClass();

    String actual = "Rocket";
    String expected, expectNew;

    p1.setRocket(actual);
    expected = p1.getRocket();

    assertEquals("expected and actual values are equal",expected,actual);
    assertSame("expected and actual values are same", expected, actual);
    assertTrue("Yes! expected and actual values are equal", expected==actual);
    assertFalse("No! these objects are not equal",p1==p2);
    assertNotNull("value is not null", expected);

    p2.setRocket(null);
    expectNew = p2.getRocket();
    assertNull("value is null",expectNew);
    assertNotSame("expected and actual values are not same",expectNew,actual);
    assertNotEquals("expected and actual values are not equal",expectNew,actual);

    }

    @Test (expected = NullPointerException.class)
    public void setRocket()
    {

    String actual = "Rocket";
    String expected, expectedNew;
    paymentHelperClass p17 = new paymentHelperClass();
    paymentHelperClass p18 = new paymentHelperClass();

    p17.setRocket(null);
    expected = p17.getRocket();
    assertNull("p17 is null", expected);

    p18.setRocket(actual);
    expectedNew = p18.getRocket();
    assertNotNull("p18 is not null", expectedNew);
    assertNotNull("p18 is not null", p18);

    assertFalse("not equal",expected==expectedNew);

    assertNotEquals(" both are not equal", expected, expectedNew);
    assertNotSame("not same", p17, p18);

    p17.setRocket(actual);
    expected = p17.getRocket();
    assertEquals(expected,actual);
    assertTrue("Yes expected and actual values are equal.", expected==actual);
    assertSame(expected, actual);

    }
}