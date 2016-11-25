package com.example.android.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.habittracker.data.HabitContracts.HabitEntry;
import com.example.android.habittracker.data.HabitDbHelper;

public class MainActivity extends AppCompatActivity {

    private HabitDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertHabit();
        readTable();
    }

    private void readTable() {

        HabitDbHelper mDbHelper = new HabitDbHelper(this);

        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        Cursor cursor = db.query(HabitEntry.TABLE_NAME, null, null, null, null, null, null);


    }

    private void insertHabit() {
        HabitDbHelper mDbHelper = new HabitDbHelper(this);

        // create a db using HabitDbHelper instance
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // create obj to store values
        ContentValues values = new ContentValues();

        // insert row values into obj
        values.put(HabitEntry.HABIT_NAME, "Walked Dog");
        values.put(HabitEntry.DAY, 1); // Monday

        // insert row and store response in long var
        long newRow = db.insert(HabitEntry.TABLE_NAME, null, values);

    }
}
