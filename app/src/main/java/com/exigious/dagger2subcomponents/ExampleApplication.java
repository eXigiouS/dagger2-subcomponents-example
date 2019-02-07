package com.exigious.dagger2subcomponents;

import com.exigious.dagger2subcomponents.data.Database;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;

public class ExampleApplication extends DaggerApplication {

    @Inject
    Database database;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        Timber.i(database.name());

    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent
                .builder()
                .application(this)
                .build();
    }
}
