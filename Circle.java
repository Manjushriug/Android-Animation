package com.example.manju.shapes;



public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int delta =5;
    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void moveEast(){
        /*if(centerX==0){
            centerX = screenX;
        }*/if(centerX <=1800) {
            centerX = centerX + delta;
        }else{
            centerX = 0;
            centerX = centerX + delta;
        }
    }
    public void moveWest(){
        /*if(centerX==0){
            centerX = screenX;
        }*/
        if(centerX>0) {
            centerX = centerX - 10;
        }else{
            centerX = 1800;
            centerX = centerX - 10;
        }
    }

    public void moveNorth(){
        /*if(centerX==0){
            centerX = screenX;
        }*/
        if(centerY>0) {
            centerY = centerY - 10;
        }else{
            centerY = 1000;
            centerY = centerY - 10;
        }
    }
    public void moveSouth(){
        /*if(centerX==0){
            centerX = screenX;
        }*/
        if(centerY<=1000) {
            centerY = centerY + 15;
        }else{
            centerY = 0;
            centerY = centerY + 15;
        }
    }
    public int getCenterX(){
        return centerX;
    }

    public int getCenterY(){
        return centerY;
    }

    public int getRadius(){
        return radius;
    }
}
