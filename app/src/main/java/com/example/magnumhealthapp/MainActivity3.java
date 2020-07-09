package com.example.magnumhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Name = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.UserPassword);
        Login = (Button) findViewById(R.id.Loginbtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());

            }
        });

    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("1234")) && (userPassword.equals("4321"))) {
            Intent move_4th_page = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(move_4th_page);
        }
    }
}