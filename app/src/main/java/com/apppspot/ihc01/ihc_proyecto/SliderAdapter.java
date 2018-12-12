package com.apppspot.ihc01.ihc_proyecto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;



    public SliderAdapter(Context context){
     this.context=context;
    }

    //ARRAYS

    public int [] slide_images={

            R.drawable.cp9,
            R.drawable.cp10,
            R.drawable.cp8,
            R.drawable.cp9,
            R.drawable.lp8,
            R.drawable.lp9,
            R.drawable.lp10,
            R.drawable.cp9
    };
    public String[] slide_headings={

            "PC-GAMER1",
            "PC-GAMER2",
            "PC-GAMER3",
            "PC-GAMER4",
            "LAP-GAMER2",
            "LAP-GAMER3",
            "LAP-GAMER4",
            "PC-GAMER5"
    };

    public String [] slide_descriptions={
       "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum  ",
       "dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que adwaw  " ,
            "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum",
            "dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró  " ,
            "dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que adwaw  " ,
            "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum",
            "dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró  " ,
       "en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s  "
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==(RelativeLayout)o;
    }

    public Object instantiateItem(ViewGroup container,int position){

        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView=(ImageView)view.findViewById(R.id.slide_image);
        TextView slideHeading= (TextView)view.findViewById(R.id.slide_heading);
        TextView slideDescription=(TextView)view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descriptions[position]);

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container,int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
