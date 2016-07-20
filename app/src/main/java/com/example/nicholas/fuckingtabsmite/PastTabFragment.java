package com.example.nicholas.fuckingtabsmite;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nicholas on 7/19/2016.
 */
public class PastTabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View pastFockingTab = inflater.inflate(R.layout.past_tab, container, false);
        return pastFockingTab;

    }
}
