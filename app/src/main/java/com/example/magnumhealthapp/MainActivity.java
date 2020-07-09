package com.example.magnumhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Sign;
    private Button Msignin, Psignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Heading = (TextView) findViewById(R.id.Heading);
        Sign= (TextView)findViewById(R.id.Signin);
        Msignin=(Button)findViewById(R.id.Bookings);
        Psignin=(Button)findViewById(R.id.Patientbtn);

        Msignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move_3rd_page= new Intent(MainActivity.this, MainActivity3.class);
                startActivity(move_3rd_page);
            }
        });

        Psignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move_2nd_page = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(move_2nd_page);
            }
            });
        }

    }




