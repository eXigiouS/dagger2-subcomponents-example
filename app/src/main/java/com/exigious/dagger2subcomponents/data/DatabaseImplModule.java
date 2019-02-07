package com.exigious.dagger2subcomponents.data;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseImplModule {

    DatabaseImplModule(int concurrencyLevel) {}

    @Provides DatabaseConnectionPool provideDatabaseConnectionPool() {
        return new DatabaseConnectionPool();
    }
    @Provides DatabaseSchema provideDatabaseSchema() {
        return new DatabaseSchema();
    }

    /*
    @Provides
    Database provideDatabase(@Named("name") String name) {
        return new Database(name);
    }*/
}