package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    Button Login;
    TextView singup;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login = (Button) findViewById(R.id.loginButton);
        singup = (TextView) findViewById(R.id.signupText);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.startdateEdt);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("") && pass.equals("")){
                    Intent intent = new Intent(LoginActivity.this,HeadDashboardActivity.class);
                    startActivity(intent);
                }
//
//                Intent intent = new Intent(LoginActivity.this,AdminDashboardActivity.class);
//                startActivity(intent);

//                Intent intent = new Intent(LoginActivity.this,TestActivity.class);
//                startActivity(intent);

            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}