package ma.alexcarrilloar.android.trendingt.main.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alexcarrilloar on 11/6/16.
 */
public class MainSectionPagerAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private Fragment [] fragments;

    public MainSectionPagerAdapter(FragmentManager fm, Fragment[] fragments, String[] titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments[position];
    }

    @Override
    public int getCount() {
        return this.fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.titles[position];
    }
}
