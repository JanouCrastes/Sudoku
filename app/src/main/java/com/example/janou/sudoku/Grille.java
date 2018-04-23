package com.example.janou.sudoku;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.io.Console;

public class Grille extends Activity implements View.OnClickListener {

    int nbPut = 1;
    // private PuzzleView puzzleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PuzzleView(this));
        // puzzleView = new PuzzleView(this);
        // puzzleView.requestFocus();
        setContentView(R.layout.activity_grille);
        Button B1 = (Button) findViewById(R.id.button1Value);
        Button B2 = (Button) findViewById(R.id.button2Value);
        Button B3 = (Button) findViewById(R.id.button3Value);
        Button B4 = (Button) findViewById(R.id.button4Value);
        Button B5 = (Button) findViewById(R.id.button5Value);
        Button B6 = (Button) findViewById(R.id.button6Value);
        Button B7 = (Button) findViewById(R.id.button7Value);
        Button B8 = (Button) findViewById(R.id.button8Value);
        Button B9 = (Button) findViewById(R.id.button9Value);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);
        B7.setOnClickListener(this);
        B8.setOnClickListener(this);
        B9.setOnClickListener(this);

        // B1.setBackgroundColor(0xFF00FF00);

        final String numbers[] = new String[]{
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
                "0", "0", "0", "0", "0", "0", "0", "0", "0",
        };

        final GridView gridviewitem = (GridView) findViewById(R.id.gridviewitem);



        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
        gridviewitem.setAdapter(adapter);



        gridviewitem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v,
                                    int position, long id) {
                numbers[position] = String.valueOf(nbPut);
                gridviewitem.setAdapter(adapter);

                // Toast.makeText(Grille.this, "X" + position,
                //        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onClick(View view) {

        // view.setBackgroundColor(0xFF00FF00);
        switch (view.getId()){
            case R.id.button1Value: nbPut = 1;
            break;

            case R.id.button2Value: nbPut = 2;
                break;

            case R.id.button3Value: nbPut = 3;
                break;

            case R.id.button4Value: nbPut = 4;
                break;

            case R.id.button5Value: nbPut = 5;
                break;

            case R.id.button6Value: nbPut = 6;
                break;

            case R.id.button7Value: nbPut = 7;
                break;

            case R.id.button8Value: nbPut = 8;
                break;

            case R.id.button9Value: nbPut = 9;
                break;

            default: nbPut = 1;
            break;
        }
    }
}
