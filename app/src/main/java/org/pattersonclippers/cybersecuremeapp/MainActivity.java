package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView appLoad, dyk, cyberFacts, themeTV;
    ImageView picOfFact;
    Button doneBTN;
    RadioGroup colourRG;
    RadioButton radio_light, radio_dark, radio_cream, radio_blue, radio_lilac;
    LinearLayout mainScreen;


    int factIndex;
    Facts fact1, fact2, fact3, fact4, fact5, fact6, fact7, fact8, fact9, fact10;
    String theme;
    private SharedPreferences mySharedPreferences;
    SharedPreferences.Editor preferencesEditor;
    private final String COLOR_KEY = "color";
    private String spFilename = "org.pattersonclippers.cybersecuremeapp.AllColor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySharedPreferences = getSharedPreferences(spFilename, MODE_PRIVATE);
        preferencesEditor = mySharedPreferences.edit();
        theme = mySharedPreferences.getString(COLOR_KEY, "light");

        mainScreen = (LinearLayout) findViewById(R.id.mainScreen);
        appLoad = (TextView) findViewById(R.id.appLoad);
        dyk = (TextView) findViewById(R.id.dyk);
        cyberFacts = (TextView) findViewById(R.id.cyberFacts);
        picOfFact = (ImageView) findViewById(R.id.picOfFact);
        themeTV = (TextView) findViewById(R.id.themeTV);
        colourRG = (RadioGroup) findViewById(R.id.colourRG);
        radio_light = (RadioButton) findViewById(R.id.radio_light);
        radio_dark = (RadioButton) findViewById(R.id.radio_dark);
        radio_cream = (RadioButton) findViewById(R.id.radio_cream);
        radio_blue = (RadioButton) findViewById(R.id.radio_blue);
        radio_lilac = (RadioButton) findViewById(R.id.radio_lilac);
        doneBTN = (Button) findViewById(R.id.doneBTN);

        if(theme.equals("light")) {
            mainScreen.setBackgroundColor(getResources().getColor(R.color.light_bg));
            doneBTN.setBackgroundColor(getResources().getColor(R.color.light_button));
            appLoad.setTextColor(getResources().getColor(R.color.light_text));
            dyk.setTextColor(getResources().getColor(R.color.light_text));
            cyberFacts.setTextColor(getResources().getColor(R.color.light_text));
            themeTV.setTextColor(getResources().getColor(R.color.light_text));
            radio_light.setTextColor(getResources().getColor(R.color.light_text));
            radio_dark.setTextColor(getResources().getColor(R.color.light_text));
            radio_cream.setTextColor(getResources().getColor(R.color.light_text));
            radio_blue.setTextColor(getResources().getColor(R.color.light_text));
            radio_lilac.setTextColor(getResources().getColor(R.color.light_text));
            doneBTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
        }
        if(theme.equals("dark")) {
            mainScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg));
            doneBTN.setBackgroundColor(getResources().getColor(R.color.dark_button));
            appLoad.setTextColor(getResources().getColor(R.color.dark_text));
            dyk.setTextColor(getResources().getColor(R.color.dark_text));
            cyberFacts.setTextColor(getResources().getColor(R.color.dark_text));
            themeTV.setTextColor(getResources().getColor(R.color.dark_text));
            radio_light.setTextColor(getResources().getColor(R.color.dark_text));
            radio_dark.setTextColor(getResources().getColor(R.color.dark_text));
            radio_cream.setTextColor(getResources().getColor(R.color.dark_text));
            radio_blue.setTextColor(getResources().getColor(R.color.dark_text));
            radio_lilac.setTextColor(getResources().getColor(R.color.dark_text));
            doneBTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
        }
        if(theme.equals("cream")) {
            mainScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg));
            doneBTN.setBackgroundColor(getResources().getColor(R.color.cream_button));
            appLoad.setTextColor(getResources().getColor(R.color.cream_text));
            dyk.setTextColor(getResources().getColor(R.color.cream_text));
            cyberFacts.setTextColor(getResources().getColor(R.color.cream_text));
            themeTV.setTextColor(getResources().getColor(R.color.cream_text));
            radio_light.setTextColor(getResources().getColor(R.color.cream_text));
            radio_dark.setTextColor(getResources().getColor(R.color.cream_text));
            radio_cream.setTextColor(getResources().getColor(R.color.cream_text));
            radio_blue.setTextColor(getResources().getColor(R.color.cream_text));
            radio_lilac.setTextColor(getResources().getColor(R.color.cream_text));
            doneBTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
        }
        if(theme.equals("blue")) {
            mainScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg));
            doneBTN.setBackgroundColor(getResources().getColor(R.color.blue_button));
            appLoad.setTextColor(getResources().getColor(R.color.blue_text));
            dyk.setTextColor(getResources().getColor(R.color.blue_text));
            cyberFacts.setTextColor(getResources().getColor(R.color.blue_text));
            themeTV.setTextColor(getResources().getColor(R.color.blue_text));
            radio_light.setTextColor(getResources().getColor(R.color.blue_text));
            radio_dark.setTextColor(getResources().getColor(R.color.blue_text));
            radio_cream.setTextColor(getResources().getColor(R.color.blue_text));
            radio_blue.setTextColor(getResources().getColor(R.color.blue_text));
            radio_lilac.setTextColor(getResources().getColor(R.color.blue_text));
            doneBTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
        }
        if(theme.equals("lilac")) {
            mainScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg));
            doneBTN.setBackgroundColor(getResources().getColor(R.color.lilac_button));
            appLoad.setTextColor(getResources().getColor(R.color.lilac_text));
            dyk.setTextColor(getResources().getColor(R.color.lilac_text));
            cyberFacts.setTextColor(getResources().getColor(R.color.lilac_text));
            themeTV.setTextColor(getResources().getColor(R.color.lilac_text));
            radio_light.setTextColor(getResources().getColor(R.color.lilac_text));
            radio_dark.setTextColor(getResources().getColor(R.color.lilac_text));
            radio_cream.setTextColor(getResources().getColor(R.color.lilac_text));
            radio_blue.setTextColor(getResources().getColor(R.color.lilac_text));
            radio_lilac.setTextColor(getResources().getColor(R.color.lilac_text));
            doneBTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
        }

        factIndex = (int) (Math.random()*10);
        fact1 = new Facts(getString(R.string.fact1), R.drawable.fact1pic);
        fact2 = new Facts(getString(R.string.fact2), R.drawable.fact2pic);
        fact3 = new Facts(getString(R.string.fact3), R.drawable.fact3pic);
        fact4 = new Facts(getString(R.string.fact4), R.drawable.fact4pic);
        fact5 = new Facts(getString(R.string.fact5), R.drawable.fact5pic);
        fact6 = new Facts(getString(R.string.fact6), R.drawable.fact6pic);
        fact7 = new Facts(getString(R.string.fact7), R.drawable.fact7pic);
        fact8 = new Facts(getString(R.string.fact8), R.drawable.fact8pic);
        fact9 = new Facts(getString(R.string.fact9), R.drawable.fact9pic);
        fact10 = new Facts(getString(R.string.fact10), R.drawable.fact10pic);

        Facts[] factsArray = new Facts[]{fact1, fact2, fact3, fact4, fact5, fact6, fact7, fact8, fact9, fact10};
        cyberFacts.setText(factsArray[factIndex].getFact());
        picOfFact.setImageResource(factsArray[factIndex].getPicture());

        doneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(myIntent);
            }
        });

        colourRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = colourRG.getCheckedRadioButtonId();
                View radioButton = colourRG.findViewById(id);

                if(radioButton.getId() == R.id.radio_light){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.light_bg));
                    doneBTN.setBackgroundColor(getResources().getColor(R.color.light_button));
                    appLoad.setTextColor(getResources().getColor(R.color.light_text));
                    dyk.setTextColor(getResources().getColor(R.color.light_text));
                    cyberFacts.setTextColor(getResources().getColor(R.color.light_text));
                    themeTV.setTextColor(getResources().getColor(R.color.light_text));
                    radio_light.setTextColor(getResources().getColor(R.color.light_text));
                    radio_dark.setTextColor(getResources().getColor(R.color.light_text));
                    radio_cream.setTextColor(getResources().getColor(R.color.light_text));
                    radio_blue.setTextColor(getResources().getColor(R.color.light_text));
                    radio_lilac.setTextColor(getResources().getColor(R.color.light_text));
                    doneBTN.setTextColor(getResources().getColor(R.color.light_buttontxt));
                    theme = "light";
                    preferencesEditor.putString(COLOR_KEY, theme);
                    preferencesEditor.apply();
                }
                if(radioButton.getId() == R.id.radio_dark){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg));
                    doneBTN.setBackgroundColor(getResources().getColor(R.color.dark_button));
                    appLoad.setTextColor(getResources().getColor(R.color.dark_text));
                    dyk.setTextColor(getResources().getColor(R.color.dark_text));
                    cyberFacts.setTextColor(getResources().getColor(R.color.dark_text));
                    themeTV.setTextColor(getResources().getColor(R.color.dark_text));
                    radio_light.setTextColor(getResources().getColor(R.color.dark_text));
                    radio_dark.setTextColor(getResources().getColor(R.color.dark_text));
                    radio_cream.setTextColor(getResources().getColor(R.color.dark_text));
                    radio_blue.setTextColor(getResources().getColor(R.color.dark_text));
                    radio_lilac.setTextColor(getResources().getColor(R.color.dark_text));
                    doneBTN.setTextColor(getResources().getColor(R.color.dark_buttontxt));
                    theme = "dark";
                    preferencesEditor.putString(COLOR_KEY, theme);
                    preferencesEditor.apply();
                }
                if(radioButton.getId() == R.id.radio_cream){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.cream_bg));
                    doneBTN.setBackgroundColor(getResources().getColor(R.color.cream_button));
                    appLoad.setTextColor(getResources().getColor(R.color.cream_text));
                    dyk.setTextColor(getResources().getColor(R.color.cream_text));
                    cyberFacts.setTextColor(getResources().getColor(R.color.cream_text));
                    themeTV.setTextColor(getResources().getColor(R.color.cream_text));
                    radio_light.setTextColor(getResources().getColor(R.color.cream_text));
                    radio_dark.setTextColor(getResources().getColor(R.color.cream_text));
                    radio_cream.setTextColor(getResources().getColor(R.color.cream_text));
                    radio_blue.setTextColor(getResources().getColor(R.color.cream_text));
                    radio_lilac.setTextColor(getResources().getColor(R.color.cream_text));
                    doneBTN.setTextColor(getResources().getColor(R.color.cream_buttontxt));
                    theme = "cream";
                    preferencesEditor.putString(COLOR_KEY, theme);
                    preferencesEditor.apply();
                }
                if(radioButton.getId() == R.id.radio_blue){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.blue_bg));
                    doneBTN.setBackgroundColor(getResources().getColor(R.color.blue_button));
                    appLoad.setTextColor(getResources().getColor(R.color.blue_text));
                    dyk.setTextColor(getResources().getColor(R.color.blue_text));
                    cyberFacts.setTextColor(getResources().getColor(R.color.blue_text));
                    themeTV.setTextColor(getResources().getColor(R.color.blue_text));
                    radio_light.setTextColor(getResources().getColor(R.color.blue_text));
                    radio_dark.setTextColor(getResources().getColor(R.color.blue_text));
                    radio_cream.setTextColor(getResources().getColor(R.color.blue_text));
                    radio_blue.setTextColor(getResources().getColor(R.color.blue_text));
                    radio_lilac.setTextColor(getResources().getColor(R.color.blue_text));
                    doneBTN.setTextColor(getResources().getColor(R.color.blue_buttontxt));
                    theme = "blue";
                    preferencesEditor.putString(COLOR_KEY, theme);
                    preferencesEditor.apply();
                }
                if(radioButton.getId() == R.id.radio_lilac){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.lilac_bg));
                    doneBTN.setBackgroundColor(getResources().getColor(R.color.lilac_button));
                    appLoad.setTextColor(getResources().getColor(R.color.lilac_text));
                    dyk.setTextColor(getResources().getColor(R.color.lilac_text));
                    cyberFacts.setTextColor(getResources().getColor(R.color.lilac_text));
                    themeTV.setTextColor(getResources().getColor(R.color.lilac_text));
                    radio_light.setTextColor(getResources().getColor(R.color.lilac_text));
                    radio_dark.setTextColor(getResources().getColor(R.color.lilac_text));
                    radio_cream.setTextColor(getResources().getColor(R.color.lilac_text));
                    radio_blue.setTextColor(getResources().getColor(R.color.lilac_text));
                    radio_lilac.setTextColor(getResources().getColor(R.color.lilac_text));
                    doneBTN.setTextColor(getResources().getColor(R.color.lilac_buttontxt));
                    theme = "lilac";
                    preferencesEditor.putString(COLOR_KEY, theme);
                    preferencesEditor.apply();
                }
            }
        });
    }
}