package com.iranshao.iranshao.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.iranshao.iranshao.R;
import com.iranshao.iranshao.bean.TrainingBean;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;

import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/5/17.
 */
public class Fragment_training extends Fragment {

    private View view;
    private TextView tv_info;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_training, null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();

    }


    private void initView() {
        tv_info = (TextView) view.findViewById(R.id.tv_info);
    }

    private void initData() {
        OkHttpUtils.get(" http://trial.iranshao.com/api/v1/races/home.json?access_token=fe4cb5aa9e1017b1d37add4dffe048b9").tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onResponse(boolean isFromCache, String s, Request request, @Nullable Response response) {
                        TrainingBean trainingBean = new Gson().fromJson(s, TrainingBean.class);
                        String desc = trainingBean.getCells().get(0).getText().toString().trim();
                        tv_info.setText(desc);
                    }
                });
    }
}
