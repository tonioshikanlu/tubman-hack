package com.amplitude.api;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.util.Pair;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import com.segment.analytics.integrations.BasePayload;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import n.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AmplitudeClient {
    public static final String DEVICE_ID_KEY = "device_id";
    public static final String END_SESSION_EVENT = "session_end";
    public static final String LAST_EVENT_ID_KEY = "last_event_id";
    public static final String LAST_EVENT_TIME_KEY = "last_event_time";
    public static final String LAST_IDENTIFY_ID_KEY = "last_identify_id";
    public static final String OPT_OUT_KEY = "opt_out";
    public static final String PREVIOUS_SESSION_ID_KEY = "previous_session_id";
    public static final String SEQUENCE_NUMBER_KEY = "sequence_number";
    public static final String START_SESSION_EVENT = "session_start";
    public static final String TAG = "com.amplitude.api.AmplitudeClient";
    public static final String USER_ID_KEY = "user_id";
    /* access modifiers changed from: private */
    public static final AmplitudeLog logger = AmplitudeLog.getLogger();
    public String apiKey;
    public JSONObject apiPropertiesTrackingOptions;
    /* access modifiers changed from: private */
    public boolean backoffUpload;
    /* access modifiers changed from: private */
    public int backoffUploadBatchSize;
    public Context context;
    public DatabaseHelper dbHelper;
    public String deviceId;
    /* access modifiers changed from: private */
    public DeviceInfo deviceInfo;
    private int eventMaxCount;
    /* access modifiers changed from: private */
    public int eventUploadMaxBatchSize;
    private long eventUploadPeriodMillis;
    /* access modifiers changed from: private */
    public int eventUploadThreshold;
    /* access modifiers changed from: private */
    public boolean flushEventsOnClose;
    public c0 httpClient;
    public WorkerThread httpThread;
    /* access modifiers changed from: private */
    public boolean inForeground;
    public boolean initialized;
    public String instanceName;
    public Throwable lastError;
    public long lastEventId;
    public long lastEventTime;
    public long lastIdentifyId;
    public WorkerThread logThread;
    private long minTimeBetweenSessionsMillis;
    private boolean newDeviceIdPerInstall;
    private boolean offline;
    /* access modifiers changed from: private */
    public boolean optOut;
    public String platform;
    public long previousSessionId;
    public long sequenceNumber;
    public long sessionId;
    private long sessionTimeoutMillis;
    public TrackingOptions trackingOptions;
    /* access modifiers changed from: private */
    public boolean trackingSessionEvents;
    /* access modifiers changed from: private */
    public AtomicBoolean updateScheduled;
    public AtomicBoolean uploadingCurrently;
    public String url;
    private boolean useAdvertisingIdForDeviceId;
    public String userId;
    private boolean usingForegroundTracking;

    public AmplitudeClient() {
        this((String) null);
    }

    public AmplitudeClient(String str) {
        this.newDeviceIdPerInstall = false;
        this.useAdvertisingIdForDeviceId = false;
        this.initialized = false;
        this.optOut = false;
        this.offline = false;
        this.trackingOptions = new TrackingOptions();
        this.sessionId = -1;
        this.sequenceNumber = 0;
        this.lastEventId = -1;
        this.lastIdentifyId = -1;
        this.lastEventTime = -1;
        this.previousSessionId = -1;
        this.eventUploadThreshold = 30;
        this.eventUploadMaxBatchSize = 50;
        this.eventMaxCount = 1000;
        this.eventUploadPeriodMillis = Constants.EVENT_UPLOAD_PERIOD_MILLIS;
        this.minTimeBetweenSessionsMillis = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
        this.sessionTimeoutMillis = Constants.SESSION_TIMEOUT_MILLIS;
        this.backoffUpload = false;
        this.backoffUploadBatchSize = 50;
        this.usingForegroundTracking = false;
        this.trackingSessionEvents = false;
        this.inForeground = false;
        this.flushEventsOnClose = true;
        this.updateScheduled = new AtomicBoolean(false);
        this.uploadingCurrently = new AtomicBoolean(false);
        this.url = Constants.EVENT_LOG_URL;
        this.logThread = new WorkerThread("logThread");
        this.httpThread = new WorkerThread("httpThread");
        this.instanceName = Utils.normalizeInstanceName(str);
        this.logThread.start();
        this.httpThread.start();
    }

    private Set<String> getInvalidDeviceIds() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add(EnvironmentCompat.MEDIA_UNKNOWN);
        hashSet.add("000000000000000");
        hashSet.add(Constants.PLATFORM);
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    /* access modifiers changed from: private */
    public long getLongvalue(String str, long j2) {
        Long longValue = this.dbHelper.getLongValue(str);
        return longValue == null ? j2 : longValue.longValue();
    }

    private boolean inSession() {
        return this.sessionId >= 0;
    }

    /* access modifiers changed from: private */
    public String initializeDeviceId() {
        Set<String> invalidDeviceIds = getInvalidDeviceIds();
        String value = this.dbHelper.getValue(DEVICE_ID_KEY);
        String stringFromSharedPreferences = Utils.getStringFromSharedPreferences(this.context, this.instanceName, DEVICE_ID_KEY);
        if (!Utils.isEmptyString(value) && !invalidDeviceIds.contains(value)) {
            if (!value.equals(stringFromSharedPreferences)) {
                saveDeviceId(value);
            }
            return value;
        } else if (Utils.isEmptyString(stringFromSharedPreferences) || invalidDeviceIds.contains(stringFromSharedPreferences)) {
            if (!this.newDeviceIdPerInstall && this.useAdvertisingIdForDeviceId && !this.deviceInfo.isLimitAdTrackingEnabled()) {
                String advertisingId = this.deviceInfo.getAdvertisingId();
                if (!Utils.isEmptyString(advertisingId) && !invalidDeviceIds.contains(advertisingId)) {
                    saveDeviceId(advertisingId);
                    return advertisingId;
                }
            }
            String str = DeviceInfo.generateUUID() + "R";
            saveDeviceId(str);
            return str;
        } else {
            saveDeviceId(stringFromSharedPreferences);
            return stringFromSharedPreferences;
        }
    }

    private boolean isWithinMinTimeBetweenSessions(long j2) {
        return j2 - this.lastEventTime < (this.usingForegroundTracking ? this.minTimeBetweenSessionsMillis : this.sessionTimeoutMillis);
    }

    private static void migrateBooleanValue(SharedPreferences sharedPreferences, String str, boolean z, DatabaseHelper databaseHelper, String str2) {
        if (databaseHelper.getLongValue(str2) == null) {
            databaseHelper.insertOrReplaceKeyLongValue(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1 : 0));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    private static void migrateLongValue(SharedPreferences sharedPreferences, String str, long j2, DatabaseHelper databaseHelper, String str2) {
        if (databaseHelper.getLongValue(str2) == null) {
            databaseHelper.insertOrReplaceKeyLongValue(str2, Long.valueOf(sharedPreferences.getLong(str, j2)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    private static void migrateStringValue(SharedPreferences sharedPreferences, String str, String str2, DatabaseHelper databaseHelper, String str3) {
        if (Utils.isEmptyString(databaseHelper.getValue(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (!Utils.isEmptyString(string)) {
                databaseHelper.insertOrReplaceKeyValue(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    /* access modifiers changed from: private */
    public void saveDeviceId(String str) {
        this.dbHelper.insertOrReplaceKeyValue(DEVICE_ID_KEY, str);
        Utils.writeStringToSharedPreferences(this.context, this.instanceName, DEVICE_ID_KEY, str);
    }

    /* access modifiers changed from: private */
    public void sendSessionEvent(String str) {
        if (contextAndApiKeySet(String.format("sendSessionEvent('%s')", new Object[]{str})) && inSession()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                logEvent(str, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null, (JSONObject) null, this.lastEventTime, false);
            } catch (JSONException e2) {
                Diagnostics.getLogger().logError(String.format("Failed to generate API Properties JSON for session event %s", new Object[]{str}), e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setSessionId(long j2) {
        this.sessionId = j2;
        setPreviousSessionId(j2);
    }

    private void startNewSession(long j2) {
        if (this.trackingSessionEvents) {
            sendSessionEvent(END_SESSION_EVENT);
        }
        setSessionId(j2);
        refreshSessionTime(j2);
        if (this.trackingSessionEvents) {
            sendSessionEvent(START_SESSION_EVENT);
        }
    }

    public static String truncate(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    private void updateServerLater(long j2) {
        if (!this.updateScheduled.getAndSet(true)) {
            this.logThread.postDelayed(new Runnable() {
                public void run() {
                    AmplitudeClient.this.updateScheduled.set(false);
                    AmplitudeClient.this.updateServer();
                }
            }, j2);
        }
    }

    public static boolean upgradePrefs(Context context2) {
        return upgradePrefs(context2, (String) null, (String) null);
    }

    public static boolean upgradePrefs(Context context2, String str, String str2) {
        if (str == null) {
            try {
                str = Constants.class.getPackage().getName();
            } catch (Exception unused) {
                str = "com.amplitude.api";
            }
        }
        if (str2 == null) {
            str2 = "com.amplitude.api";
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            String str3 = str + "." + context2.getPackageName();
            SharedPreferences sharedPreferences = context2.getSharedPreferences(str3, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str4 = str2 + "." + context2.getPackageName();
            SharedPreferences.Editor edit = context2.getSharedPreferences(str4, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                edit.putLong(Constants.PREFKEY_PREVIOUS_SESSION_ID, sharedPreferences.getLong(str + ".previousSessionId", -1));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                edit.putString(Constants.PREFKEY_DEVICE_ID, sharedPreferences.getString(str + ".deviceId", (String) null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                edit.putString(Constants.PREFKEY_USER_ID, sharedPreferences.getString(str + ".userId", (String) null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                edit.putBoolean(Constants.PREFKEY_OPT_OUT, sharedPreferences.getBoolean(str + ".optOut", false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            logger.i(TAG, "Upgraded shared preferences from " + str3 + " to " + str4);
            return true;
        } catch (Exception e2) {
            logger.e(TAG, "Error upgrading shared preferences", e2);
            Diagnostics.getLogger().logError("Failed to upgrade shared prefs", e2);
            return false;
        }
    }

    public static boolean upgradeSharedPrefsToDB(Context context2) {
        return upgradeSharedPrefsToDB(context2, (String) null);
    }

    public static boolean upgradeSharedPrefsToDB(Context context2, String str) {
        if (str == null) {
            str = "com.amplitude.api";
        }
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper(context2);
        String value = databaseHelper.getValue(DEVICE_ID_KEY);
        Long longValue = databaseHelper.getLongValue(PREVIOUS_SESSION_ID_KEY);
        Long longValue2 = databaseHelper.getLongValue(LAST_EVENT_TIME_KEY);
        if (!Utils.isEmptyString(value) && longValue != null && longValue2 != null) {
            return true;
        }
        StringBuilder B = a.B(str, ".");
        B.append(context2.getPackageName());
        SharedPreferences sharedPreferences = context2.getSharedPreferences(B.toString(), 0);
        migrateStringValue(sharedPreferences, Constants.PREFKEY_DEVICE_ID, (String) null, databaseHelper, DEVICE_ID_KEY);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        DatabaseHelper databaseHelper2 = databaseHelper;
        migrateLongValue(sharedPreferences2, Constants.PREFKEY_LAST_EVENT_TIME, -1, databaseHelper2, LAST_EVENT_TIME_KEY);
        migrateLongValue(sharedPreferences2, Constants.PREFKEY_LAST_EVENT_ID, -1, databaseHelper2, LAST_EVENT_ID_KEY);
        migrateLongValue(sharedPreferences2, Constants.PREFKEY_LAST_IDENTIFY_ID, -1, databaseHelper2, LAST_IDENTIFY_ID_KEY);
        migrateLongValue(sharedPreferences2, Constants.PREFKEY_PREVIOUS_SESSION_ID, -1, databaseHelper2, PREVIOUS_SESSION_ID_KEY);
        migrateStringValue(sharedPreferences, Constants.PREFKEY_USER_ID, (String) null, databaseHelper, USER_ID_KEY);
        migrateBooleanValue(sharedPreferences, Constants.PREFKEY_OPT_OUT, false, databaseHelper, OPT_OUT_KEY);
        return true;
    }

    public String bytesToHexString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            int i3 = i2 * 2;
            cArr2[i3] = cArr[b2 >>> 4];
            cArr2[i3 + 1] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public void clearUserProperties() {
        identify(new Identify().clearAll());
    }

    public synchronized boolean contextAndApiKeySet(String str) {
        if (this.context == null) {
            AmplitudeLog amplitudeLog = logger;
            amplitudeLog.e(TAG, "context cannot be null, set context with initialize() before calling " + str);
            return false;
        } else if (!Utils.isEmptyString(this.apiKey)) {
            return true;
        } else {
            AmplitudeLog amplitudeLog2 = logger;
            amplitudeLog2.e(TAG, "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
            return false;
        }
    }

    public AmplitudeClient disableDiagnosticLogging() {
        Diagnostics.getLogger().disableLogging();
        return this;
    }

    public AmplitudeClient disableLocationListening() {
        runOnLogThread(new Runnable() {
            public void run() {
                if (AmplitudeClient.this.deviceInfo != null) {
                    AmplitudeClient.this.deviceInfo.setLocationListening(false);
                    return;
                }
                throw new IllegalStateException("Must initialize before acting on location listening.");
            }
        });
        return this;
    }

    public AmplitudeClient enableDiagnosticLogging() {
        if (!contextAndApiKeySet("enableDiagnosticLogging")) {
            return this;
        }
        Diagnostics.getLogger().enableLogging(this.httpClient, this.apiKey, this.deviceId);
        return this;
    }

    public AmplitudeClient enableForegroundTracking(Application application) {
        if (!this.usingForegroundTracking && contextAndApiKeySet("enableForegroundTracking()")) {
            application.registerActivityLifecycleCallbacks(new AmplitudeCallbacks(this));
        }
        return this;
    }

    public AmplitudeClient enableLocationListening() {
        runOnLogThread(new Runnable() {
            public void run() {
                if (AmplitudeClient.this.deviceInfo != null) {
                    AmplitudeClient.this.deviceInfo.setLocationListening(true);
                    return;
                }
                throw new IllegalStateException("Must initialize before acting on location listening.");
            }
        });
        return this;
    }

    public AmplitudeClient enableLogging(boolean z) {
        logger.setEnableLogging(z);
        return this;
    }

    public AmplitudeClient enableNewDeviceIdPerInstall(boolean z) {
        this.newDeviceIdPerInstall = z;
        return this;
    }

    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public long getNextSequenceNumber() {
        long j2 = this.sequenceNumber + 1;
        this.sequenceNumber = j2;
        this.dbHelper.insertOrReplaceKeyLongValue(SEQUENCE_NUMBER_KEY, Long.valueOf(j2));
        return this.sequenceNumber;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void groupIdentify(String str, Object obj, Identify identify) {
        groupIdentify(str, obj, identify, false);
    }

    public void groupIdentify(String str, Object obj, Identify identify, boolean z) {
        JSONObject jSONObject;
        String str2 = str;
        Identify identify2 = identify;
        if (identify2 == null || identify2.userPropertiesOperations.length() == 0) {
            return;
        }
        if (contextAndApiKeySet("groupIdentify()") && !Utils.isEmptyString(str)) {
            try {
                Object obj2 = obj;
                jSONObject = new JSONObject().put(str, obj);
            } catch (JSONException e2) {
                logger.e(TAG, e2.toString());
                Diagnostics.getLogger().logError(String.format("Failed to generate Group Identify JSON Object for groupType %s", new Object[]{str2}), e2);
                jSONObject = null;
            }
            logEventAsync(Constants.GROUP_IDENTIFY_EVENT, (JSONObject) null, (JSONObject) null, (JSONObject) null, jSONObject, identify2.userPropertiesOperations, getCurrentTimeMillis(), z);
        }
    }

    public void identify(Identify identify) {
        identify(identify, false);
    }

    public void identify(Identify identify, boolean z) {
        if (identify != null && identify.userPropertiesOperations.length() != 0 && contextAndApiKeySet("identify()")) {
            logEventAsync(Constants.IDENTIFY_EVENT, (JSONObject) null, (JSONObject) null, identify.userPropertiesOperations, (JSONObject) null, (JSONObject) null, getCurrentTimeMillis(), z);
        }
    }

    public AmplitudeClient initialize(Context context2, String str) {
        return initialize(context2, str, (String) null);
    }

    public AmplitudeClient initialize(Context context2, String str, String str2) {
        return initialize(context2, str, str2, (String) null, false);
    }

    public synchronized AmplitudeClient initialize(Context context2, String str, String str2, String str3, boolean z) {
        if (context2 == null) {
            logger.e(TAG, "Argument context cannot be null in initialize()");
            return this;
        } else if (Utils.isEmptyString(str)) {
            logger.e(TAG, "Argument apiKey cannot be null or blank in initialize()");
            return this;
        } else {
            Context applicationContext = context2.getApplicationContext();
            this.context = applicationContext;
            this.apiKey = str;
            this.dbHelper = DatabaseHelper.getDatabaseHelper(applicationContext, this.instanceName);
            if (Utils.isEmptyString(str3)) {
                str3 = Constants.PLATFORM;
            }
            this.platform = str3;
            final Context context3 = context2;
            final boolean z2 = z;
            final String str4 = str;
            final String str5 = str2;
            runOnLogThread(new Runnable() {
                public void run() {
                    AmplitudeClient amplitudeClient = AmplitudeClient.this;
                    if (!amplitudeClient.initialized) {
                        try {
                            if (amplitudeClient.instanceName.equals(Constants.DEFAULT_INSTANCE)) {
                                AmplitudeClient.upgradePrefs(context3);
                                AmplitudeClient.upgradeSharedPrefsToDB(context3);
                            }
                            AmplitudeClient.this.httpClient = new c0(new c0.a());
                            DeviceInfo unused = AmplitudeClient.this.deviceInfo = new DeviceInfo(context3);
                            AmplitudeClient amplitudeClient2 = AmplitudeClient.this;
                            amplitudeClient2.deviceId = amplitudeClient2.initializeDeviceId();
                            if (z2) {
                                Diagnostics logger = Diagnostics.getLogger();
                                AmplitudeClient amplitudeClient3 = AmplitudeClient.this;
                                logger.enableLogging(amplitudeClient3.httpClient, str4, amplitudeClient3.deviceId);
                            }
                            AmplitudeClient.this.deviceInfo.prefetch();
                            String str = str5;
                            if (str != null) {
                                this.userId = str;
                                AmplitudeClient.this.dbHelper.insertOrReplaceKeyValue(AmplitudeClient.USER_ID_KEY, str);
                            } else {
                                this.userId = AmplitudeClient.this.dbHelper.getValue(AmplitudeClient.USER_ID_KEY);
                            }
                            Long longValue = AmplitudeClient.this.dbHelper.getLongValue(AmplitudeClient.OPT_OUT_KEY);
                            boolean unused2 = AmplitudeClient.this.optOut = longValue != null && longValue.longValue() == 1;
                            AmplitudeClient amplitudeClient4 = AmplitudeClient.this;
                            amplitudeClient4.previousSessionId = amplitudeClient4.getLongvalue(AmplitudeClient.PREVIOUS_SESSION_ID_KEY, -1);
                            AmplitudeClient amplitudeClient5 = AmplitudeClient.this;
                            long j2 = amplitudeClient5.previousSessionId;
                            if (j2 >= 0) {
                                amplitudeClient5.sessionId = j2;
                            }
                            amplitudeClient5.sequenceNumber = amplitudeClient5.getLongvalue(AmplitudeClient.SEQUENCE_NUMBER_KEY, 0);
                            AmplitudeClient amplitudeClient6 = AmplitudeClient.this;
                            amplitudeClient6.lastEventId = amplitudeClient6.getLongvalue(AmplitudeClient.LAST_EVENT_ID_KEY, -1);
                            AmplitudeClient amplitudeClient7 = AmplitudeClient.this;
                            amplitudeClient7.lastIdentifyId = amplitudeClient7.getLongvalue(AmplitudeClient.LAST_IDENTIFY_ID_KEY, -1);
                            AmplitudeClient amplitudeClient8 = AmplitudeClient.this;
                            amplitudeClient8.lastEventTime = amplitudeClient8.getLongvalue(AmplitudeClient.LAST_EVENT_TIME_KEY, -1);
                            AmplitudeClient.this.dbHelper.setDatabaseResetListener(new DatabaseResetListener() {
                                public void onDatabaseReset(SQLiteDatabase sQLiteDatabase) {
                                    AnonymousClass1 r0 = AnonymousClass1.this;
                                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValueToTable(sQLiteDatabase, DatabaseHelper.STORE_TABLE_NAME, AmplitudeClient.DEVICE_ID_KEY, this.deviceId);
                                    AnonymousClass1 r02 = AnonymousClass1.this;
                                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValueToTable(sQLiteDatabase, DatabaseHelper.STORE_TABLE_NAME, AmplitudeClient.USER_ID_KEY, this.userId);
                                    AnonymousClass1 r03 = AnonymousClass1.this;
                                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValueToTable(sQLiteDatabase, DatabaseHelper.LONG_STORE_TABLE_NAME, AmplitudeClient.OPT_OUT_KEY, Long.valueOf(this.optOut ? 1 : 0));
                                    AnonymousClass1 r04 = AnonymousClass1.this;
                                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValueToTable(sQLiteDatabase, DatabaseHelper.LONG_STORE_TABLE_NAME, AmplitudeClient.PREVIOUS_SESSION_ID_KEY, Long.valueOf(this.sessionId));
                                    AnonymousClass1 r05 = AnonymousClass1.this;
                                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValueToTable(sQLiteDatabase, DatabaseHelper.LONG_STORE_TABLE_NAME, AmplitudeClient.LAST_EVENT_TIME_KEY, Long.valueOf(this.lastEventTime));
                                }
                            });
                            AmplitudeClient.this.initialized = true;
                        } catch (CursorWindowAllocationException e2) {
                            AmplitudeClient.logger.e(AmplitudeClient.TAG, String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e2.getMessage()}));
                            Diagnostics.getLogger().logError("Failed to initialize Amplitude SDK", e2);
                            this.apiKey = null;
                        }
                    }
                }
            });
            return this;
        }
    }

    public boolean isInForeground() {
        return this.inForeground;
    }

    public boolean isOptedOut() {
        return this.optOut;
    }

    public boolean isUsingForegroundTracking() {
        return this.usingForegroundTracking;
    }

    public long logEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z) {
        String str2;
        Location mostRecentLocation;
        String str3 = str;
        JSONObject jSONObject6 = jSONObject;
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        JSONObject jSONObject9 = jSONObject5;
        long j3 = j2;
        AmplitudeLog amplitudeLog = logger;
        amplitudeLog.d(TAG, "Logged event to Amplitude: " + str3);
        if (this.optOut) {
            return -1;
        }
        if (!(this.trackingSessionEvents && (str3.equals(START_SESSION_EVENT) || str3.equals(END_SESSION_EVENT))) && !z) {
            if (!this.inForeground) {
                startNewSessionIfNeeded(j3);
            } else {
                refreshSessionTime(j3);
            }
        }
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject10.put("event_type", replaceWithJSONNull(str));
            jSONObject10.put(BasePayload.TIMESTAMP_KEY, j3);
            jSONObject10.put(USER_ID_KEY, replaceWithJSONNull(this.userId));
            jSONObject10.put(DEVICE_ID_KEY, replaceWithJSONNull(this.deviceId));
            jSONObject10.put("session_id", z ? -1 : this.sessionId);
            jSONObject10.put("uuid", UUID.randomUUID().toString());
            jSONObject10.put(SEQUENCE_NUMBER_KEY, getNextSequenceNumber());
            if (this.trackingOptions.shouldTrackVersionName()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_VERSION_NAME, replaceWithJSONNull(this.deviceInfo.getVersionName()));
            }
            if (this.trackingOptions.shouldTrackOsName()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_OS_NAME, replaceWithJSONNull(this.deviceInfo.getOsName()));
            }
            if (this.trackingOptions.shouldTrackOsVersion()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_OS_VERSION, replaceWithJSONNull(this.deviceInfo.getOsVersion()));
            }
            if (this.trackingOptions.shouldTrackDeviceBrand()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_DEVICE_BRAND, replaceWithJSONNull(this.deviceInfo.getBrand()));
            }
            if (this.trackingOptions.shouldTrackDeviceManufacturer()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_DEVICE_MANUFACTURER, replaceWithJSONNull(this.deviceInfo.getManufacturer()));
            }
            if (this.trackingOptions.shouldTrackDeviceModel()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_DEVICE_MODEL, replaceWithJSONNull(this.deviceInfo.getModel()));
            }
            if (this.trackingOptions.shouldTrackCarrier()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_CARRIER, replaceWithJSONNull(this.deviceInfo.getCarrier()));
            }
            if (this.trackingOptions.shouldTrackCountry()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_COUNTRY, replaceWithJSONNull(this.deviceInfo.getCountry()));
            }
            if (this.trackingOptions.shouldTrackLanguage()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_LANGUAGE, replaceWithJSONNull(this.deviceInfo.getLanguage()));
            }
            if (this.trackingOptions.shouldTrackPlatform()) {
                jSONObject10.put(Constants.AMP_TRACKING_OPTION_PLATFORM, this.platform);
            }
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("name", Constants.LIBRARY);
            jSONObject11.put("version", Constants.VERSION);
            jSONObject10.put("library", jSONObject11);
            JSONObject jSONObject12 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            JSONObject jSONObject13 = this.apiPropertiesTrackingOptions;
            if (jSONObject13 != null && jSONObject13.length() > 0) {
                jSONObject12.put("tracking_options", this.apiPropertiesTrackingOptions);
            }
            if (!this.trackingOptions.shouldTrackLatLng() || (mostRecentLocation = this.deviceInfo.getMostRecentLocation()) == null) {
                Object obj = TAG;
            } else {
                JSONObject jSONObject14 = new JSONObject();
                jSONObject14.put("lat", mostRecentLocation.getLatitude());
                str2 = TAG;
                try {
                    jSONObject14.put("lng", mostRecentLocation.getLongitude());
                    jSONObject12.put("location", jSONObject14);
                } catch (JSONException e2) {
                    e = e2;
                    logger.e(str2, String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str3, e.toString()}));
                    Diagnostics.getLogger().logError(String.format("Failed to JSON serialize event type %s", new Object[]{str3}), e);
                    return -1;
                }
            }
            if (this.trackingOptions.shouldTrackAdid() && this.deviceInfo.getAdvertisingId() != null) {
                jSONObject12.put("androidADID", this.deviceInfo.getAdvertisingId());
            }
            jSONObject12.put("limit_ad_tracking", this.deviceInfo.isLimitAdTrackingEnabled());
            jSONObject12.put("gps_enabled", this.deviceInfo.isGooglePlayServicesEnabled());
            jSONObject10.put("api_properties", jSONObject12);
            jSONObject10.put("event_properties", jSONObject6 == null ? new JSONObject() : truncate(jSONObject6));
            jSONObject10.put("user_properties", jSONObject7 == null ? new JSONObject() : truncate(jSONObject7));
            jSONObject10.put("groups", jSONObject8 == null ? new JSONObject() : truncate(jSONObject8));
            jSONObject10.put("group_properties", jSONObject9 == null ? new JSONObject() : truncate(jSONObject9));
            return saveEvent(str3, jSONObject10);
        } catch (JSONException e3) {
            e = e3;
            str2 = TAG;
            logger.e(str2, String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str3, e.toString()}));
            Diagnostics.getLogger().logError(String.format("Failed to JSON serialize event type %s", new Object[]{str3}), e);
            return -1;
        }
    }

    public void logEvent(String str) {
        logEvent(str, (JSONObject) null);
    }

    public void logEvent(String str, JSONObject jSONObject) {
        logEvent(str, jSONObject, false);
    }

    public void logEvent(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        logEvent(str, jSONObject, jSONObject2, false);
    }

    public void logEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, long j2, boolean z) {
        if (validateLogEvent(str)) {
            logEventAsync(str, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, (JSONObject) null, j2, z);
        }
    }

    public void logEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        logEvent(str, jSONObject, jSONObject2, getCurrentTimeMillis(), z);
    }

    public void logEvent(String str, JSONObject jSONObject, boolean z) {
        logEvent(str, jSONObject, (JSONObject) null, z);
    }

    public void logEventAsync(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z) {
        final JSONObject cloneJSONObject = jSONObject != null ? Utils.cloneJSONObject(jSONObject) : jSONObject;
        final JSONObject cloneJSONObject2 = jSONObject2 != null ? Utils.cloneJSONObject(jSONObject2) : jSONObject2;
        final JSONObject cloneJSONObject3 = jSONObject3 != null ? Utils.cloneJSONObject(jSONObject3) : jSONObject3;
        final JSONObject cloneJSONObject4 = jSONObject4 != null ? Utils.cloneJSONObject(jSONObject4) : jSONObject4;
        final JSONObject cloneJSONObject5 = jSONObject5 != null ? Utils.cloneJSONObject(jSONObject5) : jSONObject5;
        final String str2 = str;
        final long j3 = j2;
        final boolean z2 = z;
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(AmplitudeClient.this.apiKey)) {
                    AmplitudeClient.this.logEvent(str2, cloneJSONObject, cloneJSONObject2, cloneJSONObject3, cloneJSONObject4, cloneJSONObject5, j3, z2);
                }
            }
        });
    }

    public void logEventSync(String str) {
        logEventSync(str, (JSONObject) null);
    }

    public void logEventSync(String str, JSONObject jSONObject) {
        logEventSync(str, jSONObject, false);
    }

    public void logEventSync(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        logEventSync(str, jSONObject, jSONObject2, false);
    }

    public void logEventSync(String str, JSONObject jSONObject, JSONObject jSONObject2, long j2, boolean z) {
        if (validateLogEvent(str)) {
            logEvent(str, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, (JSONObject) null, j2, z);
        }
    }

    public void logEventSync(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        logEventSync(str, jSONObject, jSONObject2, getCurrentTimeMillis(), z);
    }

    public void logEventSync(String str, JSONObject jSONObject, boolean z) {
        logEventSync(str, jSONObject, (JSONObject) null, z);
    }

    public void logRevenue(double d) {
        logRevenue((String) null, 1, d);
    }

    public void logRevenue(String str, int i2, double d) {
        logRevenue(str, i2, d, (String) null, (String) null);
    }

    public void logRevenue(String str, int i2, double d, String str2, String str3) {
        if (contextAndApiKeySet("logRevenue()")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", Constants.AMP_REVENUE_EVENT);
                String str4 = str;
                jSONObject.put("productId", str);
                int i3 = i2;
                jSONObject.put("quantity", i2);
                jSONObject.put("price", d);
                jSONObject.put("receipt", str2);
                jSONObject.put("receiptSig", str3);
            } catch (JSONException e2) {
                Diagnostics.getLogger().logError("Failed to generate API Properties JSON for revenue event", e2);
            }
            logEventAsync(Constants.AMP_REVENUE_EVENT, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null, (JSONObject) null, getCurrentTimeMillis(), false);
        }
    }

    public void logRevenueV2(Revenue revenue) {
        if (contextAndApiKeySet("logRevenueV2()") && revenue != null && revenue.isValidRevenue()) {
            logEvent(Constants.AMP_REVENUE_EVENT, revenue.toJSONObject());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void makeEventUploadPostRequest(n.c0 r10, java.lang.String r11, long r12, long r14) {
        /*
            r9 = this;
            java.lang.String r0 = "com.amplitude.api.AmplitudeClient"
            java.lang.String r1 = "2"
            java.lang.String r2 = ""
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r2)
            long r4 = r9.getCurrentTimeMillis()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r4.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            java.lang.String r5 = r9.apiKey     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r4.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r4.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r4.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            b.c.a.a r5 = new b.c.a.a     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            java.lang.String r6 = "UTF-8"
            byte[] r4 = r4.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            byte[] r4 = r5.digest(r4)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            java.lang.String r2 = r9.bytesToHexString(r4)     // Catch:{ UnsupportedEncodingException -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r4 = move-exception
            com.amplitude.api.AmplitudeLog r5 = logger
            java.lang.String r6 = r4.toString()
            r5.e(r0, r6)
            com.amplitude.api.Diagnostics r5 = com.amplitude.api.Diagnostics.getLogger()
            java.lang.String r6 = "Failed to compute checksum for upload request"
            r5.logError(r6, r4)
        L_0x0053:
            n.v$a r4 = new n.v$a
            r4.<init>()
            java.lang.String r5 = "v"
            r4.a(r5, r1)
            java.lang.String r1 = r9.apiKey
            java.lang.String r5 = "client"
            r4.a(r5, r1)
            java.lang.String r1 = "e"
            r4.a(r1, r11)
            java.lang.String r11 = "upload_time"
            r4.a(r11, r3)
            java.lang.String r11 = "checksum"
            r4.a(r11, r2)
            n.v r11 = new n.v
            java.util.List<java.lang.String> r1 = r4.a
            java.util.List<java.lang.String> r2 = r4.f10422b
            r11.<init>(r1, r2)
            r1 = 0
            n.e0$a r2 = new n.e0$a     // Catch:{ IllegalArgumentException -> 0x018c }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x018c }
            java.lang.String r3 = r9.url     // Catch:{ IllegalArgumentException -> 0x018c }
            r2.g(r3)     // Catch:{ IllegalArgumentException -> 0x018c }
            r2.e(r11)     // Catch:{ IllegalArgumentException -> 0x018c }
            n.e0 r11 = r2.b()     // Catch:{ IllegalArgumentException -> 0x018c }
            r2 = 1
            n.f r10 = r10.a(r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            n.m0.g.e r10 = (n.m0.g.e) r10
            n.h0 r10 = r10.h()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            n.j0 r11 = r10.f10106n     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = r11.z()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r3 = "success"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r3 == 0) goto L_0x00c6
            com.amplitude.api.WorkerThread r10 = r9.logThread     // Catch:{ ConnectException -> 0x00c3, UnknownHostException -> 0x00c0, IOException -> 0x00bd, AssertionError -> 0x00ba, Exception -> 0x00b7 }
            com.amplitude.api.AmplitudeClient$14 r11 = new com.amplitude.api.AmplitudeClient$14     // Catch:{ ConnectException -> 0x00c3, UnknownHostException -> 0x00c0, IOException -> 0x00bd, AssertionError -> 0x00ba, Exception -> 0x00b7 }
            r3 = r11
            r4 = r9
            r5 = r12
            r7 = r14
            r3.<init>(r5, r7)     // Catch:{ ConnectException -> 0x00c3, UnknownHostException -> 0x00c0, IOException -> 0x00bd, AssertionError -> 0x00ba, Exception -> 0x00b7 }
            r10.post(r11)     // Catch:{ ConnectException -> 0x00c3, UnknownHostException -> 0x00c0, IOException -> 0x00bd, AssertionError -> 0x00ba, Exception -> 0x00b7 }
            goto L_0x0184
        L_0x00b7:
            r10 = move-exception
            goto L_0x0161
        L_0x00ba:
            r10 = move-exception
            goto L_0x0161
        L_0x00bd:
            r10 = move-exception
            goto L_0x016b
        L_0x00c0:
            r10 = move-exception
            goto L_0x0179
        L_0x00c3:
            r10 = move-exception
            goto L_0x0179
        L_0x00c6:
            java.lang.String r3 = "invalid_api_key"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r3 == 0) goto L_0x00d7
            com.amplitude.api.AmplitudeLog r10 = logger     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = "Invalid API key, make sure your API key is correct in initialize()"
            r10.e(r0, r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            goto L_0x015b
        L_0x00d7:
            java.lang.String r3 = "bad_checksum"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r3 == 0) goto L_0x00e5
            com.amplitude.api.AmplitudeLog r10 = logger     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
            goto L_0x0158
        L_0x00e5:
            java.lang.String r3 = "request_db_write_failed"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r3 == 0) goto L_0x00f2
            com.amplitude.api.AmplitudeLog r10 = logger     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = "Couldn't write to request database on server, will attempt to reupload later"
            goto L_0x0158
        L_0x00f2:
            int r10 = r10.f10103k     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r3 = 413(0x19d, float:5.79E-43)
            if (r10 != r3) goto L_0x0140
            boolean r10 = r9.backoffUpload     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r10 == 0) goto L_0x0114
            int r10 = r9.backoffUploadBatchSize     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            if (r10 != r2) goto L_0x0114
            r10 = 0
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x010b
            com.amplitude.api.DatabaseHelper r3 = r9.dbHelper     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r3.removeEvent(r12)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
        L_0x010b:
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0114
            com.amplitude.api.DatabaseHelper r10 = r9.dbHelper     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r10.removeIdentify(r14)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
        L_0x0114:
            r9.backoffUpload = r2     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            com.amplitude.api.DatabaseHelper r10 = r9.dbHelper     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            long r10 = r10.getEventCount()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            int r10 = (int) r10     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            int r11 = r9.backoffUploadBatchSize     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            int r10 = java.lang.Math.min(r10, r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            double r10 = (double) r10     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 / r12
            double r10 = java.lang.Math.ceil(r10)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            int r10 = (int) r10     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r9.backoffUploadBatchSize = r10     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            com.amplitude.api.AmplitudeLog r10 = logger     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = "Request too large, will decrease size and attempt to reupload"
            r10.w((java.lang.String) r0, (java.lang.String) r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            com.amplitude.api.WorkerThread r10 = r9.logThread     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            com.amplitude.api.AmplitudeClient$15 r11 = new com.amplitude.api.AmplitudeClient$15     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r11.<init>()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r10.post(r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            goto L_0x015b
        L_0x0140:
            com.amplitude.api.AmplitudeLog r10 = logger     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r12.<init>()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r13 = "Upload failed, "
            r12.append(r13)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            r12.append(r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = ", will attempt to reupload later"
            r12.append(r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
            java.lang.String r11 = r12.toString()     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
        L_0x0158:
            r10.w((java.lang.String) r0, (java.lang.String) r11)     // Catch:{ ConnectException -> 0x0177, UnknownHostException -> 0x0175, IOException -> 0x0169, AssertionError -> 0x015f, Exception -> 0x015d }
        L_0x015b:
            r2 = r1
            goto L_0x0184
        L_0x015d:
            r10 = move-exception
            goto L_0x0160
        L_0x015f:
            r10 = move-exception
        L_0x0160:
            r2 = r1
        L_0x0161:
            com.amplitude.api.AmplitudeLog r11 = logger
            java.lang.String r12 = "Exception:"
            r11.e(r0, r12, r10)
            goto L_0x0179
        L_0x0169:
            r10 = move-exception
            r2 = r1
        L_0x016b:
            com.amplitude.api.AmplitudeLog r11 = logger
            java.lang.String r12 = r10.toString()
            r11.e(r0, r12)
            goto L_0x0179
        L_0x0175:
            r10 = move-exception
            goto L_0x0178
        L_0x0177:
            r10 = move-exception
        L_0x0178:
            r2 = r1
        L_0x0179:
            r9.lastError = r10
            com.amplitude.api.Diagnostics r11 = com.amplitude.api.Diagnostics.getLogger()
            java.lang.String r12 = "Failed to post upload request"
            r11.logError(r12, r10)
        L_0x0184:
            if (r2 != 0) goto L_0x018b
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.uploadingCurrently
            r10.set(r1)
        L_0x018b:
            return
        L_0x018c:
            r10 = move-exception
            com.amplitude.api.AmplitudeLog r11 = logger
            java.lang.String r12 = r10.toString()
            r11.e(r0, r12)
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.uploadingCurrently
            r11.set(r1)
            com.amplitude.api.Diagnostics r11 = com.amplitude.api.Diagnostics.getLogger()
            java.lang.String r12 = "Failed to build upload request"
            r11.logError(r12, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.AmplitudeClient.makeEventUploadPostRequest(n.c0, java.lang.String, long, long):void");
    }

    public Pair<Pair<Long, Long>, JSONArray> mergeEventsAndIdentifys(List<JSONObject> list, List<JSONObject> list2, long j2) {
        JSONArray jSONArray = new JSONArray();
        long j3 = -1;
        long j4 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j2) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                logger.w(TAG, String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j2 - ((long) jSONArray.length()))}));
                break;
            } else if (!isEmpty2 && (isEmpty || (list.get(0).has(SEQUENCE_NUMBER_KEY) && list.get(0).getLong(SEQUENCE_NUMBER_KEY) >= list2.get(0).getLong(SEQUENCE_NUMBER_KEY)))) {
                JSONObject remove = list2.remove(0);
                long j5 = remove.getLong("event_id");
                jSONArray.put(remove);
                j4 = j5;
            } else {
                JSONObject remove2 = list.remove(0);
                long j6 = remove2.getLong("event_id");
                jSONArray.put(remove2);
                j3 = j6;
            }
        }
        return new Pair<>(new Pair(Long.valueOf(j3), Long.valueOf(j4)), jSONArray);
    }

    public void onEnterForeground(final long j2) {
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(AmplitudeClient.this.apiKey)) {
                    AmplitudeClient.this.startNewSessionIfNeeded(j2);
                    boolean unused = AmplitudeClient.this.inForeground = true;
                }
            }
        });
    }

    public void onExitForeground(final long j2) {
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(AmplitudeClient.this.apiKey)) {
                    AmplitudeClient.this.refreshSessionTime(j2);
                    boolean unused = AmplitudeClient.this.inForeground = false;
                    if (AmplitudeClient.this.flushEventsOnClose) {
                        AmplitudeClient.this.updateServer();
                    }
                    AmplitudeClient amplitudeClient = AmplitudeClient.this;
                    amplitudeClient.dbHelper.insertOrReplaceKeyValue(AmplitudeClient.DEVICE_ID_KEY, amplitudeClient.deviceId);
                    AmplitudeClient amplitudeClient2 = AmplitudeClient.this;
                    amplitudeClient2.dbHelper.insertOrReplaceKeyValue(AmplitudeClient.USER_ID_KEY, amplitudeClient2.userId);
                    AmplitudeClient amplitudeClient3 = AmplitudeClient.this;
                    amplitudeClient3.dbHelper.insertOrReplaceKeyLongValue(AmplitudeClient.OPT_OUT_KEY, Long.valueOf(amplitudeClient3.optOut ? 1 : 0));
                    AmplitudeClient amplitudeClient4 = AmplitudeClient.this;
                    amplitudeClient4.dbHelper.insertOrReplaceKeyLongValue(AmplitudeClient.PREVIOUS_SESSION_ID_KEY, Long.valueOf(amplitudeClient4.sessionId));
                    AmplitudeClient amplitudeClient5 = AmplitudeClient.this;
                    amplitudeClient5.dbHelper.insertOrReplaceKeyLongValue(AmplitudeClient.LAST_EVENT_TIME_KEY, Long.valueOf(amplitudeClient5.lastEventTime));
                }
            }
        });
    }

    public void refreshSessionTime(long j2) {
        if (inSession()) {
            setLastEventTime(j2);
        }
    }

    public AmplitudeClient regenerateDeviceId() {
        if (!contextAndApiKeySet("regenerateDeviceId()")) {
            return this;
        }
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(this.apiKey)) {
                    AmplitudeClient.this.setDeviceId(DeviceInfo.generateUUID() + "R");
                }
            }
        });
        return this;
    }

    public Object replaceWithJSONNull(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    public void runOnLogThread(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        WorkerThread workerThread = this.logThread;
        if (currentThread != workerThread) {
            workerThread.post(runnable);
        } else {
            runnable.run();
        }
    }

    public long saveEvent(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (Utils.isEmptyString(jSONObject2)) {
            logger.e(TAG, String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        if (str.equals(Constants.IDENTIFY_EVENT) || str.equals(Constants.GROUP_IDENTIFY_EVENT)) {
            long addIdentify = this.dbHelper.addIdentify(jSONObject2);
            this.lastIdentifyId = addIdentify;
            setLastIdentifyId(addIdentify);
        } else {
            long addEvent = this.dbHelper.addEvent(jSONObject2);
            this.lastEventId = addEvent;
            setLastEventId(addEvent);
        }
        int min = Math.min(Math.max(1, this.eventMaxCount / 10), 20);
        if (this.dbHelper.getEventCount() > ((long) this.eventMaxCount)) {
            DatabaseHelper databaseHelper = this.dbHelper;
            databaseHelper.removeEvents(databaseHelper.getNthEventId((long) min));
        }
        if (this.dbHelper.getIdentifyCount() > ((long) this.eventMaxCount)) {
            DatabaseHelper databaseHelper2 = this.dbHelper;
            databaseHelper2.removeIdentifys(databaseHelper2.getNthIdentifyId((long) min));
        }
        long totalEventCount = this.dbHelper.getTotalEventCount();
        int i2 = this.eventUploadThreshold;
        if (totalEventCount % ((long) i2) != 0 || totalEventCount < ((long) i2)) {
            updateServerLater(this.eventUploadPeriodMillis);
        } else {
            updateServer();
        }
        return (str.equals(Constants.IDENTIFY_EVENT) || str.equals(Constants.GROUP_IDENTIFY_EVENT)) ? this.lastIdentifyId : this.lastEventId;
    }

    public AmplitudeClient setDeviceId(final String str) {
        Set<String> invalidDeviceIds = getInvalidDeviceIds();
        if (contextAndApiKeySet("setDeviceId()") && !Utils.isEmptyString(str) && !invalidDeviceIds.contains(str)) {
            runOnLogThread(new Runnable() {
                public void run() {
                    if (!Utils.isEmptyString(this.apiKey)) {
                        AmplitudeClient amplitudeClient = this;
                        String str = str;
                        amplitudeClient.deviceId = str;
                        AmplitudeClient.this.saveDeviceId(str);
                    }
                }
            });
        }
        return this;
    }

    public AmplitudeClient setDiagnosticEventMaxCount(int i2) {
        Diagnostics.getLogger().setDiagnosticEventMaxCount(i2);
        return this;
    }

    public AmplitudeClient setEventMaxCount(int i2) {
        this.eventMaxCount = i2;
        return this;
    }

    public AmplitudeClient setEventUploadMaxBatchSize(int i2) {
        this.eventUploadMaxBatchSize = i2;
        this.backoffUploadBatchSize = i2;
        return this;
    }

    public AmplitudeClient setEventUploadPeriodMillis(int i2) {
        this.eventUploadPeriodMillis = (long) i2;
        return this;
    }

    public AmplitudeClient setEventUploadThreshold(int i2) {
        this.eventUploadThreshold = i2;
        return this;
    }

    public AmplitudeClient setFlushEventsOnClose(boolean z) {
        this.flushEventsOnClose = z;
        return this;
    }

    public void setGroup(String str, Object obj) {
        JSONObject jSONObject;
        if (contextAndApiKeySet("setGroup()") && !Utils.isEmptyString(str)) {
            try {
                jSONObject = new JSONObject().put(str, obj);
            } catch (JSONException e2) {
                logger.e(TAG, e2.toString());
                Diagnostics.getLogger().logError(String.format("Failed to generate Group JSON for groupType: %s", new Object[]{str}), e2);
                jSONObject = null;
            }
            logEventAsync(Constants.IDENTIFY_EVENT, (JSONObject) null, (JSONObject) null, new Identify().setUserProperty(str, obj).userPropertiesOperations, jSONObject, (JSONObject) null, getCurrentTimeMillis(), false);
        }
    }

    public void setLastEventId(long j2) {
        this.lastEventId = j2;
        this.dbHelper.insertOrReplaceKeyLongValue(LAST_EVENT_ID_KEY, Long.valueOf(j2));
    }

    public void setLastEventTime(long j2) {
        this.lastEventTime = j2;
        this.dbHelper.insertOrReplaceKeyLongValue(LAST_EVENT_TIME_KEY, Long.valueOf(j2));
    }

    public void setLastIdentifyId(long j2) {
        this.lastIdentifyId = j2;
        this.dbHelper.insertOrReplaceKeyLongValue(LAST_IDENTIFY_ID_KEY, Long.valueOf(j2));
    }

    public AmplitudeClient setLogLevel(int i2) {
        logger.setLogLevel(i2);
        return this;
    }

    public AmplitudeClient setMinTimeBetweenSessionsMillis(long j2) {
        this.minTimeBetweenSessionsMillis = j2;
        return this;
    }

    public AmplitudeClient setOffline(boolean z) {
        this.offline = z;
        if (!z) {
            uploadEvents();
        }
        return this;
    }

    public AmplitudeClient setOptOut(final boolean z) {
        if (!contextAndApiKeySet("setOptOut()")) {
            return this;
        }
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(AmplitudeClient.this.apiKey)) {
                    boolean unused = this.optOut = z;
                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyLongValue(AmplitudeClient.OPT_OUT_KEY, Long.valueOf(z ? 1 : 0));
                }
            }
        });
        return this;
    }

    public void setPreviousSessionId(long j2) {
        this.previousSessionId = j2;
        this.dbHelper.insertOrReplaceKeyLongValue(PREVIOUS_SESSION_ID_KEY, Long.valueOf(j2));
    }

    public AmplitudeClient setServerUrl(String str) {
        if (!Utils.isEmptyString(str)) {
            this.url = str;
        }
        return this;
    }

    public AmplitudeClient setSessionTimeoutMillis(long j2) {
        this.sessionTimeoutMillis = j2;
        return this;
    }

    public AmplitudeClient setTrackingOptions(TrackingOptions trackingOptions2) {
        this.trackingOptions = trackingOptions2;
        this.apiPropertiesTrackingOptions = trackingOptions2.getApiPropertiesTrackingOptions();
        return this;
    }

    public AmplitudeClient setUserId(String str) {
        return setUserId(str, false);
    }

    public AmplitudeClient setUserId(final String str, final boolean z) {
        if (!contextAndApiKeySet("setUserId()")) {
            return this;
        }
        runOnLogThread(new Runnable() {
            public void run() {
                if (!Utils.isEmptyString(this.apiKey)) {
                    if (z && AmplitudeClient.this.trackingSessionEvents) {
                        AmplitudeClient.this.sendSessionEvent(AmplitudeClient.END_SESSION_EVENT);
                    }
                    AmplitudeClient amplitudeClient = this;
                    String str = str;
                    amplitudeClient.userId = str;
                    AmplitudeClient.this.dbHelper.insertOrReplaceKeyValue(AmplitudeClient.USER_ID_KEY, str);
                    if (z) {
                        long currentTimeMillis = AmplitudeClient.this.getCurrentTimeMillis();
                        AmplitudeClient.this.setSessionId(currentTimeMillis);
                        AmplitudeClient.this.refreshSessionTime(currentTimeMillis);
                        if (AmplitudeClient.this.trackingSessionEvents) {
                            AmplitudeClient.this.sendSessionEvent(AmplitudeClient.START_SESSION_EVENT);
                        }
                    }
                }
            }
        });
        return this;
    }

    public void setUserProperties(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0 && contextAndApiKeySet("setUserProperties")) {
            JSONObject truncate = truncate(jSONObject);
            if (truncate.length() != 0) {
                Identify identify = new Identify();
                Iterator<String> keys = truncate.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        identify.setUserProperty(next, truncate.get(next));
                    } catch (JSONException e2) {
                        logger.e(TAG, e2.toString());
                        Diagnostics.getLogger().logError(String.format("Failed to set user property %s", new Object[]{next}), e2);
                    }
                }
                identify(identify);
            }
        }
    }

    public void setUserProperties(JSONObject jSONObject, boolean z) {
        setUserProperties(jSONObject);
    }

    public boolean startNewSessionIfNeeded(long j2) {
        if (inSession()) {
            if (isWithinMinTimeBetweenSessions(j2)) {
                refreshSessionTime(j2);
                return false;
            }
            startNewSession(j2);
            return true;
        } else if (isWithinMinTimeBetweenSessions(j2)) {
            long j3 = this.previousSessionId;
            if (j3 == -1) {
                startNewSession(j2);
                return true;
            }
            setSessionId(j3);
            refreshSessionTime(j2);
            return false;
        } else {
            startNewSession(j2);
            return true;
        }
    }

    public AmplitudeClient trackSessionEvents(boolean z) {
        this.trackingSessionEvents = z;
        return this;
    }

    public JSONArray truncate(JSONArray jSONArray) {
        Object truncate;
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                truncate = truncate((String) obj);
            } else if (obj.getClass().equals(JSONObject.class)) {
                truncate = truncate((JSONObject) obj);
            } else if (obj.getClass().equals(JSONArray.class)) {
                truncate = truncate((JSONArray) obj);
            }
            jSONArray.put(i2, truncate);
        }
        return jSONArray;
    }

    public JSONObject truncate(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            logger.w(TAG, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (!next.equals(Constants.AMP_REVENUE_RECEIPT)) {
                    if (!next.equals(Constants.AMP_REVENUE_RECEIPT_SIG)) {
                        if (obj.getClass().equals(String.class)) {
                            obj = truncate((String) obj);
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            obj = truncate((JSONObject) obj);
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            obj = truncate((JSONArray) obj);
                        }
                    }
                }
                jSONObject.put(next, obj);
            } catch (JSONException e2) {
                logger.e(TAG, e2.toString());
            }
        }
        return jSONObject;
    }

    public void updateServer() {
        updateServer(false);
        Diagnostics.getLogger().flushEvents();
    }

    /* JADX WARNING: type inference failed for: r13v5, types: [com.amplitude.api.CursorWindowAllocationException, java.lang.RuntimeException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateServer(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = "Failed to update server"
            java.lang.String r1 = "com.amplitude.api.AmplitudeClient"
            boolean r2 = r12.optOut
            if (r2 != 0) goto L_0x00b7
            boolean r2 = r12.offline
            if (r2 == 0) goto L_0x000e
            goto L_0x00b7
        L_0x000e:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.uploadingCurrently
            r3 = 1
            boolean r2 = r2.getAndSet(r3)
            if (r2 != 0) goto L_0x00b7
            com.amplitude.api.DatabaseHelper r2 = r12.dbHelper
            long r4 = r2.getTotalEventCount()
            if (r13 == 0) goto L_0x0022
            int r13 = r12.backoffUploadBatchSize
            goto L_0x0024
        L_0x0022:
            int r13 = r12.eventUploadMaxBatchSize
        L_0x0024:
            long r6 = (long) r13
            long r4 = java.lang.Math.min(r6, r4)
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r2 = 0
            if (r13 > 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.uploadingCurrently
            r13.set(r2)
            return
        L_0x0036:
            com.amplitude.api.DatabaseHelper r13 = r12.dbHelper     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            long r6 = r12.lastEventId     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.util.List r13 = r13.getEvents(r6, r4)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            com.amplitude.api.DatabaseHelper r6 = r12.dbHelper     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            long r7 = r12.lastIdentifyId     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.util.List r6 = r6.getIdentifys(r7, r4)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            android.util.Pair r13 = r12.mergeEventsAndIdentifys(r13, r6, r4)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Object r4 = r13.second     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            int r4 = r4.length()     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            if (r4 != 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.uploadingCurrently     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            r13.set(r2)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            return
        L_0x005a:
            java.lang.Object r4 = r13.first     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Object r4 = r4.first     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            long r8 = r4.longValue()     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Object r4 = r13.first     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Object r4 = r4.second     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            long r10 = r4.longValue()     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.Object r13 = r13.second     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            java.lang.String r7 = r13.toString()     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            com.amplitude.api.WorkerThread r13 = r12.httpThread     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            com.amplitude.api.AmplitudeClient$13 r4 = new com.amplitude.api.AmplitudeClient$13     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            r5 = r4
            r6 = r12
            r5.<init>(r7, r8, r10)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            r13.post(r4)     // Catch:{ JSONException -> 0x00a1, CursorWindowAllocationException -> 0x0087 }
            goto L_0x00b7
        L_0x0087:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r4 = r12.uploadingCurrently
            r4.set(r2)
            com.amplitude.api.AmplitudeLog r4 = logger
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r13.getMessage()
            r3[r2] = r5
            java.lang.String r2 = "Caught Cursor window exception during event upload, deferring upload: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r4.e(r1, r2)
            goto L_0x00b0
        L_0x00a1:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.uploadingCurrently
            r3.set(r2)
            com.amplitude.api.AmplitudeLog r2 = logger
            java.lang.String r3 = r13.toString()
            r2.e(r1, r3)
        L_0x00b0:
            com.amplitude.api.Diagnostics r1 = com.amplitude.api.Diagnostics.getLogger()
            r1.logError(r0, r13)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.AmplitudeClient.updateServer(boolean):void");
    }

    public void uploadEvents() {
        if (contextAndApiKeySet("uploadEvents()")) {
            this.logThread.post(new Runnable() {
                public void run() {
                    if (!Utils.isEmptyString(AmplitudeClient.this.apiKey)) {
                        AmplitudeClient.this.updateServer();
                    }
                }
            });
        }
    }

    public AmplitudeClient useAdvertisingIdForDeviceId() {
        this.useAdvertisingIdForDeviceId = true;
        return this;
    }

    public void useForegroundTracking() {
        this.usingForegroundTracking = true;
    }

    public boolean validateLogEvent(String str) {
        if (!Utils.isEmptyString(str)) {
            return contextAndApiKeySet("logEvent()");
        }
        logger.e(TAG, "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }
}
