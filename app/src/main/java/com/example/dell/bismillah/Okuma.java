package com.example.dell.bismillah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Okuma extends AppCompatActivity {

    Button button7;
    public static TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okuma);

    textView2 = (TextView) findViewById(R.id.textView2);
    button7 = (Button) findViewById(R.id.button7);

    button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),KodOku.class));
        }
    });

    }



    }

