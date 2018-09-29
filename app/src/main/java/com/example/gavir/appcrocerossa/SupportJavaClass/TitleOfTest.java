package com.example.gavir.appcrocerossa.SupportJavaClass;

import java.util.ArrayList;

public class TitleOfTest {


    public String titleOfTest;
    public String descriptionOfTest;

    public TitleOfTest(String titleOfTest, String descriptionOfTest) {
        this.titleOfTest = titleOfTest;
        this.descriptionOfTest = descriptionOfTest;
    }

    public String getTitleOfTest() {
        return titleOfTest;
    }

    public void setTitleOfTest(String titleOfTest) {
        this.titleOfTest = titleOfTest;
    }

    public String getDescriptionOfTest() {
        return descriptionOfTest;
    }

    public void setDescriptionOfTest(String descriptionOfTest) {
        this.descriptionOfTest = descriptionOfTest;
    }

    public static ArrayList<TitleOfTest> arrayOfTitleOfTests (){
        ArrayList<TitleOfTest> arrayOfTests = new ArrayList<TitleOfTest>();
        arrayOfTests.add(new TitleOfTest("Trauma","Capitolo 1"));
        arrayOfTests.add(new TitleOfTest("Emergenze mediche","Capitolo 2"));
        arrayOfTests.add(new TitleOfTest("Emergenze ostetirche/ginecologiche","Capitolo 3"));
        arrayOfTests.add(new TitleOfTest("Emergenze ambientali","Capitolo 4"));
        arrayOfTests.add(new TitleOfTest("Trattamento primario adulto e pediatrico","Capitolo 5"));
        arrayOfTests.add(new TitleOfTest("Aspetti psicologici del soccorso extraospedaliero","Capitolo 6"));
        arrayOfTests.add(new TitleOfTest("Operazioni in ambulanza","Capitolo 7"));
        arrayOfTests.add(new TitleOfTest("Maxiemergenza","Capitolo 8"));

        return arrayOfTests;
    }
}