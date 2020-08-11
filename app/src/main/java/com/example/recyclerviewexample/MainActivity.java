package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataModel[] myListData = new DataModel[] {
                new DataModel("Source Code","1995" ),
                new DataModel("Source Code1","1995" ),
                new DataModel("Source Code2","1995" ),
                new DataModel("Source Code3","1995" ),
                new DataModel("Source Code4","1995" ),
                new DataModel("Source Code5","1995" ),
                new DataModel("Source Code6","1995" ),
                new DataModel("Source Code7","1995" ),
                new DataModel("Source Code8","1995" ),
                new DataModel("Source Code9","1995" ),
                new DataModel("Source Code10","1995" ),
                new DataModel("Source Code11","1995" ),
                new DataModel("Source Code12","1995" ),
                new DataModel("Source Code13","1995" ),


        };

        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        MoviesAdapter adapter = new MoviesAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}