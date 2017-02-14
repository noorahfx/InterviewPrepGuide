package com.example.noora.interviewprepguide.programmingLanguages.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.model.LanguageData;
import com.example.noora.interviewprepguide.programmingLanguages.java.adapter.JavaAdapter;

import java.util.List;

public class JavaHomeScreenActivity extends AppCompatActivity {

    private List<LanguageData> list;
    private JavaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_home_screen);


        //Linkinng adapter with RecyclerView

        this.list = JavaTopicsGenerator.createJavaTopicsGenerator();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_java_home);
        adapter = new JavaAdapter(this, list);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
    }
}
