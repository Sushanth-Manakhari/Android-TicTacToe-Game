package sush.com.tictactoe;

/**
 * Created by sushanth manakari on Apr-08-15.
 */

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;

public abstract class Cell extends Point {
    public Cell(int x, int y)
    {
        super(x, y);
    }
    abstract public void draw(Canvas g,Resources res, int x, int y, int w,int h);
}