package com.garcestechnology.pauljosephdarsantos.midtermprojecta2;

/**
 * Created by pauljosephdarsantos on 2/8/17.
 */

import android.view.LayoutInflater;
import java.util.ArrayList;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import com.bumptech.glide.Glide;
import android.support.v7.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Articles> articles;

    public Adapter(Context mContext, ArrayList<Articles> articles) {
        this.mContext = mContext;
        this.articles = articles;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Glide.with(mContext).load(articles.get(position).getUrlToImage()).into(holder.news_image);
        holder.news_title.setText(articles.get(position).getTitle());
        holder.news_desc.setText(articles.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView news_image;
        private TextView news_title;
        private TextView news_desc;
        private LinearLayout news_link;
        public ViewHolder(final View itemView){
            super(itemView);
            news_image = (ImageView) itemView.findViewById(R.id.news_image);
            news_title = (TextView) itemView.findViewById(R.id.news_title);
            news_desc = (TextView) itemView.findViewById(R.id.news_desc);
            news_link = (LinearLayout) itemView.findViewById(R.id.news_link);

            news_link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri newsUri = Uri.parse(articles.get(getAdapterPosition()).getUrl());
                    Intent websiteIntent = new Intent(Intent.ACTION_VIEW,newsUri);
                    mContext.startActivity(websiteIntent);
                }
            });
        }
    }
}