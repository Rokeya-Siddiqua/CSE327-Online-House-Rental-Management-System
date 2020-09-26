package com.example.onlinehouserentalmanagement;


import android.widget.Toast;

import java.util.InputMismatchException;

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
     * this method will throw an NullPointerException exception if the location is empty.
      * @return location  location of the house.
     */
    public String getLocation() throws NullPointerException {
        if(location==null)
        {
            throw new NullPointerException("location can not be empty");
        }
            return location;
        }

    /**
     * setLocation will set the house location.
     * this method will throw an NullPointerException exception if the location is empty.
     * @param location  it contain the house location.
     */
    public void setLocation(String location) throws NullPointerException{
        if(location==null)
        {
            throw new NullPointerException("location can not be empty");
        }
            this.location = location;
        }


    /**
     * getSize will send the house size in square per feet.
     * this method will throw an NullPointerException exception if the size is not given.
     * @return size  size of the house.
     */
    public String getSize() throws NullPointerException {
        if(size==null)
        {
            throw new NullPointerException("size has not given.");
        }
        return size;
    }

    /**
     * setSize will set the house size in square per feet.
     * this method will throw an NullPointerException exception if the size is not given.
     * this method will throw an IllegalArgumentException exception if the size is less then zero.
     * this method will throw an NumberFormatException exception if the size is written in characters. Size must be given in digit format.
     * @param size  size of the house.
     */
        public void setSize(String size) throws NullPointerException {
            try{
                double s = Double.parseDouble(size);
                if (s<0)
                {
                    throw new IllegalArgumentException("size can not be less than zero");
                }
            }catch (NumberFormatException ex){
                throw new NumberFormatException("size can not be string");
            }
            if(size==null)
            {
                throw new NullPointerException("size is not given");
            }
            this.size = size;
        }


    /**
     * getPrice will send the house rental price in taka.
     * this method will throw an NullPointerException exception if the price is not given.
     * @return price  rental price of the house.
     */
    public String getPrice() throws NullPointerException{
        if(price==null)
        {
            throw new NullPointerException("price can not be empty");
        }
            return price;
        }

    /**
     * setPrice will set the house rental price in taka.
     * this method will throw an NullPointerException exception if the price is not given.
     * this method will throw an IllegalArgumentException exception if the price is less then zero.
     * this method will throw an NumberFormatException exception if the price is written in characters. Size must be given in digit format.
     * @param price  rental price of the house
     */
    public void setPrice(String price) throws NullPointerException{
        try{
            double s = Double.parseDouble(price);
            if (s<0)
            {
                throw new IllegalArgumentException("price can not be less than zero");
            }
        }catch (NumberFormatException ex){
            throw new NumberFormatException("price can not be string");
        }
        if(price==null)
        {
            throw new NullPointerException("price is not given");
        }
            this.price = price;
        }

    /**
     * getRoom will send the total room number of the house.
     * this method will throw an NullPointerException exception if the room number is not given.
     * @return room  total room number of the house.
     */
    public String getRoom() throws NullPointerException{
        if(room==null)
        {
            throw new NullPointerException("room number can not be empty");
        }
            return room;
        }

    /**
     * setRoom will set the total room number of the house.
     * this method will throw an NullPointerException exception if the room number is not given.
     * @param room  total room number of the house.
     */
    public void setRoom(String room) throws NullPointerException{
        try{
            double s = Integer.parseInt(room);
            if (s<0)
            {
                throw new IllegalArgumentException("room number can not be less than zero");
            }
        }catch (NumberFormatException ex){
            throw new NumberFormatException("room number can not be string");
        }
        if(room==null)
        {
            throw new NullPointerException("room number can not be empty");
        }
            this.room = room;
        }

    /**
     * getBathroom will send total bathroom number of the house.
     * this method will throw an NullPointerException exception if the bathroom number is not given.
     * @return bathroom  total bathroom number of the house.
     */
    public String getBathroom() throws NullPointerException{
        if(bathroom==null)
        {
            throw new NullPointerException("bathroom number can not be empty");
        }
            return bathroom;
        }

    /**
     * setBathroom will set total bathroom number of the house.
     * this method will throw an NullPointerException exception if the bathroom number is not given.
     * @param bathroom  total bathroom number of the house.
     */
    public void setBathroom(String bathroom) throws NullPointerException{
        try{
            double s = Integer.parseInt(bathroom);
            if (s<0)
            {
                throw new IllegalArgumentException("bathroom number can not be less than zero");
            }
        }catch (NumberFormatException ex){
            throw new NumberFormatException("bathroom number can not be string");
        }
        if(bathroom==null)
        {
            throw new NullPointerException("bathroom number can not be empty");
        }
            this.bathroom = bathroom;
        }

    /**
     * getGarage will send the information of house contain garage or not.
     * this method will throw an NullPointerException exception if the garage information is not given.
     * @return garage garage of the house.
     */
    public String getGarage() throws NullPointerException{
        if(garage==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return garage;
        }

    /**
     * setGarage will set the information of house contain garage or not.
     * this method will throw an NullPointerException exception if the garage information is not given.
     * @param garage  garage of the house.
     */
    public void setGarage(String garage) throws NullPointerException{
        if(garage==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.garage = garage;
        }

    /**
     * getResident will send the resident type.
     * this method will throw an NullPointerException exception if the resident type is not given.
     * @return resident resident type.
     */
    public String getResident() throws NullPointerException{
        if(resident==null)
        {
            throw new NullPointerException("resident type can not be empty");
        }
            return resident;
        }

    /**
     * setResident will set the resident type.
     * this method will throw an NullPointerException exception if the resident type is not given.
     * @param resident  resident type.
     */
    public void setResident(String resident) throws NullPointerException{
        if(resident==null)
        {
            throw new NullPointerException("resident type can not be empty");
        }
            this.resident = resident;
        }

    /**
     * getService will send the information of house service charge included with the rental price or not.
     * this method will throw an NullPointerException exception if the service charge information is not given.
     * @return service  service charge included or not.
     */
    public String getService() throws NullPointerException{
        if(service==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return service;
        }

    /**
     * setService will set the information of house service charge included with the rental price or not.
     * this method will throw an NullPointerException exception if the service charge information is not given.
     * @param service  service charge included or not.
     */
    public void setService(String service) throws NullPointerException{
        if(service==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.service = service;
        }

    /**
     * getFacing will send the information of facing direction of the house.
     * this method will throw an NullPointerException exception if the house facing direction is not given.
     * @return facing  facing direction of the house.
     */
    public String getFacing() throws NullPointerException{
        if(facing==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return facing;
        }

    /**
     * setFacing will set the information of facing direction of the house.
     * this method will throw an NullPointerException exception if the house facing direction is not given.
     * @param facing  facing direction of the house.
     */
    public void setFacing(String facing) throws NullPointerException{
        if(facing==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.facing = facing;
        }

    /**
     * getNearby will send the information if has any school/University/High way nearby of the house.
     * this method will throw an NullPointerException exception if the house nearby information is not given.
     * @return nearby  nearby school/University/High way.
     */
    public String getNearby() throws NullPointerException{
        if(nearby==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return nearby;
        }

    /**
     * setNearby will set the information if has any school/University/High way nearby of the house.
     * this method will throw an NullPointerException exception if the house nearby information is not given.
     * @param nearby  nearby school/University/High way.
     */
    public void setNearby(String nearby) throws NullPointerException{
        if(nearby==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.nearby = nearby;
        }

    /**
     * getOther will send other information of the house if the landlord want to say.
     * this method will throw an NullPointerException exception if the other information is not given.
     * @return other  other information.
     */
    public String getOther() throws NullPointerException{
        if(other==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return other;
        }

    /**
     * setOther will set other information of the house if the landlord want to say.
     * this method will throw an NullPointerException exception if the other information is not given.
     * @param other  other information.
     */
    public void setOther(String other) throws NullPointerException{
        if(other==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.other = other;
        }

    /**
     * getPtime will send the preferable visiting time to the house.
     * this method will throw an NullPointerException exception if the preferable visiting time is not given.
     * @return ptime  preferable visiting time to the house.
     */
    public String getPtime() throws NullPointerException{
        if(ptime==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return ptime;
        }

    /**
     * setPtime will set the preferable visiting time to the house.
     * this method will throw an NullPointerException exception if the preferable visiting time is not given.
     * @param ptime  preferable visiting time to the house.
     */
    public void setPtime(String ptime) throws NullPointerException{
        if(ptime==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.ptime = ptime;
        }

    /**
     * getPet will send the information if pet allowed or not in that house.
     * this method will throw an NullPointerException exception if the pet information is not given.
     * @return pet  pet allowed or not in that house.
     */
    public String getPet() throws NullPointerException{
        if(pet==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return pet;
        }

    /**
     * setPet will set the information if pet allowed or not in that house.
     * this method will throw an NullPointerException exception if the pet information is not given.
     * @param pet  pet allowed or not in that house.
     */
    public void setPet(String pet) throws NullPointerException{
        if(pet==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.pet = pet;
        }

    /**
     * getContact will send the landlord contact number.
     * this method will throw an NullPointerException exception if the contact number is not given.
     * @return contact  landlord contact number.
     */
    public String getContact() throws NullPointerException{
        if(contact==null)
        {
            throw new NullPointerException("can not be empty");
        }
            return contact;
        }

    /**
     * setContact will set the landlord contact number.
     * this method will throw an NullPointerException exception if the contact number is not given.
     * @param contact  landlord contact number.
     */
    public void setContact(String contact) throws NullPointerException{
        if(contact==null)
        {
            throw new NullPointerException("can not be empty");
        }
            this.contact = contact;
        }

    /**
     * getPuri will send the picture uri of that house.
     * this method will throw an NullPointerException exception if the picture uri is not given.
     * @return puri  picture uri.
     */
    public String getPuri() throws NullPointerException{
        if(puri==null)
        {
            throw new NullPointerException("can not be empty");
        }
        return puri;
    }

    /**
     * setPuri will set the picture uri of that house.
     * this method will throw an NullPointerException exception if the picture uri is not given.
     * @param puri  picture uri.
     */
    public void setPuri(String puri) throws NullPointerException{
        if(puri==null)
        {
            throw new NullPointerException("can not be empty");
        }
        this.puri = puri;
    }

}
