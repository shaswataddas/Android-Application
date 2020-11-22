package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[][] winposition = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int activeplayer = 1;
    int[] gamestate = {2,2,2,2,2,2,2,2,2};
    boolean gameactive = true;
    public void dropin(View view) {
        ImageView counter = (ImageView) view;
        int tappedcounter = Integer.parseInt(counter.getTag().toString());
        if(gamestate[tappedcounter] == 2 && gameactive){
            gamestate[tappedcounter] = activeplayer;
            counter.setTranslationY(-1500);
            if (activeplayer == 1) {
                counter.setImageResource(R.drawable.yellow);
                activeplayer = 0;
            } else {
                counter.setImageResource(R.drawable.red);
                activeplayer = 1;
            }
            counter.animate().translationYBy(1500).rotation(3600).setDuration(200);
            for (int[] winpos : winposition) {
                if (gamestate[winpos[0]] == gamestate[winpos[1]] && gamestate[winpos[1]] == gamestate[winpos[2]] && gamestate[winpos[0]] != 2) {
                    gameactive = false;
                    String winner = "";
                    if (activeplayer == 1) {
                        winner = "Red";
                    } else {
                        winner = "Yellow";
                    }
                    //Toast.makeText(this, winner + " has won", Toast.LENGTH_SHORT).show();
                    Button playAgainButton = (Button)findViewById(R.id.playAgainButton);
                    TextView winnerTextView = (TextView)findViewById(R.id.winnerTextView);
                    winnerTextView.setText(winner+" has Won the Game");
                    playAgainButton.setVisibility(View.VISIBLE);
                    winnerTextView.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    public void playAgain(View view)
    {
        Log.i("info","PLay again is pressed.");
        int i;
        Button playAgainButton = (Button)findViewById(R.id.playAgainButton);
        TextView winnerTextView = (TextView)findViewById(R.id.winnerTextView);
        playAgainButton.setVisibility(View.INVISIBLE);
        winnerTextView.setVisibility(View.INVISIBLE);
        GridLayout gridLayout = (GridLayout)findViewById(R.id.gameboard);
        for(i=1; i<=gridLayout.getChildCount(); i++){
            ImageView counter = (ImageView)gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }
        activeplayer = 1;
        for (i=0;i<gamestate.length;i++){
            gamestate[i]=2;
        }
        gameactive = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}