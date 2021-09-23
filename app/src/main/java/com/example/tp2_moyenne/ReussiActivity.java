package com.example.tp2_moyenne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReussiActivity extends AppCompatActivity {
    private TextView txtOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reussi);
        Intent intent = getIntent();
        float Moyenne = intent.getFloatExtra(MainActivity.EXTRA_NUMBER,0);
        this.txtOut = findViewById(R.id.message);
        txtOut.setText("Félicitations vous avez réussie avec un moyenne "+Moyenne);


    }
}