package com.example.rv_card_view;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {


    TextView t1,t2,d1;
    CheckBox c1;
    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        d1=(TextView)itemView.findViewById(R.id.date1);
        t1=(TextView)itemView.findViewById(R.id.t1);
        t2=(TextView)itemView.findViewById(R.id.t2);
        c1=(CheckBox)itemView.findViewById(R.id.c1);
    }
}
