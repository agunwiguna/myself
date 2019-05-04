package id.ciamiscode.myprofile.presenter;

import id.ciamiscode.myprofile.model.MusicModel;

public interface MusicPresenter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    void save(MusicModel music);

    void delete(MusicModel music);

    void onUpdate(MusicModel music);

    void load();

}
