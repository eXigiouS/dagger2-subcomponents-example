package com.exigious.dagger2subcomponents;

import com.exigious.dagger2subcomponents.activity.ExampleActivity;
import com.exigious.dagger2subcomponents.di.scope.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = AndroidSupportInjectionModule.class)
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {

    })
    abstract ExampleActivity contributesExampleActivity();
}
