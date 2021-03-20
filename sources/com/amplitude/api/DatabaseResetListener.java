package com.amplitude.api;

import android.database.sqlite.SQLiteDatabase;

public interface DatabaseResetListener {
    void onDatabaseReset(SQLiteDatabase sQLiteDatabase);
}
