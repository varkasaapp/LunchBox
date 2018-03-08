package com.example.admin.lunchbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Categories extends AppCompatActivity {
    GridView gridView;
    int[] images={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        gridView=(GridView)findViewById(R.id.grid);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),images);
        

    }
}
