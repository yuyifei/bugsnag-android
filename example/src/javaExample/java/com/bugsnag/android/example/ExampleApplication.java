package com.bugsnag.android.example;

import android.app.Application;

import com.bugsnag.android.Bugsnag;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Bugsnag.init(this);

    }

}
