package com.s2next.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.s2next.daggerexample.interfaces.InterPresLogin;
import com.s2next.daggerexample.interfaces.InterViewLogin;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements InterViewLogin {
    private static final String TAG = "MainActivity";

    @Inject
    InterPresLogin mainPresenter;

    //@Inject
    //Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.presValidateSession("AmadeusP","5527053248");
        //Log.i(TAG, "onCreate: mRetrofit --> "+mRetrofit);
        //mainPresenter.loadMain();
    }

    @Override
    public void vwSessionInitialized() {

    }
}
