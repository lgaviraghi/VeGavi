package com.example.gavir.appcrocerossa.DB;

import android.provider.BaseColumns;

public class DbContract {

    private DbContract() {
    }

    //TABELLA RELATIVA AI TRAUMI
    public static class secondoModuloCap1 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_1";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";

    }

    //TABELLA RELATIVA ALLE EMERGENZE MEDICHE
    public static class secondoModuloCap2 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_2";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";

    }

    //TABELLA RELATIVA ALLE EMERGENZE OSTETRICHE E GINECOLOGICHE
    public static class secondoModuloCap3 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_3";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";


    }

    //TABELLA RELATIVA ALLE EMERGENZE AMBIENTALI
    public static class secondoModuloCap4 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_4";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";


    }

    //TABELLA RELATIVA AL TRATTAMENTO PRIMARIO ADULTO E PEDIATRICO
    public static class secondoModuloCap5 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_5";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";


    }

    //TABELLA RELATIVA AGLI ASPETTI PSICOLOGICI DEL SOCCORSO EXTRAOSPEDALIERO
    public static class secondoModuloCap6 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_6";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";


    }

    //TABELLA RELATIVA ALLA MAXIEMERGENZA
    public static class secondoModuloCap8 implements BaseColumns {
        public static final String TABLE_NAME = "SECONDO_MODULO_CAP_8";
        public static final String COLUMN_QUESTIONS = "DOMANDE";
        public static final String ANSWER_A = "OPZIONE_A";
        public static final String ANSWER_B = "OPZIONE_B";
        public static final String ANSWER_C = "OPZIONE_C";
        public static final String ANSWER_D = "OPZIONE_D";


    }
}

