package com.example.cse327_project;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

/**
 * represent new user Register through email and password.
 * The mail must be valid and password must be more than 8 characters.
 * after the registration user can login into the app by email and password.
 */
public class userRegisterOrLogin extends AppCompatActivity {

    //Initialize variables
    EditText email, pass;
    Button register,login,testHomePageBtn;

    private FirebaseAuth mAuth;


    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register_or_login);


        mAuth = FirebaseAuth.getInstance();

        //Assign variables
        email = (EditText) findViewById(R.id.TV_UserEmail);
        pass = (EditText) findViewById(R.id.TV_UserPassword);
        register = (Button) findViewById(R.id.TV_UserRegister);
        login = (Button) findViewById(R.id.TV_UserLogin);
        testHomePageBtn = (Button) findViewById(R.id.homepageId);
        //for testing
        testHomePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userRegisterOrLogin.this, homePageOnlineRental.class);
                startActivity(intent);
            }
        });


        /**
         * setOnClickListener is called to set action through a button.
         * here register button will store the email address and password given by the user.
         * make them registered user in the app.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        register.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             * This function called a method named doUserRegister.
             */
            @Override
            public void onClick(View v) {
                doUserRegister();
            }
        });



        /**
         * setOnClickListener is called to set action through a button.
         * here login button will help the user to login in the app through email and pass.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        login.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             * This function called a method named doUserLogin.
             */
            @Override
            public void onClick(View view) {
                doUserLogin();
            }
        });
    }


    /**
     * Called when the register button is clicked.
     * it will register the user's information like email and password in the registered user list.
     * it will also check the email address valid or not and password must be greater than 7 characters.
     */
    private void doUserRegister() {
        String emailstr = email.getText().toString();
        String passstr = pass.getText().toString();

        if (emailstr.trim().equals("") || passstr.trim().equals("")) {
            Toast.makeText(getBaseContext(), "empty field", Toast.LENGTH_LONG).show();

            if(!Patterns.EMAIL_ADDRESS.matcher((CharSequence) email).matches())
            {
                email.setError("Please enter a valid Email");
                email.requestFocus();
                return;
            }

            if(passstr.length() > 7)
            {
                pass.setError(" Password must be at least 8 characters");
                pass.requestFocus();
                return;
            }
        } else {
            mAuth.createUserWithEmailAndPassword(emailstr, passstr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                /**
                 * it will check if the task means user register is successful or nor.
                 * it will also check if the user is already registered.
                 * @param task  The task that will be checked if it is successful.
                 */
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), " Register is successful!", Toast.LENGTH_LONG).show();
                        Toast.makeText(getApplicationContext(), "Please Login again!", Toast.LENGTH_LONG).show();

                        email.setText("");
                        pass.setText("");

                        Intent intent = new Intent(userRegisterOrLogin.this, userRegisterOrLogin.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), " Register is unsuccessful", Toast.LENGTH_LONG).show();

                        if (task.getException() instanceof FirebaseAuthUserCollisionException) {

                            Toast.makeText(getApplicationContext(), " This user is already Registered", Toast.LENGTH_LONG).show();

                        } else {
                            Toast.makeText(getApplicationContext(), " Error : " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                }
            });
        }
    }






    /**
     * Called when the login button is clicked.
     * it will login the user into the app through registered email and password.
     * it will also check the email address valid or not and password must be greater than 7 characters.
     */
    private void doUserLogin() {
        String emailstr = email.getText().toString();
        String passstr = pass.getText().toString();


        if(emailstr.trim().equals("") || passstr.trim().equals("") )
        {
            Toast.makeText(getBaseContext(), "empty field", Toast.LENGTH_LONG).show();

            if(!Patterns.EMAIL_ADDRESS.matcher((CharSequence) email).matches())
            {
                email.setError("Please enter a valid Email");
                email.requestFocus();
                return;
            }

            if(passstr.length() > 7)
            {
                pass.setError(" Password must be at least 8 characters");
                pass.requestFocus();
                return;
            }
        }
        else {
            mAuth.signInWithEmailAndPassword(emailstr,passstr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                /**
                 * it will check if the task means user login is complete or nor.
                 * @param task  The task that will be checked if it is complete.
                 */
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        finish();
                        Toast.makeText(getApplicationContext(), " Sign in is successful",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(userRegisterOrLogin.this, homePageOnlineRental.class);
                        startActivity(intent);
                        /*Intent intentPayment = new Intent(userRegisterOrLogin.this, paymentActivity.class);
                        startActivity(intentPayment);*/

                    } else {
                        Toast.makeText(getApplicationContext(), " Login is unsuccessful",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(userRegisterOrLogin.this, userRegisterOrLogin.class);
                        startActivity(intent);
                       /* Intent intentPayment = new Intent(userRegisterOrLogin.this, paymentActivity.class);
                        startActivity(intentPayment);*/
                    }

                }
            });
        }
    }
}