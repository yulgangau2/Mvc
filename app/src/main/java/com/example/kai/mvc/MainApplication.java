package com.example.kai.mvc;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Kai on 28/8/2559.
 */
public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());


    }//create

    @Override
    public void onTerminate() {
        super.onTerminate();
    }//End Terminate
}
