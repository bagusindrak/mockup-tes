package com.thinking.mockuptes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Enam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enam);
    }

    public void onBack_Click(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
}
