package com.example.janou.sudoku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janou on 14/03/2018.
 */

public class LevelAdapter extends ArrayAdapter<Level.vGrille> {
    public LevelAdapter(Context context, ArrayList<Level.vGrille> grilles) {
        super(context, 0, grilles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Level.vGrille grille = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.level_layout, parent, false);
        }
        TextView level = (TextView) convertView.findViewById(R.id.level);
        TextView num = (TextView) convertView.findViewById(R.id.num);
        TextView done = (TextView) convertView.findViewById(R.id.done);
        level.setText("Niveau : " + String.valueOf(grille.level));
        num.setText(String.valueOf(grille.num));
        done.setText(String.valueOf(grille.done) + "%");
        return convertView;
    }
}
