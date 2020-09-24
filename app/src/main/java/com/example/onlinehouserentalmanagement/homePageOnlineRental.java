package com.example.onlinehouserentalmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePageOnlineRental extends AppCompatActivity {

    Button tenant, landlord, membership;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_online_rental);
        this.setTitle("Online House Rent");

        tenant = (Button) findViewById(R.id.demo_data_page_ID);
        landlord = (Button) findViewById(R.id.house_info_page_ID);
        membership = (Button) findViewById(R.id.merbership_page_ID);


        /**
         * setOnClickListener is called to set action through a button.
         * here tenant button will open the demoDataFetch page where the tenant can view the vacant houses list.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePageOnlineRental.this, demoDataFetch.class);
                startActivity(intent);
            }
        });


        /**
         * setOnClickListener is called to set action through a button.
         * here landloard button will open the houseInformationDetailsRegistration page where the landlord can register his vacant houses information.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        landlord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homePageOnlineRental.this, houseInformationDetailsRegistration.class);
                startActivity(intent);
            }
        });


        /**
         * setOnClickListener is called to set action through a button.
         * here membership button will open the membership page where the user can get our membership.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        membership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}