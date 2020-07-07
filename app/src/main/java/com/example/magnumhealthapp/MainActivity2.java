package com.example.magnumhealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

            private EditText Name;
            private EditText Emails;
            private EditText Password;
            private Button Login;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);

                Name= (EditText)findViewById(R.id.Username);
                Emails= (EditText)findViewById(R.id.Useremail);
                Password=(EditText)findViewById(R.id.UserPassword);
                Login= (Button) findViewById(R.id.Loginbtn);

                Login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        validate(Name.getText().toString(),Password.getText().toString());

                    }
                });

            }

            private void validate(String userName, String userPassword){
               if ((userName.equals("Fustina"))&& (userPassword.equals("1234"))){
                    Intent move_5th_page= new Intent(MainActivity2.this, MainActivity5.class);
                    startActivity(move_5th_page);
                
                    

                    }
                }
            }