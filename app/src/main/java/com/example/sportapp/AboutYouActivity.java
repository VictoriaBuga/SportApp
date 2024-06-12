package com.example.sportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportapp.Stacks.Stacks;

public class AboutYouActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button btn_skip;
    Button btn_next;
    Button btn_back;
    EditText country, hours_of_sleep;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_you);
        getSupportActionBar().hide();
        country = findViewById(R.id.country);
        hours_of_sleep = findViewById(R.id.hours_of_sleep);
        Spinner spinner = findViewById(R.id.combobox_how_active);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.how_active, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Spinner spinner2 = findViewById(R.id.combobox_when_active);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.when_active, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        btn_skip = findViewById(R.id.button_skip);
        btn_next = findViewById(R.id.button_next);
        btn_back = findViewById(R.id.button_back);

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
                startActivity(new Intent(getApplicationContext(), LoseGainActivity.class));
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String string_how_active = (String) spinner.getSelectedItem();
                Stacks.pushToHowActiveStack(string_how_active);

                String string_when_active = (String) spinner2.getSelectedItem();
                Stacks.pushToWhenActiveStack(string_when_active);

                String string_country = country.getText().toString();
                Stacks.pushToCountryStack(string_country);

                String string_hours_of_sleep = hours_of_sleep.getText().toString();
                int int_hours_of_sleep=Integer.parseInt(string_hours_of_sleep);
                Stacks.pushToHoursOfSleepStack(int_hours_of_sleep);

                startActivity(new Intent(getApplicationContext(), AboutHealthActivity.class));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
