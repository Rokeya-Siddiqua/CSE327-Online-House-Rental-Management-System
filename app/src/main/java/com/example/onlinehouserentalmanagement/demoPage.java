package com.example.onlinehouserentalmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Called at first page and shown to every person to show some demo house information.
 * But they can't access the details information or next procedure until they register or login our app.
 * show the user a path to register or login in the app, ratings and feedback.
 * helps to know about the app and do contact with us through email,sms and chat if he/she wants to.
 * it also offer the user to get membership from the app.
 */
public class demoPage extends AppCompatActivity {

    Button loginOrReguster, membership, email, sms, chat, about;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_page);
        this.setTitle("Demo page");

        loginOrReguster = (Button) findViewById(R.id.loginOrRegister_demoPage_ID);
        membership = (Button) findViewById(R.id.membership_demoPage_ID);
        email = (Button) findViewById(R.id.email_demoPage_ID);
        sms = (Button) findViewById(R.id.sms_demoPage_ID);
        chat = (Button) findViewById(R.id.chat_demoPage_ID);
        about = (Button) findViewById(R.id.about_demoPage_ID);


        /**
         * setOnClickListener is called to set action through a button.
         * here loginOrReguster button will open the Login or Register page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        loginOrReguster.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             */
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(demoPage.this, userRegisterOrLogin.class);
                startActivity(intent);
            }
        });
    }
}