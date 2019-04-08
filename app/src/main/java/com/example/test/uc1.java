package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;

public class uc1 extends AppCompatActivity {
    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout bt1=findViewById(R.id.ll1);
                bt1.setOrientation(LinearLayout.HORIZONTAL);
                bt1.setGravity(Gravity.CENTER);
            }
        });
        bt2=findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout bt2=findViewById(R.id.ll1);
                bt2.setOrientation(LinearLayout.VERTICAL);
                bt2.setGravity(Gravity.CENTER);
            }
        });
        bt3=findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout bt3=findViewById(R.id.ll1);
                bt3.setGravity(Gravity.LEFT);
            }
        });
        Button refir = (Button) findViewById(R.id.re1);
        refir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
