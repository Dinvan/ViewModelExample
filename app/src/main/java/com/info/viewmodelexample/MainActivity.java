package com.info.viewmodelexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView addCount, txtCount,txtNextScreen;
    int count;
    LikeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.viewModel = AppController.getInstance().getViewModel();
        addCount = (TextView) findViewById(R.id.addCount);
        txtCount = (TextView) findViewById(R.id.txtCount);
        txtNextScreen=(TextView)findViewById(R.id.txtNextScreen);

        addCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppController.getInstance().likeStatus.put(1l,true);
                viewModel.getCurrentLikeStatus1(MainActivity.this).setValue(AppController.getInstance().likeStatus);
            }
        });

        txtNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NextActivity.class);
                startActivity(intent);
            }
        });

        CommonUtill.setObserver(MainActivity.this,txtCount);
    }
}
