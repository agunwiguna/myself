package id.ciamiscode.myprofile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ciamiscode.myprofile.R;
import id.ciamiscode.myprofile.model.FriendModel;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.GridViewHolder> {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private Context context;
    private ArrayList<FriendModel> listFriend;

    public FriendAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<FriendModel> getListFriend() {
        return listFriend;
    }

    public void setListFriend(ArrayList<FriendModel> listFriend) {
        this.listFriend = listFriend;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemGrid = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_friend,viewGroup,false);

        return new GridViewHolder(itemGrid);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i) {

        gridViewHolder.nama.setText(getListFriend().get(i).getNama());

        Glide.with(context)
                .load(getListFriend().get(i).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(gridViewHolder.img_friend);

    }

    @Override
    public int getItemCount() {
        return getListFriend().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        TextView nama;
        ImageView img_friend;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            img_friend = itemView.findViewById(R.id.img_friend);

        }
    }
}
