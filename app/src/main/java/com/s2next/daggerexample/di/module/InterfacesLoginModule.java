package com.s2next.daggerexample.di.module;

import com.s2next.daggerexample.ui.MainActivity;
import com.s2next.daggerexample.interactor.IntorLogin;
import com.s2next.daggerexample.interfaces.ContractLogin;
import com.s2next.daggerexample.presenter.PresLogin;

import dagger.Binds;
import dagger.Module;

/**
 * Created by portes on 05/12/17.
 */
@Module
public abstract class InterfacesLoginModule {
    @Binds
    abstract ContractLogin.Presenter provideLoginPresenter(PresLogin presLogin);
    @Binds
    abstract ContractLogin.Interactor provideLoginInteracor(IntorLogin intorLogin);
    @Binds
    abstract ContractLogin.View provideLoginView(MainActivity mainActivity);
}
