package org.pattersonclippers.cybersecuremeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button doneBTN;
    RadioGroup colourRG;
    LinearLayout mainScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doneBTN = (Button) findViewById(R.id.doneBTN);
        colourRG = (RadioGroup) findViewById(R.id.colourRG);
        mainScreen = (LinearLayout) findViewById(R.id.mainScreen);

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