package com.example.dell.a1705010321;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String [] titles = {"存储容量需求","存储器价格","成本计算"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        final TabLayout tab_comm = findViewById(R.id.tab_comm);
        tab_comm.addTab(tab_comm.newTab().setText(titles[0]));
        tab_comm.addTab(tab_comm.newTab().setText(titles[1]));
        tab_comm.addTab(tab_comm.newTab().setText(titles[2]));

        tab_comm.post(new Runnable() {
            @Override
            public void run() {
                IndicatorLineUtil.setIndicator(tab_comm, 20, 20);
            }
        });

        final List<Fragment> list = new ArrayList<>();
        list.add(new FragmentCapacity());
        list.add(new FragmentPrice());
        list.add(new FragmentCost());

        ViewPager vp_comm = findViewById(R.id.vp_comm);
        vp_comm.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        tab_comm.setupWithViewPager(vp_comm);
    }
}
