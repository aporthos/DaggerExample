package com.s2next.daggerexample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.s2next.daggerexample.R;
import com.s2next.daggerexample.interfaces.ContractLogin;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements ContractLogin.View {
    private static final String TAG = "MainActivity";
    private Button btnDetalle;

    @Inject
    ContractLogin.Presenter mainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetalle = findViewById(R.id.btnDetalle);

        btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });
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
