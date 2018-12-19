package com.example.knight.databasexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class localDb extends SQLiteOpenHelper {

    private static final String DBNAME = "People";
    private static final String TBLNAME = "Names";
    private static final int VERSION_NUMBER = 1;

    public localDb(Context context){
        super(context,DBNAME,null,VERSION_NUMBER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
