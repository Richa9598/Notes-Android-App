package com.example.rv_card_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OnClick extends AppCompatActivity {

    ImageView i2;
    TextView t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click);
        setTitle("Richa's Notes");
        t3=(TextView)findViewById(R.id.text1);
        t4=(TextView)findViewById(R.id.text2);

        //setting the resources

        t3.setText(getIntent().getStringExtra("header"));
        t4.setText(getIntent().getStringExtra("description"));

    }
}