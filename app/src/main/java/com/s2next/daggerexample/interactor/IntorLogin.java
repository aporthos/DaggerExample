package com.s2next.daggerexample.interactor;

import android.util.Log;

import com.s2next.daggerexample.interfaces.InterIntorLogin;
import com.s2next.daggerexample.interfaces.InterfaceLogin;
import com.s2next.daggerexample.utils.Login;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by amadeusportes on 05/12/17.
 */

public class IntorLogin implements InterIntorLogin {
    private static final String TAG = "IntorLogin";
    InterfaceLogin mInterfaceLogin;
    @Inject
    public IntorLogin(InterfaceLogin mInterfaceLogin){
        this.mInterfaceLogin = mInterfaceLogin;
    }
    @Override
    public void intValidateSession(String mUser, String mPassword) {
        HashMap<String, Object> mBodyPost = new HashMap<>();
        mBodyPost.put("username", mUser);
        mBodyPost.put("phone", mPassword);
        Disposable mDisposable = mInterfaceLogin.getLogin(mBodyPost)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Login>() {
                    @Override
                    public void accept(Login login) throws Exception {
                        Log.i(TAG, "accept: "+login.getToken());
                        Log.i(TAG, "accept: "+login.getRole());
                    }

                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e(TAG, "accept: ", throwable);
                    }
                });
        Log.i(TAG, "intValidateSession: Hola pinche putita "+mInterfaceLogin);

        //mInterfaceLogin.getLogin();
    }
}
