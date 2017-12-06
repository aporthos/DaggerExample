package com.s2next.daggerexample.presenter;

import com.s2next.daggerexample.interfaces.InterIntorLogin;
import com.s2next.daggerexample.interfaces.InterPresLogin;
import com.s2next.daggerexample.interfaces.InterViewLogin;

import javax.inject.Inject;

/**
 * Created by amadeusportes on 05/12/17.
 */

public class MainPresenterImpl implements InterPresLogin {
    private static final String TAG = "MainPresenterImpl";
    InterViewLogin mInterViewLogin;
    InterIntorLogin mnIntorLogin;

    @Inject
    public MainPresenterImpl(InterViewLogin mInterViewLogin, InterIntorLogin mnIntorLogin) {
        this.mInterViewLogin = mInterViewLogin;
        this.mnIntorLogin = mnIntorLogin;
    }

    @Override
    public void presValidateSession(String mUser, String mPassword) {
        mnIntorLogin.intValidateSession(mUser, mPassword);
    }

    @Override
    public void presTokenRegister(String user) {

    }

    /*@Override
    public void loadMain() {
        apiService.loadData();
        mainView.onMainLoaded();
    } */
}
