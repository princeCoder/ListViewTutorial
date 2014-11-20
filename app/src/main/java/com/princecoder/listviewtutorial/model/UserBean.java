package com.princecoder.listviewtutorial.model;

import java.io.Serializable;

/**
 * Created by prinzlyngotoum on 11/19/14.
 */
public class UserBean implements Serializable{

    String mName;
    String mTitle;
    String mDescription;
    String mCompany;
    String mPicture;

    public UserBean(String name, String title,String description, String company, String pictureUrl){
        this.mName=name;
        this.mTitle=title;
        this.mDescription=description;
        this.mCompany=company;
        this.mPicture=pictureUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String mCompany) {
        this.mCompany = mCompany;
    }

    public String getPicture() {
        return mPicture;
    }

    public void setPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTite) {
        this.mTitle = mTite;
    }

}
