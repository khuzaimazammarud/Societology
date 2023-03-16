package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.societology.Adapter.EventAdapterHead;
import com.example.societology.model.Event;

import java.util.ArrayList;

public class HeadDashboardActivity extends AppCompatActivity {

    private ArrayList<Event> cursorUserArrayList;
    private EventAdapterHead courseRVAdapter;
    private RecyclerView coursesRV;

    Button addEvent, viewAnnoucBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_dashboard);


        //====find view by id=========

        addEvent = (Button) findViewById(R.id.addEventBtn);
        viewAnnoucBtn = (Button) findViewById(R.id.ViewAnnocBtn);


        cursorUserArrayList = new ArrayList<Event>();
        // getting our course array
        // list from db handler class.

        cursorUserArrayList.add(new Event("LOC","22-7-2022","this the event","socetyHall"));

        // on below line passing our array lost to our adapter class.
        courseRVAdapter = new EventAdapterHead(cursorUserArrayList, HeadDashboardActivity.this);
        coursesRV = findViewById(R.id.recyclerview_userEvent);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HeadDashboardActivity.this, RecyclerView.VERTICAL, false);
        coursesRV.setLayoutManager(linearLayoutManager);

        // setting our adapter to recycler view.
        coursesRV.setAdapter(courseRVAdapter);

        ///=====onlcicks============


        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HeadDashboardActivity.this,AddEvent.class);
                startActivity(i);
            }
        });


        ///============view Annoucment=====

        viewAnnoucBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HeadDashboardActivity.this,ViewAnnoucementActivity.class);
                startActivity(i);
            }
        });


    }
}