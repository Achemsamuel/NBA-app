package com.example.android.nbafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.nbafinal.R;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This is for when the +3 button is cicked
     */
    public void addThreeA (View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);

    }

    /**
     * This is for when the +2 button is cicked
     */
    public void addTwoA (View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);

    }
    /**
     * This is for when the free throw button is cicked
     */
    public void freeThrowA (View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * This is for when the +3 button is cicked
     */
    public void addThreeB (View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);

    }

    /**
     * This is for when the +2 button is cicked
     */
    public void addTwoB (View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);

    }
    /**
     * This is for when the free throw button is cicked
     */
    public void freeThrowB (View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    /**
     * This is for when the reset button is cicked
     */
    public void reset (View view){
        scoreB = scoreB * 0;
        scoreA= scoreA*0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreB);
    }


}

