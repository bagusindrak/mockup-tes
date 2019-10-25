package com.thinking.mockuptes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSatu_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Satu.class));
        finish();
    }
    public void onDua_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Dua.class));
        finish();
    }

    public void onLima_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Lima.class));
        finish();
    }

    public void onEnam_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Enam.class));
        finish();
    }

    public void onEmpat_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Empat.class));
        finish();
    }

    public void onTiga_Click(View view) {
        startActivity(new Intent(getApplicationContext(), Tiga.class));
        finish();
    }
}
