package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class bkashActivity extends AppCompatActivity {
    private EditText accountNumber;
    private EditText Pin;
    private EditText Amount;
    private EditText PhoneNumber;
    private Button Next;
    FirebaseDatabase rootNode;
    DatabaseReference Reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bkash);

        accountNumber = (EditText)findViewById(R.id.idAccountNumber);
        Pin = (EditText)findViewById(R.id.idPIN);
        Amount = (EditText) findViewById(R.id.idAmount);

        Next = (Button) findViewById(R.id.btnNext);



        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bkash();
            }
        });
    }

    private void Bkash()
    {
        String bkashPin = Pin.getText().toString();
        String totalAmount = Amount.getText().toString();
        String accountNum = accountNumber.getText().toString();

        if((TextUtils.isEmpty(bkashPin) ||  bkashPin.length() != 5) || (TextUtils.isEmpty(accountNum) || accountNum.length() != 7))
        {
            Pin.setError("Bkash Pin is required");
            Pin.setError("Pin is not correct");
            accountNumber.setError("Account Number is required");
            accountNumber.setError("Account Number is not correct");
            return;
        }
        else
        {
            rootNode = FirebaseDatabase.getInstance();
            Reference = rootNode.getReference("Payment Details");
            bkashHelperClass bkashHelperClass  = new bkashHelperClass(bkashPin,totalAmount,accountNum);

            String key = Reference.push().getKey();
            Reference.child(key).setValue(bkashHelperClass);
            Intent intent = new Intent(bkashActivity.this, demoPage.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(), " Payment successfully done", Toast.LENGTH_LONG).show();
        }

    }
}