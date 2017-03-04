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
        words.add(new Word("padre", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("madre", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("figlio", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("figlia", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("fratello maggiore", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("fratello minore", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("sorella maggiore", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("sorella minore", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("nonna", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("nonno", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
