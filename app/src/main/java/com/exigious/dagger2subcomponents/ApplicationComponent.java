package com.exigious.dagger2subcomponents;


import android.app.Application;

import com.exigious.dagger2subcomponents.data.Database;
import com.exigious.dagger2subcomponents.data.DatabaseModule;
import com.exigious.dagger2subcomponents.di.scope.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@ApplicationScope
@Component(modules = {
        ApplicationModule.class,
        AndroidSupportInjectionModule.class,
        ActivityBindingModule.class,
        DatabaseModule.class,

})
public interface ApplicationComponent extends AndroidInjector<ExampleApplication> {

    Database database();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }

    @Override
    void inject(ExampleApplication instance);
}
