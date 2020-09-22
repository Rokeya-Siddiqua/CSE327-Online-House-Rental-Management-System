package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * smsActivity represents to send any message given by user.
 * User can give their number and send message.
 */
public class smsActivity extends AppCompatActivity {

    public EditText phoneNumber;
    public EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        phoneNumber = (EditText) findViewById(R.id.phoneID);
        message = (EditText) findViewById(R.id.messageID);

    }

    /**
     * sendID represents to check and get permission of sending message.
     * @param view  represents to get all the component from view group.
     */

    public void sendId(View view)
    {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED)
        {

        myMessage();

        }
        else
        {

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);

        }

    }

    /**
     * MyMessage represent to send message.
     * it will sent message to user's given number.
     */

    private void myMessage()
    {
        String Phone = phoneNumber.getText().toString().trim();
        String Message = message.getText().toString().trim();

        if(  !phoneNumber.getText().toString().equals("") ||!message.getText().toString().equals("")  )
        {

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(Phone, null, Message, null, null);
        Toast.makeText(  this, "Send Massage Successfully", Toast.LENGTH_SHORT  ).show();

        }
        else
        {

        Toast.makeText(  this, "Please enter message and phone number ", Toast.LENGTH_SHORT  ).show();

        }

    }

    /**
     * onRequestPermissionsResult will represents to check condition of sending message.
     * @param requestCode  will get the code from user.
     * @param permissions  will request user to give permission.
     * @param grantResults  will get the permission and check condition.
     */

    @Override
    public void onRequestPermissionsResult(  int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults  )
    {

        super.onRequestPermissionsResult(  requestCode, permissions, grantResults  );

        switch (  requestCode  )
        {
            case 0:

                if(  grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED  )
                {

                myMessage();

                }
                else
                {

                Toast.makeText(this, "You don't have required permission to access", Toast.LENGTH_SHORT).show();

                }
                break;

        }

    }

}
