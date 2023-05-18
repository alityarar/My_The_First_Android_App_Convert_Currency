package com.example.convertcurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView amountEntered;
    TextView currencyTyp;
    TextView resultShow;
    TextView converter;
    int balance=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountEntered=findViewById(R.id.EnteredAmount);
        currencyTyp=findViewById(R.id.CurrencyType);
        resultShow=findViewById(R.id.ResultHere);
        converter=findViewById(R.id.ConvertButton);

        converter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                depositClicked();
            }

        });
    }
    private void depositClicked() {

        balance=Integer.parseInt(amountEntered.getText().toString());
        int currency=balance*137;
        resultShow.setText(String.valueOf(currency)+" Japanese Yen");
    }
}