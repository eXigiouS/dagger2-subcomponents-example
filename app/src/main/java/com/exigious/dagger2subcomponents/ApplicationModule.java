package com.exigious.dagger2subcomponents;

import com.exigious.dagger2subcomponents.di.qualifier.NumberOfCores;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @NumberOfCores
    Integer providesNumberOfCores() {
        return 2;
    }
}
