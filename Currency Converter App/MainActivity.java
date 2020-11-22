package com.example.firstdemoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        EditText editAmount = (EditText) findViewById(R.id.editAmount);
        String amountInDoller = editAmount.getText().toString();
        double amontInRupee = Double.parseDouble(amountInDoller);
        amontInRupee = amontInRupee * 73.32;
        String IndianRupee =String.format("%.2f", amontInRupee);
        Toast.makeText(this, amountInDoller+" Dollar is "+IndianRupee+" Rupee", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}