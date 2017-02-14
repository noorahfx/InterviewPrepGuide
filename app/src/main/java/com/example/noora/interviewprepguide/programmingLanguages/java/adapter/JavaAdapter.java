package com.example.noora.interviewprepguide.programmingLanguages.java.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.noora.interviewprepguide.HomePageActivity;
import com.example.noora.interviewprepguide.R;
import com.example.noora.interviewprepguide.model.LanguageData;
import com.example.noora.interviewprepguide.programmingLanguages.java.JavaHomeScreenActivity;
import com.example.noora.interviewprepguide.programmingLanguages.java.topics.string.string.StringActivity;

import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.MyViewHolder> {

    private List<LanguageData> objectList;
    private LayoutInflater inflater;

    public JavaAdapter(Context context, List<LanguageData> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.java_list_topics, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        LanguageData current = objectList.get(position);
        holder.setData(current, position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView imgThumb;
        private int position;
        private LanguageData currentObject;
        private final Context context;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.java_topics_tv);
            imgThumb = (ImageView) itemView.findViewById(R.id.java_topics_img_logo);
            context = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()) {
                        case 0:
                            intent = new Intent(context, HomePageActivity.class);
                            break;
                        case 1:
                            intent = new Intent(context, StringActivity.class);
                            break;
                        default:
                            intent = new Intent(context, HomePageActivity.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
        }

        public void setData(LanguageData currentObject, int position) {
            this.title.setText(currentObject.getTitle());
            this.imgThumb.setImageResource(currentObject.getImageID());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}