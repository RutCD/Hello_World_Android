package com.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
          Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


             b1 = findViewById(R.id.btn1);
             b2 = findViewById(R.id.btn2);
             b3 = findViewById(R.id.btn3);
             b4 = findViewById(R.id.btn4);

            b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this," El resultado es 4", Toast.LENGTH_LONG).show();


            }
        });
                b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this," El resultado es 18", Toast.LENGTH_LONG).show();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this," El resultado es 56", Toast.LENGTH_LONG).show();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this," El resultado es 72", Toast.LENGTH_LONG).show();


            }
        });






    }


}