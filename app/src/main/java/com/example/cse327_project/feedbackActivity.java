package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

/**
 * feedbackActivity represents to rate this app.
 * it also represents to sent feedback given by user.
 * All the feedback will be store in the database.
 */

public class feedbackActivity extends AppCompatActivity {
    TextView tvFeedback;
    RatingBar rbStars;
    EditText userName;
    EditText Feedback;
    private Firebase Reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        userName = (EditText)findViewById(R.id.userName);
        Feedback = (EditText)findViewById(R.id.Feedback);
        tvFeedback = (TextView)findViewById(R.id.tvFeedback);
        rbStars = (RatingBar)findViewById(R.id.rbStars);
        Firebase.setAndroidContext(this);
        String uniqueID = Settings.Secure.getString(getApplicationContext().getContentResolver(),Settings.Secure.ANDROID_ID);
        Reference = new Firebase("https://cse327-project.firebaseio.com/" + uniqueID);

        rbStars.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener()
        {
            /**
             * onRatingChanged represents user's given rate to this app.
             * @param ratingBar  represents to show user rating in the form of stars
             * @param rating  assign value and pass ratingBar the current value.
             * @param fromUser get the boolean value from user.
             */
            @Override
            public void onRatingChanged(  RatingBar ratingBar,  float rating,  boolean fromUser  )
            {
                if(  rating == 0.5  )
                {

                tvFeedback.setText(  "not happy at all"  );

                }
                else if(  rating == 1 || rating == 1.5  )
                {

                tvFeedback.setText(  "very disatisfied"  );

                }
                else if (  rating == 2 || rating == 2.5  )
                {

                tvFeedback.setText(  "Disatisfied"  );

                }
                else if (  rating == 3  )
                {

                tvFeedback.setText(  "ok"  );

                }
                else if(  rating == 3.5  )
                {

                tvFeedback.setText(  "ok,doing well"  );

                }

                else if (  rating == 4  )
                {

                tvFeedback.setText(  "satisfied"  );

                }
                else if (  rating == 4.5  )
                {

                tvFeedback.setText(  "satisfied,really doing well"  );

                }
                else
                {

                tvFeedback.setText(  "Very satisfied"  );

                }
            }
        });
    }

    /**
     * feedBackSent store all the user's feedback into database.
     * @param view  represents to get all the component of view class.
     */
    public void feedBackSent(  android.view.View view  )

    {

    String  usernameInput =  userName.getText().toString();
    String feedbackInput =  Feedback.getText().toString();

    Firebase reUserName = Reference.child("Username");
    reUserName.setValue(usernameInput);

    Firebase reFeedback = Reference.child("Feedback");
    reFeedback.setValue(feedbackInput);
    Toast.makeText(this,"Thank you ",Toast.LENGTH_SHORT).show();

    }
}