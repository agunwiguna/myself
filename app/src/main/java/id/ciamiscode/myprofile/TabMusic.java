package id.ciamiscode.myprofile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import id.ciamiscode.myprofile.adapter.MusicAdapter;
import id.ciamiscode.myprofile.model.MusicModel;
import id.ciamiscode.myprofile.presenter.MusicPresenter;
import id.ciamiscode.myprofile.presenter.MusicPresenterImpl;
import id.ciamiscode.myprofile.view.MainView;

public class TabMusic extends Fragment implements MainView {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private RecyclerView recyclerView;
    private MusicAdapter adapter;
    private List<MusicModel> musicList = new ArrayList<>();
    private MusicPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabmenu_music,null);

        recyclerView = view.findViewById(R.id.rv_music);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        musicList.addAll(MusicPresenterImpl.getListData());

        adapter = new MusicAdapter(musicList);
        recyclerView.setAdapter(adapter);

        return view;
    }


    @Override
    public void onLoad(List<MusicModel> daily) {

    }

    @Override
    public void onSave() {

    }

    @Override
    public void onDelete() {

    }

    @Override
    public void onUpdate() {

    }
}
