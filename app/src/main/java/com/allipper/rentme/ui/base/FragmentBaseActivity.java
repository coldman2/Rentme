package com.allipper.rentme.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;

/**
 * Created by allipper on 2015/9/1.
 */
public class FragmentBaseActivity extends FragmentActivity {

    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.mContext = this;
        PushAgent.getInstance(mContext).onAppStart();
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);       //统计时长
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    public void back(View view){
        finish();
    }
}
