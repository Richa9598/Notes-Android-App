package com.example.rv_card_view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {
    //constructors here
    ArrayList<Model> data;
    Context context;
    public myAdapter(ArrayList<Model> data, Context context) {

        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        //for handling click vents
        final Model temp=data.get(position);
        //getting the views here

        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());
        holder.d1.setText(data.get(position).getDate());
        if(holder.c1.isChecked())
        {
            Toast.makeText(context, "You have selected " +temp.getHeader(), Toast.LENGTH_SHORT).show();
        }



        //Handling Onclick events (Mainly on Header)

        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,OnClick.class);

                intent.putExtra("header",temp.getHeader());
                intent.putExtra("description",temp.getDesc());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
