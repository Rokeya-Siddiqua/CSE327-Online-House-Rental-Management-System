package com.example.cse327_project;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * User can contact with the admin for any help through giving Mail .
 * User have to visit demo page first and by clicking the Mail button,they can enter to this page.
 * user will have to set their mail address and can give any mail to admin regarding to this app,
 * This class is for get and set api so that any user can send mail.
 * To give a mail this method have to take permission of using the internet.
 * It will take permission and let user send mail.
 */

public class javaMailApi extends AsyncTask<Void,Void,Void> {


    private Context mContext;
    private Session mSession;

    private String mEmail;
    private String mSubject;
    private String mMessage;
    private ProgressDialog mProgressDialog;

    /**
     *
     * @param mContext  will get then context and will assign to this parameter.
     * @param mEmail  will get then mail and will assign to this parameter.
     * @param mSubject  will get then subject and will assign to this parameter.
     * @param mMessage  will get then message and will assign to this parameter.
     */
    public javaMailApi( Context mContext, String mEmail, String mSubject, String mMessage ) {
        this.mContext = mContext;
        this.mEmail = mEmail;
        this.mSubject = mSubject;
        this.mMessage = mMessage;
    }

    /**
     *  This method will show progress dialog while sending email
     *  And it will let user to know that message send is in process by displaying a toast message
     *  And will ask user to wait by displaying a toast message .
     */

    @Override
    protected void onPreExecute()
    {

    super.onPreExecute();
    mProgressDialog = ProgressDialog.show(mContext,"Sending message", "Please wait...",false,false);

    }

    /**
     * This method will dismiss progress dialog when message successfully send
     * And will display user a success toast message.
     * @param aVoid  sent a void to method.
     */

    @Override
    protected void onPostExecute(Void aVoid)
    {

    super.onPostExecute(aVoid);
    mProgressDialog.dismiss();
    Toast.makeText(mContext,"Message Sent",Toast.LENGTH_SHORT).show();

    }

    /**
     * This method will create all properties for gmail by creating object.
     * and also Configuring properties for gmail.
     * @param params  will set a prams value.
     * @return the value of email and password for PasswordAuthentication.
     */
    @Override
    protected Void doInBackground(Void... params)
    {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");


        mSession = javax.mail.Session.getDefaultInstance(props,
                new javax.mail.Authenticator()
                {
                    /**
                     * this method will Authenticate the password
                     * and will return mail and password.
                     */

                    protected PasswordAuthentication getPasswordAuthentication()
                    {

                    return new PasswordAuthentication(Utils.EMAIL, Utils.PASSWORD);

                    }
                });

        try {
            /**
             * Creating MimeMessage object and set sender address.
             * And also add receiver email and subject and message.
             * and will send message.
             */
            MimeMessage mm = new MimeMessage(mSession);
            mm.setFrom(new InternetAddress(Utils.EMAIL));
            mm.addRecipient(Message.RecipientType.TO, new InternetAddress(mEmail));
            mm.setSubject(mSubject);
            mm.setText(mMessage);
            Transport.send(mm);

//            BodyPart messageBodyPart = new MimeBodyPart();
//
//            messageBodyPart.setText(message);
//
//            Multipart multipart = new MimeMultipart();
//
//            multipart.addBodyPart(messageBodyPart);
//
//            messageBodyPart = new MimeBodyPart();
//
//            DataSource source = new FileDataSource(filePath);
//
//            messageBodyPart.setDataHandler(new DataHandler(source));
//
//            messageBodyPart.setFileName(filePath);
//
//            multipart.addBodyPart(messageBodyPart);

//            mm.setContent(multipart);

        } catch (MessagingException e)
        {

        e.printStackTrace();

        }
        return null;
    }
}
