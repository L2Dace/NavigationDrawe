package Setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sidemenu.R;

import java.util.List;
import java.util.Set;

import Novel.Novel;

public class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.SettingViewHolder> {

    Context mContext;
    List<Setting> mListSetting;

    public SettingAdapter(Context mContext, List<Setting> mListSetting) {
        this.mContext = mContext;
        this.mListSetting = mListSetting;
    }

    public void setData(List<Setting> list){
        this.mListSetting = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.setting_item,parent,false);
        SettingViewHolder settingViewHolder = new SettingViewHolder(v);
        return settingViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SettingViewHolder holder, int position) {
        Setting setting = mListSetting.get(position);
        if (setting == null){
            return;
        }
        holder.name.setText(setting.getSetting_name());


    }

    @Override
    public int getItemCount() {
        if (mListSetting != null){
            return mListSetting.size();
        }
        return 0;
    }

    public class SettingViewHolder extends RecyclerView.ViewHolder{

        private TextView name;

        public SettingViewHolder(@NonNull View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.tv_setting);
        }
    }
}
