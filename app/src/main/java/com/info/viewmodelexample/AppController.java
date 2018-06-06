package com.info.viewmodelexample;

import android.app.Application;

import java.util.HashMap;

/**
 * Created by advanz101 on 30/5/18.
 */

public class AppController extends Application {
    LikeViewModel viewModel;
    public static AppController mInstance = null;
    public HashMap<Long,Boolean> likeStatus=new HashMap<>();

    @Override
    public void onCreate() {
        mInstance = this;
        super.onCreate();
    }

    public static synchronized AppController getInstance() {
        if (mInstance == null) {
            mInstance = new AppController();
        }
        return mInstance;
    }


    public LikeViewModel getViewModel() {
        if (viewModel == null) {
            this.viewModel = new LikeViewModel();
        }
        return viewModel;
    }
}
