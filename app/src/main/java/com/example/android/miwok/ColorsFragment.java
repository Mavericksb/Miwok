package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {

    private WordAdapter itemsAdapter;

    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("rosso", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("verde", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("marrone", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("grigio", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("nero", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("bianco", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("giallo sporco", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("giallo mostarda", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));



        itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        itemsAdapter.releaseMediaPlayer();
        super.onStop();
    }

}
