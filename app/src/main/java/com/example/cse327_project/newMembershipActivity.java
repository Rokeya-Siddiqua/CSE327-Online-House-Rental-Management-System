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
 * user can visit this page from the demo page by clicking the membership button.
 * and this membership card will give different types of facility to the user.
 * User have to give to all the information and it will be stored in the database.
 * And after then it will display congratulation message to user.
 */
public class newMembershipActivity extends AppCompatActivity {
    private EditText Name, Mail,Password,Date,membershipFor;
    Button Submit;
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
        setContentView(R.layout.activity_new_membership);

        Name = (EditText)findViewById(R.id.idName);
        Mail = (EditText)findViewById(R.id.idEmail);
        Password = (EditText)findViewById(R.id.idPassword);
        Date = (EditText)findViewById(R.id.idDate);
        membershipFor = (EditText)findViewById(R.id.idMembershipFor);
        Submit = (Button)findViewById(R.id.btnSubmit);

        /**
         * setOnClickListener is called to set action through a button.
         * By clicking submit button all the information of the user will be stored in the database.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        Submit.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             */
            @Override
            public void onClick(View v)
            {

            Membership();

            }
        });
    }


    /**
     * This method will be called when submit button will be clicked.
     * User need to provide some personal information and
     * this will get all the value which will be provided by the user.
     * And will store in the database.
     * It will check and show error if it finds any information is not properly given.
     * and if it finds everything okay then it will display a congratulation message to user.
     */
    private void Membership() {
        String mName = Name.getText().toString();
        String mMail = Mail.getText().toString();
        String mPassword = Password.getText().toString();
        String mDate = Date.getText().toString();
        String Membership = membershipFor.getText().toString();


        if ( TextUtils.isEmpty(mMail) || ( TextUtils.isEmpty(mPassword) && mPassword.length() != 11 ) )
        {

        Mail.setError( "Email is required" );
        Password.setError( "Password is required" );
        return;

        }
        else
        {

        rootNode = FirebaseDatabase.getInstance();
        Reference = rootNode.getReference( "Membership" );
        membershipHelperClass helperClass = new membershipHelperClass( mName, mMail, mPassword, mDate, Membership );

        String key = Reference.push().getKey();
        Reference.child(key).setValue(helperClass);

        Toast.makeText(getApplicationContext(), "Congratulation, You get 1 year of membership", Toast.LENGTH_LONG).show();

        }
    }

}