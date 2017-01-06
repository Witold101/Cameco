package pl.pionwit.cameco.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pl.pionwit.cameco.fragments.FragmentDataAddActivityTitle;
import pl.pionwit.cameco.fragments.FragmentDataAddImage;

/**
 * Created by vi_st on 06.01.2017.
 * Адаптер для отображения и смены контента в активити добавления данных чека  (текст и фото)
 */

public class DataAddPagerAdapter extends FragmentStatePagerAdapter {
    private int numbOfTabs;

    public DataAddPagerAdapter(FragmentManager fm, int numbOfTabs) {
        super(fm);
        this.numbOfTabs = numbOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0){
            FragmentDataAddActivityTitle fragment1 = new FragmentDataAddActivityTitle();
            return fragment1;
        }else {
            FragmentDataAddImage fragment2 = new FragmentDataAddImage();
            return fragment2;
        }
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}

