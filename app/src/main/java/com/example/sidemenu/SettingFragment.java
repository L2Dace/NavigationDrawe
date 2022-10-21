package com.example.sidemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Novel.Novel;
import Setting.Setting;
import Setting.SettingAdapter;

public class SettingFragment extends Fragment {

    View v;
    private RecyclerView rcvSetting;
    private List<Setting> firstSetting;

    public SettingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_setting, container, false);
        rcvSetting = (RecyclerView) v.findViewById(R.id.rcv_setting);
        SettingAdapter adapter = new SettingAdapter(getContext(),firstSetting);
        //rcvNovel.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rcvSetting.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcvSetting.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstSetting = new ArrayList<>();
        firstSetting.add(new Setting("General"));
        firstSetting.add(new Setting("Tools"));
        firstSetting.add(new Setting("Contact"));
        firstSetting.add(new Setting("System"));

    }
}
