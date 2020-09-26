package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePageOnlineRental extends AppCompatActivity {

    Button tenant, landlord,payment,Gmail,Sms, Chat;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_online_rental);
        this.setTitle("Online House Rent");

        tenant = (Button) findViewById(R.id.demo_data_page_ID);
        landlord = (Button) findViewById(R.id.house_info_page_ID);
        payment = (Button) findViewById(R.id.paymentId);
        Gmail = (Button) findViewById(R.id.email_homePage_ID);
        Sms = (Button) findViewById(R.id.sms_homePage_ID);
        Chat = (Button) findViewById(R.id.chat_homePage_ID);


        /**
         * setOnClickListener is called to set action through a button.
         * here tenant button will open the demoDataFetch page where the tenant can view the vacant houses list.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        /*tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePageOnlineRental.this, demoDataFetch.class);
                startActivity(intent);
            }
        });*/


        /**
         * setOnClickListener is called to set action through a button.
         * here landloard button will open the houseInformationDetailsRegistration page where the landlord can register his vacant houses information.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        /*landlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePageOnlineRental.this, houseInformationDetailsRegistration.class);
                startActivity(intent);
            }
        });*/


        /**
         * setOnClickListener is called to set action through a button.
         * here Payment will open the membership page where the user can get our membership.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        payment.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             */
            @Override
            public void onClick(View v)
            {

            Intent intent = new Intent(homePageOnlineRental.this, paymentActivity.class);
               /* Intent intent = new Intent(homePageOnlineRental.this, userRegisterOrLogin.class);*/
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

            Intent intent = new Intent(homePageOnlineRental.this,chatAppActivity.class);
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

             Intent intent = new Intent(homePageOnlineRental.this,gmailActivity.class);
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
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             */
            @Override
            public void onClick(View v)
            {

            Intent intent = new Intent(homePageOnlineRental.this, smsActivity.class);
            startActivity(intent);

            }
        });
    }
}