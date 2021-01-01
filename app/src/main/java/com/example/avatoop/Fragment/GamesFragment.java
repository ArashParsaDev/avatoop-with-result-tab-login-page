package com.example.avatoop.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.avatoop.Adapter.ViewPagerAdapter;
import com.example.avatoop.Fragment.Games.GameResultsFragment;
import com.example.avatoop.Fragment.Games.GameTablesFragment;
import com.example.avatoop.Fragment.Games.LiveFragment;
import com.example.avatoop.R;
import com.google.android.material.tabs.TabLayout;

public class GamesFragment extends Fragment {

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment =  inflater.inflate(R.layout.fragment_games, container, false);
        viewPager = myFragment.findViewById(R.id.viewpager_games);
        tabLayout = myFragment.findViewById(R.id.tablayout_games);
        return myFragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setUpViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new LiveFragment(),"پخش زنده");
        adapter.addFragment(new GameResultsFragment(),"نتایج بازی");
        adapter.addFragment(new GameTablesFragment(),"جداول بازی");


        viewPager.setAdapter(adapter);
    }
}
