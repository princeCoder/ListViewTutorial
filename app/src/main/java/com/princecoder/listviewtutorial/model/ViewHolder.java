package com.princecoder.listviewtutorial.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.princecoder.listviewtutorial.R;

/**
 * Created by prinzlyngotoum on 11/19/14.
 */
public class ViewHolder{

     TextView mName;
     TextView mTitle;
     TextView mCompany;
     TextView mDescription;
     ImageView mPicture;



    public ViewHolder(View v){

        mName=(TextView)v.findViewById(R.id.name);
        mTitle=(TextView)v.findViewById(R.id.title);
        mCompany=(TextView)v.findViewById(R.id.company);
        mDescription=(TextView)v.findViewById(R.id.description);
        mPicture=(ImageView)v.findViewById(R.id.picture);

    }

    public void setPicture(int resId) {
        this.mPicture.setImageResource(resId);
    }

    public void setName(String name) {
        this.mName.setText(name);
    }

    public void setDescription(String description) {
        this.mDescription.setText(description);
    }

    public void setCompany(String company) {
        this.mCompany.setText(company);
    }

    public void setTitle(String title) {
        this.mTitle.setText(title);
    }


}