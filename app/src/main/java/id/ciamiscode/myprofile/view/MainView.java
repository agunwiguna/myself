package id.ciamiscode.myprofile.view;

import java.util.List;
import id.ciamiscode.myprofile.model.MusicModel;

public interface MainView {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    void onLoad(List<MusicModel> daily);

    void onSave();

    void onDelete();

    void onUpdate();

}
