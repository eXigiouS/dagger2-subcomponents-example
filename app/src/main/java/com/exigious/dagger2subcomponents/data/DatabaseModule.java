package com.exigious.dagger2subcomponents.data;

import com.exigious.dagger2subcomponents.di.qualifier.NumberOfCores;
import com.exigious.dagger2subcomponents.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = DatabaseComponent.class)
public class DatabaseModule {

    @Provides
    @ApplicationScope
    Database provideDatabase(
            @NumberOfCores int numberOfCores,
            DatabaseComponent.Builder databaseComponentBuilder) {
        return databaseComponentBuilder
                .databaseImplModule(new DatabaseImplModule(numberOfCores / 2))
                .build()
                .database();
    }
}