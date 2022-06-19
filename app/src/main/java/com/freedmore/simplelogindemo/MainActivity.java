package com.freedmore.simplelogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPrefs;
    SharedPreferences.Editor editor;
    EditText edtxtNames;
    EditText edtxtEmail;
    EditText edtxtPassword;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxtNames = findViewById(R.id.editTextFullName);
        edtxtEmail = findViewById(R.id.editTextEmail);
        edtxtPassword = findViewById(R.id.editTextPassword);
        btnregister = findViewById(R.id.buttonRegister);

        sharedPrefs = getSharedPreferences("myprefs", Context.MODE_PRIVATE);
        editor = sharedPrefs.edit();

    }
    public void save(View view) {
        String fullnames = edtxtNames.getText().toString();
        String email = edtxtEmail.getText().toString();
        String password = edtxtPassword.getText().toString();

        editor.putString("f_name",fullnames);
        editor.putString("e_mail",email);
        editor.putString("p_word",password);
        editor.commit();

        Toast.makeText(this,"Registered Successfully",Toast.LENGTH_LONG).show();
    }
    public void openSecondActivity(View view){
        startActivity(new Intent(this,SecondActivity.class));
    }
}