package com.example.societology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.societology.Adapter.EventAdapterHead;
import com.example.societology.Adapter.TestAdapter;
import com.example.societology.api.JSONplaceholder;
import com.example.societology.model.Event;
import com.example.societology.model.olympic;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestActivity extends AppCompatActivity {

    private ArrayList<olympic> cursorUserArrayList;
    private TestAdapter courseRVAdapter;
    private RecyclerView coursesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        coursesRV = findViewById(R.id.recylerview_test);

        // setting layout manager for our recycler view.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TestActivity.this, RecyclerView.VERTICAL, false);
        coursesRV.setLayoutManager(linearLayoutManager);


        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.100.7:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONplaceholder jsoNplaceholder = retrofit.create(JSONplaceholder.class);


        //====fetching====/
        //===================//


//        Call<ArrayList<olympic>> call = jsoNplaceholder.getplayers();
//        call.enqueue(new Callback<ArrayList<olympic>>() {
//            @Override
//            public void onResponse(Call<ArrayList<olympic>> call, Response<ArrayList<olympic>> response) {
//                if(!response.isSuccessful())
//                {
//                    Toast.makeText(TestActivity.this, response.code(), Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                cursorUserArrayList = response.body();
//                courseRVAdapter = new TestAdapter(cursorUserArrayList, TestActivity.this);
//                coursesRV.setAdapter(courseRVAdapter);
//                Toast.makeText(TestActivity.this, "Filed is Emplty", Toast.LENGTH_SHORT).show();
//
//
//
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<olympic>> call, Throwable t) {
//                Toast.makeText(TestActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });

        //====================================//
        ///============inster=================//
        //====================================//


//        olympic oly = new olympic("14","hussain malik","12-8-2022","azerbaijaan",123,"100m");
//
//        Call<olympic> call = jsoNplaceholder.addplayer(oly);
//
//        call.enqueue(new Callback<olympic>() {
//            @Override
//            public void onResponse(Call<olympic> call, Response<olympic> response) {
//                if(!response.isSuccessful())
//                {
//                    Toast.makeText(TestActivity.this, response.code(), Toast.LENGTH_SHORT).show();
//                    return;
//                }
//            }
//
//            @Override
//            public void onFailure(Call<olympic> call, Throwable t) {
//
//            }
//        });

        olympic oly =  new olympic("14","khuzema don","12.6.2022","pakistani",1234,"100m");
        Call<olympic> call = jsoNplaceholder.updatePlayer("639426b87ff6b1312e35dea8",oly);
        call.enqueue(new Callback<olympic>() {
            @Override
            public void onResponse(Call<olympic> call, Response<olympic> response) {
                if(!response.isSuccessful())
                {
                    return;
                }
            }

            @Override
            public void onFailure(Call<olympic> call, Throwable t) {

            }
        });
    }


}