package com.thinking.mockuptes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


    public void onBtnLoginNow_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Login.class));
    }

    public void onBtnRegister_Click(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
