package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayCli3A(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void displayCli2A(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void displayCli1A(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void displayResetA(View view) {
        scoreA = scoreA * 0;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

        public void displayCli3B(View view) {
            scoreB = scoreB + 3;
            displayForTeamB(scoreB);
        }

    public void displayCli2B(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void displayCli1B(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    /** reset for boath scores
     *
     *
     */

    public void displayReset(View view) {

        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}

