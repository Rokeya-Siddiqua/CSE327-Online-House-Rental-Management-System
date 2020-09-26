package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

/**
 * This page will be needed when user will give their payment.
 * User can get entry by their mail and address.
 * Admin will verify if this user is registered or not.
 * They have to give their personal information which will be stored in database.
 * User can choose bkash or rocket option to pay their bill.
 * by clicking the next his information will be stored in the database.
 * And will also sent them to bkash page where they will finally complete the payment .
 */
public class paymentActivity extends AppCompatActivity  {
    private EditText Name,Mail,Time,Date,tenantType,Phone;
    private Button Next;
    RadioButton Bkash,Rocket;
    FirebaseDatabase rootNode;
    DatabaseReference Reference;
    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Name = (EditText) findViewById(R.id.idName);
        Mail = (EditText) findViewById(R.id.idMAil);
        Time = (EditText) findViewById(R.id.idTime);
        Date = (EditText) findViewById(R.id.idDate);
        tenantType = (EditText) findViewById(R.id.idType);
        Phone = (EditText)findViewById(R.id.idPhone);
        Bkash = (RadioButton) findViewById(R.id.idBkash);
        Rocket = (RadioButton) findViewById(R.id.idRocket);
        Next = (Button)findViewById(R.id.idNext);

        /**
         * setOnClickListener is called to set action through a button.
         * By clicking next button will open the bkash page.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        Next.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             */
            @Override
            public void onClick(View v)
            {

            Payment();

            }

        });

    }
    /**
     * This method will be called when next button will be clicked.
     * this will get all the value which will be provided by the user.
     * And will store in the database will sent to bkash page.
     * It will check and show error if it finds any information is not properly given.
     */
    private void Payment()
    {

        String name = Name.getText().toString();
        String mail = Mail.getText().toString();
        String time = Time.getText().toString();
        String date = Date.getText().toString();
        String tenant = tenantType.getText().toString();
        String phoneNumber = Phone.getText().toString();
        String mBkash = Bkash.getText().toString();
        String mRocket = Rocket.getText().toString();

        if( TextUtils.isEmpty(mail) || TextUtils.isEmpty(name) || TextUtils.isEmpty(date) || ( TextUtils.isEmpty(phoneNumber) && phoneNumber.length() != 11 ) )
        {

         Mail.setError( "Email is required" );
         Name.setError( "Name is required" );
         Date.setError( "Date is required" );
         Phone.setError( "Phone Number is required" );
         Phone.setError( "Phone Number to be 11 digit" );
         return;

        }
        else
        {

        rootNode = FirebaseDatabase.getInstance();
        Reference = rootNode.getReference( "Payment Details" );
        paymentHelperClass helperClass = new paymentHelperClass( name, mail, time, date, tenant, phoneNumber, mBkash, mRocket );

        String key = Reference.push().getKey();
        Reference.child(key).setValue( helperClass );

        Intent intent = new Intent( paymentActivity.this, bkashActivity.class );
        startActivity(intent);

        }
    }

}