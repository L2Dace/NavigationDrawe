package com.example.sidemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Novel.Novel;
import Story.Story;
import Story.StoryAdapter;

public class StoryFragment extends Fragment {

    View v;
    private RecyclerView rcvStory;
    private List<Story> firstStory;

    public StoryFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_story, container, false);
        rcvStory = (RecyclerView) v.findViewById(R.id.rcv_story);
        StoryAdapter adapter = new StoryAdapter(getContext(),firstStory);
        rcvStory.setLayoutManager(new GridLayoutManager(getContext(), 3));
//        rcvStory.setLayoutManager(new LinearLayoutManager(getActivity()));
        rcvStory.setAdapter(adapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstStory = new ArrayList<>();
        firstStory.add(new Story(R.drawable.story1, "My Story Book"));
        firstStory.add(new Story(R.drawable.story2, "Andersen Tales"));
        firstStory.add(new Story(R.drawable.story3, "Jesus StoryBook"));
        firstStory.add(new Story(R.drawable.story4, "Hena Khan"));
        firstStory.add(new Story(R.drawable.story5, "Palculienka"));
        firstStory.add(new Story(R.drawable.story6, "Cinderella"));
        firstStory.add(new Story(R.drawable.story7, "Snow Queen"));
        firstStory.add(new Story(R.drawable.story8, "Richard Peck"));
        firstStory.add(new Story(R.drawable.story9, "Hana Tooko"));
        firstStory.add(new Story(R.drawable.story10, "Willa series"));
    }
}
