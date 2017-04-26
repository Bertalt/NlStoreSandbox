package edu.bertalt.nlsandbox;

import android.app.Application;

import io.realm.Realm;


public class NlApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
