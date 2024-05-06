package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VirusActivity extends AppCompatActivity {

    Button homeBTN, malwareBTN, scamBTN, virusBTN, quizBTN;
    LinearLayout virusScreen, buttonBar;
    TextView header, article;

    String theme;
    private SharedPreferences mySharedPreferences;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cyberlearningapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        virusScreen = (LinearLayout) findViewById(R.id.virusScreen);
        buttonBar = (LinearLayout) findViewById(R.id.buttonBar);
        homeBTN = (Button) findViewById(R.id.homeBTN);
        malwareBTN = (Button) findViewById(R.id.malwareBTN);
        scamBTN = (Button) findViewById(R.id.scamBTN);
        virusBTN = (Button) findViewById(R.id.virusBTN);
        quizBTN = (Button) findViewById(R.id.quizBTN);
        header = (TextView) findViewById(R.id.header);
        article = (TextView) findViewById(R.id.article);

        if(theme.equals("light")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.light_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.light_button));
            virusBTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.light_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.light_text));
            article.setTextColor(getResources().getColor(R.color.light_text));
        }
        if(theme.equals("dark")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.dark_button));
            virusBTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.dark_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.dark_text));
            article.setTextColor(getResources().getColor(R.color.dark_text));
        }
        if(theme.equals("cream")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.cream_button));
            virusBTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.cream_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.cream_text));
            article.setTextColor(getResources().getColor(R.color.cream_text));
        }
        if(theme.equals("blue")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.blue_button));
            virusBTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.blue_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.blue_text));
            article.setTextColor(getResources().getColor(R.color.blue_text));
        }
        if(theme.equals("lilac")) {
            virusScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg));
            buttonBar.setBackgroundColor(getResources().getColor(R.color.lilac_button));
            virusBTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
            homeBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            malwareBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            scamBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            quizBTN.setTextColor(getResources().getColor(R.color.lilac_inactivetxt));
            header.setTextColor(getResources().getColor(R.color.lilac_text));
            article.setTextColor(getResources().getColor(R.color.lilac_text));
        }

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