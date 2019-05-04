package id.ciamiscode.myprofile.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import id.ciamiscode.myprofile.R;
import id.ciamiscode.myprofile.model.MusicModel;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    private List<MusicModel> musics;
    private OncallBackListener listener;

    public MusicAdapter(List<MusicModel> musics) {
        this.musics = musics;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_music,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MusicModel music = musics.get(i);
        viewHolder.title.setText(music.getTitle());
        viewHolder.song.setText(music.getSong());
    }

    @Override
    public int getItemCount() {
        return musics.size();
    }

    public void setOnCallBackListener(OncallBackListener listener){
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView song;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            title = itemView.findViewById(R.id.title);
            song = itemView.findViewById(R.id.song);
        }

        @Override
        public void onClick(View v) {
            if(listener != null){
                listener.onClick(musics.get(getAdapterPosition()));
            }
        }
    }

    public interface OncallBackListener{
        void onClick(MusicModel user);
    }
}
