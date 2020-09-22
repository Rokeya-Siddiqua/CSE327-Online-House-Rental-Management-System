package com.example.cse327_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class paymentActivity extends AppCompatActivity {
    private EditText Name,Mail,Time,Date,tenantType,PaymentType,Amount,Currency,Phone;
    private Button Submit;
    FirebaseDatabase rootNode;
    DatabaseReference Reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Name = (EditText) findViewById(R.id.idName);
        Mail = (EditText) findViewById(R.id.idMAil);
        Time = (EditText) findViewById(R.id.idTime);
        Date = (EditText) findViewById(R.id.idDate);
        tenantType = (EditText) findViewById(R.id.idType);
        PaymentType = (EditText) findViewById(R.id.idPayemntType);
        Amount = (EditText) findViewById(R.id.idAmount);
        Currency = (EditText) findViewById(R.id.idCurrency);
        Phone = (EditText)findViewById(R.id.idPhone);
        Submit = (Button)findViewById(R.id.btnSubmit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                Reference = rootNode.getReference("Payment Details");

                String name = Name.getText().toString();
                String mail = Mail.getText().toString();
                String time = Time.getText().toString();
                String date = Date.getText().toString();
                String tenant = tenantType.getText().toString();
                String payment = PaymentType.getText().toString();
                String totalAmount = Amount.getText().toString();
                String currencyChanger = Currency.getText().toString();
                String phoneNumber = Phone.getText().toString();

                paymentHelperClass helperClass = new paymentHelperClass(name,mail,time,date,tenant,payment,totalAmount,currencyChanger,phoneNumber);
                Reference.child(phoneNumber).setValue(helperClass);


                
            }
        });

    }
}