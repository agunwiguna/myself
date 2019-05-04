package id.ciamiscode.myprofile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.ciamiscode.myprofile.adapter.FriendAdapter;
import id.ciamiscode.myprofile.model.FriendModel;
import id.ciamiscode.myprofile.presenter.FriendPresenter;

public class TabFriend extends Fragment {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private RecyclerView rv_friend;
    private ArrayList<FriendModel> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabmenu_friend,null);

        rv_friend = view.findViewById(R.id.rv_friend);
        rv_friend.setHasFixedSize(true);

        list.addAll(FriendPresenter.getListData());
        showFriend();

        return view;
    }

    private void showFriend(){

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_friend.setLayoutManager(gridLayoutManager);
        FriendAdapter friendAdapter = new FriendAdapter(getContext());
        friendAdapter.setListFriend(list);
        rv_friend.setAdapter(friendAdapter);

    }
}
