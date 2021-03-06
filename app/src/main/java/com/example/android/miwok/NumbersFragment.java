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
public class NumbersFragment extends Fragment {

    private WordAdapter itemsAdapter;

    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Uno", "Lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Due", "Otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Tre", "Tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Quattro", "Oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Cinque", "Massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Sei", "Temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Sette", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Otto", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nove", "Wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Dieci", "Na'aacha", R.drawable.number_ten, R.raw.number_ten));


        itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

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
