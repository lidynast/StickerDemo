package com.wanyueliang.stickerdemo.wediget.sticker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import java.io.InputStream;


public class PresetTextViewDrawable extends BitmapDrawable {

    private String txt;

    public PresetTextViewDrawable(Resources res, String filepath) {
        super(res, filepath);
    }

    public PresetTextViewDrawable(Resources res, InputStream is) {
        super(res, is);
    }

    //TextViewDrawable(getResources(), bitmap)
    public PresetTextViewDrawable(Resources res, Bitmap bitmap) {
        super(res, bitmap);
    }

    //TextViewDrawable(getResources(), bitmap)
    public PresetTextViewDrawable(Resources res, Bitmap bitmap, String txt) {
        super(res, bitmap);
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
