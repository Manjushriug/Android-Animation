package com.example.manju.shapes;



public class Square {
    private int left;
    private int top;
    private int right;
    private int bottom;
    private int screenY = 1800;
    public Square(int left, int top, int right, int bottom){
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;

    }

    public int getLeft(){
        return left;
    }

    public int getRight(){
        return right;
    }

    public int getBottom(){
        return bottom;
    }

    public int getTop(){
        return top;
    }

    public void moveNorth() {
        if (bottom <= (1000)) {
            top = top + 5;
            bottom = bottom + 5;
        }
        if (bottom >= (1000)) {
            top = top - screenY - 5;
            bottom = bottom - screenY - 5;
        }
    }

    public void moveSouth() {
        int length = right - left;
        if(bottom >=0) {
            top = top - 10;
            bottom = bottom - 10;
        }

        if(bottom<0){
            bottom = 1000;
            top = bottom -length;
        }
          // left = left - 10;
        //right = right -10;

    }

    public void moveEast() {
        int length = bottom - top;
        if (right >= 0) {
            left = left - 10;
            right = right - 10;
        }

        if (right < 0) {
            right = 1000;
            left = right - length;
        }
    }

    public void moveWest() {
        int length = bottom - top;
        if(right <=1800) {
            left = left +5;
            right = right + 5;
        }

        if(right>=1800){
            right = 0;
            left = right + length;
            right = right + 5;
        }
        // left = left - 10;
        //right = right -10;

    }
}
