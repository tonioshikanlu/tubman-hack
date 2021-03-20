package com.segment.analytics.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.EnvironmentCompat;
import b.e.a.a.a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Utils {
    public static final boolean DEFAULT_COLLECT_DEVICE_ID = true;
    public static final int DEFAULT_FLUSH_INTERVAL = 30000;
    public static final int DEFAULT_FLUSH_QUEUE_SIZE = 20;
    public static final String THREAD_PREFIX = "Segment-";

    public static class AnalyticsNetworkExecutorService extends ThreadPoolExecutor {
        private static final int DEFAULT_THREAD_COUNT = 1;
        private static final int MAX_THREAD_COUNT = 2;

        public AnalyticsNetworkExecutorService() {
            super(1, 2, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new AnalyticsThreadFactory());
        }
    }

    public static class AnalyticsThread extends Thread {
        private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger(1);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AnalyticsThread(java.lang.Runnable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Segment-"
                java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
                java.util.concurrent.atomic.AtomicInteger r1 = SEQUENCE_GENERATOR
                int r1 = r1.getAndIncrement()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.internal.Utils.AnalyticsThread.<init>(java.lang.Runnable):void");
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class AnalyticsThreadFactory implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new AnalyticsThread(runnable);
        }
    }

    public static class NullableConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
        public NullableConcurrentHashMap() {
        }

        public NullableConcurrentHashMap(Map<? extends K, ? extends V> map) {
            super(map);
        }

        public V put(K k2, V v) {
            if (k2 == null || v == null) {
                return null;
            }
            return super.put(k2, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry next : map.entrySet()) {
                put(next.getKey(), next.getValue());
            }
        }
    }

    private Utils() {
        throw new AssertionError("No instances");
    }

    @NonNull
    public static <T> T assertNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(a.m(str, " == null"));
    }

    @NonNull
    public static String assertNotNullOrEmpty(String str, @Nullable String str2) {
        if (!isNullOrEmpty((CharSequence) str)) {
            return str;
        }
        throw new NullPointerException(a.m(str2, " cannot be null or empty"));
    }

    @NonNull
    public static <K, V> Map<K, V> assertNotNullOrEmpty(Map<K, V> map, @Nullable String str) {
        if (!isNullOrEmpty((Map) map)) {
            return map;
        }
        throw new NullPointerException(a.m(str, " cannot be null or empty"));
    }

    public static BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float coerceToFloat(Object obj, float f) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf((String) obj).floatValue();
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    public static void copySharedPreferences(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Set) {
                edit.putStringSet(str, (Set) value);
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            }
        }
        edit.apply();
    }

    public static void createDirectory(File file) {
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Could not create directory at " + file);
        }
    }

    public static <T> Map<String, T> createMap() {
        return new NullableConcurrentHashMap();
    }

    @SuppressLint({"HardwareIds"})
    public static String getDeviceId(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!isNullOrEmpty((CharSequence) string) && !"9774d56d682e549c".equals(string) && !EnvironmentCompat.MEDIA_UNKNOWN.equals(string) && !"000000000000000".equals(string)) {
            return string;
        }
        String str = Build.SERIAL;
        if (!isNullOrEmpty((CharSequence) str)) {
            return str;
        }
        if (hasPermission(context, "android.permission.READ_PHONE_STATE") && hasFeature(context, "android.hardware.telephony")) {
            String deviceId = ((TelephonyManager) getSystemService(context, "phone")).getDeviceId();
            if (!isNullOrEmpty((CharSequence) deviceId)) {
                return deviceId;
            }
        }
        return UUID.randomUUID().toString();
    }

    private static int getIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    public static InputStream getInputStream(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public static String getResourceString(Context context, String str) {
        int identifier = getIdentifier(context, "string", str);
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public static SharedPreferences getSegmentSharedPreferences(Context context, String str) {
        return context.getSharedPreferences("analytics-android-" + str, 0);
    }

    public static <T> T getSystemService(Context context, String str) {
        return context.getSystemService(str);
    }

    private static int getTrimmedLength(@NonNull CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) <= ' ') {
            i2++;
        }
        while (length > i2 && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i2;
    }

    public static boolean hasFeature(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    @NonNull
    public static <T> List<T> immutableCopyOf(@Nullable List<T> list) {
        return isNullOrEmpty((Collection) list) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
    }

    @NonNull
    public static <K, V> Map<K, V> immutableCopyOf(@NonNull Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static boolean isConnected(Context context) {
        if (!hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(context, "connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static boolean isEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        return isEmpty(charSequence) || getTrimmedLength(charSequence) == 0;
    }

    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isNullOrEmpty(Map map) {
        return map == null || map.size() == 0;
    }

    public static <T> boolean isNullOrEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean isOnClassPath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static <T> Set<T> newSet(T... tArr) {
        HashSet hashSet = new HashSet(tArr.length);
        Collections.addAll(hashSet, tArr);
        return hashSet;
    }

    public static Date parseISO8601Date(String str) {
        return Iso8601Utils.parse(str);
    }

    public static NanoDate parseISO8601DateWithNanos(String str) {
        return Iso8601Utils.parseWithNanos(str);
    }

    public static String readFully(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    public static String readFully(InputStream inputStream) {
        return readFully(buffer(inputStream));
    }

    public static String toISO8601Date(Date date) {
        return toISO8601String(date);
    }

    public static Date toISO8601Date(String str) {
        return parseISO8601Date(str);
    }

    public static String toISO8601NanoFormattedString(Date date) {
        return Iso8601Utils.formatNanos(date);
    }

    public static String toISO8601String(Date date) {
        return Iso8601Utils.format(date);
    }

    public static JSONObject toJsonObject(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), wrap(next.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static <T> Map<String, T> transform(Map<String, T> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (map2.containsKey(str)) {
                str = map2.get(str);
                if (isNullOrEmpty((CharSequence) str)) {
                }
            }
            linkedHashMap.put(str, next.getValue());
        }
        return linkedHashMap;
    }

    private static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? toJsonObject((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) ? obj : obj instanceof String ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray.put(wrap(Array.get(jSONArray, i2)));
            }
            return jSONArray;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
