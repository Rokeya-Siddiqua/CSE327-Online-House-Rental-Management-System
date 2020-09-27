package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * user will get this page from the paymentActivity page
 * by clicking the next button to complete the payment.
 * User will have to give his bkash pin and account number to proceed
 * and how much he/she wants to pay have to mention.
 * All the information will be stored in database by clicking the next button.
 * And they will finally complete the payment
 * and will be shown to them a payment successful message .
 */
public class bkashActivity extends AppCompatActivity {
    private EditText accountNumber;
    private EditText Pin;
    private EditText Amount;
    private EditText PhoneNumber;
    private Button Next;
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
        setContentView(R.layout.activity_bkash);
        accountNumber = (EditText)findViewById(R.id.idAccountNumber);
        Pin = (EditText)findViewById(R.id.idPIN);
        Amount = (EditText) findViewById(R.id.idAmount);
        Next = (Button) findViewById(R.id.btnNext);

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

            Bkash();

            }
        });
    }

    /**
     * This method will be called when next button will be clicked.
     * this will get all the value which will be provided by the user.
     * And will store in the database.
     * It will check and show error if it finds bkashPin and account is not correct.
     * Finally it will display payment successfully done message to the user.
     */
    private void Bkash()
    {
        String bkashPin = Pin.getText().toString();
        String totalAmount = Amount.getText().toString();
        String accountNum = accountNumber.getText().toString();

        if( ( TextUtils.isEmpty(bkashPin) ) || ( TextUtils.isEmpty(accountNum) ) )
        {

         Pin.setError( "Bkash Pin is required" );
         Pin.setError( "Pin is not correct" );
         accountNumber.setError( "Account Number is required" );
         accountNumber.setError( "Account Number is not correct" );
         return;

        }
        else
        {

         rootNode = FirebaseDatabase.getInstance();
         Reference = rootNode.getReference( "Payment Details" );
         bkashHelperClass bkashHelperClass  = new bkashHelperClass(bkashPin,totalAmount,accountNum);

         String key = Reference.push().getKey();
         Reference.child(key).setValue( bkashHelperClass );
         Intent intent = new Intent( bkashActivity.this, demoPage.class );
         startActivity(intent);
         Toast.makeText( getApplicationContext(), " Payment successfully done", Toast.LENGTH_LONG ).show();
         accountNumber.setText(null);
         Pin.setText(null) ;
         Amount.setText(null);

        }
    }
}