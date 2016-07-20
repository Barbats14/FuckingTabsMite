package com.example.nicholas.fuckingtabsmite;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.nicholas.fuckingtabsmite.fockingSTabs.SlidingTabLayout;

public class FockingTabs extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focking_tabs);

        ViewPager viewFockingPager = (ViewPager) findViewById(R.id.FOckingViewpagerMate);

        viewFockingPager.setAdapter(new FragmentFOckingPageaAdapter(getSupportFragmentManager(),FockingTabs.this));

        SlidingTabLayout slidingFockingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_focking_tabs);

        slidingFockingTabLayout.setViewPager(viewFockingPager);




    }
}
