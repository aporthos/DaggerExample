package com.s2next.daggerexample.di.module;

import com.s2next.daggerexample.interfaces.ContractDetail;
import com.s2next.daggerexample.presenter.PresDetailFragment;
import com.s2next.daggerexample.ui.fragment.DetailFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amadeusportes on 06/12/17.
 */

@Module
public class DetailFragmentModule {
    @Provides
    ContractDetail.View provideDetailFragmentView(DetailFragment detailFragment){
        return detailFragment;
    }
    @Provides
    ContractDetail.Presenter provideDetailPresenter(){
        return new PresDetailFragment();
    }

}
