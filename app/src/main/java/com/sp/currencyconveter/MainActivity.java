package com.sp.currencyconveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertAmount(View view){
        // 1 AUD = 48.73 INR
        // 1 AUD = 4.78 Chinese Yuan
        EditText editText = findViewById(R.id.editText);
        String amountInAUD = editText.getText().toString();
        Double amount = Double.parseDouble(amountInAUD);
        Double amountInINR = amount * 48.73;
       // String finalValue = Double.toString(amountInINR);
        String finalValue = String.format("%.2f", amountInINR);
        Log.i("Info","Button Pressed");
        Toast.makeText(this, amountInAUD + " AUD is " + finalValue + " INR" , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
