package com.example.janou.sudoku;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Level extends Activity {

    public class vGrille {
        int level;
        int num;
        int done;

        public vGrille(int vLevel, int vNum, int vDone){
            this.level = vLevel;
            this.num = vNum;
            this.done = vDone;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        final ListView listview = (ListView) findViewById(R.id.niveaux);
        Intent intent = getIntent();
        int level = intent.getIntExtra("level", 0);
        ArrayList<vGrille> Grilles = new ArrayList<vGrille>();



        for (int i = 1; i<=100; i++){
            Random rand = new Random();
            int randDone = rand.nextInt(100);
            vGrille grille = new vGrille(level, i, randDone);
            Grilles.add(grille);
        }

        LevelAdapter adapter = new LevelAdapter(this, Grilles);
        // ArrayAdapter<vGrille> adapter = new ArrayAdapter<vGrille>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Grilles);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                vGrille selectedItem = (vGrille) parent.getItemAtPosition(position);

                Intent sudoku = new Intent(Level.this,Grille.class);
                sudoku.putExtra("vGrille", selectedItem.toString());
                startActivity(sudoku);
            }
        });
    }


}
