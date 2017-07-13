package com.example.android.prague;

/**
 * Created by Karnoha on 12.07.2017.
 */

public class Item {
    private String mName = "name";
    private String mDesc = "desc";
    private String mPrice = "price";
    private String mContact = "contact";
    private int mImageID;

    public Item (String name, String desc, String price, String contact, int ImageID){
        mName = name;
        mDesc = desc;
        mPrice = price;
        mContact = contact;
        mImageID = ImageID;
    }


    // Getter methods
    public String getName(){
        return mName;
    }

    public String getDesc(){
        return mDesc;
    }

    public String getPrice(){
        return mPrice;
    }

    public String getContact(){
        return mContact;
    }

    public int getImageID(){
        return mImageID;
    }



}
