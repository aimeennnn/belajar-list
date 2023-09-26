package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        android.widget.Spinner spinner = findViewById(R.id.spinner);
        String[] options = {"Cari Pilihan Anda", "ListView", "RecycleView", "AutoComplate"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, options);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = options[position];

                switch (selectedItem) {
                    case "ListView":
                        Intent explicitIntent = new Intent(Spinner.this, listview.class);
                        startActivity(explicitIntent);
                        break;
                    case "RecycleView":
                        Intent explicitIntent2 = new Intent(Spinner.this, RecycleView.class);
                        startActivity(explicitIntent2);
                        break;
                    case "AutoComplate":
                        Intent explicitIntent3 = new Intent(Spinner.this, AutoComplate.class);
                        startActivity(explicitIntent3);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        getSupportActionBar().setTitle("Minggu 4");
    }
}