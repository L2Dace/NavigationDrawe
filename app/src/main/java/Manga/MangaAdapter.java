package Manga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidemenu.R;

import java.util.List;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.NovelViewHolder> {

    Context mContext;
    List<Manga> mListManga;

    public MangaAdapter(Context mContext, List<Manga> mListManga) {
        this.mContext = mContext;
        this.mListManga = mListManga;
    }

    public void setData(List<Manga> list){
        this.mListManga = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.manga_item,parent,false);
        NovelViewHolder novelViewHolder = new NovelViewHolder(v);

        return novelViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NovelViewHolder holder, int position) {
        Manga manga = mListManga.get(position);
        if (manga == null){
            return;
        }

        holder.imgNovel.setImageResource(manga.getResourceImg());
        holder.nameNovel.setText(manga.getName());
    }

    @Override
    public int getItemCount() {
        if (mListManga != null){
            return mListManga.size();
        }
        return 0;
    }

    public class NovelViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgNovel;
        private TextView nameNovel;

        public NovelViewHolder(@NonNull View itemView) {
            super(itemView);

            imgNovel = itemView.findViewById(R.id.img_book_manga);
            nameNovel = itemView.findViewById(R.id.tv_title_manga);
        }
    }
}
