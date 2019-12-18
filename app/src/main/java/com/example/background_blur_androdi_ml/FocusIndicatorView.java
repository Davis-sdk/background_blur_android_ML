package com.example.background_blur_androdi_ml;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

public class FocusIndicatorView extends View {

    private Point mLocationPoint;

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);}

    private void setDrawable(int resId) { this.setBackgroundResource(resId); }

    public void showStart() { setDrawable(R.drawable.focus_indicator); }

    public void clear(){setBackgroundDrawable(null);}



}
