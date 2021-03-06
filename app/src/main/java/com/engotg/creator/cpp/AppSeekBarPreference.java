package com.engotg.creator.cpp;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import com.engotg.creator.cpp.R;

import gs.preference.SeekBarPreference;

public class AppSeekBarPreference extends SeekBarPreference {
    public AppSeekBarPreference(Context context){
        super(context);
    }

    public AppSeekBarPreference(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public AppSeekBarPreference(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        TextView titleView = view.findViewById(android.R.id.title);
        TextView summaryView = view.findViewById(android.R.id.summary);
        Typeface typeface = Typeface.createFromAsset(getContext().getResources().getAssets(), "fibra_one_light.otf");
        titleView.setTypeface(typeface, Typeface.BOLD);
        titleView.setTextColor(getContext().getResources().getColor(R.color.quizText));
        summaryView.setTypeface(typeface);
        summaryView.setTextColor(getContext().getResources().getColor(R.color.greyText));
        if (android.os.Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP_MR1) {
            titleView.setTextSize(16);
            summaryView.setTextSize(12);
        } else {
            titleView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 60);
            summaryView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 56);
        }
    }
}
