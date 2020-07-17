package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText username,password;
    Intent gotodash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.submit);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname=username.getText().toString();
                String pass=password.getText().toString();
             //   Toast.makeText(Login.this,uname+pass,Toast.LENGTH_SHORT).show();


                if(uname .equals("softwarica" )){
                    if(pass.equals("coventry")){
                        gotodash=new Intent(Login.this,Dashboard.class);
                        startActivity(gotodash);

                    }
                    else{
                        Toast.makeText(Login.this,"Invalid password, try again",Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(Login.this,"Invalid username, try again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
