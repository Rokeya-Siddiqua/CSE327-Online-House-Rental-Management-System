package com.example.cse327_project;

import android.widget.EditText;

public class paymentHelperClass {
    String Name,Mail,Time,Date,tenantType,PaymentType,Amount,Currency,Phone;
    public paymentHelperClass(String Name,String Mail,String Time,String Date,String tenantType,String PaymentType,String Amount,String Currency,String Phone) {
        this.Name = Name ;
        this.Mail = Mail ;
        this.Time = Time ;
        this.Date = Date ;
        this.tenantType = tenantType ;
        this.PaymentType = PaymentType ;
        this.Amount = Amount ;
        this.Currency = Currency ;
        this.Phone = Phone;
    }

    public paymentHelperClass() {
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTime()
    {
        return Time;
    }

    public void setTime(String time)
    {
        Time = time;
    }

    public String getMail()
    {
        return Mail;
    }

    public void setMail(String mail)
    {
        Mail = mail;
    }

    public String getDate()
    {
        return Date;
    }

    public void setDate(String date)
    {
        Date = date;
    }

    public String getTenantType()
    {
        return tenantType;
    }

    public void setTenantType(String tenantType)
    {
        this.tenantType = tenantType;
    }

    public String getPaymentType()
    {
        return PaymentType;
    }

    public void setPaymentType(String paymentType)
    {
        PaymentType = paymentType;
    }

    public String getAmount()
    {
        return Amount;
    }

    public void setAmount(String amount)
    {
        Amount = amount;
    }

    public String getCurrency()
    {
        return Currency;
    }

    public void setCurrency(String currency)
    {
        Currency = currency;
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String phone)
    {
        Phone = phone;
    }
}
