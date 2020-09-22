package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class newMembershipActivity extends AppCompatActivity {
    private EditText Name, Mail,Password,Date,membershipFor;
    Button Submit;
    FirebaseDatabase rootNode;
    DatabaseReference Reference;

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

        Submit.setOnClickListener(new View.OnClickListener() {
            /**
             *
             * @param v  represents to get all the component from view group.
             */
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                Reference = rootNode.getReference("Membership");

                String mName = Name.getText().toString();
                String mMail = Mail.getText().toString();
                String mPassword = Password.getText().toString();
                String mDate = Date.getText().toString();
                String Membership = membershipFor.getText().toString();

                membershipHelperClass helperClass = new membershipHelperClass(mName, mMail, mPassword,mDate,Membership);
                Reference.child(mPassword).setValue(helperClass);

            }
        });

    }
}