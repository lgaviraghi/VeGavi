package com.example.gavir.appcrocerossa.Activity.TestSection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gavir.appcrocerossa.Adapter.CustomTitleTestAdapter;
import com.example.gavir.appcrocerossa.R;
import com.example.gavir.appcrocerossa.SupportJavaClass.TitleTest;

import java.util.ArrayList;

public class CustomListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_test);
        populateTitleTestList();
    }

    private void populateTitleTestList() {
        // Construct the data source
        ArrayList<TitleTest> arrayOfTests = TitleTest.getTest();

        // Create the adapter to convert the array to views
        CustomTitleTestAdapter adapter = new CustomTitleTestAdapter(this, arrayOfTests);
        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.TypeOftests);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                position += 1;
                prova(position);
            }
        });
    }

    public void prova(int position) {
        if (position == 1) {
            Intent secondoModCap1Intent = new Intent(getApplicationContext(), QuestionsActivity.class);
            startActivity(secondoModCap1Intent);
        }
        if (position == 2) {
            Toast.makeText(CustomListActivity.this, "TEST 2", Toast.LENGTH_SHORT).show();
        }
        if (position == 3) {
            Toast.makeText(CustomListActivity.this, "TEST 3", Toast.LENGTH_SHORT).show();
        }
        if (position == 4) {
            Toast.makeText(CustomListActivity.this, "TEST 4", Toast.LENGTH_SHORT).show();
        }
        if (position == 5) {
            Toast.makeText(CustomListActivity.this, "TEST 5", Toast.LENGTH_SHORT).show();
        }
        if (position == 6) {
            Toast.makeText(CustomListActivity.this, "TEST 6", Toast.LENGTH_SHORT).show();
        }
        if (position == 7) {
            Toast.makeText(CustomListActivity.this, "TEST 7", Toast.LENGTH_SHORT).show();
        }
        if (position == 8) {
            Toast.makeText(CustomListActivity.this, "TEST 8", Toast.LENGTH_SHORT).show();
        }
    }
}
