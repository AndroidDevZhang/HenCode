package com.seachal.hencode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * *
 * *
 * Project_Name:HenCode
 *
 * @author zhangxc
 * @date 2020-02-14 23:31
 * *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_code1).setOnClickListener(this);
        findViewById(R.id.tv_code2).setOnClickListener(this);
        findViewById(R.id.tv_code3).setOnClickListener(this);
        findViewById(R.id.tv_code4).setOnClickListener(this);
        findViewById(R.id.tv_code5).setOnClickListener(this);
        findViewById(R.id.tv_code6).setOnClickListener(this);
        findViewById(R.id.tv_code7).setOnClickListener(this);
        findViewById(R.id.tv_code8).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_code1:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw1.MainActivity.class));
                break;
            case R.id.tv_code2:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw2.MainActivity.class));
                break;
            case R.id.tv_code3:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw3.MainActivity.class));
                break;
            case R.id.tv_code4:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw4.MainActivity.class));
                break;
            case R.id.tv_code5:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw5.MainActivity.class));
                break;
            case R.id.tv_code6:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw6.MainActivity.class));
                break;
            case R.id.tv_code7:
                startActivity(new Intent(this, com.hencoder.hencoderpracticedraw7.MainActivity.class));
                break;
            case R.id.tv_code8:
                startActivity(new Intent(this, com.hencoder.hencoderpracticelayout1.MainActivity.class));
                break;
        }
    }

}
