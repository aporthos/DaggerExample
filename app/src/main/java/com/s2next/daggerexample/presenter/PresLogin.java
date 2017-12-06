package com.s2next.daggerexample.presenter;

import com.s2next.daggerexample.interfaces.ContractLogin;
import com.s2next.daggerexample.interfaces.OnLoginListener;

import javax.inject.Inject;

/**
 * Created by amadeusportes on 05/12/17.
 */

public class PresLogin implements ContractLogin.Presenter, OnLoginListener {
    private static final String TAG = "PresLogin";
    ContractLogin.View mInterViewLogin;
    ContractLogin.Interactor mnIntorLogin;

    @Inject
    public PresLogin(ContractLogin.View mInterViewLogin, ContractLogin.Interactor mnIntorLogin) {
        this.mInterViewLogin = mInterViewLogin;
        this.mnIntorLogin = mnIntorLogin;
    }

    @Override
    public void presValidateSession(String mUser, String mPassword) {
        mnIntorLogin.intValidateSession(mUser, mPassword, this);
    }

    @Override
    public void onSessionInitialized() {
        mInterViewLogin.vwSessionInitialized();
    }

    @Override
    public void onDataNotFound() {
        mInterViewLogin.vwDataNotFound();
    }
}
