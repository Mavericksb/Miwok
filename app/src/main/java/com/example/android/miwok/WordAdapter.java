package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.getColor;

/**
 * Created by ROBERTO on 27/02/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int background){
        super(context, 0, words);
        backgroundColor = background;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);

        //retrieve miwok translation from activity java file
        TextView miwokWord = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentWord.getMiwokWord());

        TextView defaultWord = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultWord.setText(currentWord.getDefaultWord());

        ImageView icon = (ImageView)listItemView.findViewById(R.id.icon_view);
        if(currentWord.hasImage())
            { icon.setImageResource(currentWord.getIconImg());        }
        else
            { icon.setVisibility(View.GONE);        }

        View textContainer = (View)listItemView.findViewById(R.id.text_container);
        int color = getColor(getContext(), backgroundColor);
        textContainer.setBackgroundColor(color);

        final ImageView playIcon = (ImageView)listItemView.findViewById(R.id.play_icon);
        playIcon.setBackgroundColor(color);
        playIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer playTranslation = MediaPlayer.create(getContext(), currentWord.getAudioId());
                playTranslation.start();
            }
        });


        return listItemView;
    }
}
