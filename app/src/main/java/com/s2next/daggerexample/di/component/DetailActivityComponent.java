package com.s2next.daggerexample.di.component;

import com.s2next.daggerexample.di.module.DetailActivityModule;
import com.s2next.daggerexample.di.provider.DetailFragmentProvider;
import com.s2next.daggerexample.ui.DetailActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by amadeusportes on 06/12/17.
 */

@Subcomponent(modules = {
        DetailActivityModule.class,
        DetailFragmentProvider.class
})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
    }
}