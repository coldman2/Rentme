package com.allipper.rentme.ui.mine;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.allipper.rentme.R;
import com.allipper.rentme.ui.base.BaseActivity;

public class RentMeOrderDetailActivity extends BaseActivity {
    private static final String TAG = RentMeOrderDetailActivity.class.getSimpleName();

    private ImageView backImageView;
    private TextView titleTextView;
    private TextView numberTextView;
    private TextView nameTextView;
    private TextView constellationTextView;
    private TextView locationTextView;
    private TextView dateTextView;
    private TextView timeTextView;
    private TextView durationTextView;
    private TextView telphoneTextView;
    private TextView cityTextView;
    private TextView addressTextView;
    private TextView costTextView;
    private TextView orderDateTextView;
    private TextView total_feeTextView;
    private RelativeLayout bottomRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_me_order_detail);
        findViews();
        getData(false);
    }

    private void getData(boolean isShowDialog) {

    }

    private void findViews() {
        backImageView = (ImageView) findViewById(R.id.back);
        titleTextView = (TextView) findViewById(R.id.title);
        numberTextView = (TextView) findViewById(R.id.number);
        nameTextView = (TextView) findViewById(R.id.name);
        constellationTextView = (TextView) findViewById(R.id.constellation);
        locationTextView = (TextView) findViewById(R.id.location);
        dateTextView = (TextView) findViewById(R.id.date);
        timeTextView = (TextView) findViewById(R.id.time);
        durationTextView = (TextView) findViewById(R.id.duration);
        telphoneTextView = (TextView) findViewById(R.id.telphone);
        cityTextView = (TextView) findViewById(R.id.city);
        addressTextView = (TextView) findViewById(R.id.address);
        costTextView = (TextView) findViewById(R.id.cost);
        orderDateTextView = (TextView) findViewById(R.id.orderDate);
        total_feeTextView = (TextView) findViewById(R.id.total_fee);
        bottomRelativeLayout = (RelativeLayout) findViewById(R.id.bottomRl);

    }

    //���õ���¼�
    public void back(View view) {
    }

    public void confirm(View view) {
    }
}
