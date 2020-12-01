package com.example.manju.shapes;

import java.util.TimerTask;

/**
 * Created by manju on 12/1/2017.
 */

public class GameTimerTask extends TimerTask {
    private Game game;
    private GameView gameView;
    public GameTimerTask(Game game, GameView gameView){
        this.game = game;
        this.gameView = gameView;
    }

    public void run(){
        game.update();
        gameView.postInvalidate();
    }
}
