package com.freedmore.simplelogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sharedPrefs;
    SharedPreferences.Editor editor ;
    TextView names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        names = findViewById(R.id.textViewNames);
        sharedPrefs = getSharedPreferences("myprefs", Context.MODE_PRIVATE);
        editor = sharedPrefs.edit();

        if (sharedPrefs.contains("f_name")) {
            names.setText(sharedPrefs.getString("f_name", "No Name Found"));
        }
    }

}