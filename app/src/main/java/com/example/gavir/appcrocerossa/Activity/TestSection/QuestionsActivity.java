package com.example.gavir.appcrocerossa.Activity.TestSection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gavir.appcrocerossa.R;

public class QuestionsActivity extends AppCompatActivity {
    int numberAnswer = 1;
    TextView questionTitle;
    TextView questionBody;
    RadioButton choice1;
    RadioButton choice2;
    RadioButton choice3;
    RadioButton choice4;
    RadioGroup radioGroupChoice;
    Button nextQuestionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers_test);

        //Domanda n°:
        questionTitle = findViewById(R.id.titleSectionTest);
        //corpo della domanda
        questionBody = findViewById(R.id.answer);
        //radio group scelte di risposta
        choice1 = findViewById(R.id.choice_1);
        choice2 = findViewById(R.id.choice_2);
        choice3 = findViewById(R.id.choice_3);
        choice4 = findViewById(R.id.choice_4);
        radioGroupChoice = findViewById(R.id.radioGroupAnswer);

        //Bottone nuova domanda
        nextQuestionButton = findViewById(R.id.next);

        nextAnswer();
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (noRudioButtonChecked()) {
                    Toast.makeText(QuestionsActivity.this, "Scegli una risposta", Toast.LENGTH_SHORT).show();
                } else {
                    numberAnswer += 1;
                    clearRadioButton();
                    nextAnswer();
                }
            }
        });

    }

    public boolean noRudioButtonChecked() {
        boolean isUserDecided = false;
        if (!(choice1.isChecked() || choice2.isChecked() || choice3.isChecked() || choice4.isChecked())) {
            isUserDecided = true;
        }
        return isUserDecided;
    }

    public void clearRadioButton() {
        choice1.setChecked(false);
        choice2.setChecked(false);
        choice3.setChecked(false);
        choice4.setChecked(false);
    }

    public void nextAnswer() {
        questionTitle.setText("Domanda " + numberAnswer + ":");
        AnswersHelper.checkAnswerNumber(numberAnswer, questionBody, choice1, choice2, choice3, choice4, radioGroupChoice, getApplicationContext());

    }
}
