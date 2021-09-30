package com.example.helloworld;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SQLite extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="sqlite.bd";
    private static  final int VERSION_ID=1;
    private static final String TABLA_CURSOS="CREATE TABLE CURSOS(CODIGO TEXT PRIMARY KEY, CURSOS TEXT, CARRERA TEXT)";

    public SQLite( Context context) {
        super(context, NOMBRE_BD, null, VERSION_ID);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_CURSOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS"+TABLA_CURSOS);
        SQLiteDatabase.execSQL(TABLA_CURSOS);
    }
}
}
