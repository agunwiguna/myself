package id.ciamiscode.myprofile.presenter;

import java.util.ArrayList;
import java.util.List;

import id.ciamiscode.myprofile.model.MusicModel;
import id.ciamiscode.myprofile.view.MainView;

public class MusicPresenterImpl implements MusicPresenter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private MainView mainView;
    private List<MusicModel> musics = new ArrayList<>();

    public MusicPresenterImpl(MainView view) {
        this.mainView = view;
    }

    @Override
    public void save(MusicModel music) {

    }

    @Override
    public void delete(MusicModel music) {

    }

    @Override
    public void onUpdate(MusicModel music) {

    }

    @Override
    public void load() {
        mainView.onLoad(musics);
    }


    public static ArrayList<MusicModel> getListData(){

        //MusicModel music = null;
        ArrayList<MusicModel> list = new ArrayList<>();

        MusicModel music = new MusicModel();
        music.setTitle("Chlorine");
        music.setSong("Twenty One Pilots");
        list.add(music);

        MusicModel music2 = new MusicModel();
        music2.setTitle("Jumpsuit");
        music2.setSong("Twenty One Pilots");
        list.add(music2);

        MusicModel music3 = new MusicModel();
        music3.setTitle("Stressed Out");
        music3.setSong("Twenty One Pilots");
        list.add(music3);

        MusicModel music4 = new MusicModel();
        music4.setTitle("Line Boy");
        music4.setSong("Twenty One Pilots");
        list.add(music4);

        MusicModel music5 = new MusicModel();
        music5.setTitle("Heatens");
        music5.setSong("Twenty One Pilots");
        list.add(music5);

        MusicModel music6 = new MusicModel();
        music6.setTitle("Ride");
        music6.setSong("Twenty One Pilots");
        list.add(music6);

        return list;

    }
}
