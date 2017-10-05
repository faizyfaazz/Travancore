package com.example.wot.malloftravancore;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by WOT on 10/4/2017.
 */

public class DealsoftheDay_Adapter extends RecyclerView.Adapter<DealsoftheDay_Adapter.MyViewHolder>  {


    Context context;

    ArrayList<String> alName;
    ArrayList<Integer> alImage;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titletxt,desctxt;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            titletxt = (TextView) itemView.findViewById(R.id.home_card_title);
            desctxt = (TextView) itemView.findViewById(R.id.home_card_desc);
            imageView = (ImageView) itemView.findViewById(R.id.home_card_imageview);

        }
    }

    public DealsoftheDay_Adapter(Context context, ArrayList<String> alName, ArrayList<Integer> alImage) {
        super();
        this.context = context;
        this.alName = alName;
        this.alImage = alImage;
    }

    @Override
    public DealsoftheDay_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dealofthedaylayout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(DealsoftheDay_Adapter.MyViewHolder holder, int position) {
        Typeface typefaceQuestrial = Typeface.createFromAsset(context.getAssets(), "fonts/questrial_regular.ttf");
    //    holder.titletxt.setTypeface(typefaceQuestrial);
        holder.titletxt.setText(alName.get(position));
        holder.imageView.setImageResource(alImage.get(position));

    }

    @Override
    public int getItemCount() {
        return alImage.size();
    }


}
