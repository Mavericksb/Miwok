package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Uno", "Lutti", R.mipmap.ic_launcher));
        words.add(new Word("Due", "Otiiko", R.mipmap.ic_launcher));
        words.add(new Word("Tre", "Tolookosu", R.mipmap.ic_launcher));
        words.add(new Word("Quattro", "Oyyisa", R.mipmap.ic_launcher));
        words.add(new Word("Cinque", "Massokka", R.mipmap.ic_launcher));
        words.add(new Word("Sei", "Temmokka", R.mipmap.ic_launcher));
        words.add(new Word("Sette", "Kenekaku", R.mipmap.ic_launcher));
        words.add(new Word("Otto", "Kawinta", R.mipmap.ic_launcher));
        words.add(new Word("Nove", "Wo'e", R.mipmap.ic_launcher));
        words.add(new Word("Dieci", "Na'aacha", R.mipmap.ic_launcher));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
