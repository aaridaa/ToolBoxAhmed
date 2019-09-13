package com.example.toolboxahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TicketActivity extends AppCompatActivity {

    public static final String REG_PREM = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        Intent intent = getIntent();
        String y = intent.getStringExtra(REG_PREM);

        String strToDisplay = "Your experience: "+ y;
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
