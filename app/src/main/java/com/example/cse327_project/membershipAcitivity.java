package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class membershipAcitivity extends AppCompatActivity {

    Button Registered, newMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_acitivity);

        Registered =(Button)findViewById(R.id.RegisterId);
        newMember=(Button)findViewById(R.id.idNewMember);

        newMember.setOnClickListener(new View.OnClickListener() {
            /**
             *
             * @param v represents to get all the component from view group.
             */
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(membershipAcitivity.this,newMembershipActivity.class);
                startActivity(intent);

            }
        });
    }
}