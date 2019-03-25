package com.engotg.creator.cpp;

import android.app.Application;

import com.bumptech.glide.request.target.ViewTarget;
import com.engotg.creator.cpp.R;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ViewTarget.setTagId(R.id.glide_tag);
    }
}
