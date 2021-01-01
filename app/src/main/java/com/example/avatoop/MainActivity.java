package com.example.avatoop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import com.example.avatoop.Adapter.ViewPagerAdapter;
import com.example.avatoop.Fragment.GamesFragment;
import com.example.avatoop.Fragment.HomeFragment;
import com.example.avatoop.Fragment.NewsFragment;
import com.example.avatoop.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_main_fragment_container, new HomeFragment());
        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_main);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuItem_home:
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.frame_main_fragment_container, new HomeFragment());
                        fragmentTransaction1.commit();
                        break;
                    case R.id.menuItem_games:
                        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.frame_main_fragment_container, new GamesFragment());
                        fragmentTransaction2.commit();
                        break;
                    case R.id.menuItem_profile:
                        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.frame_main_fragment_container, new ProfileFragment());
                        fragmentTransaction3.commit();
                        break;
                    case R.id.menuItem_news:
                        FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.frame_main_fragment_container, new NewsFragment());
                        fragmentTransaction4.commit();
                        break;

                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.menuItem_home);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });
    }
}