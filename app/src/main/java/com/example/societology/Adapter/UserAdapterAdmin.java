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
import com.example.societology.UpdateUserActivity;
import com.example.societology.model.User;

import java.util.ArrayList;

public class UserAdapterAdmin extends RecyclerView.Adapter<UserAdapterAdmin.ViewHolder> {

    // variable for our array list and context
    private ArrayList<User> cursorUserArrayList;
    private Context context;

    // constructor
    public UserAdapterAdmin(ArrayList<User> cursorUserArrayList, Context context) {
        this.cursorUserArrayList = cursorUserArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        User modal = cursorUserArrayList.get(position);
        holder.userName.setText(modal.getName());
        holder.userId.setText(Integer.toString(modal.getUser_id()));
        holder.Active.setText(Integer.toString(modal.getActive()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are calling an intent.
                Intent i = new Intent(context, UpdateUserActivity.class);

                // below we are passing all our values.
//                i.putExtra("name", modal.getName());
//                i.putExtra("email", modal.getEmail());
//                i.putExtra("password", modal.getPassword());
//                i.putExtra("societyid", Integer.toString(modal.getSocietyid()));

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
        private TextView userId,userName,Active;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            userName = itemView.findViewById(R.id.userNameDy);
            userId = itemView.findViewById(R.id.userIddy);
            Active = itemView.findViewById(R.id.activeDy);
        }
    }
}