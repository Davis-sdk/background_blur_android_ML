package com.example.background_blur_androdi_ml;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class ImageUtils {

    public static Bitmap tfResizeBilinear(Bitmap bitmap, int w, int h)
    {
        if(bitmap == null) {
            return null;
        }


        Bitmap resized = Bitmap.createBitmap(w,h
                    ,Bitmap.Config.ARGB_8888);


        final Canvas canvas = new Canvas(resized);
        canvas.drawBitmap(bitmap, new Rect(0,0, bitmap.getWidth(), bitmap.getHeight()),
                new Rect(0,0,w,h), null);



}
