package com.example.gavir.appcrocerossa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gavir.appcrocerossa.Activity.TestSection.TestPrincipalActivity;
import com.example.gavir.appcrocerossa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scenariButton = findViewById(R.id.scenario_button);
        Button videoButton = findViewById(R.id.video_tutorial);
        Button testButton = findViewById(R.id.test);

        scenariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent scenariIntent = new Intent(getApplicationContext(), ScenariActivity.class);
                startActivity(scenariIntent);
                */
                Toast.makeText(MainActivity.this, "Presto disponiile", Toast.LENGTH_SHORT).show();
            }
        });

        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent videoIntent = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(videoIntent);
                */
                Toast.makeText(MainActivity.this, "Presto disponiile", Toast.LENGTH_SHORT).show();
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testIntent = new Intent(getApplicationContext(), TestPrincipalActivity.class);
                startActivity(testIntent);
            }
        });

    }
}
