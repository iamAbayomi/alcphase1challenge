package com.appdot.io.alc_phase1_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    /**
     *
     * @param savedInstanceState
        Oncreate method to initialize the buttons.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        /*button1 opens ActivityB which contains The Andela About ALC Page*/
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent( MainActivity.this, ActivityB.class);
                startActivity(intentA);
            }
        });

        /*button2 opens ActivityC which contains my Profile Page*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent( MainActivity.this, ActivityC.class);
                startActivity(intentB);
            }
        });

    }





}
