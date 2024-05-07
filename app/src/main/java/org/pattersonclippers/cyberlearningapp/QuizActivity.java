package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class QuizActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN, fillBlankBTN, trueFalseBTN;
    LinearLayout quizScreen;

    String theme;
    private SharedPreferences mySharedPreferences;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cyberlearningapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        quizScreen = (LinearLayout) findViewById(R.id.quizScreen);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);
        fillBlankBTN = (Button) findViewById(R.id.fillBlankBTN);
        trueFalseBTN = (Button) findViewById(R.id.trueFalseBTN);

        if(theme.equals("light")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.light_bg)); }
        if(theme.equals("dark")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg)); }
        if(theme.equals("cream")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg)); }
        if(theme.equals("blue")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg)); }
        if(theme.equals("lilac")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg)); }

        homeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, HomeActivity.class);
                startActivity(myIntent);
            }
        });

        malwareBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, MalwareActivity.class);
                startActivity(myIntent);
            }
        });

        scamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, ScamsActivity.class);
                startActivity(myIntent);
            }
        });

        virusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, VirusActivity.class);
                startActivity(myIntent);
            }
        });

        fillBlankBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, FitbActivity.class);
                startActivity(myIntent);
            }
        });

        trueFalseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(QuizActivity.this, TruefalseActivity.class);
                startActivity(myIntent);
            }
        });
    }
}