package com.apppspot.ihc01.ihc_proyecto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class FragmentPrincipal extends Fragment  {


    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------SLIDER-----------------------------------------------
    //--------------------------------------------------------------------------------------------------
    private ViewPager mSlideViewPager;
    private LinearLayout nDotLayout;
    private TextView[] mDots;
    private SliderAdapter sliderAdapter;


    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vista=inflater.inflate(R.layout.fragment_fragment_principal, container, false);


        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------SLIDER-----------------------------------------------
        //--------------------------------------------------------------------------------------------------
        mSlideViewPager=(ViewPager)vista.findViewById(R.id.slideViewPager);
        nDotLayout=(LinearLayout)vista.findViewById(R.id.dotsLayout);
        sliderAdapter=new SliderAdapter(getContext());
        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicarto(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------

        return vista;
    }
    //--------------------------------------------------------------------------------------------------
    //------------------------------------SLIDER----------------------------------------------
    //--------------------------------------------------------------------------------------------------

    public void addDotsIndicarto(int position){
        mDots= new TextView[8];
        nDotLayout.removeAllViews();

        for(int i=0;i<mDots.length;i++){
            mDots[i]= new TextView(getContext());
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));
            nDotLayout.addView(mDots[i]);

        }

        if(mDots.length>0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewListener= new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicarto(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------

}
