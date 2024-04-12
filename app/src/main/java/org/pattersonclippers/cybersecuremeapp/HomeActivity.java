package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN, link1BTN, link2BTN;
    LinearLayout homeScreen, buttonBar;
    TextView header, summary, checkOut;
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
        buttonBar = (LinearLayout) findViewById(R.id.buttonBar);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);
        header = (TextView) findViewById(R.id.header);
        summary = (TextView) findViewById(R.id.summary);
        checkOut = (TextView) findViewById(R.id.checkOut);
        link1BTN = (Button) findViewById(R.id.link1BTN);
        link2BTN = (Button) findViewById(R.id.link2BTN);

        if(theme.equals("light")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.light_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.light_button));
            link1BTN.setBackgroundColor(getResources().getColor(R.color.light_button));
            link2BTN.setBackgroundColor(getResources().getColor(R.color.light_button));
            link1BTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
            link2BTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            virusBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.light_text));
            summary.setTextColor(getResources().getColor(R.color.light_text));
            checkOut.setTextColor(getResources().getColor(R.color.light_text));
        }
        if(theme.equals("dark")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.dark_button));
            link1BTN.setBackgroundColor(getResources().getColor(R.color.dark_button));
            link2BTN.setBackgroundColor(getResources().getColor(R.color.dark_button));
            link1BTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
            link2BTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            virusBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.dark_text));
            summary.setTextColor(getResources().getColor(R.color.dark_text));
            checkOut.setTextColor(getResources().getColor(R.color.dark_text));
        }
        if(theme.equals("cream")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.cream_button));
            link1BTN.setBackgroundColor(getResources().getColor(R.color.cream_button));
            link2BTN.setBackgroundColor(getResources().getColor(R.color.cream_button));
            link1BTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
            link2BTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            virusBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.cream_text));
            summary.setTextColor(getResources().getColor(R.color.cream_text));
            checkOut.setTextColor(getResources().getColor(R.color.cream_text));
        }
        if(theme.equals("blue")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.blue_button));
            link1BTN.setBackgroundColor(getResources().getColor(R.color.blue_button));
            link2BTN.setBackgroundColor(getResources().getColor(R.color.blue_button));
            link1BTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
            link2BTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            virusBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.blue_text));
            summary.setTextColor(getResources().getColor(R.color.blue_text));
            checkOut.setTextColor(getResources().getColor(R.color.blue_text));
        }
        if(theme.equals("lilac")) {
            homeScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.lilac_button));
            link1BTN.setBackgroundColor(getResources().getColor(R.color.lilac_button));
            link2BTN.setBackgroundColor(getResources().getColor(R.color.lilac_button));
            link1BTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
            link2BTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            virusBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.lilac_text));
            summary.setTextColor(getResources().getColor(R.color.lilac_text));
            checkOut.setTextColor(getResources().getColor(R.color.lilac_text));
        }

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

        virusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomeActivity.this, VirusActivity.class);
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