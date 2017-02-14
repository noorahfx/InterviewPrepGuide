package com.example.noora.interviewprepguide.programmingLanguages.java.topics.string.string;

import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.font.FontClass;
import com.example.noora.interviewprepguide.model.TopicData;

import java.util.List;

import static com.example.noora.interviewprepguide.R.id.tv_question;

public class StringActivity extends AppCompatActivity {
    StringAdapter adapter;
    ViewPager viewPager;
    ImageButton leftNav, rightNav;
    List<TopicData> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);

        this.list = StringJavaDataGenerator.createStringJavaData();
        viewPager = (ViewPager)findViewById(R.id.view_pager);



        adapter = new StringAdapter(this, list);

        viewPager.setAdapter(adapter);



        leftNav = (ImageButton)findViewById(R.id.left_nav);
        rightNav = (ImageButton) findViewById(R.id.right_nav);

// Images left navigation
        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.arrowScroll(View.FOCUS_LEFT);
            }
        });

        // Images right navigatin
        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.arrowScroll(View.FOCUS_RIGHT);
            }
        });
    }



}
