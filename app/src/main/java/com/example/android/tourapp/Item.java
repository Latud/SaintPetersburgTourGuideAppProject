package com.example.android.tourapp;

/**
 * Created by latud on 19.04.2018.
 */

public class Item {
    private String mString1;

    private String mString2;

    private String mString3 = NO_STRING_PROVIDED;

    private static final String NO_STRING_PROVIDED = null; // alt + enter -> extract strings

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Item(String string1, String string2, int imageResourceId, int audioResourceId) {
        mString1 = string1;
        mString2 = string2;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Item (String string1, String string2, String string3, int audioResourceId) {
        mString1 = string1;
        mString2 = string2;
        mString3 = string3;
        mAudioResourceId = audioResourceId;
    }

    public Item(String string1, String string2, int imageResourceId) {
        mString1 = string1;
        mString2 = string2;
        mImageResourceId = imageResourceId;
    }

    public String getString1() {
        return mString1;
    }

    public String getString2() {
        return mString2;
    }

    public String getString3() {
        return mString3;
    }

    public boolean hasString (){return mString3 != NO_STRING_PROVIDED; }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage (){return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getAudioResourceId()  {
        return mAudioResourceId;
    }
}