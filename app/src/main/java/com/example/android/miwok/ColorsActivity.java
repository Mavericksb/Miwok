package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("rosso", "weṭeṭṭi", R.mipmap.ic_launcher));
        words.add(new Word("verde", "chokokki", R.mipmap.ic_launcher));
        words.add(new Word("marrone", "ṭakaakki", R.mipmap.ic_launcher));
        words.add(new Word("grigio", "ṭopoppi", R.mipmap.ic_launcher));
        words.add(new Word("nero", "kululli", R.mipmap.ic_launcher));
        words.add(new Word("bianco", "kelelli", R.mipmap.ic_launcher));
        words.add(new Word("giallo sporco", "ṭopiisә", R.mipmap.ic_launcher));
        words.add(new Word("giallo mostarda", "chiwiiṭә", R.mipmap.ic_launcher));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
