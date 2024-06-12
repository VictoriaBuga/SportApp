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

import com.example.project.R;
import com.example.sportapp.Stacks.Stacks;
import com.example.sportapp.model.Users;
import com.example.sportapp.retrofit.RetrofitService;
import com.example.sportapp.retrofit.UsersApi;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    TextInputEditText username_input;
    EditText password_input, repassword_input;
    EditText email_input;

    TextInputEditText username1;
    EditText  password1, repassword1, email1;
    TextView login;

    Button register;
    DBHelper DB;
    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        login = findViewById(R.id.alreadyHaveAccount);
        DB = new DBHelper(this);
        getSupportActionBar().hide();
        username1=findViewById(R.id.inputUsername);
        password1=findViewById(R.id.inputPassword);
        repassword1=findViewById(R.id.inputConfirmPassword);
        email1=findViewById(R.id.inputEmail);
        register=findViewById(R.id.btnregister);
        imageView1=findViewById(R.id.imageView8);
        imageView2=findViewById(R.id.imageView9);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
        initializeComponents();
        }});
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repassword1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });

        /*imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                repassword1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

            }
        });*/
       // password1.setTransformationMethod(PasswordTransformationMethod.getInstance());
       // repassword1.setTransformationMethod(PasswordTransformationMethod.getInstance());


    }

private void insertLocal()
{
    Boolean checkuser = DB.checkusername(username1.getText().toString());

    if(TextUtils.isEmpty(username1.getText().toString()) || TextUtils.isEmpty(email1.getText().toString()) || TextUtils.isEmpty(password1.getText().toString()) || TextUtils.isEmpty(repassword1.getText().toString()))
    {
        Toast.makeText(RegisterActivity.this, "All fields Required", Toast.LENGTH_SHORT).show();
    }
    else
    //               else Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
    {
        if(password1.getText().toString().equals(repassword1.getText().toString()))
        {

            if(checkuser == false)
            {
                Boolean insert = DB.insertData(username1.getText().toString(), email1.getText().toString(), password1.getText().toString());
                if(insert == true)
                {
                    Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, GenderActivity.class));
                }
                else  Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
            }
            else  Toast.makeText(RegisterActivity.this, "That username’s been taken. I guess great minds really do think alike.", Toast.LENGTH_SHORT).show();
        }
        else  Toast.makeText(RegisterActivity.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
    }
}

        private void initializeComponents () {
            username_input = findViewById(R.id.inputUsername);
            email_input = findViewById(R.id.inputEmail);
            password_input = findViewById(R.id.inputPassword);
            repassword_input = findViewById(R.id.inputConfirmPassword);
            register = findViewById(R.id.btnregister);
            RetrofitService retrofitService = new RetrofitService();
            UsersApi usersApi = retrofitService.getRetrofit().create(UsersApi.class);
            register.setOnClickListener(view -> {
                insertLocal();
                String username = username_input.getText().toString();
                Stacks.pushToUsernameStack(username);
                String email = email_input.getText().toString();
                String password = password_input.getText().toString();
                String repassword = repassword_input.getText().toString();
                Users user = new Users();
                user.setPassword(password);
                user.setUsername(username);
                user.setEmail(email);
                user.setRepassword(repassword);
                usersApi.save(user)

                        .enqueue(new Callback<Users>() {
                            @Override
                            public void onResponse(Call<Users> call, Response<Users> response) {

                                Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            }
                            @Override
                            public void onFailure(Call<Users> call, Throwable t) {
                               Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                              Logger.getLogger(RegisterActivity.class.getName()).log(Level.SEVERE, "Eroare aparuta", t);
                            }
                        });



            });
        }

}

 /* private void postData(String username, String email, String password, String repassword)
    {

        Retrofit  retrofit =  new Retrofit.Builder()
                .baseUrl("http://192.168.9.111:8083")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UsersApi usersApi = retrofit.create(UsersApi.class);
        Users users = new Users(username, email, password, repassword);
        Call<Users> call = usersApi.createPost(users);

        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                username1.setText("");
                email1.setText("");
                password1.setText("");
                repassword1.setText("");
                Users responsefromApi = response.body();
                assert responsefromApi != null;
                String responseString = "Response: " + response.code() + "\nUsername: " + responsefromApi.getUsername() + "\n" + "email: " + responsefromApi.getEmail() + "\n" +  "password: " + responsefromApi.getPassword() + "\n" + "repassword: " + responsefromApi.getRepassword();
                apiresponse.setText(responseString);
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                apiresponse.setText("Error found is : " + t.getMessage());
            }
        });
    }*/

// TextView apiresponse;

/* String username = String.valueOf(username_input.getText());
                String email = String.valueOf(email_input.getText());
                String password = String.valueOf(password_input.getText());
                String repassword = String.valueOf(repassword_input.getText());*/

/*private void seeData(String username, String email, String password, String repassword)
{
   String response =  "username " + username + " email " + email + " password " + password + " repassword " + repassword;
    apiresponse.setText(response);
}*/
// seeData(username1.getText().toString(), email1.getText().toString(), password1.getText().toString(), repassword1.getText().toString());

 /* register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postData(username1.getText().toString(), email1.getText().toString(), password1.getText().toString(), repassword1.getText().toString());
            }
        });*/



// apiresponse = findViewById(R.id.text_view_api);



       /*register.setOnClickListener(new View.OnClickListener()
        {
             @Override
            public void onClick(View view)
            {
                initializeComponents();
                EditText username, password, repassword, email1;
             username=findViewById(R.id.inputUsername);
             password=findViewById(R.id.inputPassword);
            repassword=findViewById(R.id.inputConfirmPassword);
             email1=findViewById(R.id.inputEmail);
             register=findViewById(R.id.btnregister);
                Boolean checkuser = DB.checkusername(username.getText().toString());

                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(email1.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) || TextUtils.isEmpty(repassword.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "All fields Required", Toast.LENGTH_SHORT).show();
                }
               else
 //               else Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                {
                    if(password.getText().toString().equals(repassword.getText().toString()))
                    {

                        if(checkuser == false)
                        {
                            Boolean insert = DB.insertData(username.getText().toString(), email1.getText().toString(), password.getText().toString());
                            if(insert == true)
                            {
                                Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegisterActivity.this, GenderActivity.class));

                            }
                            else  Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }
                        else  Toast.makeText(RegisterActivity.this, "That username’s been taken. I guess great minds really do think alike.", Toast.LENGTH_SHORT).show();
                    }
                    else  Toast.makeText(RegisterActivity.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
                }
            }

        });*/


