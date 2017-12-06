package com.s2next.daggerexample.di.component;

import com.s2next.daggerexample.ui.MainActivity;
import com.s2next.daggerexample.di.module.InterfacesLoginModule;
import com.s2next.daggerexample.di.module.MainActivityModule;
import com.s2next.daggerexample.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Singleton
@Subcomponent(modules = {
        MainActivityModule.class,
        NetModule.class,
        InterfacesLoginModule.class
    })
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
