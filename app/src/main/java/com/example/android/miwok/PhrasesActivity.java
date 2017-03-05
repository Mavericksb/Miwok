package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private WordAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

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



        itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

    @Override
    protected void onStop() {
        itemsAdapter.releaseMediaPlayer();
        super.onStop();
    }

}
