package com.example.toolboxahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v)
    {
        Switch simpleSwitch = (Switch) findViewById(R.id.simpleSwitch);
        Boolean switchState = simpleSwitch.isChecked();
        String regOrPremium = "";

        if(switchState == true)
            regOrPremium = "reg";
        else
            regOrPremium = "prem";

        Intent intent = new Intent(this, TicketActivity.class);

        intent.putExtra(TicketActivity.REG_PREM, regOrPremium);

        startActivity(intent);
    }
}
