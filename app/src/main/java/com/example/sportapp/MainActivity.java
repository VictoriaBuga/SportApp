package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText username, password;
    Button login_btn;
    DBHelper DB;
    ImageView imageView1;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.SignUp);
        username = findViewById(R.id.username_login);
        password = findViewById(R.id.password_login);
        login_btn = findViewById(R.id.btnlogin);
        imageView1=findViewById(R.id.imageView8);
        DB = new DBHelper(this);
        getSupportActionBar().hide();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                {
                    Toast.makeText(MainActivity.this, "All fields required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass == true)
                    {
                       Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                       startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
