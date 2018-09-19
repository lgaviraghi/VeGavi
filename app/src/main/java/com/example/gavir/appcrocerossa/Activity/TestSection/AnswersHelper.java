package com.example.gavir.appcrocerossa.Activity.TestSection;

import android.content.Context;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class AnswersHelper {

    static int checkedButton = 0;

    public static void checkAnswerNumber(int numberAnswer,
                                         TextView answerBody,
                                         RadioButton choice1,
                                         RadioButton choice2,
                                         RadioButton choice3,
                                         RadioButton choice4,
                                         RadioGroup radioGroupChoice,
                                         Context context) {

        if (numberAnswer == 1) {
            answerBody.setText("QUAL’È LA PRIMA COSA DA FARE APPENA GIUNTI SUL LUOGO DI UN INCIDENTE?");
            choice1.setText("Fermare le emorragie importanti");
            choice2.setText("Valuare la scena e fare auto protezione");
            choice3.setText("Mettere l'ossigeno");
            choice4.setText("Immobilizzare il rachide cervicale e fare l'ABCDE primario");
        }
        if (numberAnswer == 2) {
            answerBody.setText("NEL SOCCORSO AD UN PAZIENTE COLPITO DA UNA SCARICA ELETTRICA:");
            choice1.setText("Si deve verificare che la scena sia sicura");
            choice2.setText("Si può valutare immediatamente il paziente perché i guanti servono da Isolante");
            choice3.setText("Si rianima il paziente con materiali che non conducono elettricità, cannule, pallone auto espansibile");
            choice4.setText("Non si somministra O2 per motivi di sicurezza");

            //TODO: REGISTRARE LA RISPOSTA SU DB
            //checkedButton = radioGroupChoice.getCheckedRadioButtonId();


        }
        if (numberAnswer == 3) {
            answerBody.setText("Schiaccia il bottone \"Prova 3\"");
            choice1.setText("-");
            choice2.setText("-");
            choice3.setText("Prova3");
            choice4.setText("-");
        }
        if (numberAnswer == 4) {
            answerBody.setText("Schiaccia il bottone \"Prova 4\"");
            choice1.setText("-");
            choice2.setText("-");
            choice3.setText("-");
        }

    }


    public static void saveAnswerOnDB() {

    }
}
