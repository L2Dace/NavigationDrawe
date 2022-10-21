package com.example.sidemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Manga.Manga;
import Story.Story;
import Manga.MangaAdapter;

public class MangaFragment extends Fragment {

    View v;
    private RecyclerView rcvManga;
    private List<Manga> firstManga;

    public MangaFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_manga, container, false);
        rcvManga = (RecyclerView) v.findViewById(R.id.rcv_manga);
        MangaAdapter adapter = new MangaAdapter(getContext(),firstManga);
        rcvManga.setLayoutManager(new GridLayoutManager(getContext(), 2));
//        rcvStory.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcvManga.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstManga = new ArrayList<>();
        firstManga.add(new Manga(R.drawable.manga1, "Naruto"));
        firstManga.add(new Manga(R.drawable.manga2, "Jujutsu"));
        firstManga.add(new Manga(R.drawable.manga3, "Persona 5"));
        firstManga.add(new Manga(R.drawable.manga4, "Tokyo Ghoul"));
        firstManga.add(new Manga(R.drawable.manga5, "Hero Academia"));
        firstManga.add(new Manga(R.drawable.manga6, "Attack on Titan"));
        firstManga.add(new Manga(R.drawable.manga7, "Sherlock"));
        firstManga.add(new Manga(R.drawable.manga8, "Chainsaw Man"));
        firstManga.add(new Manga(R.drawable.manga9, "Neverland"));
        firstManga.add(new Manga(R.drawable.manga10, "Dragonball"));
    }
}
