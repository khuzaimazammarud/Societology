package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.societology.database.MYDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignupActivity extends AppCompatActivity {

    EditText username,password,email,roll_number;
    MYDB DB;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        signup = (Button) findViewById(R.id.signupButton);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
//        roll_number = (EditText) findViewById(R.id.rollnumber);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();
                String eml = email.getText().toString();

                DB.addUser(user,eml,pass);
                Intent i = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);

            }
        });

    }



}