package com.example.cse327_project;

import android.widget.EditText;

import com.firebase.client.Firebase;

/**
 * this class will provide all the information from user.
 * Will sent all the values to paymentActivity page to store the database.
 * this class will get all the information from user.
 * Will sent all the values to payment method of paymentActivity page to store in the database.
 */
public class paymentHelperClass {
    String Name,Mail,Time,Date,tenantType,Phone,Bkash,Rocket;
    private Firebase Reference;

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
    public String getName()
    {

    return Name;

    }
    /**
     * setName will set the user name that whoever wants payment.
     * @param name  will set the name of ussr.
     */
    public void setName(String name)
    {

    Name = name;

    }
    /**
     * getTime will time the user's name.
     * @return  time of the user.
     */
    public String getTime()
    {

    return Time;

    }
    /**
     * setTime will set the user time that whoever wants payment.
     * @param  time  will set the name of ussr.
     */
    public void setTime(String time)
    {

    Time = time;

    }
    /**
     * getMail will time the user's name.
     * @return  time of the user.
     */
    public String getMail()
    {
        return Mail;
    }
    /**
     * setMail will set the user time that whoever wants payment.
     * @param  mail  will set the name of ussr.
     */
    public void setMail(String mail)
    {
        Mail = mail;
    }
    /**
     * getDate will time the user's name.
     * @return  date of the user.
     */
    public String getDate()
    {

    return Date;

    }
    /**
     * setDate will set the user time that whoever wants payment.
     * @param  date  will set the name of ussr.
     */
    public void setDate(String date)
    {

    Date = date;

    }
    /**
     * getTenantType will time the user's name.
     * @return  tenantType of the user.
     */
    public String getTenantType()
    {

    return tenantType;

    }
    /**
     * setTenantType will set the user time that whoever wants payment.
     * @param  tenantType  will set the name of ussr.
     */

    public void setTenantType(String tenantType)
    {
        this.tenantType = tenantType;
    }
    /**
     * getPhone will time the user's name.
     * @return  phone of the user.
     */
    public String getPhone()
    {
        return Phone;
    }
    /**
     * setPhone will set the user time that whoever wants payment.
     * @param  phone  will set the name of ussr.
     */
    public void setPhone(String phone)
    {

    Phone = phone;

    }
    /**
     * getBkash will time the user's name.
     * @return  baksh of the user.
     */
    public String getBkash()
    {

    return Bkash;

    }
    /**
     * setBkash will set the user time that whoever wants payment.
     * @param  bkash  will set the name of ussr.
     */
    public void setBkash(String bkash)
    {

    Bkash = bkash;

    }
    /**
     * getRocket will time the user's name.
     * @return  Rocket of the user.
     */

    public String getRocket()
    {

    return Rocket;

    }
    /**
     * setRocket will set the user time that whoever wants payment.
     * @param  rocket  will set the name of ussr.
     */
    public void setRocket(String rocket)
    {

    Rocket = rocket;

    }
}
