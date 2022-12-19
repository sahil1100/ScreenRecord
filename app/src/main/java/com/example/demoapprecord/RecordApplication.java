package com.example.demoapprecord;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

public class RecordApplication extends Application {

    private static RecordApplication recordApplication;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        recordApplication = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, RecordService.class));
    }

    public static RecordApplication getInstance(){

        return recordApplication;
    }
}
