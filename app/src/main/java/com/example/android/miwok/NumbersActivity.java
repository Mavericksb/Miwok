package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Uno", "Lutti", R.drawable.number_one));
        words.add(new Word("Due", "Otiiko", R.drawable.number_two));
        words.add(new Word("Tre", "Tolookosu", R.drawable.number_three));
        words.add(new Word("Quattro", "Oyyisa", R.drawable.number_four));
        words.add(new Word("Cinque", "Massokka", R.drawable.number_five));
        words.add(new Word("Sei", "Temmokka", R.drawable.number_six));
        words.add(new Word("Sette", "Kenekaku", R.drawable.number_seven));
        words.add(new Word("Otto", "Kawinta", R.drawable.number_eight));
        words.add(new Word("Nove", "Wo'e", R.drawable.number_nine));
        words.add(new Word("Dieci", "Na'aacha", R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MediaPlayer audioPlay = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                audioPlay.start();
            }
        });



    }
}
