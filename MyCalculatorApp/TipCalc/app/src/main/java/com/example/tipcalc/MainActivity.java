package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getTip(View v)
    {
        // get refrences to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        EditText percentEditText = (EditText) findViewById(R.id.percentEditText);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);

        //get the values from the EditText boxes and convert them to double data types
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = Double.parseDouble(percentEditText.getText().toString());
        //double total = Double.parseDouble(totalTextView.getText().toString());

        //calculate tip
        percent = percent/100;
        double tip = bill*percent;
        double total = bill + tip;

        tipTextView.setText("Tip: " + tip);
        totalTextView.setText("Total: " + total);




    }
}
