package com.example.onlinehouserentalmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Source;

public class googleMap extends AppCompatActivity {

    //initialize variable
    TextView source,destination;
    Button track;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);
        this.setTitle("Search in Google Map");

        //Assign variable
        source = (TextView) findViewById(R.id.Source_googleMap_ID);
        destination = (TextView) findViewById(R.id.Destination_googleMap_ID);
        track = (Button) findViewById(R.id.TrackButton_googleMap_ID);


        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get value from EditText
                String Source = source.getText().toString().trim();
                String Destination = destination.getText().toString().trim();

                //Check Condition
                if(Source.equals("") && Destination.equals(""))
                {
                    //when both value blank
                    Toast.makeText(getApplicationContext(),"Enter both Location",Toast.LENGTH_LONG).show();;
                }
                else
                {
                    //when both value are filled
                    //Display Track
                    DisplayTrack(Source,Destination);
                }
            }
        });
    }

    private void DisplayTrack(String source, String destination) {
        //if the device does not have a map installed then redirect it to play store
        try {
            //when google map is installed
            //Initialize uri
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" + source + "/" + destination);
            //initialize intent with Action view
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            //set package
            intent.setPackage("com.google.android.apps.maps");
            //set flag
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //start activity
            startActivity(intent);
        }catch (ActivityNotFoundException e)
        {
            //when google map is not installed
            //Initialize uri
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            //Initialize intent with Action view
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            //set flag
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //start activity
            startActivity(intent);
        }
    }

}