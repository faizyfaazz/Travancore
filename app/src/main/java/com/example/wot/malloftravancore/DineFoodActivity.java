package com.example.wot.malloftravancore;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DineFoodActivity extends Fragment {
    List<DineFoodModel> heroList;
    //the listview
    ListView listView;
    public DineFoodActivity()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_dine_food, container, false);
       // View view = inflater.inflate(R.layout.dineshoplistinglayout, container, false);
        heroList = new ArrayList<>();
        listView = (ListView)view.findViewById(R.id.listview);
        //adding some values to our list
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Baskin Robbins", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Baskin Robbins", "Injustice Gang"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Cafe Coffee Day", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "McDonnals", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Burger king", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Subway", "Justice League"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "McDonnals", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Burger king", "Avengers"));
        heroList.add(new DineFoodModel(R.drawable.robinsons, "Subway", "Justice League"));

        //creating the adapter
        DineFoodAdapter adapter = new DineFoodAdapter(getActivity(), R.layout.dineshoplistinglayout, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.robinsons);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);

//        ImageView circularImageView = (ImageView)view.findViewById(R.id.imageView);
//        circularImageView.setImageBitmap(circularBitmap);
        return view;
    }
}
