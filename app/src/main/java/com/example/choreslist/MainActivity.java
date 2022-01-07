package com.example.choreslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    //setting up a list view and mylist of stings to be used later
    ListView l;
    List<String> MyList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding the list view by it's ID
        l = findViewById(R.id.listview);
        //creating a array adapter (it seems to be more for display perposes)
        ArrayAdapter<String> array;
        array = new ArrayAdapter<String>(
          this,
          R.layout.support_simple_spinner_dropdown_item,MyList);
        l.setAdapter(array);

        //getting user intput from the editTextChore
        EditText editTextChore = (EditText)findViewById(R.id.editTextChore);


        //creating a onclick for the addchores button
        Button addChores = (Button) findViewById(R.id.AddChoresButton);
        addChores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //adding the string this to my list
                String strChores =  editTextChore.getText().toString();
                MyList.add(strChores);
                //letting the array adapter know that something changed and needs refreshing
                array.notifyDataSetChanged();
            }
        });
    }
}