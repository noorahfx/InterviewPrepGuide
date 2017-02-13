package com.example.noora.interviewprepguide.adapter;

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

import java.util.List;

/**
 * Created by noora on 2/13/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<LanguageData> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<LanguageData> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
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
            title = (TextView) itemView.findViewById(R.id.tv_language);
            imgThumb = (ImageView) itemView.findViewById(R.id.img_logo);
            context = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    final Intent intent;
                    switch (getAdapterPosition()) {
                        case 0:
                            intent = new Intent(context, JavaHomeScreenActivity.class);
                            break;
                        case 1:
                            intent = new Intent(context, HomePageActivity.class);
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

