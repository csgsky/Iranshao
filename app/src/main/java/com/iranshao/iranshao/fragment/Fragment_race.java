package com.iranshao.iranshao.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
public class Fragment_race extends Fragment {

    private View view;
    private TrainingBean trainingBean;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragment_race, null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }


    private void initView() {

    }

    private void initData() {
        //请求网路获取数据，将数据存放在bean中
        OkHttpUtils.get(" http://trial.iranshao.com/api/v1/races/home.json?access_token=fe4cb5aa9e1017b1d37add4dffe048b9").tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onResponse(boolean isFromCache, String s, Request request, @Nullable Response response) {
                        trainingBean = new Gson().fromJson(s, TrainingBean.class);
                    }
                });
    }
}
