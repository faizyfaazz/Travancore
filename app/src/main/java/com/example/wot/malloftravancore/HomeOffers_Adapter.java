package com.example.wot.malloftravancore;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by WOT on 10/5/2017.
 */

public class HomeOffers_Adapter extends RecyclerView.Adapter<HomeOffers_Adapter.MyViewHolder>{

    Context context;


    ArrayList<Integer> alImage;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.homeoffersimview);
        }
    }

    public HomeOffers_Adapter(Context context, ArrayList<Integer> alImage) {
        super();
        this.context = context;

        this.alImage = alImage;
    }

    @Override
    public HomeOffers_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.homeofferslistlayout, parent, false);
        HomeOffers_Adapter.MyViewHolder viewHolder = new HomeOffers_Adapter.MyViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(HomeOffers_Adapter.MyViewHolder holder, int position) {


        holder.imageView.setImageResource(alImage.get(position));

    }

    @Override
    public int getItemCount() {
        return alImage.size();
    }

}
