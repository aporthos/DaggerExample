package com.s2next.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.s2next.daggerexample.interfaces.ContractLogin;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements ContractLogin.View {
    private static final String TAG = "MainActivity";
    @Inject
    ContractLogin.Presenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.presValidateSession("AmadeusP","5527053248");
    }

    @Override
    public void vwSessionInitialized() {
        Log.i(TAG, "vwSessionInitialized: ");
    }

    @Override
    public void vwDataNotFound() {
        Log.i(TAG, "vwDataNotFound: ");
    }
}
