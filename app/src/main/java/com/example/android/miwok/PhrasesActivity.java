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
        words.add(new Word("Dove stai andando?", "minto wuksus", R.mipmap.ic_launcher));
        words.add(new Word("Come ti chiami?", "tinnә oyaase'nә", R.mipmap.ic_launcher));
        words.add(new Word("Mi chiamo...", "oyaaset...", R.mipmap.ic_launcher));
        words.add(new Word("Come ti senti?", "michәksәs?", R.mipmap.ic_launcher));
        words.add(new Word("Mi sento bene", "kuchi achit", R.mipmap.ic_launcher));
        words.add(new Word("Stai arrivando?", "әәnәs'aa?", R.mipmap.ic_launcher));
        words.add(new Word("Sì, sto arrivando", "hәә’ әәnәm", R.mipmap.ic_launcher));
        words.add(new Word("Sto arrivando", "әәnәm", R.mipmap.ic_launcher));
        words.add(new Word("Andiamo", "yoowutis", R.mipmap.ic_launcher));
        words.add(new Word("Vieni qui", "әnni'nem", R.mipmap.ic_launcher));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
