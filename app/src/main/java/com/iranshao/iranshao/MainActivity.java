package com.iranshao.iranshao;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.iranshao.iranshao.fragment.Fragment_me;
import com.iranshao.iranshao.fragment.Fragment_race;
import com.iranshao.iranshao.fragment.Fragment_training;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ll_main;
    private RadioGroup rg_main;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实现radiogroup和fragment管理器之间的交互
        initView();
        initData();
    }

    private void initView() {
        ll_main = (LinearLayout) findViewById(R.id.ll_main);
        rg_main = (RadioGroup) findViewById(R.id.rg_main);
        rg_main.check(R.id.rbtn_homefragment_training);
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.ll_main,new Fragment_training(),"train");
        transaction.commit();
    }
    private void initData() {

        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_homefragment_training:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.ll_main,new Fragment_training(),"train");
                        transaction.commit();
                        Toast.makeText(getApplicationContext(),"training",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbtn_homefragment_race :
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.ll_main, new Fragment_race(),"race");
                        transaction.commit();
                        Toast.makeText(getApplicationContext(),"race",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbtn_homefragment_me:
                        transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.ll_main,new Fragment_me(),"me");
                        transaction.commit();
                        Toast.makeText(getApplicationContext(),"me",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

    }
}
