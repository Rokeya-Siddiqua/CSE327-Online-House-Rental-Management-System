package com.example.onlinehouserentalmanagement;


/**
 * record represent all of the house information.
 * non of the information can be empty.
 */
public class record {

        private String location;
        private String size;
        private String price;
        private String room;
        private String bathroom;
        private String garage;
        private String resident;
        private String service;
        private String facing;
        private String nearby;
        private String other;
        private String ptime;
        private String pet;
        private String contact;
        private String puri;


    /**
     * empty constructor make a null value object of the record class.
     * it doesn't contain any value.
     */
    public record() {

    }


    /**
     * Constructs ans Initialize the house information including pictures.
     * @param location  location of the house
     * @param size  size of the house in square per feet
     * @param price  rental price of the house in taka
     * @param room  total room number of the house
     * @param bathroom  total bathroom number of the house
     * @param garage  garage has or not in that house
     * @param resident  resident type of the house
     * @param service  service charge included or not with the house rental price
     * @param facing  facing direction of the house
     * @param nearby  has any school/University/High way nearby of the house
     * @param other  other information of the house if the landlord want to say
     * @param ptime  preferable visiting time to the house
     * @param pet  pet allowed or not in that house
     * @param contact  landlord contact number
     * @param puri  Picture of the house
     */
    public record(String location, String size, String price, String room, String bathroom, String garage, String resident, String service, String facing, String nearby, String other, String ptime, String pet, String contact, String puri) {
        this.location = location;
        this.size = size;
        this.price = price;
        this.room = room;
        this.bathroom = bathroom;
        this.garage = garage;
        this.resident = resident;
        this.service = service;
        this.facing = facing;
        this.nearby = nearby;
        this.other = other;
        this.ptime = ptime;
        this.pet = pet;
        this.contact = contact;
        this.puri = puri;
    }


    /**
     * Constructs ans Initialize the house information without pictures.
     * @param location  location of the house
     * @param size  size of the house in square per feet
     * @param price  rental price of the house in taka
     * @param room  total room number of the house
     * @param bathroom  total bathroom number of the house
     * @param garage  garage has or not in that house
     * @param resident  resident type of the house
     * @param service  service charge included or not with the house rental price
     * @param facing  facing direction of the house
     * @param nearby  has any school/University/High way nearby of the house
     * @param other  other information of the house if the landlord want to say
     * @param ptime  preferable visiting time to the house
     * @param pet  pet allowed or not in that house
     * @param contact  landlord contact number
     */
    public record(String location, String size, String price, String room, String bathroom, String garage, String resident, String service,
                  String facing, String nearby, String other, String ptime, String pet, String contact) {
        this.location = location;
        this.size = size;
        this.price = price;
        this.room = room;
        this.bathroom = bathroom;
        this.garage = garage;
        this.resident = resident;
        this.service = service;
        this.facing = facing;
        this.nearby = nearby;
        this.other = other;
        this.ptime = ptime;
        this.pet = pet;
        this.contact = contact;
    }


    /**
     * getLocation will send the house location.
      * @return location  location of the house.
     */
    public String getLocation() {
            return location;
        }

    /**
     * setLocation will set the house location.
     * @param location  it contain the house location.
     */
    public void setLocation(String location) {
            this.location = location;
        }


    /**
     * getSize will send the house size in square per feet
     * @return size  size of the house
     */
    public String getSize() {
        return size;
    }

    /**
     * setSize will set the house size in square per feet
     * @param size  size of the house
     */
        public void setSize(String size) {
            this.size = size;
        }


    /**
     * getPrice will send the house rental price in taka
     * @return price  rental price of the house
     */
    public String getPrice() {
            return price;
        }

    /**
     * setPrice will set the house rental price in taka
     * @param price  rental price of the house
     */
    public void setPrice(String price) {
            this.price = price;
        }

    /**
     * getRoom will send the total room number of the house
     * @return room  total room number of the house
     */
    public String getRoom() {
            return room;
        }

    /**
     * setRoom will set the total room number of the house
     * @param room  total room number of the house
     */
    public void setRoom(String room) {
            this.room = room;
        }

    /**
     * getBathroom will send total bathroom number of the house
     * @return bathroom  total bathroom number of the house
     */
    public String getBathroom() {
            return bathroom;
        }

    /**
     * setBathroom will set total bathroom number of the house
     * @param bathroom  total bathroom number of the house
     */
    public void setBathroom(String bathroom) {
            this.bathroom = bathroom;
        }

    /**
     * getGarage will send the information of house contain garage or not.
     * @return garage garage of the house.
     */
    public String getGarage() {
            return garage;
        }

    /**
     * setGarage will set the information of house contain garage or not.
     * @param garage  garage of the house.
     */
    public void setGarage(String garage) {
            this.garage = garage;
        }

    /**
     * getResident will send the resident type.
     * @return resident resident type.
     */
    public String getResident() {
            return resident;
        }

    /**
     * setResident will set the resident type.
     * @param resident  resident type.
     */
    public void setResident(String resident) {
            this.resident = resident;
        }

    /**
     * getService will send the information of house service charge included with the rental price or not.
     * @return service  service charge included or not
     */
    public String getService() {
            return service;
        }

    /**
     * setService will set the information of house service charge included with the rental price or not.
     * @param service  service charge included or not
     */
    public void setService(String service) {
            this.service = service;
        }

    /**
     * getFacing will send the information of facing direction of the house.
     * @return facing  facing direction of the house
     */
    public String getFacing() {
            return facing;
        }

    /**
     * setFacing will set the information of facing direction of the house.
     * @param facing  facing direction of the house
     */
    public void setFacing(String facing) {
            this.facing = facing;
        }

    /**
     * getNearby will send the information if has any school/University/High way nearby of the house
     * @return nearby  nearby school/University/High way
     */
    public String getNearby() {
            return nearby;
        }

    /**
     * setNearby will set the information if has any school/University/High way nearby of the house.
     * @param nearby  nearby school/University/High way.
     */
    public void setNearby(String nearby) {
            this.nearby = nearby;
        }

    /**
     * getOther will send other information of the house if the landlord want to say
     * @return other  other information
     */
    public String getOther() {
            return other;
        }

    /**
     * setOther will set other information of the house if the landlord want to say
     * @param other  other information
     */
    public void setOther(String other) {
            this.other = other;
        }

    /**
     * getPtime will send the preferable visiting time to the house.
     * @return ptime  preferable visiting time to the house.
     */
    public String getPtime() {
            return ptime;
        }

    /**
     * setPtime will set the preferable visiting time to the house.
     * @param ptime  preferable visiting time to the house.
     */
    public void setPtime(String ptime) {
            this.ptime = ptime;
        }

    /**
     * getPet will send the information if pet allowed or not in that house
     * @return pet  pet allowed or not in that house
     */
    public String getPet() {
            return pet;
        }

    /**
     * setPet will set the information if pet allowed or not in that house
     * @param pet  pet allowed or not in that house
     */
    public void setPet(String pet) {
            this.pet = pet;
        }

    /**
     * getContact will send the landlord contact number
     * @return contact  landlord contact number
     */
    public String getContact() {
            return contact;
        }

    /**
     * setContact will set the landlord contact number
     * @param contact  landlord contact number
     */
    public void setContact(String contact) {
            this.contact = contact;
        }

    /**
     * getPuri will send the picture uri of that house
     * @return puri  picture uri
     */
    public String getPuri() {
        return puri;
    }

    /**
     * setPuri will set the picture uri of that house
     * @param puri  picture uri
     */
    public void setPuri(String puri) {
        this.puri = puri;
    }

}
