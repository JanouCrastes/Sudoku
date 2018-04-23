package com.example.janou.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
        Button Blevel1 = (Button) findViewById(R.id.level1);
        Button Blevel2 = (Button) findViewById(R.id.level2);
        Blevel1.setOnClickListener(this);
        Blevel2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Level.class);
        switch (view.getId()){
            case R.id.level1:
                intent.putExtra("level", 1);
                break;
            case R.id.level2:
                intent.putExtra("level", 2);
                break;

            default:
                break;
        }

        startActivity(intent);
    }
}
