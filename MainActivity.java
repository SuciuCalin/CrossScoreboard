package com.example.android.crossscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int pointsA = 0;    //Tracks the points for Player 1
    private int pointsB = 0;    //Tracks the points for Player 2
    private int scoreA = 0;     //Tracks the score for Player 1
    private int scoreB = 0;     //Tracks the score for Player 2
    private int call40 = 0;     //Tracks the +40 calls. Allowed 1 per game
    private int call20 = 0;     //Tracks the +20 calls. Cannot be more than 3 per game

    TextView scoreViewA;
    TextView pointsViewA;
    TextView scoreViewB;
    TextView pointsViewB;

    static final String POINTS_A = "playerApoints";
    static final String POINTS_B = "playerBpoints";
    static final String SCORE_A = "PlayerAscore";
    static final String SCORE_B = "PlayerBscore";
    static final String TWENTY = "checkForTwenty";
    static final String FORTY = "checkForForty";


    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        //Save the current game states
        savedInstanceState.putInt(POINTS_A, pointsA);
        savedInstanceState.putInt(POINTS_B, pointsB);
        savedInstanceState.putInt(SCORE_A, scoreA);
        savedInstanceState.putInt(SCORE_B, scoreB);
        savedInstanceState.putInt(TWENTY, call20);
        savedInstanceState.putInt(FORTY, call40);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //Restore states from saved instance
        pointsA = savedInstanceState.getInt(POINTS_A);
        pointsB = savedInstanceState.getInt(POINTS_B);
        scoreA = savedInstanceState.getInt(SCORE_A);
        scoreB = savedInstanceState.getInt(SCORE_B);
        call20 = savedInstanceState.getInt(TWENTY);
        call40 = savedInstanceState.getInt(FORTY);

        scoreViewA.setText(savedInstanceState.getString(SCORE_A));
        scoreViewB.setText(savedInstanceState.getString(SCORE_B));
        pointsViewA.setText(savedInstanceState.getString(POINTS_A));
        pointsViewB.setText(savedInstanceState.getString(POINTS_B));

        displayForPlayerA(pointsA);
        displayForPlayerB(pointsB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA = (TextView) findViewById(R.id.playerA_score);
        scoreViewB = (TextView) findViewById(R.id.playerB_score);
        pointsViewA = (TextView) findViewById(R.id.playerA_points);
        pointsViewB = (TextView) findViewById(R.id.playerB_points);
    }

    //Displays the points and score for Player 1.
    public void displayForPlayerA(int points) {
        pointsViewA.setText(String.valueOf(points));

        //Calculates and displays the score. 1 score point = 33 points
        scoreA = pointsA / 33;
        scoreViewA.setText(String.valueOf(scoreA));

    }

    //Displays the points and score for Player 2.
    public void displayForPlayerB(int points) {
        pointsViewB.setText(String.valueOf(points));

        //Calculates and displays the score. 1 score point = 33 points
        scoreB = pointsB / 33;
        scoreViewB.setText(String.valueOf(scoreB));

    }

    //Checks if a +40 has already been called in the current game
    public void fortyCallCheck() {
        call40++;
        if (call40 > 1) {
            Toast.makeText(getApplicationContext()
                    , getString(R.string.plus40Call)
                    , Toast.LENGTH_SHORT).show();
        }
    }

    //Checks the +20 calls in the current game. Impossible to have more than 3 calls of +20
    public void twentyCallCheck() {
        call20++;
        if (call20 > 3) {
            Toast.makeText(getApplicationContext()
                    , getString(R.string.plus20Call)
                    , Toast.LENGTH_SHORT).show();
        }
    }

    //ADDING PLAYER 1 POINTS
    //Increase the points for Player 1 by 2
    public void playerA_2points(View v) {
        pointsA += 2;
        displayForPlayerA(pointsA);
    }

    //Increase the points for Player 1 by 3
    public void playerA_3points(View v) {
        pointsA += 3;
        displayForPlayerA(pointsA);
    }

    //Increase the points for Player 1 by 4
    public void playerA_4points(View v) {
        pointsA += 4;
        displayForPlayerA(pointsA);
    }

    //Increase the points for Player 1 by 10
    public void playerA_10points(View v) {
        pointsA += 10;
        displayForPlayerA(pointsA);
    }

    //Increase the points for Player 1 by 11
    public void playerA_11points(View v) {
        pointsA += 11;
        displayForPlayerA(pointsA);
    }

    //Increase the points for Player 1 by 20
    public void playerA_20points(View v) {
        twentyCallCheck();
        if (call20 < 4) {
            pointsA += 20;
            displayForPlayerA(pointsA);
        }
    }

    //Increase the points for Player 1 by 40
    public void playerA_40points(View v) {
        fortyCallCheck();
        if (call40 < 2) {
            pointsA += 40;
            displayForPlayerA(pointsA);
        }
    }


    //ADDING PLAYER 2 POINTS
    //Increase the points for Player 2 by 2
    public void playerB_2points(View v) {
        pointsB += 2;
        displayForPlayerB(pointsB);
    }

    //Increase the points for Player 2 by 3
    public void playerB_3points(View v) {
        pointsB += 3;
        displayForPlayerB(pointsB);
    }

    //Increase the points for Player 2 by 4
    public void playerB_4points(View v) {
        pointsB += 4;
        displayForPlayerB(pointsB);
    }

    //Increase the points for Player 2 by 10
    public void playerB_10points(View v) {
        pointsB += 10;
        displayForPlayerB(pointsB);
    }

    //Increase the points for Player 2 by 11
    public void playerB_11points(View v) {
        pointsB += 11;
        displayForPlayerB(pointsB);
    }

    //Increase the points for Player 2 by 20
    public void playerB_20points(View v) {
        twentyCallCheck();
        if (call20 < 4) {
            pointsB += 20;
            displayForPlayerB(pointsB);
        }
    }

    //Increase the points for Player 2 by 40
    public void playerB_40points(View v) {
        fortyCallCheck();
        if (call40 < 2) {
            pointsB += 40;
            displayForPlayerB(pointsB);
        }
    }

    //Resets the score and points to 0
    public void resetsPointsAndScore(View v) {
        pointsA = 0;
        pointsB = 0;
        call40 = 0;
        call20 = 0;
        displayForPlayerA(pointsA);
        displayForPlayerB(pointsB);
    }
}