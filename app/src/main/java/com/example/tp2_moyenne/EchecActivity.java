package com.example.tp2_moyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EchecActivity extends AppCompatActivity {
    private TextView txtOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echec);
        Intent intent = getIntent();
        float Moyenne = intent.getFloatExtra(MainActivity.EXTRA_NUMBER,0);
        this.txtOut = findViewById(R.id.message2);
        txtOut.setText("désolé mais vous avez redoubler avec un moyenne "+Moyenne);
    }
}