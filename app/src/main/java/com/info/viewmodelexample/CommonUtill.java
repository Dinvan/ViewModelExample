package com.info.viewmodelexample;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import java.util.HashMap;

/**
 * Created by advanz101 on 4/6/18.
 */

public class CommonUtill {

    public static void setObserver(Context context, final TextView txtCount) {
        // Create the observer which updates the UI.
        final Observer<HashMap<Long, Boolean>> likeObserver = new Observer<HashMap<Long, Boolean>>() {
            @Override
            public void onChanged(@Nullable final HashMap<Long, Boolean> likeStatus) {
                Log.e("CommonUtill", "Status");
                txtCount.setText("Like Status : " + likeStatus.get(1l).booleanValue());
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        AppController.getInstance().getViewModel().getCurrentLikeStatus1(context).observe((AppCompatActivity) context, likeObserver);
    }
}
