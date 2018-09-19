package com.example.gavir.appcrocerossa.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gavir.appcrocerossa.R;
import com.example.gavir.appcrocerossa.SupportJavaClass.TitleTest;

import java.util.ArrayList;

public class CustomTitleTestAdapter extends ArrayAdapter<TitleTest> {
    public CustomTitleTestAdapter(Context context, ArrayList<TitleTest> tests) {
        super(context, 0, tests);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_test, parent, false);
        }

        // Get the data item for this position
        TitleTest typeOfTest = getItem(position);

        // Lookup view for data population
        TextView testPrincipaleTitle = convertView.findViewById(R.id.testPrincipaleTitle);
        TextView chapterAndDescription = convertView.findViewById(R.id.chapterAndDescription);
        // Populate the data into the template view using the data object
        testPrincipaleTitle.setText(typeOfTest.getPrincipalTitle());
        chapterAndDescription.setText(typeOfTest.getChapter());
        // Return the completed view to render on screen
        return convertView;
    }
}