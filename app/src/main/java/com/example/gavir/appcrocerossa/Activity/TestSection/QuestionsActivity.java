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

    private int numberOfQuestion = 1;
    private TextView questionTitle;
    private TextView questionBody;
    private RadioButton choice1;
    private RadioButton choice2;
    private RadioButton choice3;
    private RadioButton choice4;
    private RadioGroup radioGroupChoice;
    private Button nextQuestionButton;

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

        questions();
        nextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (noRudioButtonChecked()) {
                    Toast.makeText(QuestionsActivity.this, "Scegli una risposta", Toast.LENGTH_SHORT).show();
                } else {
                    numberOfQuestion += 1;
                    clearRadioButton();
                    questions();
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

    public void questions() {
        questionTitle.setText("Domanda " + numberOfQuestion + ":");

        //TODO query a db che restituisce le domande
    }
}
