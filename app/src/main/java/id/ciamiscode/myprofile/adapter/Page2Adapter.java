package id.ciamiscode.myprofile.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import id.ciamiscode.myprofile.TabMusic;
import id.ciamiscode.myprofile.TabVideo;

public class Page2Adapter extends FragmentStatePagerAdapter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 2/5/2019
     */

    int countTab;

    public Page2Adapter(FragmentManager fm, int countTab) {
        super(fm);
        this.countTab = countTab;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                TabMusic tabMusic = new TabMusic();
                return tabMusic;
            case 1:
                TabVideo tabVideo = new TabVideo();
                return tabVideo;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countTab;
    }
}
