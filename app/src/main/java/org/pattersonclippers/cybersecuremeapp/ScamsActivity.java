package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ScamsActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN;
    LinearLayout scamsScreen;

    String theme;
    private SharedPreferences mySharedPreferences;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cybersecuremeapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scams);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        scamsScreen = (LinearLayout) findViewById(R.id.scamsScreen);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);

        if(theme.equals("light")) {
            scamsScreen.setBackgroundColor(getResources().getColor(R.color.light_bg)); }
        if(theme.equals("dark")) {
            scamsScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg)); }
        if(theme.equals("cream")) {
            scamsScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg)); }
        if(theme.equals("blue")) {
            scamsScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg)); }
        if(theme.equals("lilac")) {
            scamsScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg)); }

        homeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScamsActivity.this, HomeActivity.class);
                startActivity(myIntent);
            }
        });

        malwareBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScamsActivity.this, MalwareActivity.class);
                startActivity(myIntent);
            }
        });

        virusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScamsActivity.this, VirusActivity.class);
                startActivity(myIntent);
            }
        });

        quizBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScamsActivity.this, QuizActivity.class);
                startActivity(myIntent);
            }
        });
    }
}