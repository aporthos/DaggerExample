package com.s2next.daggerexample;

import android.app.Activity;
import android.app.Application;


import com.s2next.daggerexample.di.component.DaggerMyApplicationComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by amadeusportes on 05/12/17.
 */

public class MainApplication extends Application implements HasActivityInjector {
    private static final String TAG = "MainApplication";
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMyApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
