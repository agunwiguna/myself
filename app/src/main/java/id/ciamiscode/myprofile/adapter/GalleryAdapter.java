package id.ciamiscode.myprofile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ciamiscode.myprofile.R;
import id.ciamiscode.myprofile.model.GalleryModel;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GridViewHolder> {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private Context context;
    private ArrayList<GalleryModel> listGallery;

    public GalleryAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<GalleryModel> getListGallery() {
        return listGallery;
    }

    public void setListGallery(ArrayList<GalleryModel> listGallery) {
        this.listGallery = listGallery;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_gallery,parent,false);

        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {

        Glide.with(context)
                .load(getListGallery().get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListGallery().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
