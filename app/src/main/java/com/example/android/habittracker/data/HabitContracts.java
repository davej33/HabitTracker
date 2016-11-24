package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by dnj on 11/24/16.
 */

public final class HabitContracts {

    private HabitContracts() {
    }

    public static abstract class PetEntry implements BaseColumns {

        public static String TABLE_NAME = "Daily Habits";

        // columns
        public static final String _ID = BaseColumns._ID;
        public static final String HABIT_NAME = "Habit Name";
        public static final String DAY = "Day";

        // days
        public static final String MONDAY = "Monday";
        public static final String TUESDAY = "Tuesday";
        public static final String WEDNESDAY = "Wednesday";
        public static final String THURSDAY = "Thursday";
        public static final String FRIDAY = "Friday";
        public static final String SATURDAY = "Saturday";
        public static final String SUNDAY = "Sunday";
    }
}
