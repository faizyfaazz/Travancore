package com.example.wot.malloftravancore;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class DineFoodActivity extends Fragment {

    public DineFoodActivity()
    {
//ajdbdaknabdaknda
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // View view = inflater.inflate(R.layout.activity_dine_food, container, false);
        View view = inflater.inflate(R.layout.dineshoplistinglayout, container, false);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.robinsons);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);

//        ImageView circularImageView = (ImageView)view.findViewById(R.id.imageView);
//        circularImageView.setImageBitmap(circularBitmap);
        return view;
    }
}
