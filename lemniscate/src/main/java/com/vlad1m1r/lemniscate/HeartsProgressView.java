package com.vlad1m1r.lemniscate;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by vladimirjovanovic on 1/18/17.
 */

public class HeartsProgressView extends BaseCurveProgressView {

    public HeartsProgressView(Context context) {
        super(context);
    }

    public HeartsProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HeartsProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public double getGraphY(int i) {
        double t = i*2*Math.PI/mPrecision;
        return -mLemniscateParamY/17 * (13 * Math.cos(t) - 5 * Math.cos(2*t) - 2 * Math.cos(3*t) - Math.cos(4*t));
    }

    @Override
    public double getGraphX(int i) {
        double t = i*2*Math.PI/mPrecision;
        return mLemniscateParamX/17 * 16 *  Math.pow(Math.sin(t), 3);
    }
}
