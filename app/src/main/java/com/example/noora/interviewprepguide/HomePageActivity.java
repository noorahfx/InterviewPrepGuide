package com.example.noora.interviewprepguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.noora.interviewprepguide.adapter.MyAdapter;
import com.example.noora.interviewprepguide.model.LanguageData;
import com.example.noora.interviewprepguide.dataGenerator.ProgrammingLanguageGenerator;

import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    private List<LanguageData> list;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //Linkinng adapter with RecyclerView

        this.list = ProgrammingLanguageGenerator.createProgrammingLanguageData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new MyAdapter(this, list);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
    }
}
