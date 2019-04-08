package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,uc1.class);
                startActivity(i);
            }
        });
        Button  btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,uc2.class);
                startActivity(j);
            }
        });
        Button  btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,uc3.class);
                startActivity(j);
            }
        });
        Button  btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,uc4.class);
                startActivity(j);
            }
        });
        Button  btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,uc5.class);
                startActivity(j);
            }
        });
    }
}
