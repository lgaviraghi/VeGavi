package com.example.gavir.appcrocerossa.Activity.TestSection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.gavir.appcrocerossa.R;

public class TestPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_test);

        Button choiceTestButton = findViewById(R.id.startTest);

        //bottone che consente di scegliere il test da effettuare
        choiceTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityChoiceIntent = new Intent(getApplicationContext(), CustomListActivity.class);
                startActivity(startActivityChoiceIntent);
//                Intent startTestIntent = new Intent(getApplicationContext(), QuestionsActivity.class);
//                startActivity(startTestIntent);
            }
        });
    }
}
