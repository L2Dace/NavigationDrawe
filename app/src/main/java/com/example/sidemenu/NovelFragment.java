package com.example.sidemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Novel.Novel;
import Novel.NovelAdapter;


public class NovelFragment extends Fragment {

    View v;
    private RecyclerView rcvNovel;
    private List<Novel> firstNovel;

    public NovelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_novel, container, false);
        rcvNovel = (RecyclerView) v.findViewById(R.id.rcv_novel);
        NovelAdapter adapter = new NovelAdapter(getContext(),firstNovel);
        //rcvNovel.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rcvNovel.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcvNovel.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstNovel = new ArrayList<>();
        firstNovel.add(new Novel(R.drawable.novel1, "Chuyện ma ám ở trang viên Bly"));
        firstNovel.add(new Novel(R.drawable.novel2, "Lưỡng Nam Chích Quái"));
        firstNovel.add(new Novel(R.drawable.novel3, "Ông già và biển cả"));
        firstNovel.add(new Novel(R.drawable.novel4, "Tuổi thơ dữ dội"));
        firstNovel.add(new Novel(R.drawable.novel5, "Số đỏ"));
        firstNovel.add(new Novel(R.drawable.novel6, "Làm đĩ"));
        firstNovel.add(new Novel(R.drawable.novel7, "Tiếng chim hót trong bụi mận gai"));
        firstNovel.add(new Novel(R.drawable.novel8, "Woman of Light"));
        firstNovel.add(new Novel(R.drawable.novel9, "Master Pieces"));
        firstNovel.add(new Novel(R.drawable.novel10, "The Alchemist"));
    }
}
