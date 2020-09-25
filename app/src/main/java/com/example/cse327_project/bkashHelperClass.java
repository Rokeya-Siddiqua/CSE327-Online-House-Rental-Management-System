package com.example.cse327_project;

public class bkashHelperClass {

    String accountNumber,Pin,Amount;

    public bkashHelperClass(String accountNumber,String Pin,String Amount) {
        this.accountNumber = accountNumber ;
        this.Pin = Pin ;
        this.Amount = Amount ;

    }
    public bkashHelperClass() {
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getPin()
    {
        return Pin;
    }

    public void setPin(String pin)
    {
        Pin = pin;
    }

    public String getAmount()
    {
        return Amount;
    }

    public void setAmount(String amount)
    {
        Amount = amount;
    }

}
