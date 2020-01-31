package com.samsung.myitschool.surfacegameworkingfull;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class MyButton {

    private int x;
    private int y;
    private Bitmap bitmap;
    private Rect detectCollision;

    MyButton (Context context, int x, int y, int id){
        this.x = x;
        this.y = y;
        bitmap = BitmapFactory.decodeResource(context.getResources(), id);
        detectCollision = new Rect(x, y, bitmap.getWidth(), bitmap.getHeight());
        System.out.println(x);
        System.out.println(bitmap.getWidth());
    }

    public Rect getDetectCollision(){
        return detectCollision;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Bitmap getBitmap() { return bitmap; }

}
