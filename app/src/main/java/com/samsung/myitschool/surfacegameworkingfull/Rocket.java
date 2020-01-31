package com.samsung.myitschool.surfacegameworkingfull;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Rocket {
    private Bitmap bitmap;
    private int x;
    private int y;
    private int maxX;
    private int speed = 0;
    private int index;
    private Rect detectCollision;
    private boolean fly;

    public Rocket(Context context, int pos_x, int pos_y, int screenX, int index){
        this.index = index;
        this.x = pos_x;
        this.y = pos_y;
        this.maxX = screenX;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.rocket);
        this.speed = 5;
        fly = true;
        detectCollision = new Rect(pos_x, pos_y, bitmap.getWidth(), bitmap.getHeight());
    }

    public void update(int playerSpeed){
        if (fly) {
            x += speed;
            x += playerSpeed;

            if (x > maxX) {
                setFly(false);
            }

            detectCollision.left = x;
            detectCollision.top = y;
            detectCollision.right = x + bitmap.getWidth();
            detectCollision.bottom = y + bitmap.getHeight();
        }
    }

    public Rect getDetectCollision() {
        return detectCollision;
    }

    public Bitmap getBitmap() {return bitmap; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setFly(boolean sign) { fly = sign; x = -200; }
    public int getIndex() { return index; }
    public boolean getFly() { return fly; }
}
