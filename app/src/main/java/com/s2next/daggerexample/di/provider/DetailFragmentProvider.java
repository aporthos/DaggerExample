package com.s2next.daggerexample.di.provider;

import android.support.v4.app.Fragment;

import com.s2next.daggerexample.di.component.DetailFragmentComponent;
import com.s2next.daggerexample.ui.fragment.DetailFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by amadeusportes on 06/12/17.
 */

@Module
public abstract class DetailFragmentProvider {
    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideDetailFragmentFactory(DetailFragmentComponent.Builder builder);
}
