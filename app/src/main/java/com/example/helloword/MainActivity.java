package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipe;
    private RecyclerView listDS;
    private Toolbar toolbar;
    List<Model> modelList;
    Adapter adapter;
    String id;
    LinearLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        GetData();
    }

    private void GetData() {
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setRefreshing(false);
            }
        });
        if (id.equals("1")){
            modelList.add(new Model(R.drawable.dv1,1,"Con Khỉ"));
            modelList.add(new Model(R.drawable.voi,1,"Con Voi"));
            modelList.add(new Model(R.drawable.meo,1,"Con Mèo"));
            modelList.add(new Model(R.drawable.lon,1,"Con Lợn"));
        }else if (id.equals("2")){
            modelList.add(new Model(R.drawable.cachua,1,"Cà Chua"));
            modelList.add(new Model(R.drawable.catim,1,"Cà Tím"));
            modelList.add(new Model(R.drawable.dau,1,"Dâu"));
            modelList.add(new Model(R.drawable.xoai,1,"Xoài"));
        }
    }

    private void AnhXa() {
        Intent intent = getIntent();
        String name =  intent.getStringExtra("name");
        id = intent.getStringExtra("id");

        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        listDS = (RecyclerView) findViewById(R.id.listDS);
        toolbar = findViewById(R.id.toobalNhan);
        modelList = new ArrayList<>();
        manager = new GridLayoutManager(MainActivity.this,2);
        adapter = new Adapter(modelList,MainActivity.this);
        listDS.setHasFixedSize(true);
        listDS.setLayoutManager(manager);
        listDS.setAdapter(adapter);
        toolbar.setTitle("Bé nhận biết "+name);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
