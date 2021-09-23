package com.example.tp2_moyenne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText FirstNote;
    private EditText SecondNote;
    private EditText ThirdNote;
    private Button btn;
    private TextView txtOut;
    private float Moyenne;
    public static final String EXTRA_NUMBER = "com.example.tp2_moyenne.EXTRA_NUMBER";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.FirstNote =(EditText) findViewById(R.id.FirstNote);
        this.SecondNote = (EditText) findViewById(R.id.SecondNote);
        this.ThirdNote = (EditText) findViewById(R.id.ThirdNote);
        this.btn = (Button) findViewById(R.id.button);
        this.txtOut = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Moyenne = (Float.parseFloat(FirstNote.getText().toString()) + Float.parseFloat(SecondNote.getText().toString())+Float.parseFloat(ThirdNote.getText().toString()))/3;
                if(Moyenne>10){
                    Intent intent = new Intent(MainActivity.this, ReussiActivity.class);
                    intent.putExtra(EXTRA_NUMBER,Moyenne);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(MainActivity.this, EchecActivity.class);
                    intent.putExtra(EXTRA_NUMBER,Moyenne);
                    startActivity(intent);
                }


            }
        });
    }

    public float getMoyenne() {
        return Moyenne;
    }

    public void setMoyenne(float moyenne) {
        Moyenne = moyenne;
    }
}