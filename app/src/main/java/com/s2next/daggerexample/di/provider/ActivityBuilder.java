package com.s2next.daggerexample.di.provider;

import android.app.Activity;

import com.s2next.daggerexample.di.component.DetailActivityComponent;
import com.s2next.daggerexample.di.component.MainActivityComponent;
import com.s2next.daggerexample.ui.DetailActivity;
import com.s2next.daggerexample.ui.MainActivity;

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

    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);
}
