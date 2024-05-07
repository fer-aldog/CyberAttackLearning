package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FitbActivity extends AppCompatActivity {
    TextView qNum, score, firstTxt, secondTxt;
    EditText answerET;
    Button checkBTN, nextBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitb);

        qNum = (TextView) findViewById(R.id.qNum);
        score = (TextView) findViewById(R.id.score);
        firstTxt = (TextView) findViewById(R.id.firstTxt);
        secondTxt = (TextView) findViewById(R.id.secondTxt);

        answerET = (EditText) findViewById(R.id.answerET);

        checkBTN = (Button) findViewById(R.id.checkBTN);
        nextBTN = (Button) findViewById(R.id.nextBTN);
    }
}