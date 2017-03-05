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
public class PhrasesFragment extends Fragment {

    private WordAdapter itemsAdapter;

    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dove stai andando?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("Come ti chiami?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word("Mi chiamo...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("Come ti senti?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("Mi sento bene", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Stai arrivando?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Sì, sto arrivando", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word("Sto arrivando", "әәnәm", R.raw.phrase_im_coming));
        words.add(new Word("Andiamo", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Vieni qui", "әnni'nem", R.raw.phrase_come_here));



        itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_phrases);

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
