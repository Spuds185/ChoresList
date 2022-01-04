package com.example.choreslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String MyList[] = {"This","is","a","test"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.listview);
        ArrayAdapter<String> array;
        array = new ArrayAdapter<String>(
          this,
          R.layout.support_simple_spinner_dropdown_item,MyList);
        l.setAdapter(array);
    }
}