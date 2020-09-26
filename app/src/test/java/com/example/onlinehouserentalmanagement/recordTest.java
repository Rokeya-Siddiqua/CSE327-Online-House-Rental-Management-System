package com.example.onlinehouserentalmanagement;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class recordTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("text cases has started");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("text cases are finished");
    }

    @Test (expected = NullPointerException.class)
    public void getLocationTest() {
        String actual = "Mirpur";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setLocation(actual);
        expected = r1.getLocation();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setLocation(null);
        expectNew = r2.getLocation();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setLocationTest() {
        String actual = "Mirpur";
        record r3 = new record();
        record r4 = new record();

        r3.setLocation(null);
        assertNull("location of object r3 is null", r3.getLocation());

        r4.setLocation(actual);
        assertNotNull("location of object r4 is not null", r4.getLocation());
        assertNotNull("object r4 is not null", r4);

        assertFalse("location of r3 and r4 is not equal",r3.getLocation()==r4.getLocation());

        assertNotEquals("Location of both r3 and r4 are not same", r3.getLocation(), r4.getLocation());
        assertNotSame("r3 and r4 are not same", r3, r4);


        r3.setLocation(actual);
        String expected = r3.getLocation();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getSizeTest() {
        String actual = "20.20";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setSize(actual);
        expected = r1.getSize();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setSize(null);
        expectNew = r2.getSize();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NumberFormatException.class)
    public void getSizeNumberFormatExceptionTest() {
        String actual = "20.20 square per feet";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setSize(actual);
        expected = r1.getSize();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setSize(null);
        expectNew = r2.getSize();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }


    @Test (expected = NullPointerException.class)
    public void setSizeTest() {
        String actual = "20.20 square per feet";
        String expected, expectedNew;
        record r7 = new record();
        record r8 = new record();

        r7.setSize(null);
        expected = r7.getSize();
        assertNull("size of object r7 is null", expected);

        r8.setSize(actual);
        expectedNew = r8.getSize();
        assertNotNull("size of object r8 is not null", expectedNew);
        assertNotNull("object r8 is not null", r8);

        assertFalse("size of r7 and r8 is not equal",expected==expectedNew);

        assertNotEquals("size of both r7 and r8 are not equal", expected, expectedNew);
        assertNotSame("r7 and r8 are not same", r7, r8);

        r7.setSize(actual);
        expected = r7.getSize();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setSizeIllegalArgumentExceptionTest() {
        String actual = "-50";
        String expectedNew;
        record r8 = new record();

        r8.setSize(actual);
        expectedNew = r8.getSize();
        assertNotNull("size of object r8 is not null", expectedNew);
        assertNotNull("object r8 is not null", r8);
    }

    @Test (expected = NumberFormatException.class)
    public void setSizeNumberFormatExceptionTest() {
        String actual = "fifty square feet";
        String expectedNew;
        record r8 = new record();

        r8.setSize(actual);
        expectedNew = r8.getSize();
        assertNotNull("size of object r8 is not null", expectedNew);
        assertNotNull("object r8 is not null", r8);
    }

    @Test (expected = NullPointerException.class)
    public void getPriceTest() {
        String actual = "2000";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setPrice(actual);
        expected = r1.getPrice();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setPrice(null);
        expectNew = r2.getPrice();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setPriceTest() {
        String actual = "20000";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setPrice(null);
        expected = r11.getPrice();
        assertNull("price is null", expected);

        r12.setPrice(actual);
        expectedNew = r12.getPrice();
        assertNotNull("price is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("price of these are not equal",expected==expectedNew);

        assertNotEquals("price of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setPrice(actual);
        expected = r11.getPrice();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setPriceIllegalArgumentExceptionTest() {
        String actual = "-500";
        String expectedNew;
        record r12 = new record();

        r12.setPrice(actual);
        expectedNew = r12.getPrice();
        assertNotNull("price is not null", expectedNew);
        assertNotNull("object is not null", r12);
    }

    @Test (expected = NumberFormatException.class)
    public void setPriceNumberFormatExceptionTest() {
        String actual = "2000 taka";
        String expectedNew;
        record r12 = new record();

        r12.setPrice(actual);
        expectedNew = r12.getPrice();
        assertNotNull("price is not null", expectedNew);
        assertNotNull("object is not null", r12);
    }

    @Test (expected = NullPointerException.class)
    public void getRoomTest() {
        String actual = "total room number 8";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setRoom(actual);
        expected = r1.getRoom();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setRoom(null);
        expectNew = r2.getRoom();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setRoomTest() {
        String actual = "total 5 rooms";
        String expected, expectedNew;
        record r15 = new record();
        record r16 = new record();

        r15.setRoom(null);
        expected = r15.getRoom();
        assertNull("room is null", expected);

        r16.setRoom(actual);
        expectedNew = r16.getRoom();
        assertNotNull("room is not null", expectedNew);
        assertNotNull("object is not null", r16);

        assertFalse("room of these are not equal",expected==expectedNew);

        assertNotEquals("room of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r15, r16);

        r15.setRoom(actual);
        expected = r16.getRoom();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setRoomIllegalArgumentExceptionTest() {
        String actual = "-5";
        String expectedNew;
        record r16 = new record();

        r16.setRoom(actual);
        expectedNew = r16.getRoom();
        assertNotNull("room is not null", expectedNew);
        assertNotNull("object is not null", r16);
    }

    @Test (expected = NumberFormatException.class)
    public void setRoomNumberFormatExceptionTest() {
        String actual = "five rooms";
        String expectedNew;
        record r16 = new record();

        r16.setRoom(actual);
        expectedNew = r16.getRoom();
        assertNotNull("room is not null", expectedNew);
        assertNotNull("object is not null", r16);
    }

    @Test (expected = NullPointerException.class)
    public void getBathroomTest() {
        String actual = "total 3 bathrooms";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setBathroom(actual);
        expected = r1.getBathroom();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setBathroom(null);
        expectNew = r2.getBathroom();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setBathroomTest() {
        String actual = "total 3 bathrooms";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setBathroom(null);
        expected = r11.getBathroom();
        assertNull("bathroom is null", expected);

        r12.setBathroom(actual);
        expectedNew = r12.getBathroom();
        assertNotNull("bathroom is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("bathroom of these are not equal",expected==expectedNew);

        assertNotEquals("bathroom of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setBathroom(actual);
        expected = r11.getBathroom();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setBathroomIllegalArgumentExceptionTest() {
        String actual = "-3";
        String expectedNew;
        record r12 = new record();

        r12.setBathroom(actual);
        expectedNew = r12.getBathroom();
        assertNotNull("bathroom is not null", expectedNew);
        assertNotNull("object is not null", r12);
    }

    @Test (expected = NumberFormatException.class)
    public void setBathroomNumberFormatExceptionTest() {
        String actual = "three bathrooms";
        String expectedNew;
        record r12 = new record();

        r12.setBathroom(actual);
        expectedNew = r12.getBathroom();
        assertNotNull("bathroom is not null", expectedNew);
        assertNotNull("object is not null", r12);
    }

    @Test (expected = NullPointerException.class)
    public void getGarageTest() {
        String actual = "yes! we have garage";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setGarage(actual);
        expected = r1.getGarage();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setGarage(null);
        expectNew = r2.getGarage();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setGarageTest() {
        String actual = "yes we have garage";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setGarage(null);
        expected = r11.getGarage();
        assertNull("garage is null", expected);

        r12.setGarage(actual);
        expectedNew = r12.getGarage();
        assertNotNull("garage is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("garage of these are not equal",expected==expectedNew);

        assertNotEquals("garage of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setGarage(actual);
        expected = r11.getGarage();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getResidentTest() {
        String actual = "apartment house";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setResident(actual);
        expected = r1.getResident();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setResident(null);
        expectNew = r2.getResident();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setResidentTest() {
        String actual = "private house";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setResident(null);
        expected = r11.getResident();
        assertNull("resident is null", expected);

        r12.setResident(actual);
        expectedNew = r12.getResident();
        assertNotNull("resident is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("resident of these are not equal",expected==expectedNew);

        assertNotEquals("resident of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setResident(actual);
        expected = r11.getResident();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getServiceTest() {
        String actual = "No! Service charge is not included";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setService(actual);
        expected = r1.getService();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setService(null);
        expectNew = r2.getService();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setServiceTest() {
        String actual = "No! Service charge is not included.";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setService(null);
        expected = r11.getService();
        assertNull("service charge is null", expected);

        r12.setService(actual);
        expectedNew = r12.getService();
        assertNotNull("service charge is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("service charge of these are not equal",expected==expectedNew);

        assertNotEquals("service charge of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setService(actual);
        expected = r11.getService();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getFacingTest() {
        String actual = "House facing direction is North";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setFacing(actual);
        expected = r1.getFacing();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setFacing(null);
        expectNew = r2.getFacing();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setFacingTest() {
        String actual = "facing direction is south";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setFacing(null);
        expected = r11.getFacing();
        assertNull("facing direction is null", expected);

        r12.setFacing(actual);
        expectedNew = r12.getFacing();
        assertNotNull("facing direction is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("facing durection of these are not equal",expected==expectedNew);

        assertNotEquals("facing direction of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setFacing(actual);
        expected = r11.getFacing();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getNearbyTest() {
        String actual = "House is near by a School and a College";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setNearby(actual);
        expected = r1.getNearby();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setNearby(null);
        expectNew = r2.getNearby();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setNearbyTest() {
        String actual = "Near by university and market";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setNearby(null);
        expected = r11.getNearby();
        assertNull("nearby is null", expected);

        r12.setNearby(actual);
        expectedNew = r12.getNearby();
        assertNotNull("nearby is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("nearby of these are not equal",expected==expectedNew);

        assertNotEquals("nearby of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setNearby(actual);
        expected = r11.getNearby();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getOtherTest() {
        String actual = "welcome to our house";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setOther(actual);
        expected = r1.getOther();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setOther(null);
        expectNew = r2.getOther();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setOtherTest() {
        String actual = "welcome to our home";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setOther(null);
        expected = r11.getOther();
        assertNull("other is null", expected);

        r12.setOther(actual);
        expectedNew = r12.getOther();
        assertNotNull("other is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("other of these are not equal",expected==expectedNew);

        assertNotEquals("other of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setOther(actual);
        expected = r11.getOther();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getPtimeTest() {
        String actual = "08:30am-07:00pm";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setPtime(actual);
        expected = r1.getPtime();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setPtime(null);
        expectNew = r2.getPtime();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setPtimeTest() {
        String actual = "08:00am - 08:00pm";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setPtime(null);
        expected = r11.getPtime();
        assertNull("preferable visiting time is null", expected);

        r12.setPtime(actual);
        expectedNew = r12.getPtime();
        assertNotNull("preferable bisiting time is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("preferable visiting time of these are not equal",expected==expectedNew);

        assertNotEquals("preferable visiting time of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setPtime(actual);
        expected = r11.getPtime();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getPetTest() {
        String actual = "No! no pet is allowed here";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setPet(actual);
        expected = r1.getPet();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setPet(null);
        expectNew = r2.getPet();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setPetTest() {
        String actual = "yes! you can bring your pet.";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setPet(null);
        expected = r11.getPet();
        assertNull("pet is null", expected);

        r12.setPet(actual);
        expectedNew = r12.getPet();
        assertNotNull("pet is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("pet of these are not equal",expected==expectedNew);

        assertNotEquals("pet of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setPet(actual);
        expected = r11.getPet();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getContactTest() {
        String actual = "01198954997";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setContact(actual);
        expected = r1.getContact();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setContact(null);
        expectNew = r2.getContact();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setContactTest() {
        String actual = "01191526119";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setContact(null);
        expected = r11.getContact();
        assertNull("contact is null", expected);

        r12.setContact(actual);
        expectedNew = r12.getContact();
        assertNotNull("contact is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("contact of these are not equal",expected==expectedNew);

        assertNotEquals("contact of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setContact(actual);
        expected = r11.getContact();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void getPuriTest() {
        String actual = "https://com.google.com";
        String expected, expectNew;
        record r1 = new record();
        record r2 = new record();

        r1.setPuri(actual);
        expected = r1.getPuri();

        assertEquals("expected and actual values are equal",expected,actual);
        assertSame("expected and actual values are same", expected, actual);
        assertTrue("Yes! expected and actual values are equal", expected==actual);
        assertFalse("No! these objects are not equal",r1==r2);
        assertNotNull("value is not null", expected);

        r2.setPuri(null);
        expectNew = r2.getPuri();
        assertNull("value is null",expectNew);
        assertNotSame("expected and actual values are not same",expectNew,actual);
        assertNotEquals("expected and actual values are not equal",expectNew,actual);
    }

    @Test (expected = NullPointerException.class)
    public void setPuriTest() {
        String actual = "https://com.google.com";
        String expected, expectedNew;
        record r11 = new record();
        record r12 = new record();

        r11.setPuri(null);
        expected = r11.getPuri();
        assertNull("picture link is null", expected);

        r12.setPuri(actual);
        expectedNew = r12.getPuri();
        assertNotNull("picture link is not null", expectedNew);
        assertNotNull("object is not null", r12);

        assertFalse("picture link of these are not equal",expected==expectedNew);

        assertNotEquals("picture link of these are not equal", expected, expectedNew);
        assertNotSame("these are not same", r11, r12);

        r11.setPuri(actual);
        expected = r11.getPuri();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }
}