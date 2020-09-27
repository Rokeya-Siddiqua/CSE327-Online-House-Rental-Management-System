package com.example.cse327_project;

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

    Button loginOrReguster, Membership, Gmail, Sms, Chat, about,Feedback;

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
        Membership = (Button) findViewById(R.id.membership_demoPage_ID);
        Gmail = (Button) findViewById(R.id.email_demoPage_ID);
        Sms = (Button) findViewById(R.id.sms_demoPage_ID);
        Chat = (Button) findViewById(R.id.chat_demoPage_ID);
        about = (Button) findViewById(R.id.about_demoPage_ID);
        Feedback = (Button) findViewById(R.id.feedbackID);

        /**
         * setOnClickListener is called to set action through a button.
         * here loginOrRegister button will open the Login or Register page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        loginOrReguster.setOnClickListener(new View.OnClickListener()
        {

            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             */
            @Override
            public void onClick(View view)
            {

            Intent intent = new Intent( demoPage.this, userRegisterOrLogin.class );
            startActivity(intent);

            }

        });

        /**
         * setOnClickListener is called to set action through a button.
         * here Chat button will open the Chat page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        Chat.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             */
                @Override
                public void onClick(View view)
                {

                Intent intent = new Intent( demoPage.this,chatAppActivity.class );
                startActivity(intent);

                }
        });

        /**
         * setOnClickListener is called to set action through a button.
         * here Gmail button will open the Gmail page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        Gmail.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             */
                @Override
                public void onClick(View view)
                {

                Intent intent = new Intent( demoPage.this,gmailActivity.class );
                startActivity(intent);

                }
        });
        /**
         * setOnClickListener is called to set action through a button.
         * here Sms button will open the Sms page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        Sms.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked
             * @param v The view that was clicked.
             */
                @Override
                public void onClick(View v)
                {

                Intent intent = new Intent( demoPage.this, smsActivity.class );
                startActivity(intent);

                }
        });

        /**
         * setOnClickListener is called to set action through a button.
         * here Feedback button will open the Feedback page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        Feedback.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param v The view that was clicked.
             */
                @Override
                public void onClick(View v)
                {

                Intent intent = new Intent( demoPage.this,feedbackActivity.class );
                startActivity(intent);

                }
        });

        /**
         * setOnClickListener is called to set action through a button.
         * here Membership button will open the Membership page
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        Membership.setOnClickListener(new View.OnClickListener()
        {
            /**
             * Called when a view has been clicked.
             * @param v The view that was clicked.
             */
                @Override
                public void onClick(View v)
                {

                Intent intent = new Intent( demoPage.this,newMembershipActivity.class );
                startActivity(intent);

                }
        });
    }
}