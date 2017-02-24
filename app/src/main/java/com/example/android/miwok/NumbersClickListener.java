package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by ROBERTO on 24/02/2017.
 */

public class NumbersClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(), "Open the list of Numbers", Toast.LENGTH_SHORT).show();
    }
}
