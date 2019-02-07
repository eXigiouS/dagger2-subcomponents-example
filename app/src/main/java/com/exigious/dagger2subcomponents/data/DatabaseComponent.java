package com.exigious.dagger2subcomponents.data;

import dagger.Subcomponent;

@Subcomponent(modules = DatabaseImplModule.class)
public interface DatabaseComponent {

    // @PrivateToDatabase <- Is this a qualifier? A scope? Neither?
    Database database();

    @Subcomponent.Builder
    interface Builder {
        Builder databaseImplModule(DatabaseImplModule databaseImplModule);
        DatabaseComponent build();
    }

}