package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView cyberFacts;
    ImageView picOfFact;
    Button doneBTN;
    RadioGroup colourRG;
    LinearLayout mainScreen;


    int factIndex;
    Facts fact1, fact2, fact3, fact4, fact5, fact6, fact7, fact8, fact9, fact10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cyberFacts = (TextView) findViewById(R.id.cyberFacts);
        picOfFact = (ImageView) findViewById(R.id.picOfFact);
        doneBTN = (Button) findViewById(R.id.doneBTN);
        colourRG = (RadioGroup) findViewById(R.id.colourRG);
        mainScreen = (LinearLayout) findViewById(R.id.mainScreen);

        factIndex = (int) (Math.random()*10);
        fact1 = new Facts(getString(R.string.fact1), R.drawable.fact1pic);
        fact2 = new Facts(getString(R.string.fact2), R.drawable.fact1pic);
        fact3 = new Facts(getString(R.string.fact3), R.drawable.fact1pic);
        fact4 = new Facts(getString(R.string.fact4), R.drawable.fact1pic);
        fact5 = new Facts(getString(R.string.fact5), R.drawable.fact1pic);
        fact6 = new Facts(getString(R.string.fact6), R.drawable.fact1pic);
        fact7 = new Facts(getString(R.string.fact7), R.drawable.fact1pic);
        fact8 = new Facts(getString(R.string.fact8), R.drawable.fact1pic);
        fact9 = new Facts(getString(R.string.fact9), R.drawable.fact1pic);
        fact10 = new Facts(getString(R.string.fact10), R.drawable.fact1pic);

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
                }
                if(radioButton.getId() == R.id.radio_dark){
                    mainScreen.setBackgroundColor(getResources().getColor(R.color.dark_bg));
                }
                if(radioButton.getId() == R.id.radio_cream){

                }
                if(radioButton.getId() == R.id.radio_blue){

                }
                if(radioButton.getId() == R.id.radio_lilac){

                }
            }
        });
    }
}