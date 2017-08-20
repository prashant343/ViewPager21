package iotapps.viewpager1;

/**
 * Created by prashantkaushik on 13/03/17.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by prashantkaushik on 10/03/17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Homefragment Home = new Homefragment();
                return Home;
            case 1:
                Trendingfragment trendingfragment = new Trendingfragment();
                return trendingfragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
