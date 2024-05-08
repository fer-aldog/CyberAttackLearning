package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    TextView header, fitbTitle, fitbHighest, fitbDesc, tfTitle, tfHighest, tfDesc;
    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN, fillBlankBTN, trueFalseBTN;
    LinearLayout quizScreen, buttonBar, fitbBG, tfBG;

    Intent incomingIntent;
    String theme;
    int fitbOldScore, fitbNewScore, tfOldScore, tfNewScore;
    private SharedPreferences mySharedPreferences;
    SharedPreferences.Editor preferencesEditor;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cyberlearningapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        preferencesEditor = mySharedPreferences.edit();
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        quizScreen = (LinearLayout) findViewById(R.id.quizScreen);
        buttonBar = (LinearLayout) findViewById(R.id.buttonBar);
        fitbBG = (LinearLayout) findViewById(R.id.fitbBG);
        tfBG = (LinearLayout) findViewById(R.id.tfBG);

        header = (TextView) findViewById(R.id.header);
        fitbTitle = (TextView) findViewById(R.id.fitbTitle);
        fitbHighest = (TextView) findViewById(R.id.fitbHighest);
        fitbDesc = (TextView) findViewById(R.id.fitbDesc);
        tfTitle = (TextView) findViewById(R.id.tfTitle);
        tfHighest = (TextView) findViewById(R.id.tfHighest);
        tfDesc = (TextView) findViewById(R.id.tfDesc);

        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);
        fillBlankBTN = (Button) findViewById(R.id.fillBlankBTN);
        trueFalseBTN = (Button) findViewById(R.id.trueFalseBTN);

        fitbHighest = (TextView) findViewById(R.id.fitbHighest);
        tfHighest = (TextView) findViewById(R.id.tfHighest);

        fitbOldScore = mySharedPreferences.getInt("fitbHighest", 0);
        tfOldScore = mySharedPreferences.getInt("tfHighest", 0);

        incomingIntent = getIntent();
        fitbNewScore = incomingIntent.getIntExtra("fitbHighest", 0);
        tfNewScore = incomingIntent.getIntExtra("tfHighest", 0);

        if(fitbNewScore > fitbOldScore) {
            fitbOldScore = fitbNewScore;
        }
        if(tfNewScore > tfOldScore) {
            tfOldScore = tfNewScore;
        }

        Log.d("findpercent", "the fitb high score is: " + fitbOldScore);
        Log.d("findpercent", "the tf high score is: " + tfOldScore);

        fitbHighest.setText("Your highest score: " + fitbOldScore + "%");
        tfHighest.setText("Your highest score: " + tfOldScore + "%");

        preferencesEditor.putInt("fitbHighest", fitbOldScore);
        preferencesEditor.putInt("tfHighest", tfOldScore);
        preferencesEditor.apply();

        if(theme.equals("light")) {
            quizScreen.setBackgroundColor(getResources().getColor(R.color.light_bg));
            header, fitbTitle, fitbHighest, fitbDesc, tfTitle, tfHighest, tfDesc;
            Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN, fillBlankBTN, trueFalseBTN;
            LinearLayout quizScreen, buttonBar, fitbBG, tfBG
        }
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