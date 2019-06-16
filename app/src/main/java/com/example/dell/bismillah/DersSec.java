package com.example.dell.bismillah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DersSec extends AppCompatActivity {


    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ders_sec);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

     button2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             okuma();
         }
     });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okuma();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okuma();
            }
        });
    }

    public void okuma(){

        Intent intent = new Intent(this,Okuma.class);
        startActivity(intent);
    }

}
