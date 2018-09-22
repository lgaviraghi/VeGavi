package com.example.gavir.appcrocerossa.DB;

import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.ANSWER_A;
import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.ANSWER_B;
import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.ANSWER_C;
import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.ANSWER_D;
import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.CORRECT_ANSWER;
import static com.example.gavir.appcrocerossa.DB.DbContract.dBConstantForTables.SECONDO_MODULO_CAP_1;

public class QueryConstantCreateTables {

    private QueryConstantCreateTables() {
    }

    public static class ConstantToCreateTables {
        public static final String CREATE_TABLE_SECONDO_MODULO_CAP_1 = "CREATE TABLE " + SECONDO_MODULO_CAP_1 + " (" +
                DbContract.dBConstantForTables._ID + " INTEGER PRIMARY KEY," +
                DbContract.dBConstantForTables.COLUMN_QUESTIONS + " TEXT," +
                ANSWER_A + " TEXT," +
                ANSWER_B + " TEXT," +
                ANSWER_C + " TEXT," +
                ANSWER_D + " TEXT" +
                CORRECT_ANSWER + " TEXT " +
                DbContract.dBConstantForTables.USER_ANSWER + " TEXT " +
                ")";

        //array di stringe contentne quesry per creare le tabelle
        public static final String[] CREATE_TABLE_ARRAY = new String[]{CREATE_TABLE_SECONDO_MODULO_CAP_1};
    }
}
