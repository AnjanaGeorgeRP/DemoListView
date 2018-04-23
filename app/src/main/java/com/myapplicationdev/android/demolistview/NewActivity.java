package com.myapplicationdev.android.demolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tvInfo = (TextView) findViewById(R.id.tvInfo);
        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        tvInfo.setText("Food:"+info[0]+"\nStar:"+info[1]);
    }
}
