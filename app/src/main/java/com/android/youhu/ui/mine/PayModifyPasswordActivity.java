package com.android.youhu.ui.mine;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.youhu.R;
import com.android.youhu.common.util.ToastUtils;
import com.android.youhu.ui.base.BaseActivity;

public class PayModifyPasswordActivity extends BaseActivity {
    private static final String TAG = PayModifyPasswordActivity.class.getSimpleName();

    private TextView messageTextView;
    private EditText oldPasswordEditText;
    private EditText newPasswordEditText;
    private EditText confirmNewPasswordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_modify_password);
        findViews();
        getData(false);
    }

    private void getData(boolean isShowDialog) {

    }

    private void findViews() {
        backImageView = (TextView) findViewById(R.id.back);
        titleTextView = (TextView) findViewById(R.id.title);
        messageTextView = (TextView) findViewById(R.id.message);
        oldPasswordEditText = (EditText) findViewById(R.id.oldPassword);
        newPasswordEditText = (EditText) findViewById(R.id.newPassword);
        confirmNewPasswordEditText = (EditText) findViewById(R.id.confirmNewPassword);
        titleTextView.setText("修改支付密码");
    }


    public void confirm(View view) {
        ToastUtils.show(mContext, "修改成功");
        finish();
    }


}

