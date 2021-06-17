package com.example.currencyconnvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    
    public void convertCurrency(View view) {
              Log.i("Info ","Button prssed");


        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInDollars = editText.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInRupessDouble =  amountInDollarsDouble*72;
        String amountInRupessString = Double.toString(amountInRupessDouble);

        Toast.makeText(this, "$" + amountInDollars +" is " + amountInRupessString + " rupees " , Toast.LENGTH_LONG).show();
    }
    
    
    
    
    
    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}