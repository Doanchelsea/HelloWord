package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Bai2Activity extends AppCompatActivity {
    private LinearLayout llDVat;
    private LinearLayout llTraiCay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        llDVat = (LinearLayout) findViewById(R.id.llDVat);
        llTraiCay = (LinearLayout) findViewById(R.id.llTraiCay);
        llDVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai2Activity.this,MainActivity.class);
                intent.putExtra("id","1");
                intent.putExtra("name","động vật");
                startActivity(intent);
            }
        });
        llTraiCay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai2Activity.this,MainActivity.class);
                intent.putExtra("id","2");
                intent.putExtra("name","trái cây");
                startActivity(intent);
            }
        });
    }
}
