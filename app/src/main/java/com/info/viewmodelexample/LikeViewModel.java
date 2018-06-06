package com.info.viewmodelexample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

import java.util.HashMap;

/**
 * Created by advanz101 on 22/5/18.
 */

public class LikeViewModel extends ViewModel {
    MutableLiveData<HashMap<Long,Boolean>> likeStatus;

    public MutableLiveData<HashMap<Long,Boolean>> getCurrentLikeStatus1(Context context) {
        if (likeStatus == null) {
            likeStatus = new MutableLiveData<HashMap<Long,Boolean>>();
        }
        return likeStatus;
    }

}
