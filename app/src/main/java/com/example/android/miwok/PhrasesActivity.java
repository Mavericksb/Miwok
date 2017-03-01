package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dove stai andando?", "minto wuksus"));
        words.add(new Word("Come ti chiami?", "tinnә oyaase'nә"));
        words.add(new Word("Mi chiamo...", "oyaaset..."));
        words.add(new Word("Come ti senti?", "michәksәs?"));
        words.add(new Word("Mi sento bene", "kuchi achit"));
        words.add(new Word("Stai arrivando?", "әәnәs'aa?"));
        words.add(new Word("Sì, sto arrivando", "hәә’ әәnәm"));
        words.add(new Word("Sto arrivando", "әәnәm"));
        words.add(new Word("Andiamo", "yoowutis"));
        words.add(new Word("Vieni qui", "әnni'nem"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
