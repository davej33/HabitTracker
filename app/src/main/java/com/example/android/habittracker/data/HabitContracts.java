package com.example.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by dnj on 11/24/16.
 */

public final class HabitContracts {

    private HabitContracts() {
    }

    public static abstract class HabitEntry implements BaseColumns {

        public static String TABLE_NAME = "Daily_Habits";

        // columns
        public static final String _ID = BaseColumns._ID;
        public static final String HABIT_NAME = "Habit_Name";
        public static final String DAY = "Day";

        // days
        public static final String UNKNOWN = "Default"; // 0
        public static final String MONDAY = "Monday"; // 1
        public static final String TUESDAY = "Tuesday"; // 2
        public static final String WEDNESDAY = "Wednesday"; // 3
        public static final String THURSDAY = "Thursday"; // 4
        public static final String FRIDAY = "Friday"; // 5
        public static final String SATURDAY = "Saturday"; // 6
        public static final String SUNDAY = "Sunday"; // 7
    }
}
