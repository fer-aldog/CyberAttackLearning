package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FitbActivity extends AppCompatActivity {
    TextView qNum, scoreCount, firstTxt, secondTxt;
    EditText answerET;
    Button checkBTN, nextBTN;
    Question q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, currentQ;
    ArrayList<Question> unusedQuestions, toBeAnswered;
    int score, totalQs, ibeforetotal, currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitb);

        qNum = (TextView) findViewById(R.id.qNum);
        scoreCount = (TextView) findViewById(R.id.scoreCount);
        firstTxt = (TextView) findViewById(R.id.firstTxt);
        //secondTxt = (TextView) findViewById(R.id.secondTxt);

        answerET = (EditText) findViewById(R.id.answerET);

        checkBTN = (Button) findViewById(R.id.checkBTN);
        nextBTN = (Button) findViewById(R.id.nextBTN);

        ibeforetotal = 0;
        totalQs = 10;
        score = 0;

        q1 = new Question(getString(R.string.fitbq1), "malware1");
        q2 = new Question(getString(R.string.fitbq2), "malware2");
        q3 = new Question(getString(R.string.fitbq3), "malware3");
        q4 = new Question(getString(R.string.fitbq4), "malware4");
        q5 = new Question(getString(R.string.fitbq5), "malware5");
        q6 = new Question(getString(R.string.fitbq6), "virus1");
        q7 = new Question(getString(R.string.fitbq7), "virus2");
        q8 = new Question(getString(R.string.fitbq8), "virus3");
        q9 = new Question(getString(R.string.fitbq9), "virus4");
        q10 = new Question(getString(R.string.fitbq10), "virus5");
        q11 = new Question(getString(R.string.fitbq11), "scams1");
        q12 = new Question(getString(R.string.fitbq12), "scams2");
        q13 = new Question(getString(R.string.fitbq13), "scams3");
        q14 = new Question(getString(R.string.fitbq14), "scams4");
        q15 = new Question(getString(R.string.fitbq15), "scams5");

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
        firstTxt.setText(currentQ.getqText());
        ibeforetotal++;
        qNum.setText("QUESTION " + ibeforetotal);

        //when click checkBTN, shows correct if right
        //when wrong, say wrong
        checkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQ.getCorrectAnswer().equalsIgnoreCase(answerET.getText().toString())) {
                    Toast t = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
                    t.show();
                    score = score + 1;
                    scoreCount.setText("score: " + score);
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Wrong. Try again or click" +
                            "\nnext to see the right answer.", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        //when click, say what right answer is
        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ///////////refer to the truefalse java code///////////
                toBeAnswered.add(unusedQuestions.get(currentIndex));
                unusedQuestions.remove(currentIndex);
                currentIndex = (int) (Math.random() * unusedQuestions.size());

                if(ibeforetotal < totalQs) {
                    answerET.setText("");
                    qNum.setText("QUESTION " + (ibeforetotal + 1));
                    currentQ = unusedQuestions.get(currentIndex);
                    firstTxt.setText(currentQ.getqText());
                    ibeforetotal++;
                }
                else {
                    Intent myIntent = new Intent(FitbActivity.this, QuizActivity.class);
                    double percent = (score / (double) totalQs) * 100;
                    Log.d("findpercent", "percent is: " + percent);
                    myIntent.putExtra("fitbHighest", (int) percent);
                    startActivity(myIntent);
                }
            }
        });
    }
}