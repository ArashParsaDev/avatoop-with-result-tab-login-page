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
import com.example.avatoop.Fragment.News.ArchiveFragment;
import com.example.avatoop.Fragment.News.HotTopicsFragment;
import com.example.avatoop.Fragment.News.ReporterNewsFragment;
import com.example.avatoop.Fragment.News.SportNewspapersFragment;
import com.example.avatoop.R;
import com.google.android.material.tabs.TabLayout;

public class NewsFragment extends Fragment {
    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;

    public NewsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment =  inflater.inflate(R.layout.fragment_news, container, false);
        viewPager = myFragment.findViewById(R.id.viewpager_news);
        tabLayout = myFragment.findViewById(R.id.tablayout_news);
        return myFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

      /*  Toolbar toolbar = view.findViewById(R.id.);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);*/
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
        adapter.addFragment(new ArchiveFragment(),"آرشیو مطالب");
        adapter.addFragment(new ReporterNewsFragment(),"خبر های خبرنگاران");
        adapter.addFragment(new SportNewspapersFragment(),"روزنامه های ورزشی");
        adapter.addFragment(new HotTopicsFragment(),"پر بازدید های هفته ");




        viewPager.setAdapter(adapter);
    }
}
