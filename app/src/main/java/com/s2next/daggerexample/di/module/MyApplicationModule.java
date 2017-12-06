package com.s2next.daggerexample.di.module;

import com.s2next.daggerexample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
