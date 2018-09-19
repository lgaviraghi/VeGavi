package com.example.gavir.appcrocerossa.SupportJavaClass;

import java.util.ArrayList;


public class TitleTest {

    //declare private data instead of public to ensure the privacy of data field of each class
    private String principalTitle;
    private String chapter;

    public TitleTest(String principalTitle, String chapter) {
        this.principalTitle = principalTitle;
        this.chapter = chapter;
    }

    public static ArrayList<TitleTest> getTest() {
        ArrayList<TitleTest> titleTests = new ArrayList<TitleTest>();
        titleTests.add(new TitleTest("SECONDO MODULO CAP.1", "TRAUMA"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.2", "EMERGENZE MEDICHE"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.3", "LE EMERGENZE OSTETRICHE GINECOLOGICHE"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.4", "EMERGENZE AMBIENALI"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.5", "IL TRATTAMENTO PRIMARIO ADULTO E PEDIATRICO"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.6", "ASPETTI PSICOLOGICI DEL SOCCORSO EXTRAOSPEDALIERO"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.7", "LE OPERAZIONI IN AMBULANZA"));
        titleTests.add(new TitleTest("SECONDO MODULO CAP.8", "LA MAXIEMERGENZA"));
        return titleTests;
    }

    //retrieve user's title
    public String getPrincipalTitle() {
        return principalTitle;
    }

    //retrieve users' chapter
    public String getChapter() {
        return chapter;
    }

}

