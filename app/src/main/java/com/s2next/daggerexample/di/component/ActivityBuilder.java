package com.s2next.daggerexample.di.component;

import android.app.Activity;

import com.s2next.daggerexample.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);
}
