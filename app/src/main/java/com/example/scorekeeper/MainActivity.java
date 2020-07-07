package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int teamA = 0;
    int teamB = 0;

    //this is for Team A
    public void setTeamA1(View view){
        teamA = teamA +6;
        score_board_a_current(teamA);
    }
    public void setTeamA2(View view){
        teamA = teamA +4;
        score_board_a_current(teamA);
    }
    public void setTeamA3(View view){
        teamA = teamA +3;
        score_board_a_current(teamA);
    }
    public void setTeamA4(View view){
        teamA = teamA +2;
        score_board_a_current(teamA);
    }
    public void setTeamA5(View view){
        teamA = teamA +1;
        score_board_a_current(teamA);
    }
    //this is for Team B Score
    public void setTeamB1(View view){
        teamB = teamB +6;
        score_board_b_current(teamB);
    }
    public void setTeamB2(View view){
        teamB = teamB +4;
        score_board_b_current(teamB);
    }
    public void setTeamB3(View view){
        teamB = teamB +3;
        score_board_b_current(teamB);
    }
    public void setTeamB4(View view){
        teamB = teamB +2;
        score_board_b_current(teamB);
    }
    public void setTeamB5(View view){
        teamB = teamB +1;
        score_board_b_current(teamB);
    }
    public void resetScore(View view){
        teamA = 0;
        teamB = 0;
        score_board_a_current(teamA);
        score_board_b_current(teamB);
    }


    public void score_board_a_current(int number){
        TextView textView = findViewById(R.id.score_board_team_A);
        textView.setText("" +number);
    }
    public void score_board_b_current(int number){
        TextView textView = findViewById(R.id.score_board_team_B);
        textView.setText("" +number);
    }
}
