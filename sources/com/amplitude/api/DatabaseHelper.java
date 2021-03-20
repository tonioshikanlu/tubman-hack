package com.amplitude.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import b.e.a.a.a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String CREATE_EVENTS_TABLE = "CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";
    private static final String CREATE_IDENTIFYS_TABLE = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);";
    private static final String CREATE_LONG_STORE_TABLE = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);";
    private static final String CREATE_STORE_TABLE = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);";
    private static final String EVENT_FIELD = "event";
    public static final String EVENT_TABLE_NAME = "events";
    public static final String IDENTIFY_TABLE_NAME = "identifys";
    private static final String ID_FIELD = "id";
    private static final String KEY_FIELD = "key";
    public static final String LONG_STORE_TABLE_NAME = "long_store";
    public static final String STORE_TABLE_NAME = "store";
    private static final String TAG = "com.amplitude.api.DatabaseHelper";
    private static final String VALUE_FIELD = "value";
    public static final Map<String, DatabaseHelper> instances = new HashMap();
    private static final AmplitudeLog logger = AmplitudeLog.getLogger();
    private boolean callResetListenerOnDatabaseReset;
    private DatabaseResetListener databaseResetListener;
    public File file;
    private String instanceName;

    public DatabaseHelper(Context context) {
        this(context, (String) null);
    }

    public DatabaseHelper(Context context, String str) {
        super(context, getDatabaseName(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.callResetListenerOnDatabaseReset = true;
        this.file = context.getDatabasePath(getDatabaseName(str));
        this.instanceName = Utils.normalizeInstanceName(str);
    }

    private synchronized long addEventToTable(String str, String str2) {
        long j2;
        SQLiteException e2;
        StackOverflowError e3;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j2 = insertEventContentValuesIntoTable(writableDatabase, str, contentValues);
            if (j2 == -1) {
                try {
                    logger.w(TAG, String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e4) {
                    e2 = e4;
                } catch (StackOverflowError e5) {
                    e3 = e5;
                    try {
                        logger.e(TAG, String.format("addEvent to %s failed", new Object[]{str}), e3);
                        Diagnostics.getLogger().logError(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e3);
                        delete();
                        close();
                        return j2;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e6) {
            e2 = e6;
            j2 = -1;
            logger.e(TAG, String.format("addEvent to %s failed", new Object[]{str}), e2);
            Diagnostics.getLogger().logError(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
            delete();
            close();
            return j2;
        } catch (StackOverflowError e7) {
            e3 = e7;
            j2 = -1;
            logger.e(TAG, String.format("addEvent to %s failed", new Object[]{str}), e3);
            Diagnostics.getLogger().logError(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e3);
            delete();
            close();
            return j2;
        }
        close();
        return j2;
    }

    private static void convertIfCursorWindowException(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (Utils.isEmptyString(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00eb, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void delete() {
        /*
            r10 = this;
            java.lang.String r0 = "DB: Failed to run databaseReset callback in delete"
            java.lang.String r1 = "databaseReset callback failed during delete"
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            r3 = 0
            r4 = 1
            r5 = 0
            r10.close()     // Catch:{ SecurityException -> 0x0069 }
            java.io.File r6 = r10.file     // Catch:{ SecurityException -> 0x0069 }
            r6.delete()     // Catch:{ SecurityException -> 0x0069 }
            com.amplitude.api.DatabaseResetListener r6 = r10.databaseResetListener
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.callResetListenerOnDatabaseReset
            if (r6 == 0) goto L_0x00cd
            r10.callResetListenerOnDatabaseReset = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0035 }
            com.amplitude.api.DatabaseResetListener r6 = r10.databaseResetListener     // Catch:{ SQLiteException -> 0x0035 }
            r6.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x0035 }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
        L_0x002e:
            r10.close()
            goto L_0x00cd
        L_0x0033:
            r0 = move-exception
            goto L_0x0059
        L_0x0035:
            r6 = move-exception
            com.amplitude.api.AmplitudeLog r7 = logger     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0033 }
            r7.e(r2, r1, r6)     // Catch:{ all -> 0x0033 }
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0033 }
            r1.logError(r0, r6)     // Catch:{ all -> 0x0033 }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0059:
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x0066
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0066
            r10.close()
        L_0x0066:
            throw r0
        L_0x0067:
            r6 = move-exception
            goto L_0x00ce
        L_0x0069:
            r6 = move-exception
            com.amplitude.api.AmplitudeLog r7 = logger     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "delete failed"
            r7.e(r2, r8, r6)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.Diagnostics r6 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "DB: Failed to delete database"
            r6.logError(r7)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.DatabaseResetListener r6 = r10.databaseResetListener
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.callResetListenerOnDatabaseReset
            if (r6 == 0) goto L_0x00cd
            r10.callResetListenerOnDatabaseReset = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x009a }
            com.amplitude.api.DatabaseResetListener r6 = r10.databaseResetListener     // Catch:{ SQLiteException -> 0x009a }
            r6.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x009a }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0098:
            r0 = move-exception
            goto L_0x00bf
        L_0x009a:
            r6 = move-exception
            com.amplitude.api.AmplitudeLog r7 = logger     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0098 }
            r7.e(r2, r1, r6)     // Catch:{ all -> 0x0098 }
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0098 }
            r1.logError(r0, r6)     // Catch:{ all -> 0x0098 }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x00bf:
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x00cc
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x00cc
            r10.close()
        L_0x00cc:
            throw r0
        L_0x00cd:
            return
        L_0x00ce:
            com.amplitude.api.DatabaseResetListener r7 = r10.databaseResetListener
            if (r7 == 0) goto L_0x0123
            boolean r7 = r10.callResetListenerOnDatabaseReset
            if (r7 == 0) goto L_0x0123
            r10.callResetListenerOnDatabaseReset = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f1 }
            com.amplitude.api.DatabaseResetListener r7 = r10.databaseResetListener     // Catch:{ SQLiteException -> 0x00f1 }
            r7.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
        L_0x00eb:
            r10.close()
            goto L_0x0123
        L_0x00ef:
            r0 = move-exception
            goto L_0x0115
        L_0x00f1:
            r7 = move-exception
            com.amplitude.api.AmplitudeLog r8 = logger     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ all -> 0x00ef }
            r8.e(r2, r1, r7)     // Catch:{ all -> 0x00ef }
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00ef }
            r1.logError(r0, r7)     // Catch:{ all -> 0x00ef }
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
            goto L_0x00eb
        L_0x0115:
            r10.callResetListenerOnDatabaseReset = r4
            if (r3 == 0) goto L_0x0122
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0122
            r10.close()
        L_0x0122:
            throw r0
        L_0x0123:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.DatabaseHelper.delete():void");
    }

    @Deprecated
    public static DatabaseHelper getDatabaseHelper(Context context) {
        return getDatabaseHelper(context, (String) null);
    }

    public static synchronized DatabaseHelper getDatabaseHelper(Context context, String str) {
        DatabaseHelper databaseHelper;
        synchronized (DatabaseHelper.class) {
            String normalizeInstanceName = Utils.normalizeInstanceName(str);
            Map<String, DatabaseHelper> map = instances;
            databaseHelper = map.get(normalizeInstanceName);
            if (databaseHelper == null) {
                databaseHelper = new DatabaseHelper(context.getApplicationContext(), normalizeInstanceName);
                map.put(normalizeInstanceName, databaseHelper);
            }
        }
        return databaseHelper;
    }

    private static String getDatabaseName(String str) {
        return (Utils.isEmptyString(str) || str.equals(Constants.DEFAULT_INSTANCE)) ? "com.amplitude.api" : a.m("com.amplitude.api_", str);
    }

    private synchronized long getEventCountFromTable(String str) {
        long j2;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            SQLiteStatement compileStatement = readableDatabase.compileStatement("SELECT COUNT(*) FROM " + str);
            j2 = compileStatement.simpleQueryForLong();
            compileStatement.close();
            close();
        } catch (SQLiteException e2) {
            logger.e(TAG, String.format("getNumberRows for %s failed", new Object[]{str}), e2);
            Diagnostics.getLogger().logError(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e2);
            delete();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            close();
            j2 = 0;
            return j2;
        } catch (StackOverflowError e3) {
            try {
                logger.e(TAG, String.format("getNumberRows for %s failed", new Object[]{str}), e3);
                Diagnostics.getLogger().logError(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e3);
                delete();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                j2 = 0;
                return j2;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        return j2;
    }

    private synchronized long getNthEventIdFromTable(String str, long j2) {
        long j3;
        j3 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            sQLiteStatement = readableDatabase.compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j2 - 1));
            try {
                j3 = sQLiteStatement.simpleQueryForLong();
            } catch (SQLiteDoneException e2) {
                logger.w(TAG, (Throwable) e2);
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (SQLiteException e3) {
            logger.e(TAG, String.format("getNthEventId from %s failed", new Object[]{str}), e3);
            Diagnostics.getLogger().logError(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e3);
            delete();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e4) {
            try {
                logger.e(TAG, String.format("getNthEventId from %s failed", new Object[]{str}), e4);
                Diagnostics.getLogger().logError(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e4);
                delete();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j3;
    }

    private void handleIfCursorRowTooLargeException(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (Utils.isEmptyString(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        delete();
    }

    private synchronized void removeEventFromTable(String str, long j2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id = " + j2, (String[]) null);
        } catch (SQLiteException e2) {
            logger.e(TAG, String.format("removeEvent from %s failed", new Object[]{str}), e2);
            Diagnostics.getLogger().logError(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e2);
            delete();
        } catch (StackOverflowError e3) {
            try {
                logger.e(TAG, String.format("removeEvent from %s failed", new Object[]{str}), e3);
                Diagnostics.getLogger().logError(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e3);
                delete();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    private synchronized void removeEventsFromTable(String str, long j2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id <= " + j2, (String[]) null);
        } catch (SQLiteException e2) {
            logger.e(TAG, String.format("removeEvents from %s failed", new Object[]{str}), e2);
            Diagnostics.getLogger().logError(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e2);
            delete();
        } catch (StackOverflowError e3) {
            try {
                logger.e(TAG, String.format("removeEvents from %s failed", new Object[]{str}), e3);
                Diagnostics.getLogger().logError(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e3);
                delete();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    private void resetDatabase(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    public synchronized long addEvent(String str) {
        return addEventToTable(EVENT_TABLE_NAME, str);
    }

    public synchronized long addIdentify(String str) {
        return addEventToTable(IDENTIFY_TABLE_NAME, str);
    }

    public boolean dbFileExists() {
        return this.file.exists();
    }

    public synchronized long deleteKeyFromTable(String str, String str2) {
        long j2;
        try {
            j2 = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e2) {
            logger.e(TAG, String.format("deleteKey from %s failed", new Object[]{str}), e2);
            Diagnostics.getLogger().logError(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e2);
            delete();
            close();
            j2 = -1;
            return j2;
        } catch (StackOverflowError e3) {
            try {
                logger.e(TAG, String.format("deleteKey from %s failed", new Object[]{str}), e3);
                Diagnostics.getLogger().logError(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e3);
                delete();
                close();
                j2 = -1;
                return j2;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j2;
    }

    public synchronized long getEventCount() {
        return getEventCountFromTable(EVENT_TABLE_NAME);
    }

    public synchronized List<JSONObject> getEvents(long j2, long j3) {
        return getEventsFromTable(EVENT_TABLE_NAME, j2, j3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> getEventsFromTable(java.lang.String r19, long r20, long r22) {
        /*
            r18 = this;
            r11 = r18
            r0 = r20
            r2 = r22
            monitor-enter(r18)
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x012d }
            r12.<init>()     // Catch:{ all -> 0x012d }
            r13 = 0
            r14 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r4 = r18.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r5 = "id"
            java.lang.String r6 = "event"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0033
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r9 = "id <= "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r0 = r8.toString()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r16 = "id ASC"
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r6 = ""
            r1.append(r6)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r17 = r1
            goto L_0x0053
        L_0x0051:
            r17 = r13
        L_0x0053:
            r1 = r18
            r2 = r4
            r3 = r19
            r4 = r5
            r5 = r0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r16
            r10 = r17
            android.database.Cursor r13 = r1.queryDb(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
        L_0x0065:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            if (r0 == 0) goto L_0x0088
            long r0 = r13.getLong(r14)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r2 = r13.getString(r15)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            boolean r3 = com.amplitude.api.Utils.isEmptyString(r2)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            if (r3 == 0) goto L_0x007a
            goto L_0x0065
        L_0x007a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            java.lang.String r2 = "event_id"
            r3.put(r2, r0)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            r12.add(r3)     // Catch:{ SQLiteException -> 0x00f5, StackOverflowError -> 0x00c9, IllegalStateException -> 0x00ae, RuntimeException -> 0x0093 }
            goto L_0x0065
        L_0x0088:
            r13.close()     // Catch:{ all -> 0x012d }
        L_0x008b:
            r18.close()     // Catch:{ all -> 0x012d }
            goto L_0x0122
        L_0x0090:
            r0 = move-exception
            goto L_0x0124
        L_0x0093:
            r0 = move-exception
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r3[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0090 }
            r1.logError(r2, r0)     // Catch:{ all -> 0x0090 }
            convertIfCursorWindowException(r0)     // Catch:{ all -> 0x0090 }
            if (r13 == 0) goto L_0x008b
            r13.close()     // Catch:{ all -> 0x012d }
            goto L_0x008b
        L_0x00ae:
            r0 = move-exception
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r3[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0090 }
            r1.logError(r2, r0)     // Catch:{ all -> 0x0090 }
            r11.handleIfCursorRowTooLargeException(r0)     // Catch:{ all -> 0x0090 }
            if (r13 == 0) goto L_0x008b
            r13.close()     // Catch:{ all -> 0x012d }
            goto L_0x008b
        L_0x00c9:
            r0 = move-exception
            com.amplitude.api.AmplitudeLog r1 = logger     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r4[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0090 }
            r1.e(r2, r3, r0)     // Catch:{ all -> 0x0090 }
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r3[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0090 }
            r1.logError(r2, r0)     // Catch:{ all -> 0x0090 }
            r18.delete()     // Catch:{ all -> 0x0090 }
            if (r13 == 0) goto L_0x008b
            r13.close()     // Catch:{ all -> 0x012d }
            goto L_0x008b
        L_0x00f5:
            r0 = move-exception
            com.amplitude.api.AmplitudeLog r1 = logger     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r4[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0090 }
            r1.e(r2, r3, r0)     // Catch:{ all -> 0x0090 }
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x0090 }
            r3[r14] = r19     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0090 }
            r1.logError(r2, r0)     // Catch:{ all -> 0x0090 }
            r18.delete()     // Catch:{ all -> 0x0090 }
            if (r13 == 0) goto L_0x008b
            r13.close()     // Catch:{ all -> 0x012d }
            goto L_0x008b
        L_0x0122:
            monitor-exit(r18)
            return r12
        L_0x0124:
            if (r13 == 0) goto L_0x0129
            r13.close()     // Catch:{ all -> 0x012d }
        L_0x0129:
            r18.close()     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.DatabaseHelper.getEventsFromTable(java.lang.String, long, long):java.util.List");
    }

    public synchronized long getIdentifyCount() {
        return getEventCountFromTable(IDENTIFY_TABLE_NAME);
    }

    public synchronized List<JSONObject> getIdentifys(long j2, long j3) {
        return getEventsFromTable(IDENTIFY_TABLE_NAME, j2, j3);
    }

    public synchronized Long getLongValue(String str) {
        return (Long) getValueFromTable(LONG_STORE_TABLE_NAME, str);
    }

    public synchronized long getNthEventId(long j2) {
        return getNthEventIdFromTable(EVENT_TABLE_NAME, j2);
    }

    public synchronized long getNthIdentifyId(long j2) {
        return getNthEventIdFromTable(IDENTIFY_TABLE_NAME, j2);
    }

    public synchronized long getTotalEventCount() {
        return getEventCount() + getIdentifyCount();
    }

    public synchronized String getValue(String str) {
        return (String) getValueFromTable(STORE_TABLE_NAME, str);
    }

    /* JADX WARNING: type inference failed for: r14v16, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r14v17, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[SYNTHETIC, Splitter:B:25:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC, Splitter:B:32:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0 A[SYNTHETIC, Splitter:B:39:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd A[SYNTHETIC, Splitter:B:46:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[SYNTHETIC, Splitter:B:53:0x00e8] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0051=Splitter:B:22:0x0051, B:43:0x00b6=Splitter:B:43:0x00b6, B:36:0x0089=Splitter:B:36:0x0089, B:29:0x006d=Splitter:B:29:0x006d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object getValueFromTable(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00b4, StackOverflowError -> 0x0087, IllegalStateException -> 0x006b, RuntimeException -> 0x004f, all -> 0x004c }
            java.lang.String r3 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r6 = new java.lang.String[]{r3, r5}     // Catch:{ SQLiteException -> 0x00b4, StackOverflowError -> 0x0087, IllegalStateException -> 0x006b, RuntimeException -> 0x004f, all -> 0x004c }
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00b4, StackOverflowError -> 0x0087, IllegalStateException -> 0x006b, RuntimeException -> 0x004f, all -> 0x004c }
            r8[r1] = r15     // Catch:{ SQLiteException -> 0x00b4, StackOverflowError -> 0x0087, IllegalStateException -> 0x006b, RuntimeException -> 0x004f, all -> 0x004c }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r3 = r3.queryDb(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x00b4, StackOverflowError -> 0x0087, IllegalStateException -> 0x006b, RuntimeException -> 0x004f, all -> 0x004c }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, IllegalStateException -> 0x0046, RuntimeException -> 0x0044 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "store"
            boolean r4 = r14.equals(r4)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, IllegalStateException -> 0x0046, RuntimeException -> 0x0044 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r14 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, IllegalStateException -> 0x0046, RuntimeException -> 0x0044 }
            goto L_0x003b
        L_0x0033:
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, IllegalStateException -> 0x0046, RuntimeException -> 0x0044 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, IllegalStateException -> 0x0046, RuntimeException -> 0x0044 }
        L_0x003b:
            r0 = r14
        L_0x003c:
            r3.close()     // Catch:{ all -> 0x00ef }
        L_0x003f:
            r13.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00e2
        L_0x0044:
            r14 = move-exception
            goto L_0x0051
        L_0x0046:
            r14 = move-exception
            goto L_0x006d
        L_0x0048:
            r4 = move-exception
            goto L_0x0089
        L_0x004a:
            r4 = move-exception
            goto L_0x00b6
        L_0x004c:
            r14 = move-exception
            goto L_0x00e6
        L_0x004f:
            r14 = move-exception
            r3 = r0
        L_0x0051:
            com.amplitude.api.Diagnostics r4 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r2[r1] = r15     // Catch:{ all -> 0x00e4 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00e4 }
            r4.logError(r15, r14)     // Catch:{ all -> 0x00e4 }
            convertIfCursorWindowException(r14)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ all -> 0x00ef }
            goto L_0x003f
        L_0x006b:
            r14 = move-exception
            r3 = r0
        L_0x006d:
            com.amplitude.api.Diagnostics r4 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r2[r1] = r15     // Catch:{ all -> 0x00e4 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00e4 }
            r4.logError(r15, r14)     // Catch:{ all -> 0x00e4 }
            r13.handleIfCursorRowTooLargeException(r14)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ all -> 0x00ef }
            goto L_0x003f
        L_0x0087:
            r4 = move-exception
            r3 = r0
        L_0x0089:
            com.amplitude.api.AmplitudeLog r5 = logger     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r8[r1] = r14     // Catch:{ all -> 0x00e4 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00e4 }
            r5.e(r6, r14, r4)     // Catch:{ all -> 0x00e4 }
            com.amplitude.api.Diagnostics r14 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r2[r1] = r15     // Catch:{ all -> 0x00e4 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00e4 }
            r14.logError(r15, r4)     // Catch:{ all -> 0x00e4 }
            r13.delete()     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ all -> 0x00ef }
            goto L_0x003f
        L_0x00b4:
            r4 = move-exception
            r3 = r0
        L_0x00b6:
            com.amplitude.api.AmplitudeLog r5 = logger     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r8[r1] = r14     // Catch:{ all -> 0x00e4 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00e4 }
            r5.e(r6, r14, r4)     // Catch:{ all -> 0x00e4 }
            com.amplitude.api.Diagnostics r14 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e4 }
            r2[r1] = r15     // Catch:{ all -> 0x00e4 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00e4 }
            r14.logError(r15, r4)     // Catch:{ all -> 0x00e4 }
            r13.delete()     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ all -> 0x00ef }
            goto L_0x003f
        L_0x00e2:
            monitor-exit(r13)
            return r0
        L_0x00e4:
            r14 = move-exception
            r0 = r3
        L_0x00e6:
            if (r0 == 0) goto L_0x00eb
            r0.close()     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            r13.close()     // Catch:{ all -> 0x00ef }
            throw r14     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.DatabaseHelper.getValueFromTable(java.lang.String, java.lang.String):java.lang.Object");
    }

    public synchronized long insertEventContentValuesIntoTable(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insert(str, (String) null, contentValues);
    }

    public synchronized long insertKeyValueContentValuesIntoTable(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insertWithOnConflict(str, (String) null, contentValues, 5);
    }

    public synchronized long insertOrReplaceKeyLongValue(String str, Long l2) {
        return l2 == null ? deleteKeyFromTable(LONG_STORE_TABLE_NAME, str) : insertOrReplaceKeyValueToTable(LONG_STORE_TABLE_NAME, str, l2);
    }

    public synchronized long insertOrReplaceKeyValue(String str, String str2) {
        return str2 == null ? deleteKeyFromTable(STORE_TABLE_NAME, str) : insertOrReplaceKeyValueToTable(STORE_TABLE_NAME, str, str2);
    }

    public synchronized long insertOrReplaceKeyValueToTable(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) {
        long insertKeyValueContentValuesIntoTable;
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FIELD, str2);
        if (obj instanceof Long) {
            contentValues.put(VALUE_FIELD, (Long) obj);
        } else {
            contentValues.put(VALUE_FIELD, (String) obj);
        }
        insertKeyValueContentValuesIntoTable = insertKeyValueContentValuesIntoTable(sQLiteDatabase, str, contentValues);
        if (insertKeyValueContentValuesIntoTable == -1) {
            logger.w(TAG, "Insert failed");
        }
        return insertKeyValueContentValuesIntoTable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r2.isOpen() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r2.isOpen() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long insertOrReplaceKeyValueToTable(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004c, StackOverflowError -> 0x001a }
            long r8 = r7.insertOrReplaceKeyValueToTable(r2, r8, r9, r10)     // Catch:{ SQLiteException -> 0x004c, StackOverflowError -> 0x001a }
            if (r2 == 0) goto L_0x007d
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r10 == 0) goto L_0x007d
            r7.close()     // Catch:{ all -> 0x008b }
            goto L_0x007d
        L_0x0018:
            r8 = move-exception
            goto L_0x007f
        L_0x001a:
            r10 = move-exception
            com.amplitude.api.AmplitudeLog r3 = logger     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r6[r0] = r8     // Catch:{ all -> 0x0018 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0018 }
            r3.e(r4, r8, r10)     // Catch:{ all -> 0x0018 }
            com.amplitude.api.Diagnostics r8 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r9     // Catch:{ all -> 0x0018 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0018 }
            r8.logError(r9, r10)     // Catch:{ all -> 0x0018 }
            r7.delete()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x007b
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x007b
        L_0x0048:
            r7.close()     // Catch:{ all -> 0x008b }
            goto L_0x007b
        L_0x004c:
            r10 = move-exception
            com.amplitude.api.AmplitudeLog r3 = logger     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r6[r0] = r8     // Catch:{ all -> 0x0018 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0018 }
            r3.e(r4, r8, r10)     // Catch:{ all -> 0x0018 }
            com.amplitude.api.Diagnostics r8 = com.amplitude.api.Diagnostics.getLogger()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r9     // Catch:{ all -> 0x0018 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0018 }
            r8.logError(r9, r10)     // Catch:{ all -> 0x0018 }
            r7.delete()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x007b
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x007b
            goto L_0x0048
        L_0x007b:
            r8 = -1
        L_0x007d:
            monitor-exit(r7)
            return r8
        L_0x007f:
            if (r2 == 0) goto L_0x008a
            boolean r9 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r9 == 0) goto L_0x008a
            r7.close()     // Catch:{ all -> 0x008b }
        L_0x008a:
            throw r8     // Catch:{ all -> 0x008b }
        L_0x008b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.DatabaseHelper.insertOrReplaceKeyValueToTable(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_STORE_TABLE);
        sQLiteDatabase.execSQL(CREATE_LONG_STORE_TABLE);
        sQLiteDatabase.execSQL(CREATE_EVENTS_TABLE);
        sQLiteDatabase.execSQL(CREATE_IDENTIFYS_TABLE);
        DatabaseResetListener databaseResetListener2 = this.databaseResetListener;
        if (databaseResetListener2 != null && this.callResetListenerOnDatabaseReset) {
            try {
                this.callResetListenerOnDatabaseReset = false;
                databaseResetListener2.onDatabaseReset(sQLiteDatabase);
            } catch (SQLiteException e2) {
                logger.e(TAG, String.format("databaseReset callback failed during onCreate", new Object[0]), e2);
                Diagnostics.getLogger().logError(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e2);
            } catch (Throwable th) {
                this.callResetListenerOnDatabaseReset = true;
                throw th;
            }
            this.callResetListenerOnDatabaseReset = true;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 > i3) {
            logger.e(TAG, "onUpgrade() with invalid oldVersion and newVersion");
            resetDatabase(sQLiteDatabase);
        } else if (i3 > 1) {
            if (i2 == 1) {
                sQLiteDatabase.execSQL(CREATE_STORE_TABLE);
                if (i3 <= 2) {
                    return;
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    AmplitudeLog amplitudeLog = logger;
                    amplitudeLog.e(TAG, "onUpgrade() with unknown oldVersion " + i2);
                    resetDatabase(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL(CREATE_IDENTIFYS_TABLE);
            sQLiteDatabase.execSQL(CREATE_LONG_STORE_TABLE);
        }
    }

    public Cursor queryDb(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public synchronized void removeEvent(long j2) {
        removeEventFromTable(EVENT_TABLE_NAME, j2);
    }

    public synchronized void removeEvents(long j2) {
        removeEventsFromTable(EVENT_TABLE_NAME, j2);
    }

    public synchronized void removeIdentify(long j2) {
        removeEventFromTable(IDENTIFY_TABLE_NAME, j2);
    }

    public synchronized void removeIdentifys(long j2) {
        removeEventsFromTable(IDENTIFY_TABLE_NAME, j2);
    }

    public void setDatabaseResetListener(DatabaseResetListener databaseResetListener2) {
        this.databaseResetListener = databaseResetListener2;
    }
}
