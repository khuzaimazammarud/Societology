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
import com.example.societology.UpdateEventActivity;
import com.example.societology.model.Event;

import java.util.ArrayList;

public class EventAdapterHead extends RecyclerView.Adapter<EventAdapterHead.ViewHolder> {

    // variable for our array list and context
    private ArrayList<Event> cursorUserArrayList;
    private Context context;

    // constructor
    public EventAdapterHead(ArrayList<Event> cursorUserArrayList, Context context) {
        this.cursorUserArrayList = cursorUserArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        Event modal = cursorUserArrayList.get(position);
        holder.eventName.setText(modal.getEventname());
        holder.startDate.setText(modal.getStartdate());
        holder.Describtion.setText(modal.getDescribtion());
        holder.Venue.setText(modal.getVenue());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are calling an intent.
                Intent i = new Intent(context, UpdateEventActivity.class);

//                // below we are passing all our values.
//                i.putExtra("eventname", modal.getEventName());
//                i.putExtra("startdate", modal.getStartDate());
//                i.putExtra("enddate", modal.getEndDate());
//                i.putExtra("societyid", Integer.toString(modal.getSocietyId()));

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
        private TextView eventName, startDate, Describtion, Venue;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            eventName = itemView.findViewById(R.id.eventNameDy_userevent);
            startDate = itemView.findViewById(R.id.startDateDy_userevent);
            Describtion = itemView.findViewById(R.id.DescribtionEdt);
            Venue = itemView.findViewById(R.id.venueEdt);

        }
    }
}