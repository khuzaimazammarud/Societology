package com.example.societology.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.societology.R;
import com.example.societology.UpdateSocietyActivity;
import com.example.societology.model.Society;

import java.util.ArrayList;

public class SocietyAdapterAdmin extends RecyclerView.Adapter<SocietyAdapterAdmin.ViewHolder> {

    // variable for our array list and context
    private ArrayList<Society> cursorUserArrayList;
    private Context context;

    // constructor
    public SocietyAdapterAdmin(ArrayList<Society> cursorUserArrayList, Context context) {
        this.cursorUserArrayList = cursorUserArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.society_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        Society modal = cursorUserArrayList.get(position);
        holder.societyName.setText(modal.getSocietyFullName());
        holder.soceityFullName.setText(modal.getSocietyFullName());
        holder.head.setText(modal.getHeadName());
        holder.startDate.setText(modal.getStartDate());
        holder.Active.setText(Integer.toString(modal.getActive()));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are calling an intent.
                Intent i = new Intent(context, UpdateSocietyActivity.class);

//                // below we are passing all our values.
//                i.putExtra("name", modal.getSocietyName());
//                i.putExtra("societyid",Integer.toString(modal.getSocietyid()));
                // starting our activity.
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list
        return cursorUserArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private TextView societyName,soceityFullName,startDate,Active,head;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
           societyName =itemView.findViewById(R.id.societyNameDy);
           soceityFullName = itemView.findViewById(R.id.fullNameDy);
           startDate = itemView.findViewById(R.id.startDateSocietyDy);
           Active = itemView.findViewById(R.id.activeDy);
           head = itemView.findViewById(R.id.headDy);
        }
    }
}