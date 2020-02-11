package com.example.shan.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Manufacturer> mManufacturers = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mManufacturers.add(new Manufacturer("1", "Lenovo", "Shenzhen"));
        mManufacturers.add(new Manufacturer("2", "Nokia", "Finland"));
        mManufacturers.add(new Manufacturer("3", "Q mobile", "Pakistan"));

        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPagerManufacturer);


        viewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int i) {
                Manufacturer manufacturer = mManufacturers.get(i);

                Fragment_Manufacturer fragment_manufacturer =
                        new Fragment_Manufacturer();

                Bundle bundle = new Bundle();
                bundle.putString("id", manufacturer.getId());
                bundle.putString("name", manufacturer.getName());
                bundle.putString("address", manufacturer.getAddress());

                fragment_manufacturer.setArguments(bundle);

                return fragment_manufacturer;
            }

            @Override
            public int getCount() {
                return mManufacturers.size();
            }
        });
    }
}
