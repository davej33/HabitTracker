package com.example.android.habittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.android.habittracker.data.HabitContracts.HabitEntry;

/**
 * Created by dnj on 11/24/16.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "HabitTracker.db";
    public static final int DB_VERSION = 1;

    public HabitDbHelper(Context context){
        super(context, DATABASE_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_HABIT_CREATE_TABLE = "CREATE TABLE " + HabitEntry.TABLE_NAME + "("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.HABIT_NAME + " TEXT NOT NULL, "
                + HabitEntry.DAY + " INTEGER DEFAULT 0);";

        Log.e("DBHELPER", "create string: " + SQL_HABIT_CREATE_TABLE);

        db.execSQL(SQL_HABIT_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
