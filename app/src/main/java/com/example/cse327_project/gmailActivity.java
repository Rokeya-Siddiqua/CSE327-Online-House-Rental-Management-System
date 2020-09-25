package com.example.cse327_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class gmailActivity extends AppCompatActivity {
    public EditText mEmail;
    public EditText mSubject;
    public EditText mMessage;
    private Button Mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        mEmail = (EditText) findViewById(R.id.mailID);
        mSubject = (EditText) findViewById(R.id.subjectID);
        mMessage = (EditText) findViewById(R.id.messageID);
        Mail = (Button) findViewById(R.id.sendMailBtn);

        Mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }
    private void sendMail() {

        String mail = mEmail.getText().toString().trim();
        String message = mMessage.getText().toString();
        String subject = mSubject.getText().toString().trim();
        //send mail
        javaMailApi javaMailApi = new javaMailApi(gmailActivity.this , mail, subject, message);
        javaMailApi.execute();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

}
