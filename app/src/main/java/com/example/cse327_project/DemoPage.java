package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class DemoPage extends AppCompatActivity {
    private Button Register ,Login,Payment,Feedback,Membership;
    private Button Chat ,Gmail,Sms;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_page);
        Register = (Button)findViewById(R.id.RegisterId);
        Login = (Button)findViewById(R.id.LoginId);
        Payment = (Button)findViewById(R.id.paymentId);
        Feedback = (Button)findViewById(R.id.feedbackId);
        Membership =(Button)findViewById(R.id.membershipId);

        Chat =(Button)findViewById(R.id.btnCHATAPP);
        //Gmail =(Button)findViewById(R.id.btnGAMAIL);
        Sms=(Button)findViewById(R.id.btnSMS);


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DemoPage.this, Register.class);
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DemoPage.this, Login.class);
                startActivity(intent);
            }
        });


       Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DemoPage.this,chatAppActivity.class);
                startActivity(intent);
            }
        });


        Sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DemoPage.this, smsActivity.class);
                startActivity(intent);

            }
        });

        Payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DemoPage.this, paymentActivity.class);
                startActivity(intent);

            }
        });


        Feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DemoPage.this,feedbackActivity.class);
                startActivity(intent);

            }
        });
        Membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DemoPage.this,newMembershipActivity.class);
                startActivity(intent);

            }
        });


    }
}