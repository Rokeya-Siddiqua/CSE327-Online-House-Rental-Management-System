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
 * User can contact with the admin for any help through giving sms .
 * User have to visit demo page first
 * and by clicking the sms button,they can enter to this page.
 * user will have to set their number and can give any message to admin regarding to this app,
 * Their message will came to admin with their number.
 */
public class smsActivity extends AppCompatActivity {

    public EditText phoneNumber;
    public EditText message;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        phoneNumber = (EditText) findViewById(R.id.phoneID);
        message = (EditText) findViewById(R.id.messageID);

    }

    /**
     * To access mobile their will needed a permission which is set to the manifest.
     * This method will ask permission to user of sending message .
     * if user give the  permission to checked then it will proceed to send message.
     * If user don't give permission it will ask the user again.
     * without getting it will not let user to send message.
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
     * MyMessage represent user to send message.
     * This method will the get the phone number and message which user will give.
     * And then it will let user send message.
     * It will check user phone number and message is given or not.
     * If everything is given then it will let user send message and display confirmation message
     * and if not it will display a message and ask to try again
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
     * It will check permission is granted or not.
     * It will check user input length is greater then zero or not
     * If everything is given then it will let user send message
     * and if not it will display a error message.
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
