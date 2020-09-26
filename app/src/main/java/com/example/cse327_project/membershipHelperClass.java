package com.example.cse327_project;

import android.widget.EditText;

/**
 * this class will provide all the information from user.
 * Will sent all the values to newMembershipActivity page to store the database.
 * this class will get all the information from user.
 * Will sent all the values to membership method of newMembershipActivity page to store in the database.
 */
public class membershipHelperClass
{
    String Name, Mail,Password,Date,membershipFor;

    /**
     * membershipHelperClass represents to get all the information from user regarding membership card .
     * @param Name  represents to get user name.
     * @param Mail  represents to get user Mail.
     * @param Date  represents to get user Date.
     * @param Password  represents to get Password.
     * @param membershipFor  represents to get the validity value.
     */
    public membershipHelperClass( String Name, String Mail, String Date, String Password, String membershipFor )
    {

    this.Name = Name ;
    this.Mail = Mail ;
    this.Date = Date ;
    this.Password = Password ;
    this.membershipFor = membershipFor ;

    }

    /**
     *.membershipHelperClass constructor will call the instance of this class.
     */
    public membershipHelperClass()
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
     * setName will set the user name that who wants the membership card.
     * @param name  will set the name of ussr.
     */
    public void setName(String name)
    {

    Name = name;

    }

    /**
     * getName will send the user's mail.
     * @return  the mail of user.
     */
    public String getMail()
    {

    return Mail;

    }

    /**
     * setMail will set the user mail that who wants the membership card.
     * @param mail  will set the mail of user.
     */

    public void setMail(String mail)
    {

    Mail = mail;

    }

    /**
     * getPassword will send the user's password
     * @return  the password of user.
     */
    public String getPassword()
    {

    return Password;

    }

    /**
     * setPassword set the user password that who wants the membership card.
     * @param password  will set the mail of user.
     */
    public void setPassword(String password)
    {

    Password = password;

    }

    /**
     * getDate will send the user's date.
     * @return  the date of user.
     */

    public String getDate()
    {

    return Date;

    }

    /**
     * setDate will set the user date that who wants the membership card.
     * @param date  will set the date of user.
     */

    public void setDate(String date)
    {

    Date = date;

    }

    /**
     * getMembershipFor will send the user's selected membership validity offer.
     * @return  the membership validity offer of user.
     */

    public String getMembershipFor()
    {

    return membershipFor;

    }

    /**
     * setMembershipFor will set the user's membership validity offer.
     * @param membershipFor  will set the membership validity offer od user.
     */

    public void setMembershipFor(String membershipFor)
    {

    this.membershipFor = membershipFor;

    }
}
