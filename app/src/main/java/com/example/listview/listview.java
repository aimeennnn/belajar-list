package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.*;

public class listview extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = (ListView) findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.array_negara, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        getSupportActionBar().setTitle("List View");
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.list, menu);
//        return true;
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
}
}