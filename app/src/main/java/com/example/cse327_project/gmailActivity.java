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


/**
 * gmailActivity represents to send any mail given by user.
 * User can contact with the admin for any help through giving Mail .
 * User have to visit demo page first
 * and by clicking the Mail button,they can enter to this page.
 * user will have to set their mail address and can give any mail to admin regarding to this app,
 * Their mail will came to admin with their mail address.
 */
public class gmailActivity extends AppCompatActivity {
    public EditText mEmail;
    public EditText mSubject;
    public EditText mMessage;
    private Button Mail;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        mEmail = (EditText) findViewById(R.id.mailID);
        mSubject = (EditText) findViewById(R.id.subjectID);
        mMessage = (EditText) findViewById(R.id.messageID);
        Mail = (Button) findViewById(R.id.sendMailBtn);

        /**
         * setOnClickListener is called to set action through a button.
         * by clicking the mail button it will let user sent any mail to admin.
         * User have to give mal address to send mail.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        Mail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            sendMail();

            }
        });

    }
    /**
     * sendMail represent user to send mail.
     * User have to put their mail address and mail in the Ui.
     * This method will the get the mail address and message which user will give.
     * And then it will let user send mail.
     * It will set the api for mail so that user can give mail easily.
     */

    private void sendMail()
    {

    String mail = mEmail.getText().toString().trim();
    String message = mMessage.getText().toString();
    String subject = mSubject.getText().toString().trim();

    //send mail
    javaMailApi javaMailApi = new javaMailApi(gmailActivity.this , mail, subject, message);
    javaMailApi.execute();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

    return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

    return super.onOptionsItemSelected(item);

    }

}
