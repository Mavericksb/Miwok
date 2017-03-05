package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private WordAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Uno", "Lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Due", "Otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Tre", "Tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Quattro", "Oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Cinque", "Massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Sei", "Temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Sette", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Otto", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nove", "Wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Dieci", "Na'aacha", R.drawable.number_ten, R.raw.number_ten));



        itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioId());
                mMediaPlayer.start();
            }
        });
        */
    }

    @Override
    protected void onStop() {
        itemsAdapter.releaseMediaPlayer();
        super.onStop();
    }
}
