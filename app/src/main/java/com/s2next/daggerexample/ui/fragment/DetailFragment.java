package com.s2next.daggerexample.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.s2next.daggerexample.R;
import com.s2next.daggerexample.interfaces.ContractDetail;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class DetailFragment extends Fragment implements ContractDetail.View{
    private static final String TAG = "DetailFragment";
    @Inject
    ContractDetail.Presenter mPresenter;
    public DetailFragment() {
        // Required empty public constructor
    }
    public static DetailFragment newInstance() {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mPresenter.presDetailFragment();
        Log.i(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void vwDetailFragment() {

    }
}
