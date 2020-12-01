package com.example.manju.shapes;


import java.util.LinkedList;

//Model
public class Game {
private Circle circle;
    private Square square;

    public static LinkedList<Circle> circlelist = new LinkedList<Circle>();
    public static LinkedList<Square> squarelist = new LinkedList<Square>();
    public Game(){
        circle = new Circle(100, 200, 50);
        circlelist.add(circle);
        circle = new Circle(150, 250, 50);
        circlelist.add(circle);
        circle = new Circle(200, 450, 100);
        circlelist.add(circle);
        circle = new Circle(50, 450, 70);
        circlelist.add(circle);
        circle = new Circle(400, 50, 150);
        circlelist.add(circle);
        circle = new Circle(700, 500, 20);
        circlelist.add(circle);
        circle = new Circle(400, 50, 150);
        circlelist.add(circle);
        circle = new Circle(700, 700, 250);
        circlelist.add(circle);
        circle = new Circle(500, 700, 120);
        circlelist.add(circle);
        circle = new Circle(600, 900, 100);
        circlelist.add(circle);
        square = new Square(100,100,150,150);
        squarelist.add(square);
        square = new Square(500,500,1000,1000);
        squarelist.add(square);
        square = new Square(50,50,100,100);
        squarelist.add(square);
        square = new Square(200,200,250,250);
        squarelist.add(square);
        square = new Square(300,300,175,175);
        squarelist.add(square);
        square = new Square(100,100,275,275);
        squarelist.add(square);
        square = new Square(850,850,975,975);
        squarelist.add(square);
    }

    public void update() {
        for (int i = 0; i < circlelist.size(); i++) {
            if (i == 0 || i==5) {
                circlelist.get(i).moveEast();
            } else if(i==1 || i==6) {
                circlelist.get(i).moveNorth();
            }else{
                circlelist.get(i).moveWest();
            }
            if(i==4 || i==9){
                circlelist.get(i).moveSouth();
            }
        }
        for (int i = 0; i < squarelist.size(); i++) {

            if(i==2 || i==5){
                squarelist.get(i).moveNorth();
            }else {
                squarelist.get(i).moveSouth();
            }
           if(i==3){
               squarelist.get(i).moveEast();
           }
           if(i==4){
               squarelist.get(i).moveWest();
           }

        }
    }
}
