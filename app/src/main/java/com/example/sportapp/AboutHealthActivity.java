package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportapp.Stacks.Stacks;
import com.example.sportapp.model.UserDetails;
import com.example.sportapp.retrofit.RetrofitService;
import com.example.sportapp.retrofit.UserDetailsApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AboutHealthActivity extends AppCompatActivity {
    Button btn_done;
    Button btn_back;
    EditText health;
    TextView stack;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_health);
        btn_done = findViewById(R.id.button_done);
        btn_back = findViewById(R.id.button_back);
        health = findViewById(R.id.health);
        getSupportActionBar().hide();
        btn_done.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               initializeComponents();

            }
        });

        btn_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), AboutYouActivity.class));
            }
        });


    }
    private void seeData(String username, String gender, String lose_gain, Integer actual_weight, Integer desired_weight, Integer age, String height, Integer hours_of_sleep, String country, String how_active, String when_active, String health_problems)
    {
        String response =  "username " + username + " gender " + gender + " lose_gain " + lose_gain + " actual_weight " + actual_weight + " des_weight " + desired_weight + " age " + age + " height " + height + " hours_of_sleep " + hours_of_sleep + " country " + country + " how_active " + how_active + " when_active " + when_active + " health_problems " + health_problems ;
        stack.setText(response);
    }
    private void initializeComponents () {
        String string_health = health.getText().toString();
        Stacks.pushToHealthProblemsStack(string_health);
        RetrofitService retrofitService = new RetrofitService();
        UserDetailsApi userDetailsApi = retrofitService.getRetrofit().create(UserDetailsApi.class);
        btn_done.setOnClickListener(view -> {
            UserDetails userDetails = new UserDetails();
            if(!Stacks.isUsernameStackEmpty()) {String username = Stacks.popFromUsernameStack();
                userDetails.setUsername(username);}
            if(!Stacks.isGenderStackEmpty()){
            String gender = Stacks.popFromGenderStack();
                userDetails.setGender(gender);}
            if(!Stacks.isLoseGainStackEmpty()){
            String lose_gain = Stacks.popFromLoseGainStack();
                userDetails.setLose_gain(lose_gain);}
            if(!Stacks.isActualWeightStackEmpty()){
            Integer actual_weight = Stacks.popFromActualWeightStack();
                userDetails.setActual_weight(actual_weight);}
            if(!Stacks.isDesiredWeightStackEmpty()){
            Integer desired_weight = Stacks.popFromDesiredWeightStack();
                userDetails.setDesired_weight(desired_weight);}
            if(!Stacks.isAgeStackEmpty()){
            Integer age = Stacks.popFromAgeStack();
                userDetails.setAge(age);}
            if(!Stacks.isHeightStackEmpty()){
            String height = Stacks.popFromHeightStack();
                userDetails.setHeight(height); }
            if(!Stacks.isHoursOfSleepStackEmpty()){
            Integer hours_of_sleep = Stacks.popFromHoursOfSleepStack();
                userDetails.setHours_of_sleep(hours_of_sleep);}
            if(!Stacks.isCountryStackEmpty()){
            String country = Stacks.popFromCountryStack();
                userDetails.setCountry(country);}
            if(!Stacks.isHowActiveStackEmpty()){
            String how_active = Stacks.popFromHowActiveStack();
                userDetails.setHow_active(how_active);}
            if(!Stacks.isWhenActiveStackEmpty()){
            String when_active = Stacks.popFromWhenActiveStack();
                userDetails.setWhen_active(when_active);}
            if(!Stacks.isHealthProblemsStackEmpty()){
            String health_problems = Stacks.popFromHealthProblemsStack();
                userDetails.setHealth_problems(health_problems);}
            userDetailsApi.save(userDetails)

                    .enqueue(new Callback<UserDetails>() {
                        @Override
                        public void onResponse(Call<UserDetails> call, Response<UserDetails> response) {

                             Toast.makeText(AboutHealthActivity.this, "Thank you for sharing with us.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        }

                        @Override
                        public void onFailure(Call<UserDetails> call, Throwable t) {
                              Toast.makeText(AboutHealthActivity.this, "Unfortunately, something went wrong. Please try again later.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        }
                    });



        });
    }
}
//seeData(username, gender, lose_gain, actual_weight, desired_weight, age, height, hours_of_sleep, country, how_active, when_active, health_problems);
//Logger.getLogger(AboutHealthActivity.class.getName()).log(Level.SEVERE, "Eroare aparuta", t);