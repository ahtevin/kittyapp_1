package com.example.kittycam;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "register.db";
    static  final String TABLE_NAME = "register";
    static  final String COL_1 = "ID";
    static  final String COL_2 = "Username";
    static  final String COL_3 = "Mobile_number";
    static  final String COL_4 = "Email";
    static  final String COL_5 = "Password";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE"+TABLE_NAME+"(ID INTEGER KEY AUTOINCREMENT,Username TEXT,Mobile_number TEXT,Email TEXT,Password TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);

    }
}
