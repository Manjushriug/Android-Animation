package com.example.manju.shapes;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;

public class MainActivity extends Activity {

    private Game game;
    private GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        game = new Game();
        gameView = new GameView(this);
        setContentView(gameView);
        //setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        GameTimerTask task = new GameTimerTask(game,gameView);
        timer.schedule(task,2000,10);
    }
}
