package com.example.wot.malloftravancore;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    TextView autoscroll_textview;
    ScrollView autoscrollView;
    RecyclerView recyclerViewDeals,recyclerViewOffers;
    RecyclerView.LayoutManager mLayoutManager,mlayoutManager2;
    DealsoftheDay_Adapter dealsoftheDay_adapter;
    HomeOffers_Adapter homeOffers_adapter;

    Context context;

    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        autoscroll_textview =(TextView)view.findViewById(R.id.home_autoscroll_text);
        autoscrollView = (ScrollView)view.findViewById(R.id.autoscroll_home);
        recyclerViewDeals = (RecyclerView)view.findViewById(R.id.home_hotdeal_recycler_view);
        recyclerViewOffers = (RecyclerView)view.findViewById(R.id.home_offers_recycler_view);

          Typeface typefaceQuestrial = Typeface.createFromAsset(getActivity().getAssets(), "fonts/questrial_regular.ttf");
        autoscroll_textview.setTypeface(typefaceQuestrial);

        autoscroll_textview.setMovementMethod(new ScrollingMovementMethod());
        autoscrollView.post(new Runnable() {
            @Override
            public void run() {
                autoscrollView.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });

         mLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewDeals.setLayoutManager(mLayoutManager);

        ArrayList<String> alName = new ArrayList<>(Arrays.asList("Cheesy...", "Crispy... ", "Fizzy...", "Cool...", "Softy...", "Fruity...", "Fresh...", "Sticky..."));
        ArrayList<Integer> alImage = new ArrayList<>(Arrays.asList(R.drawable.bikess, R.drawable.robinsons, R.drawable.bikess, R.drawable.robinsons, R.drawable.bikess, R.drawable.robinsons, R.drawable.bikess, R.drawable.robinsons));

        dealsoftheDay_adapter = new DealsoftheDay_Adapter(getContext(),alName,alImage);
        recyclerViewDeals.setAdapter(dealsoftheDay_adapter);


        mlayoutManager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewOffers.setLayoutManager(mlayoutManager2);

        homeOffers_adapter = new HomeOffers_Adapter(getContext(),alImage);
        recyclerViewOffers.setAdapter(homeOffers_adapter);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




    }
}
