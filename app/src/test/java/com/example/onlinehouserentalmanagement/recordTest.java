package com.example.onlinehouserentalmanagement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class recordTest {

    @Before
    public void setUp() throws Exception {
        record r1 = new record();
    }

    @After
    public void tearDown() throws Exception {
        record r1 = new record();
    }

    @Test
    public void getLocationTest() {
        String actual = "Mirpur"; String n = null;
        record r1 = new record();
        r1.setLocation(actual);
        String expected = r1.getLocation();
        record r2 = new record();

        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertFalse("r1 and r2 is not equal",r1==r2);
        assertNotNull("object r1 is not null", r1);
        assertNotNull("object r2 is null", r2);
        assertNull(n);
        assertSame(expected, actual);
        assertNotSame("r1 and r2 are not same", r1, r2);
    }

    @Test
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

    @Test
    public void getSizeTest() {
        String actual = "20.20sq/ft";
        record r5 = new record();
        r5.setSize(actual);
        String expected = r5.getSize();
        assertEquals(expected,actual);
        record r6 = new record();
    }

    @Test
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

    @Test
    public void getPriceTest() {
        String actual = "20000 taka";
        record r9 = new record();
        r9.setPrice(actual);
        String expected = r9.getPrice();
        assertEquals(expected,actual);
        record r10 = new record();
    }

    @Test
    public void setPriceTest() {
        String actual = "20000 taka";
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

    @Test
    public void getRoomTest() {
        String actual = "total 5 rooms";
        record r13 = new record();
        r13.setRoom(actual);
        String expected = r13.getRoom();
        assertEquals(expected,actual);
        record r14;
    }

    @Test
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

    @Test
    public void getBathroomTest() {
        String actual = "total bathroom number 2";
        record r1 = new record();
        r1.setBathroom(actual);
        String expected = r1.getBathroom();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getGarageTest() {
        String actual = "yes! we have garage.";
        record r1 = new record();
        r1.setGarage(actual);
        String expected = r1.getGarage();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getResidentTest() {
        String actual = "Private house";
        record r1 = new record();
        r1.setResident(actual);
        String expected = r1.getResident();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getServiceTest() {
        String actual = "No. Service charge is not included.";
        record r1 = new record();
        r1.setService(actual);
        String expected = r1.getService();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getFacingTest() {
        String actual = "Facing direction is North";
        record r1 = new record();
        r1.setFacing(actual);
        String expected = r1.getFacing();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getNearbyTest() {
        String actual = "Near by a School and a College";
        record r1 = new record();
        r1.setNearby(actual);
        String expected = r1.getNearby();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getOtherTest() {
        String actual = "welcome to our house!";
        record r1 = new record();
        r1.setOther(actual);
        String expected = r1.getOther();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getPtimeTest() {
        String actual = "08:00am-08:00pm";
        record r1 = new record();
        r1.setPtime(actual);
        String expected = r1.getPtime();
        assertEquals(expected,actual);
    }

    @Test
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
        expected = r11.getPrice();
        assertEquals(expected,actual);
        assertTrue("Yes expected and actual values are equal.", expected==actual);
        assertSame(expected, actual);
    }

    @Test
    public void getPetTest() {
        String actual = "Yes! you can bring your pet.";
        record r1 = new record();
        r1.setPet(actual);
        String expected = r1.getPet();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getContactTest() {
        String actual = "01191526119";
        record r1 = new record();
        r1.setContact(actual);
        String expected = r1.getContact();
        assertEquals(expected,actual);
    }

    @Test
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

    @Test
    public void getPuriTest() {
        String actual = "https://com.google.com";
        record r1 = new record();
        r1.setPuri(actual);
        String expected = r1.getPuri();
        assertEquals(expected,actual);
    }

    @Test
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