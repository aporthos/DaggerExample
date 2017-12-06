package com.s2next.daggerexample.di.module;

import android.app.Application;
import android.content.Context;

import com.s2next.daggerexample.di.component.DetailActivityComponent;
import com.s2next.daggerexample.di.component.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Module(subcomponents = {
        MainActivityComponent.class,
        DetailActivityComponent.class
        })
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }
}
