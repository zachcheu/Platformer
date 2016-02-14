package com.example.zachcheu.platformer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class fallingObject extends rectangle{
    private float x;
    private float y;
    private int width;
    private int length;
    private int color;
    private String direction;
    private Paint f = new Paint();

    public fallingObject(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = height;
        f.setColor(Color.RED);
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void draw(Canvas canvas){
        canvas.drawRect(this.x, this.y, this.x + this.width, this.y + this.length, f);
    }
}
