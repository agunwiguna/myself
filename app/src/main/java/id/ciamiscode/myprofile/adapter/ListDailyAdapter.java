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
import id.ciamiscode.myprofile.model.DailyModel;

public class ListDailyAdapter extends RecyclerView.Adapter<ListDailyAdapter.CategoryViewHolder> {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 3/5/2019
     */

    private Context context;
    private ArrayList<DailyModel> listDaily;

    public ListDailyAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<DailyModel> getListDaily() {
        return listDaily;
    }

    public void setListDaily(ArrayList<DailyModel> listDaily) {
        this.listDaily = listDaily;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_daily,viewGroup,false);

        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {

        categoryViewHolder.tvKegiatan.setText(getListDaily().get(position).getKegiatan());
        categoryViewHolder.tvWaktu.setText(getListDaily().get(position).getWaktu());

        Glide.with(context)
                .load(getListDaily().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListDaily().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvKegiatan;
        TextView tvWaktu;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvKegiatan = itemView.findViewById(R.id.tv_item_kegiatan);
            tvWaktu = itemView.findViewById(R.id.tv_item_waktu);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);

        }
    }
}
