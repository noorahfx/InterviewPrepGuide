package com.example.noora.interviewprepguide.programmingLanguages.java.topics.string.string;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.font.FontClass;
import com.example.noora.interviewprepguide.model.TopicData;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class StringAdapter extends PagerAdapter {

    LayoutInflater inflater = null;
    List<TopicData> list;


    private TextView tv_question;
    private TextView tv_answer;


Context context;

    public StringAdapter(Context context, List<TopicData> list) {
        super();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LinearLayout view = (LinearLayout) inflater.inflate(R.layout.flascard_design, null);
         tv_question = (TextView) view.findViewById(R.id.tv_question);
         tv_answer = (TextView) view.findViewById(R.id.tv_answer);
        tv_question.setText(list.get(position).getQuestion());
        tv_answer.setText(list.get(position).getAnswer());

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager) container).removeView((View) object);
    }




}

