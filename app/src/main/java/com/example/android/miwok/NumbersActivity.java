package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Uno", "Lutti"));
        words.add(new Word("Due", "Otiiko"));
        words.add(new Word("Tre", "Tolookosu"));
        words.add(new Word("Quattro", "Oyyisa"));
        words.add(new Word("Cinque", "Massokka"));
        words.add(new Word("Sei", "Temmokka"));
        words.add(new Word("Sette", "Kenekaku"));
        words.add(new Word("Otto", "Kawinta"));
        words.add(new Word("Nove", "Wo'e"));
        words.add(new Word("Dieci", "Na'aacha"));



        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
