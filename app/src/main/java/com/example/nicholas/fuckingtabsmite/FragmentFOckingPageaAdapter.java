package com.example.nicholas.fuckingtabsmite;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nicholas on 7/19/2016.
 */
public class FragmentFOckingPageaAdapter extends FragmentPagerAdapter {

    private String[] fockingTabs = new String[]{"Active Focking tab mite","Past Focking tab mite"};
    private Context context;

    public FragmentFOckingPageaAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new ActiveTabFragment();
        }
        else if (position ==1){
            return new PastTabFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fockingTabs[position];
    }
}
