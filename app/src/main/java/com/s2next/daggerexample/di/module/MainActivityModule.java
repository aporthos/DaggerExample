package com.s2next.daggerexample.di.module;

import android.util.Log;

import com.s2next.daggerexample.MainActivity;
import com.s2next.daggerexample.interactor.IntorLogin;
import com.s2next.daggerexample.interfaces.InterIntorLogin;
import com.s2next.daggerexample.interfaces.InterPresLogin;
import com.s2next.daggerexample.interfaces.InterViewLogin;
import com.s2next.daggerexample.interfaces.InterfaceLogin;
import com.s2next.daggerexample.presenter.MainPresenterImpl;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by amadeusportes on 05/12/17.
 */
@Module(includes = NetModule.class)
public class MainActivityModule {
    private static final String TAG = "MainActivityModule";
    @Provides
    InterViewLogin provideInterViewLogin(MainActivity mainActivity){
        return mainActivity;
    }
    @Provides
    InterIntorLogin provideInterIntorLogin(InterfaceLogin mInterfaceLogin) {
        return new IntorLogin(mInterfaceLogin);
    }
    @Provides
    InterPresLogin provideMainPresenter(InterViewLogin mInterViewLogin, InterIntorLogin mInterIntorLogin) {
        return new MainPresenterImpl(mInterViewLogin, mInterIntorLogin);
    }
    @Provides
    InterfaceLogin provideResponseLogin(@Named("Retrofit") Retrofit retrofit) {
        Log.i(TAG, "provideResponseLogin: "+retrofit);
        return retrofit.create(InterfaceLogin.class);
    }

}
