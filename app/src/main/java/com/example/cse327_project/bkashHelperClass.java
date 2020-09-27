package com.example.cse327_project;
import java.util.InputMismatchException;

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
     * this method will throw an NullPointerException exception if the account number is empty.
     * @return  account Number of the user.
     */
    public String getAccountNumber() throws NullPointerException
    {
        if( accountNumber == null )
        {

        throw new NullPointerException("accountNumber can not be empty");

        }
        return accountNumber;

    }
    /**
     * setAccountNumber will set the user name that whoever wants to do payment.
     * this method will throw an NullPointerException exception if the account number is empty.
     * @param  accountNumber  will set the name of ussr.
     */

    public void setAccountNumber( String accountNumber ) throws NullPointerException
    {
        if( accountNumber == null )
        {

        throw new NullPointerException("accountNumber can not be empty");

        }
        this.accountNumber = accountNumber;

    }
    /**
     * getPin will send the user's pin Number.
     * this method will throw an NullPointerException exception if the pin is empty.
     * @return  pin Number of the user.
     */
    public String getPin() throws NullPointerException
    {
        if( Pin == null )
        {

        throw new NullPointerException("Pin can not be empty");

        }

    return Pin;

    }

    /**
     * setPin will set the user name that whoever wants to do payment.
     * this method will throw an NullPointerException exception if the pin is empty.
     * @param  pin  will set the pin of ussr.
     */

    public void setPin( String pin ) throws NullPointerException
    {
        if( Pin == null )
        {

        throw new NullPointerException("Pin can not be empty");

        }
        this.Pin = pin;

    }
    /**
     * getAmount will send the user that how much they want to pay.
     * this method will throw an NullPointerException exception if the amount is empty.
     * @return  Amount of the user.
     */
    public String getAmount() throws NullPointerException
    {
        if( Amount == null )
        {

        throw new NullPointerException("Amount can not be empty");

        }
        return Amount;

    }
    /**
     * setAmount will set the user name that whoever wants to do payment.
     * this method will throw an NullPointerException exception if the amount is empty.
     * @param  amount  will set the amount of ussr.
     */
    public void setAmount( String amount ) throws NullPointerException
    {
        if( Amount == null )
        {

        throw new NullPointerException("Amount can not be empty");

        }
        this.Amount = amount;

    }

}
