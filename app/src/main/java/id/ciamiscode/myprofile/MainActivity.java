package id.ciamiscode.myprofile;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 29/4/2019
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());
    }

    public boolean loadFragment(Fragment fragment){
        if(fragment != null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()){

            case R.id.navigation_home :
                fragment = new HomeFragment();
                break;
            case R.id.navigation_daily :
                fragment = new DailyFragment();
                break;
            case R.id.navigation_gallery :
                fragment = new GalleryFragment();
                break;
            case R.id.navigation_music :
                fragment = new MusicFragment();
                break;
            case R.id.navigation_profile :
                fragment = new ProfileFragment();
                break;

        }

        return loadFragment(fragment);
    }

}
