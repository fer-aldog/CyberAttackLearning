package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, phishingBTN, quizBTN, link1BTN, link2BTN;
    LinearLayout homeScreen;

    String theme;
    private SharedPreferences mySharedPreferences;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cybersecuremeapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        homeScreen = (LinearLayout) findViewById(R.id.homeScreen);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        phishingBTN = (Button) findViewById(R.id.phishingBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);
        link1BTN = (Button) findViewById(R.id.link1BTN);
        link2BTN = (Button) findViewById(R.id.link2BTN);

        if(theme.equals("light")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.light_bg)); }
        if(theme.equals("dark")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg)); }
        if(theme.equals("cream")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg)); }
        if(theme.equals("blue")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg)); }
        if(theme.equals("lilac")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg)); }

        malwareBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, MalwareActivity.class);
                startActivity(myIntent);
            }
        });

        scamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, ScamsActivity.class);
                startActivity(myIntent);
            }
        });

        phishingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, PhishingActivity.class);
                startActivity(myIntent);
            }
        });

        quizBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, QuizActivity.class);
                startActivity(myIntent);
            }
        });

        link1BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, WebViewActivity.class);
                myIntent.putExtra("whichLink", "link1");
                startActivity(myIntent);
            }
        });

        link2BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, WebViewActivity.class);
                myIntent.putExtra("whichLink", "link2");
                startActivity(myIntent);
            }
        });
    }
}