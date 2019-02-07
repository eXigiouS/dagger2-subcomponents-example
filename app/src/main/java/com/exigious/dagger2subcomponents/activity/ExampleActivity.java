package com.exigious.dagger2subcomponents.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.exigious.dagger2subcomponents.R;

import dagger.android.support.DaggerAppCompatActivity;

public class ExampleActivity extends DaggerAppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
    }
}
