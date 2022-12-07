package com.example.endsemexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class Question2 extends AppCompatActivity {
    Button usdButton, kshsButton, gbpButton, euroButton, calculateButton;
    EditText usd, kshs, gbp, euro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        kshsButton = findViewById(R.id.button6);
        euroButton = findViewById(R.id.button7);
        usdButton = findViewById(R.id.button8);
        gbpButton = findViewById(R.id.button9);
        calculateButton = findViewById(R.id.button10);

        kshs = findViewById(R.id.etKshs);
        usd = findViewById(R.id.etUsd);
        gbp =  findViewById(R.id.etGbp);
        euro = findViewById(R.id.etEuro);

        calculateButton.setOnClickListener(view -> {
            int amount = Integer.parseInt(kshs.getText().toString());
            DecimalFormat f = new DecimalFormat("##.00");

            String kshs_to_usd = f.format(amount * 0.0081);
            String kshs_to_gbp = f.format(amount * 0.0066);
            String kshs_to_euro = f.format(amount * 0.0077);

            usd.setText(kshs_to_usd);
            gbp.setText(kshs_to_gbp);
            euro.setText(kshs_to_euro);

        });
    }
}