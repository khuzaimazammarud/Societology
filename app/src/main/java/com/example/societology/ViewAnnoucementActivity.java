package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.societology.Adapter.AnnoucementAdapter;
import com.example.societology.Adapter.SocietyAdapterAdmin;
import com.example.societology.Adapter.UserAdapterAdmin;
import com.example.societology.model.Annoucement;
import com.example.societology.model.Society;
import com.example.societology.model.User;

import java.util.ArrayList;

public class ViewAnnoucementActivity extends AppCompatActivity {

    private ArrayList<Annoucement> cursorUserArrayList_annouc;
    private AnnoucementAdapter courseRVAdapter_annouc;
    private RecyclerView coursesRV_annouc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_annoucement);

        cursorUserArrayList_annouc = new ArrayList<Annoucement>();

        // getting our course array
        // list from db handler class.

        cursorUserArrayList_annouc.add(new Annoucement("Sportics Deadline","12-2-2022","23-2022","hello guyz we ready for big event full masri"));
//        cursorUserArrayList_annouc.add(new Annoucement("Sportics becayse cancel the event"));
//        cursorUserArrayList_annouc.add(new Annoucement("Naba dont sing please please"));

        // on below line passing our array lost to our adapter class.
        courseRVAdapter_annouc = new AnnoucementAdapter(cursorUserArrayList_annouc, ViewAnnoucementActivity.this);
        coursesRV_annouc = findViewById(R.id.recyclerview_annouc);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager_annouc = new LinearLayoutManager(ViewAnnoucementActivity.this, RecyclerView.VERTICAL, false);
        coursesRV_annouc.setLayoutManager(linearLayoutManager_annouc);

        // setting our adapter to recycler view.
        coursesRV_annouc.setAdapter(courseRVAdapter_annouc);

    }
}