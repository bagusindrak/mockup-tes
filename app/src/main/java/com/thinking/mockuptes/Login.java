package com.thinking.mockuptes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onBtnRegister_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Register.class));
    }

    public void onBtnLogin_Click(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void onTxvForgotPassword_Click(View view) {
        Toast.makeText(getApplicationContext(), "COmming Soon to Forgot Password", Toast.LENGTH_SHORT).show();
    }
}
