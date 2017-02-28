package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("padre", "әpә", R.mipmap.ic_launcher));
        words.add(new Word("madre", "әṭa", R.mipmap.ic_launcher));
        words.add(new Word("figlio", "angsi", R.mipmap.ic_launcher));
        words.add(new Word("figlia", "tune", R.mipmap.ic_launcher));
        words.add(new Word("fratello maggiore", "taachi", R.mipmap.ic_launcher));
        words.add(new Word("fratello minore", "chalitti", R.mipmap.ic_launcher));
        words.add(new Word("sorella maggiore", "teṭe", R.mipmap.ic_launcher));
        words.add(new Word("sorella minore", "kolliti", R.mipmap.ic_launcher));
        words.add(new Word("nonna", "ama", R.mipmap.ic_launcher));
        words.add(new Word("nonno", "paapa", R.mipmap.ic_launcher));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
