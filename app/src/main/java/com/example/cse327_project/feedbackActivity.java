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
 * User can give their valuable opinion through this page.
 * User can visit this page from demo page by clicking the button called feedback.
 * In this page user can rate this page by giving star
 * All the start display a comment which user can see.
 * User can send feedback to admin by putting message.
 * To send feedback user have to set a name and send message.
 * All the feedback will be store in the database along with user's name.
 */
public class feedbackActivity extends AppCompatActivity {
    TextView tvFeedback;
    RatingBar rbStars;
    EditText userName;
    EditText Feedback;
    private Firebase Reference;
    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
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
        //Reference = new Firebase("https://cse327-project.firebaseio.com/" + uniqueID);
        Reference = new Firebase("ttps://cse327-project-643c4.firebaseio.com/" + uniqueID);

        /**
         * setOnRatingBarChangeListener is called to set action through a rating button.
         * By clicking this button user can rate this app.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */

        rbStars.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener()
        {
            /**
             * onRatingChanged represents user's given rate to this app.
             * User can rate by clicking the the rate button.
             * all the rate button contain a comment and it will display to user.
             * user can see all the comment of the button and can rate the app.
             * @param ratingBar  represents to show user rating in the form of stars
             * @param rating  assign value and pass ratingBar the current value.
             * @param fromUser get the boolean value from user.
             */
            @Override
            public void onRatingChanged(  RatingBar ratingBar,  float rating,  boolean fromUser  )
            {
                if( rating  ==  0.5 )
                {

                tvFeedback.setText( "not happy at all" );

                }
                else if( rating == 1 || rating == 1.5 )
                {

                tvFeedback.setText( "very disatisfied" );

                }
                else if ( rating == 2 || rating == 2.5 )
                {

                tvFeedback.setText( "Disatisfied" );

                }
                else if ( rating == 3 )
                {

                tvFeedback.setText( "ok" );

                }
                else if(  rating == 3.5  )
                {

                tvFeedback.setText( "ok,doing well" );

                }

                else if ( rating == 4 )
                {

                tvFeedback.setText( "satisfied" );

                }
                else if ( rating == 4.5 )
                {

                tvFeedback.setText( "satisfied,really doing well" );

                }
                else
                {

                tvFeedback.setText( "Very satisfied" );

                }
            }
        });
    }

    /**
     * User can give their valuable opinion through this page.
     * User have to give set their name and their name will be stored in the database.
     * User can send any message and that message will be stored in the database along with their name.
     * By clicking feedback,user feedback will be sent and it will display a thank you message to the user .
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