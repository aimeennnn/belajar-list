package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Aiman", "E41221613", "087853022749"));
        mahasiswaArrayList.add(new Mahasiswa("Akmal Althaf", "E41221926", "081230663914"));
        mahasiswaArrayList.add(new Mahasiswa("Angga Julian Pradana", "E41221913", "087853007879797"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rizky Asyam Haidar", "E41221788", "0875566677749"));

    }
}