package com.exigious.dagger2subcomponents.data;

import javax.inject.Inject;
import javax.inject.Named;

public class Database {

    @Inject
    public Database() { }

    public String name() {
        return "I have a name";
    }
}
