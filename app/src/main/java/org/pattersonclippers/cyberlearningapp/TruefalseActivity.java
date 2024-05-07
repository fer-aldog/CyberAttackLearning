package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TruefalseActivity extends AppCompatActivity {
    Button trueBTN, falseBTN, correctBTN, nextBTN;
    TextView qNum, scoreCount, questionTV;
    Question q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, currentQ;
    ArrayList<Question> unusedQuestions, toBeAnswered;
    int score, totalQs, ibeforetotal, currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truefalse);

        qNum = (TextView) findViewById(R.id.qNum);
        scoreCount = (TextView) findViewById(R.id.scoreCount);
        questionTV = (TextView) findViewById(R.id.questionTV);

        trueBTN = (Button) findViewById(R.id.trueBTN);
        falseBTN = (Button) findViewById(R.id.falseBTN);
        correctBTN = (Button) findViewById(R.id.correctBTN);
        nextBTN = (Button) findViewById(R.id.nextBTN);

        ibeforetotal = 0;
        totalQs = 10;
        score = 0;

        q1 = new Question(getString(R.string.tfq1), true);
        q2 = new Question(getString(R.string.tfq2), false);
        q3 = new Question(getString(R.string.tfq3), true);
        q4 = new Question(getString(R.string.tfq4), false);
        q5 = new Question(getString(R.string.tfq5), true);
        q6 = new Question(getString(R.string.tfq6), false);
        q7 = new Question(getString(R.string.tfq7), true);
        q8 = new Question(getString(R.string.tfq8), false);
        q9 = new Question(getString(R.string.tfq9), true);
        q10 = new Question(getString(R.string.tfq10), false);
        q11 = new Question(getString(R.string.tfq11), true);
        q12 = new Question(getString(R.string.tfq12), false);
        q13 = new Question(getString(R.string.tfq13), true);
        q14 = new Question(getString(R.string.tfq14), false);
        q15 = new Question(getString(R.string.tfq15), true);

        unusedQuestions = new ArrayList<Question>();
        toBeAnswered = new ArrayList<Question>();

        unusedQuestions.add(q1);
        unusedQuestions.add(q2);
        unusedQuestions.add(q3);
        unusedQuestions.add(q4);
        unusedQuestions.add(q5);
        unusedQuestions.add(q6);
        unusedQuestions.add(q7);
        unusedQuestions.add(q8);
        unusedQuestions.add(q9);
        unusedQuestions.add(q10);
        unusedQuestions.add(q11);
        unusedQuestions.add(q12);
        unusedQuestions.add(q13);
        unusedQuestions.add(q14);
        unusedQuestions.add(q15);

        currentIndex = (int) (Math.random()*15);
        currentQ = unusedQuestions.get(currentIndex);
        questionTV.setText(currentQ.getqText());
        ibeforetotal++;
        qNum.setText("QUESTION " + ibeforetotal);

        trueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQ.getCorrectAnswer() == true) {
                    Toast t = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
                    t.show();
                    score = score + 1;
                    scoreCount.setText("score: " + score);
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Wrong.", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        falseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQ.getCorrectAnswer() == false) {
                    Toast t = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
                    t.show();
                    score = score + 1;
                    scoreCount.setText("score: " + score);
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Wrong.", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        correctBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This is why.", Toast.LENGTH_SHORT);
                t.show();
            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toBeAnswered.add(unusedQuestions.get(currentIndex));
                unusedQuestions.remove(currentIndex);
                currentIndex = (int) (Math.random() * unusedQuestions.size());

                if(ibeforetotal < totalQs) {
                    qNum.setText("QUESTION " + (ibeforetotal + 1));
                    currentQ = unusedQuestions.get(currentIndex);
                    questionTV.setText(currentQ.getqText());
                    ibeforetotal++;
                }
                else {
                    Intent myIntent = new Intent(TruefalseActivity.this, QuizActivity.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}