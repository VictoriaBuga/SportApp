package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportapp.Stacks.Stacks;

public class LoseGainActivity extends AppCompatActivity {

    Button btn_skip;
    Button btn_back;
    Button btn_next;
    EditText gain_age, gain_height, gain_desired, gain_actual, lose_height, lose_age, lose_desired, lose_actual;
    Switch switch_lose, switch_gain;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_gain);
        btn_skip= findViewById(R.id.button_skip);
        btn_next=findViewById(R.id.button_next);
        btn_back=findViewById(R.id.button_back);
        gain_age=findViewById(R.id.gain_age);
        gain_height=findViewById(R.id.gain_height);
        gain_desired=findViewById(R.id.gain_desired);
        gain_actual=findViewById(R.id.gain_actual);
        lose_height=findViewById(R.id.lose_height);
        lose_age=findViewById(R.id.lose_age);
        lose_desired=findViewById(R.id.lose_desired);
        lose_actual=findViewById(R.id.lose_actual);
        switch_lose=(Switch) findViewById(R.id.switch_lose);
        switch_gain=(Switch) findViewById(R.id.switch_gain);
        getSupportActionBar().hide();


        btn_skip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), GenderActivity.class));
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(switch_gain.isChecked())
                {
                    String string_gain = "gain weight";
                    Stacks.pushToLoseGainStack(string_gain);

                    String string_height = gain_height.getText().toString();
                    Stacks.pushToHeightStack(string_height);

                    String string_age = gain_age.getText().toString();
                    int int_age=Integer.parseInt(string_age);
                    Stacks.pushToAgeStack(int_age);

                    String string_desired = gain_desired.getText().toString();
                    int int_desired=Integer.parseInt(string_desired);
                    Stacks.pushToDesiredWeightStack(int_desired);

                    String string_actual = gain_actual.getText().toString();
                    int int_actual=Integer.parseInt(string_actual);
                    Stacks.pushToActualWeightStack(int_actual);

                }

                if (switch_lose.isChecked())
                {
                    String string_lose = "lose weight";
                    Stacks.pushToLoseGainStack(string_lose);

                    String string_height = lose_height.getText().toString();
                    Stacks.pushToHeightStack(string_height);

                    String string_age = lose_age.getText().toString();
                    int int_age=Integer.parseInt(string_age);
                    Stacks.pushToAgeStack(int_age);

                    String string_desired = lose_desired.getText().toString();
                    int int_desired=Integer.parseInt(string_desired);
                    Stacks.pushToDesiredWeightStack(int_desired);

                    String string_actual = lose_actual.getText().toString();
                    int int_actual=Integer.parseInt(string_actual);
                    Stacks.pushToActualWeightStack(int_actual);
                }

                startActivity(new Intent(getApplicationContext(), AboutYouActivity.class));
            }
        });



    }
}
