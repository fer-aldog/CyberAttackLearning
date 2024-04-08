package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class VirusActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN;
    LinearLayout virusScreen;

    String theme;
    private SharedPreferences mySharedPreferences;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cybersecuremeapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        virusScreen = (LinearLayout) findViewById(R.id.virusScreen);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);

        if(theme.equals("light")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.light_bg)); }
        if(theme.equals("dark")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg)); }
        if(theme.equals("cream")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg)); }
        if(theme.equals("blue")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg)); }
        if(theme.equals("lilac")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg)); }

        homeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VirusActivity.this, HomeActivity.class);
                startActivity(myIntent);
            }
        });

        malwareBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VirusActivity.this, MalwareActivity.class);
                startActivity(myIntent);
            }
        });

        scamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VirusActivity.this, ScamsActivity.class);
                startActivity(myIntent);
            }
        });

        quizBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VirusActivity.this, QuizActivity.class);
                startActivity(myIntent);
            }
        });
    }
}