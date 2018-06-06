package com.info.viewmodelexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView addCount, txtCount,txtNextScreen;
    LikeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        this.viewModel = AppController.getInstance().getViewModel();
        init();

        addCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppController.getInstance().likeStatus.put(1l,false);
                viewModel.getCurrentLikeStatus1(NextActivity.this).setValue(AppController.getInstance().likeStatus);
            }
        });

        CommonUtill.setObserver(NextActivity.this,txtCount);
    }

    private void init() {
        addCount = (TextView) findViewById(R.id.addCount);
        txtCount = (TextView) findViewById(R.id.txtCount);
        txtNextScreen=(TextView)findViewById(R.id.txtNextScreen);
    }
}
