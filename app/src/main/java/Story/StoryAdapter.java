package Story;

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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.NovelViewHolder> {

    Context mContext;
    List<Story> mListStory;

    public StoryAdapter(Context mContext, List<Story> mListStory) {
        this.mContext = mContext;
        this.mListStory = mListStory;
    }

    public void setData(List<Story> list){
        this.mListStory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.story_item,parent,false);
        NovelViewHolder novelViewHolder = new NovelViewHolder(v);

        return novelViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NovelViewHolder holder, int position) {
        Story story = mListStory.get(position);
        if (story == null){
            return;
        }

        holder.imgNovel.setImageResource(story.getResourceImg());
        holder.nameNovel.setText(story.getName());
    }

    @Override
    public int getItemCount() {
        if (mListStory != null){
            return mListStory.size();
        }
        return 0;
    }

    public class NovelViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgNovel;
        private TextView nameNovel;

        public NovelViewHolder(@NonNull View itemView) {
            super(itemView);

            imgNovel = itemView.findViewById(R.id.img_book_story);
            nameNovel = itemView.findViewById(R.id.tv_title_story);
        }
    }
}
