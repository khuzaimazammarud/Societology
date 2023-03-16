package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.societology.Adapter.SocietyAdapterAdmin;
import com.example.societology.Adapter.UserAdapterAdmin;
import com.example.societology.model.Society;
import com.example.societology.model.User;

import java.util.ArrayList;

public class AdminDashboardActivity extends AppCompatActivity {

    //==button===

    TextView addSociety;
    Button addannouBTn;

    //=================
    //user recyler View
    //=================

    private ArrayList<User> cursorUserArrayList_user;
    private UserAdapterAdmin courseRVAdapter_user;
    private RecyclerView coursesRV_user;


    //===========================
    //======society variable=====
    //===========================

    private ArrayList<Society> cursorUserArrayList_society;
    private SocietyAdapterAdmin courseRVAdapter_society;
    private RecyclerView coursesRV_society;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        //====findView byid====

        addSociety = (TextView) findViewById(R.id.addSocietyApp);
        addannouBTn = (Button) findViewById(R.id.addAnnocBtn);


        //===================================================//
        ///==================user RecylerView================//
        //=================================================//
        cursorUserArrayList_user = new ArrayList<User>();

        // getting our course array
        // list from db handler class.
        cursorUserArrayList_user.add(new User(201651,"khuzzema","khuzema@gmail.com","12345678",1));
        cursorUserArrayList_user.add(new User(201651,"khuzzema","khuzema@gmail.com","12345678",1));
        cursorUserArrayList_user.add(new User(201651,"khuzzema","khuzema@gmail.com","12345678",1));
        // on below line passing our array lost to our adapter class.
        courseRVAdapter_user = new UserAdapterAdmin(cursorUserArrayList_user, AdminDashboardActivity.this);
        coursesRV_user = findViewById(R.id.recyclerview_user);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager_user = new LinearLayoutManager(AdminDashboardActivity.this, RecyclerView.HORIZONTAL, false);
        coursesRV_user.setLayoutManager(linearLayoutManager_user);

        // setting our adapter to recycler view.
        coursesRV_user.setAdapter(courseRVAdapter_user);



        //===========================================//
        //=================society==================//
        //==========================================//


        cursorUserArrayList_society = new ArrayList<Society>();

        // getting our course array
        // list from db handler class.
        cursorUserArrayList_society.add(new Society("GDSC","Google Developer Club","Khzuema","13-6-2015",1));
        cursorUserArrayList_society.add(new Society("ACM","Acomlished Course Product","Hasan","13-6-2015",1));
        cursorUserArrayList_society.add(new Society("ACM","Acomlished Course Product","Hasan","13-6-2015",1));

        // on below line passing our array lost to our adapter class.
        courseRVAdapter_society = new SocietyAdapterAdmin(cursorUserArrayList_society, AdminDashboardActivity.this);
        coursesRV_society = findViewById(R.id.recyclerview_society);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager_society = new LinearLayoutManager(AdminDashboardActivity.this, RecyclerView.HORIZONTAL, false);
        coursesRV_society.setLayoutManager(linearLayoutManager_society);

        // setting our adapter to recycler view.
        coursesRV_society.setAdapter(courseRVAdapter_society);




        //=====addsocity=======/

        addSociety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminDashboardActivity.this,AddSociety.class);
                startActivity(i);
            }
        });

        //=====addannoucment=======/


        addannouBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminDashboardActivity.this,AnoucementActivity.class);
                startActivity(i);
            }
        });


    }
}