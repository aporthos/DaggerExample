package com.s2next.daggerexample.di.module;

import com.s2next.daggerexample.MainActivity;
import com.s2next.daggerexample.interactor.IntorLogin;
import com.s2next.daggerexample.interfaces.ContractLogin;
import com.s2next.daggerexample.io.InterfaceLogin;
import com.s2next.daggerexample.presenter.PresLogin;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Module(includes = NetModule.class)
public class MainActivityModule {
    private static final String TAG = "MainActivityModule";

    @Singleton
    @Provides
    InterfaceLogin provideResponseLogin(@Named("Retrofit") Retrofit retrofit) {
        return retrofit.create(InterfaceLogin.class);
    }
    @Singleton
    @Provides
    CompositeDisposable provideComposite() {
        return new CompositeDisposable();
    }
}
