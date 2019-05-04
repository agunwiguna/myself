package id.ciamiscode.myprofile.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.ciamiscode.myprofile.TabDaily;
import id.ciamiscode.myprofile.TabFriend;

public class PageAdapter extends FragmentStatePagerAdapter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 2/5/2019
     */

    int countTab;

    public PageAdapter(FragmentManager fm, int countTab) {
        super(fm);
        this.countTab = countTab;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                TabDaily tabDaily = new TabDaily();
                return tabDaily;
            case 1:
                TabFriend tabFriend = new TabFriend();
                return tabFriend;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countTab;
    }
}
