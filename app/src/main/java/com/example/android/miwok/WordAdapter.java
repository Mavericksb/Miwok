package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ROBERTO on 27/02/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokWord = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentWord.getMiwokWord());

        TextView defaultWord = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultWord.setText(currentWord.getDefaultWord());

        ImageView icon = (ImageView)listItemView.findViewById(R.id.icon_view);
        icon.setImageResource(currentWord.getIconImg());

        return listItemView;



    }
}
