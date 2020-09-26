package com.example.cse327_project;

/**
 * The purpose of this class to help in storing all the value in the database
 * which will be given by user.
 * this class will get all the information from user.
 * Will sent all the values to baksh method of bkashActivity page to store in the database.
 */
public class bkashHelperClass
{
    String accountNumber,Pin,Amount;

    /**
     * This method will get all the information from the user.
     * And it will assign all the information to this parameter.
     * @param accountNumber  represents to get user accountNumber.
     * @param Pin  represents to get user Pin.
     * @param Amount  represents to get how much amount user wants to pay.
     */
    public bkashHelperClass( String accountNumber, String Pin, String Amount )
    {

    this.accountNumber = accountNumber ;
    this.Pin = Pin ;
    this.Amount = Amount ;

    }
    /**
     *.bkashHelperClass constructor will call the instance of this class.
     */
    public bkashHelperClass()
    {
    }
    /**
     * getAccountNumber will send the user's account Number.
     * @return  account Number of the user.
     */
    public String getAccountNumber()
    {

    return accountNumber;

    }
    /**
     * setAccountNumber will set the user name that whoever wants to do payment.
     * @param  accountNumber  will set the name of ussr.
     */

    public void setAccountNumber( String accountNumber )
    {

    this.accountNumber = accountNumber;

    }
    /**
     * getPin will send the user's pin Number.
     * @return  pin Number of the user.
     */
    public String getPin()
    {

    return Pin;

    }

    /**
     * setPin will set the user name that whoever wants to do payment.
     * @param  pin  will set the pin of ussr.
     */

    public void setPin( String pin )
    {

    Pin = pin;

    }
    /**
     * getAmount will send the user that how much they want to pay.
     * @return  Amount of the user.
     */
    public String getAmount()
    {

    return Amount;

    }
    /**
     * setAmount will set the user name that whoever wants to do payment.
     * @param  amount  will set the amount of ussr.
     */
    public void setAmount( String amount )
    {

    Amount = amount;

    }

}
