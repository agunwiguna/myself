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

import id.ciamiscode.myprofile.adapter.ListDailyAdapter;
import id.ciamiscode.myprofile.model.DailyModel;
import id.ciamiscode.myprofile.presenter.DailyPresenter;

public class TabDaily extends Fragment {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 3/5/2019
     */

    private RecyclerView rvCategory;
    private ArrayList<DailyModel> list = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabmenu_daily,null);

        rvCategory = view.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(DailyPresenter.getListData());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListDailyAdapter listDailyAdapter = new ListDailyAdapter(getContext());
        listDailyAdapter.setListDaily(list);
        rvCategory.setAdapter(listDailyAdapter);
    }
}
