package com.s2next.daggerexample.di.component;

import android.app.Application;

import com.s2next.daggerexample.MainApplication;
import com.s2next.daggerexample.di.module.AppModule;
import com.s2next.daggerexample.di.module.NetModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by amadeusportes on 05/12/17.
 */


@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        NetModule.class,
        ActivityBuilder.class
        })
public interface MyApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        MyApplicationComponent build();
    }
    void inject(MainApplication app);
}
