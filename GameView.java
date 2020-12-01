package com.example.manju.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;



public class GameView extends View {

    public GameView(Context context){
        super(context);

    }

    public void onDraw(Canvas canvas){
        this.setBackgroundColor(Color.BLACK);
        Paint paint = new Paint();

        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);
        if(Game.circlelist.size()>0) {

            for (int i = 0; i < Game.circlelist.size(); i++) {
                if(i==4){
                    paint.setColor(Color.rgb(140, 120, 50));
                }else{
                    paint.setColor(Color.rgb(0, 255, 50));
                }
                if(i==7){
                    paint.setColor(Color.rgb(140, 255, 150));
                }
                if(i==8 || i==9){
                    paint.setColor(Color.rgb(255, 0, 0));
                }

                canvas.drawCircle(Game.circlelist.get(i).getCenterX(),Game.circlelist.get(i).getCenterY(), Game.circlelist.get(i).getRadius(), paint);
            }
        }
        if(Game.squarelist.size()>0) {
            paint.setColor(Color.rgb(255, 0, 0));
            for (int i = 0; i < Game.squarelist.size(); i++) {
                if(i==3 || i==6){
                    paint.setColor(Color.rgb(0, 0, 255));
                }
                if(i==4 || i==5){
                    paint.setColor(Color.rgb(150, 0, 40));
                }
                canvas.drawRect(Game.squarelist.get(i).getLeft(), Game.squarelist.get(i).getTop(), Game.squarelist.get(i).getRight(), Game.squarelist.get(i).getBottom(), paint);
            }
        }
    }
}
