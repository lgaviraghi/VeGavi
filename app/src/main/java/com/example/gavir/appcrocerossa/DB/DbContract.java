package com.example.gavir.appcrocerossa.DB;

import android.content.ContentValues;
import android.provider.BaseColumns;

public class DbContract {

    private DbContract() {
    }

    //TABELLA RELATIVA AI TRAUMI
    public static class dBConstantForTables implements BaseColumns {

        //costanti comuni a tutto il DB
        public static final String TITLETABLE = "TABELLA_TIOLI";
        public static final String TITLE = "TITOLO";
        public static final String SUBHEADING = "SOTTOTITOLO";



    }
}

