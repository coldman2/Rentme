package com.allipper.rentme.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.allipper.rentme.R;
import com.allipper.rentme.common.util.SharedPre;
import com.allipper.rentme.common.util.SharedPreUtils;
import com.allipper.rentme.ui.GuideActivity;
import com.allipper.rentme.ui.mine.AgreementActivity;
import com.allipper.rentme.ui.mine.GiveBackActivity;
import com.allipper.rentme.ui.mine.MineInfoActivity;
import com.allipper.rentme.ui.mine.MinePocketActivity;
import com.allipper.rentme.ui.mine.MinePublishInfoActivity;
import com.allipper.rentme.ui.mine.MineRentActivity;
import com.allipper.rentme.ui.mine.RentMeActivity;
import com.allipper.rentme.ui.mine.SysSettingActivity;
import com.umeng.analytics.MobclickAgent;

/**
 * @author
 * @version 1.00 2015/9/21
 * @(#)Other.java
 */


public class MineFragment extends Fragment implements View.OnClickListener {

    private TextView nameTextView;
    private TextView statusTextView;
    private TextView mine_publishTextView;
    private TextView mine_rentTextView;
    private TextView rent_meTextView;
    private TextView givebackTextView;
    private TextView helpTextView;
    private TextView agreementTextView;
    private TextView settingTextView;
    private RelativeLayout mineRelativeLayout;
    private TextView pocketTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        initView(view);
        return view;
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("MineScreen"); //统计页面
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("MineScreen");
    }


    /**
     * 初始化界面
     *
     * @param view
     */
    private void initView(View view) {
        nameTextView = (TextView) view.findViewById(R.id.name);
        statusTextView = (TextView) view.findViewById(R.id.status);
        mine_publishTextView = (TextView) view.findViewById(R.id.mine_publish);
        mine_rentTextView = (TextView) view.findViewById(R.id.mine_rent);
        rent_meTextView = (TextView) view.findViewById(R.id.rent_me);
        givebackTextView = (TextView) view.findViewById(R.id.giveback);
        helpTextView = (TextView) view.findViewById(R.id.help);
        agreementTextView = (TextView) view.findViewById(R.id.agreement);
        settingTextView = (TextView) view.findViewById(R.id.setting);
        pocketTextView = (TextView) view.findViewById(R.id.pocket);
        mineRelativeLayout = (RelativeLayout) view.findViewById(R.id.mine_rl);

        mine_publishTextView.setOnClickListener(this);
        mine_rentTextView.setOnClickListener(this);
        rent_meTextView.setOnClickListener(this);
        givebackTextView.setOnClickListener(this);
        helpTextView.setOnClickListener(this);
        agreementTextView.setOnClickListener(this);
        settingTextView.setOnClickListener(this);
        pocketTextView.setOnClickListener(this);
        mineRelativeLayout.setOnClickListener(this);
        updateUserInfo();
    }

    public void updateUserInfo() {
        String string = SharedPreUtils.getString(getActivity(), SharedPre.User.NICKNAME);
        string = TextUtils.isEmpty(string) ? "昵称" : string;
        nameTextView.setText(string);
        int gender = SharedPreUtils.getInt(getActivity(), SharedPre.User.GENDER, 0);
        if (gender == 0) {
            nameTextView.setCompoundDrawables(null, null, null, null);
        } else if (gender == 1) {
            Drawable drawable = getActivity().getResources().getDrawable(R.mipmap.sex_girl);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            nameTextView.setCompoundDrawables(null, drawable, null, null);
        } else {
            Drawable drawable = getActivity().getResources().getDrawable(R.mipmap.sex_man);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            nameTextView.setCompoundDrawables(null, drawable, null, null);
        }
        statusTextView.setText(SharedPreUtils.getString(getActivity(), SharedPre.User.USERDETAIL));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent it;
        switch (id) {
            case R.id.mine_rl:
                it = new Intent(getActivity(), MineInfoActivity.class);
                startActivity(it);
                break;
            case R.id.mine_publish:
                it = new Intent(getActivity(), MinePublishInfoActivity.class);
                startActivity(it);
                break;
            case R.id.mine_rent:
                it = new Intent(getActivity(), MineRentActivity.class);
                startActivity(it);
                break;
            case R.id.rent_me:
                it = new Intent(getActivity(), RentMeActivity.class);
                startActivity(it);
                break;
            case R.id.pocket:
                it = new Intent(getActivity(), MinePocketActivity.class);
                startActivity(it);
                break;
            case R.id.giveback:
                it = new Intent(getActivity(), GiveBackActivity.class);
                startActivity(it);
                break;
            case R.id.help:
                it = new Intent(getActivity(), GuideActivity.class);
                startActivity(it);
                break;
            case R.id.agreement:
                it = new Intent(getActivity(), AgreementActivity.class);
                startActivity(it);
                break;
            case R.id.setting:
                it = new Intent(getActivity(), SysSettingActivity.class);
                startActivity(it);
                break;
        }
    }
}