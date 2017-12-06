package com.s2next.daggerexample.presenter;

import android.util.Log;

import com.s2next.daggerexample.interfaces.ContractDetail;

import javax.inject.Inject;

/**
 * Created by amadeusportes on 06/12/17.
 */

public class PresDetailFragment implements ContractDetail.Presenter {
    private static final String TAG = "PresDetailFragment";
    @Inject
    public PresDetailFragment() {
    }
    @Override
    public void presDetailFragment() {
        Log.i(TAG, "presDetailFragment: ");
    }
}
