package com.example.cse327_project;

import android.widget.EditText;

import com.firebase.client.Firebase;
import java.util.InputMismatchException;

/**
 * this class will provide all the information from user.
 * Will sent all the values to paymentActivity page to store the database.
 * this class will get all the information from user.
 * Will sent all the values to payment method of paymentActivity page to store in the database.
 */
public class paymentHelperClass {
    String Name,Mail,Time,Date,tenantType,Phone,Bkash,Rocket;


    /**
     * This method will get all the information from the user.
     * And it will assign all the information to this parameter.
     * @param Name  represents to get user name.
     * @param Mail  represents to get user Mail.
     * @param Time  represents to get user Time.
     * @param Date  represents to get user Date.
     * @param tenantType  represents to get tenantType.
     * @param Phone  represents to get Phone.
     * @param Bkash  represents to get user Bkash.
     * @param Rocket  represents to get user Rocket.
     */
    public paymentHelperClass ( String Name, String Mail, String Time, String Date, String tenantType, String Phone, String Bkash, String Rocket )
    {

    this.Name = Name ;
    this.Mail = Mail ;
    this.Time = Time ;
    this.Date = Date ;
    this.tenantType = tenantType ;
    this.Phone = Phone;
    this.Bkash = Bkash ;
    this.Rocket = Rocket;

    }
    /**
     *.paymentHelperClass constructor will call the instance of this class.
     */
    public paymentHelperClass()
    {
    }

    /**
     * getName will send the user's name.
     * @return  name of the user.
     */
    public String getName() throws NullPointerException
    {
        if( Name == null )
        {

        throw new NullPointerException("Name can not be empty");

        }
        return Name;

    }
    /**
     * setName will set the user name that whoever wants payment.
     * this method will throw an NullPointerException exception if the name is empty.
     * @param name  will set the name of ussr.
     */
    public void setName(String name) throws NullPointerException
    {

        if( name == null )
        {

        throw new NullPointerException("Name can not be empty");

        }
        this.Name = name;

    }
    /**
     * getTime will time the user's name.
     * this method will throw an NullPointerException exception if the time is empty.
     * @return  time of the user.
     */
    public String getTime() throws NullPointerException
    {

        if( Time == null )
        {

        throw new NullPointerException("Time can not be empty");

        }
        return Time;

    }
    /**
     * setTime will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the time is empty.
     * @param  time  will set the name of ussr.
     */
    public void setTime(String time) throws NullPointerException
    {

        if( Time == null )
        {

        throw new NullPointerException("Time can not be empty");

        }
        this.Time = time;

    }
    /**
     * getMail will time the user's name.
     * this method will throw an NullPointerException exception if the mail is empty.
     * @return  time of the user.
     */
    public String getMail() throws NullPointerException
    {
        if( Mail == null )
        {

        throw new NullPointerException("Mail can not be empty");

        }
        return Mail;
    }
    /**
     * setMail will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the mail is empty.
     * @param  mail  will set the name of ussr.
     */
    public void setMail(String mail)throws NullPointerException
    {
        if( Mail == null )
        {

        throw new NullPointerException("Mail can not be empty");

        }
        this.Mail = mail;
    }
    /**
     * getDate will time the user's name.
     * this method will throw an NullPointerException exception if the date is empty.
     * @return  date of the user.
     */
    public String getDate() throws NullPointerException
    {
        if( Date == null )
        {

        throw new NullPointerException("Date can not be empty");

        }
        return Date;

    }
    /**
     * setDate will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the date is empty.
     * @param  date  will set the name of ussr.
     */
    public void setDate(String date) throws NullPointerException
    {
        if( Date == null )
        {

        throw new NullPointerException("Date can not be empty");

        }
        this.Date = date;

    }
    /**
     * getTenantType will time the user's name.
     * this method will throw an NullPointerException exception if the tenant type is empty.
     * @return  tenantType of the user.
     */
    public String getTenantType() throws NullPointerException
    {
        if( tenantType == null )
        {

        throw new NullPointerException("tenantType can not be empty");

        }
        return tenantType;

    }
    /**
     * setTenantType will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the tenant type is empty.
     * @param  tenantType  will set the name of ussr.
     */

    public void setTenantType(String tenantType) throws NullPointerException
    {
        if( tenantType == null )
        {

            throw new NullPointerException("tenantType can not be empty");

        }
        this.tenantType = tenantType;
    }
    /**
     * getPhone will time the user's name.
     * this method will throw an NullPointerException exception if the phone type is empty.
     * @return  phone of the user.
     */
    public String getPhone() throws NullPointerException
    {
        if( Phone == null )
        {

        throw new NullPointerException("Phone can not be empty");

        }
        return Phone;
    }
    /**
     * setPhone will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the phone type is empty.
     * @param  phone  will set the name of ussr.
     */
    public void setPhone(String phone) throws NullPointerException
    {
        if( Phone == null )
        {

            throw new NullPointerException("Phone can not be empty");

        }
        this.Phone = phone;

    }
    /**
     * getBkash will time the user's name.
     * this method will throw an NullPointerException exception if the bkash is empty.
     * @return  baksh of the user.
     */
    public String getBkash() throws NullPointerException
    {
        if( Bkash == null )
        {

        throw new NullPointerException("Bkash can not be empty");

        }
        return Bkash;

    }
    /**
     * setBkash will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the bkash is empty.
     * @param  bkash  will set the name of ussr.
     */
    public void setBkash(String bkash) throws NullPointerException
    {
        if( Bkash == null )
        {

        throw new NullPointerException("Bkash can not be empty");

        }
        this.Bkash = bkash;

    }
    /**
     * getRocket will time the user's name.
     * this method will throw an NullPointerException exception if the rocket is empty.
     * @return  Rocket of the user.
     */

    public String getRocket() throws NullPointerException
    {
        if( Rocket == null )
        {

        throw new NullPointerException("Rocket can not be empty");

        }
        return Rocket;

    }
    /**
     * setRocket will set the user time that whoever wants payment.
     * this method will throw an NullPointerException exception if the rocket is empty.
     * @param  rocket  will set the name of ussr.
     */
    public void setRocket(String rocket) throws NullPointerException
    {
        if( Rocket == null )
        {

        throw new NullPointerException("Rocket can not be empty");

        }
        this.Rocket = rocket;

    }
}
