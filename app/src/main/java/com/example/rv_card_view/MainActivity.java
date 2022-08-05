package com.example.rv_card_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    RecyclerView rcv;

    myAdapter adapter;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Richa's Notes");
        c1=findViewById(R.id.c1);
        rcv=(RecyclerView)findViewById(R.id.recyclev);

        //For vertical layout
        //rcv.setLayoutManager(new LinearLayoutManager(this));

        try {
            adapter=new myAdapter(data1(),getApplicationContext());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        rcv.setAdapter(adapter);

        //For Horizontal layout
        //LinearLayoutManager lm=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(lm);

        //Grid Layout diaplay
        GridLayoutManager gl=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gl);

    }

    public ArrayList<Model> data1() throws ParseException {
        ArrayList<Model> h1= new ArrayList<>();
        Model o1=new Model();
        o1.setHeader("Note 1");
        o1.setDesc("Hello there ");
        SimpleDateFormat format = new SimpleDateFormat("MM dd, yyyy ");
        String dateString = format.format( new Date() );
        o1.setCheck(Boolean.FALSE);
        o1.setDate("01-05-2022");
        h1.add(o1);

        Model o2=new Model();
        o2.setHeader("Richa");
        o2.setDesc("Hello there ");
        o2.setCheck(Boolean.FALSE);
        o2.setDate("02-05-2022");
        h1.add(o2);


        Model o3=new Model();
        o3.setHeader("Note 3");
        o3.setDesc("How are u ");
        o3.setDate("01-10-2022");
        o3.setCheck(Boolean.FALSE);
        h1.add(o3);

        Model o4=new Model();
        o4.setHeader("Note 4");
        o4.setDesc("How are u ");
        o4.setCheck(Boolean.FALSE);
        o4.setDate("01-10-2021");
        h1.add(o4);


        Model o5=new Model();
        o5.setHeader("Note 5");
        o5.setDesc("How are u ");
        o5.setCheck(Boolean.FALSE);
        o5.setDate("01-10-2022");
        h1.add(o5);

        Model o6=new Model();
        o6.setHeader("Note 6");
        o6.setDesc("How are u ");
        o6.setCheck(Boolean.FALSE);
        o6.setDate("01-10-2021");
        h1.add(o6);

        return  h1;
    }
}