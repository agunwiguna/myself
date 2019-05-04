package id.ciamiscode.myprofile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.ciamiscode.myprofile.adapter.GalleryAdapter;
import id.ciamiscode.myprofile.model.GalleryModel;
import id.ciamiscode.myprofile.presenter.GalleryPresenter;

public class GalleryFragment extends Fragment {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private RecyclerView rvCategory;
    private ArrayList<GalleryModel> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery,null);

        rvCategory = view.findViewById(R.id.rv_gallery);
        rvCategory.setHasFixedSize(true);

        list.addAll(GalleryPresenter.getListData());
        showGallery();

        return view;
    }

    private void showGallery(){

        rvCategory.setLayoutManager(new GridLayoutManager(getActivity(),2));
        GalleryAdapter galleryAdapter = new GalleryAdapter(getContext());
        galleryAdapter.setListGallery(list);
        rvCategory.setAdapter(galleryAdapter);

    }
}
