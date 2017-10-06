package com.example.wot.malloftravancore;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by WOT on 10/5/2017.
 */

public class HomeOffers_Adapter extends RecyclerView.Adapter<HomeOffers_Adapter.MyViewHolder>{

    Context context;


    ArrayList<Integer> alImage;
    ArrayList<String> alName;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView titletxt;
        Typeface typefaceGillB;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.homeoffersimview);
            titletxt = (TextView) itemView.findViewById(R.id.homeofferstitle);

            typefaceGillB = Typeface.createFromAsset(context.getAssets(), "fonts/GillSansMTPro-Bold.otf");
        }
    }

    public HomeOffers_Adapter(Context context,ArrayList<String> alName, ArrayList<Integer> alImage) {
        super();
        this.context = context;

        this.alImage = alImage;
        this.alName = alName;
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

        holder.titletxt.setTypeface(holder.typefaceGillB);
        holder.titletxt.setText(alName.get(position));
        Glide.with(context).load(alImage.get(position)).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return alImage.size();
    }

}
