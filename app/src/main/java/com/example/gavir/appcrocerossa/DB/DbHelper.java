package com.example.gavir.appcrocerossa.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "DbTestAppCrocerossa.db";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_1 =
            "CREATE TABLE " + DbContract.secondoModuloCap1.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap1._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap1.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap1.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap1.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap1.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap1.ANSWER_D + " TEXT" +
                    ")";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_2 =
            "CREATE TABLE " + DbContract.secondoModuloCap2.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap2._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap2.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap2.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap2.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap2.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap2.ANSWER_D + " TEXT" +
                    ")";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_3 =
            "CREATE TABLE " + DbContract.secondoModuloCap3.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap3._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap3.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap3.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap3.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap3.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap3.ANSWER_D + " TEXT" +
                    ")";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_4 =
            "CREATE TABLE " + DbContract.secondoModuloCap4.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap4._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap4.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap4.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap4.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap4.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap4.ANSWER_D + " TEXT" +
                    ")";
    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_5 =
            "CREATE TABLE " + DbContract.secondoModuloCap5.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap5._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap5.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap5.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap5.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap5.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap5.ANSWER_D + " TEXT" +
                    ")";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_6 =
            "CREATE TABLE " + DbContract.secondoModuloCap6.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap6._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap6.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap6.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap6.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap6.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap6.ANSWER_D + " TEXT" +
                    ")";

    public static final String CREATE_TABLE_SECONDO_MODULO_CAP_8 =
            "CREATE TABLE " + DbContract.secondoModuloCap8.TABLE_NAME + " (" +
                    DbContract.secondoModuloCap8._ID + " INTEGER PRIMARY KEY," +
                    DbContract.secondoModuloCap8.COLUMN_QUESTIONS + " TEXT," +
                    DbContract.secondoModuloCap8.ANSWER_A + " TEXT," +
                    DbContract.secondoModuloCap8.ANSWER_B + " TEXT," +
                    DbContract.secondoModuloCap8.ANSWER_C + " TEXT," +
                    DbContract.secondoModuloCap8.ANSWER_D + " TEXT" +
                    ")";

    String[] stringCreationTableArray = new String[10];


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_1);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_2);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_3);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_4);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_5);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_6);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_7);
        db.execSQL(CREATE_TABLE_SECONDO_MODULO_CAP_8);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
