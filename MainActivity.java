package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        List<ModelClass> modelClassList=new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user one","This is user one"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user second","This is user second"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user third","This is user third"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background,"user fourth","This is user fourth"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}
