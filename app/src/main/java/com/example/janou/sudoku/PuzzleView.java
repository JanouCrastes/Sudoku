package com.example.janou.sudoku;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class PuzzleView extends View {

    public PuzzleView(Context context) {
        super(context);
    }

    private final int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    private final int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

    @Override
    protected void onDraw(Canvas canvas){
     canvas.drawLine(0, 0,  screenWidth, screenHeight, new Paint(Color.BLACK));
    }

}
