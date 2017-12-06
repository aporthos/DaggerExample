package com.s2next.daggerexample.di.component;

import com.s2next.daggerexample.di.module.DetailFragmentModule;
import com.s2next.daggerexample.ui.fragment.DetailFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by amadeusportes on 06/12/17.
 */

@Subcomponent(modules = DetailFragmentModule.class)
public interface DetailFragmentComponent  extends AndroidInjector<DetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment> {
    }
}
