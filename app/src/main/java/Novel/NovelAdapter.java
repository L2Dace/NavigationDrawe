package Novel;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidemenu.R;

import org.intellij.lang.annotations.JdkConstants;

import java.util.List;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.NovelViewHolder> {

    Context mContext;
    List<Novel> mListNovel;

    public NovelAdapter(Context mContext, List<Novel> mListNovel) {
        this.mContext = mContext;
        this.mListNovel = mListNovel;
    }

    public void setData(List<Novel> list){
        this.mListNovel = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.novel_item,parent,false);
        NovelViewHolder novelViewHolder = new NovelViewHolder(v);

        return novelViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NovelViewHolder holder, int position) {
        Novel novel = mListNovel.get(position);
        if (novel == null){
            return;
        }

        holder.imgNovel.setImageResource(novel.getResourceImg());
        holder.nameNovel.setText(novel.getName());
    }

    @Override
    public int getItemCount() {
        if (mListNovel != null){
            return mListNovel.size();
        }
        return 0;
    }

    public class NovelViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgNovel;
        private TextView nameNovel;

        public NovelViewHolder(@NonNull View itemView) {
            super(itemView);

            imgNovel = itemView.findViewById(R.id.img_book_novel);
            nameNovel = itemView.findViewById(R.id.tv_title_novel);
        }
    }
}
