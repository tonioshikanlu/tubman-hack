package b.l.f.x.a;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import b.e.a.a.a;
import b.g.a.h.n;
import b.i.a.f;
import b.m.a.t.i;
import b.o.b3;
import b.o.d0;
import b.o.e0;
import b.o.e3;
import b.o.f2;
import b.o.f3;
import b.o.g0;
import b.o.g3;
import b.o.h;
import b.o.h0;
import b.o.h3;
import b.o.i0;
import b.o.i1;
import b.o.i2;
import b.o.k3;
import b.o.l3;
import b.o.n1;
import b.o.q;
import b.o.r;
import b.o.t;
import b.o.v1;
import b.o.w1;
import b.o.x1;
import b.o.x2;
import b.o.y1;
import b.o.y2;
import b.o.z2;
import b.p.a.z.b;
import b.p.b.o;
import com.onesignal.JobIntentService;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    @RawRes
    public static int A(@NonNull Resources resources, @NonNull Uri uri) {
        int i2;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str = pathSegments.get(0);
            h(str);
            i2 = resources.getIdentifier(pathSegments.get(1), str, uri.getAuthority());
        } else if (pathSegments.size() == 1) {
            try {
                int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
                if (intValue != 0) {
                    h(resources.getResourceTypeName(intValue));
                }
                i2 = intValue;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(a.k("Unrecognized Uri format: ", uri), e2);
            }
        } else {
            throw new IllegalArgumentException(a.k("Unrecognized Uri format: ", uri));
        }
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(a.k("Failed to obtain resource id for: ", uri));
    }

    public static Class<?> B(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(B(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return B(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        if (r3 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int C(@androidx.annotation.NonNull java.io.FileDescriptor r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch:{ all -> 0x0023 }
            long r1 = r3.size()     // Catch:{ all -> 0x0015 }
            int r1 = (int) r1
            r3.close()     // Catch:{ all -> 0x0023 }
            r0.close()
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            if (r3 == 0) goto L_0x0022
            r3.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch:{ all -> 0x0023 }
        L_0x0022:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.x.a.g.C(java.io.FileDescriptor):int");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer D(b.o.y2 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            java.lang.String r4 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            r1 = 0
            r5[r1] = r12
            r9 = 0
            java.lang.String r2 = "notification"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x004c }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            b.o.z2 r1 = (b.o.z2) r1
            android.database.Cursor r11 = r1.S(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x002e
            r11.close()     // Catch:{ all -> 0x0047 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002d
            r11.close()
        L_0x002d:
            return r9
        L_0x002e:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0047 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0047 }
            r11.close()     // Catch:{ all -> 0x0047 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x0071
            r11.close()
            goto L_0x0071
        L_0x0047:
            r0 = move-exception
            r10 = r9
            r9 = r11
            r11 = r10
            goto L_0x004f
        L_0x004c:
            r11 = move-exception
            r0 = r11
            r11 = r9
        L_0x004f:
            b.o.i2$k r1 = b.o.i2.k.ERROR     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r2.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "Error getting android notification id for summary notification group: "
            r2.append(r3)     // Catch:{ all -> 0x0072 }
            r2.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0072 }
            b.o.i2.a(r1, r12, r0)     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x0070
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x0070
            r9.close()
        L_0x0070:
            r9 = r11
        L_0x0071:
            return r9
        L_0x0072:
            r11 = move-exception
            if (r9 == 0) goto L_0x007e
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x007e
            r9.close()
        L_0x007e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.x.a.g.D(b.o.y2, java.lang.String):java.lang.Integer");
    }

    public static Type E(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return b.h(type, cls, b.d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.i.a.f F(@androidx.annotation.NonNull java.io.File r2) {
        /*
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x002a
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            b.i.a.i r2 = new b.i.a.i     // Catch:{ all -> 0x001e }
            r2.<init>()     // Catch:{ all -> 0x001e }
            r1 = 1
            b.i.a.f r2 = r2.h(r0, r1)     // Catch:{ all -> 0x001e }
            r0.close()
            return r2
        L_0x001e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0029:
            throw r1
        L_0x002a:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "File: '"
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = "' not exists"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.x.a.g.F(java.io.File):b.i.a.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.i.a.f G(@androidx.annotation.NonNull java.io.FileDescriptor r2) {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            b.i.a.i r2 = new b.i.a.i     // Catch:{ all -> 0x0018 }
            r2.<init>()     // Catch:{ all -> 0x0018 }
            r1 = 1
            b.i.a.f r2 = r2.h(r0, r1)     // Catch:{ all -> 0x0018 }
            r0.close()
            return r2
        L_0x0018:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0023:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.x.a.g.G(java.io.FileDescriptor):b.i.a.f");
    }

    public static void H(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String p0 = p0(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String p02 = jSONArray2 == null ? null : p0(jSONArray2);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String str2 = (String) jSONArray.get(i2);
            if (jSONArray2 == null || !p02.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String string = jSONArray2.getString(i3);
                if (!p0.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }

    public static void I(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    @Nullable
    public static String J(JSONObject jSONObject) {
        try {
            JSONObject t = t(jSONObject);
            if (!t.has("a")) {
                return null;
            }
            JSONObject optJSONObject = t.optJSONObject("a");
            if (optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
        if (r6.isClosed() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if (r6.isClosed() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r6.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor K(android.content.Context r21, b.o.y2 r22, java.lang.String r23, boolean r24) {
        /*
            r0 = r21
            r1 = r23
            java.lang.String r2 = "android_notification_id"
            java.lang.String r3 = "created_time"
            java.lang.String[] r6 = new java.lang.String[]{r2, r3}
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]
            r12 = 0
            r8[r12] = r1
            r13 = r22
            b.o.z2 r13 = (b.o.z2) r13
            java.lang.String r5 = "notification"
            java.lang.String r7 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "_id DESC"
            r4 = r13
            android.database.Cursor r4 = r4.S(r5, r6, r7, r8, r9, r10, r11)
            int r5 = r4.getCount()
            r6 = 0
            if (r5 != 0) goto L_0x006b
            r4.close()
            java.lang.Integer r1 = D(r13, r1)
            if (r1 != 0) goto L_0x0034
            return r4
        L_0x0034:
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r5 = r1.intValue()
            r0.cancel(r5)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            if (r24 == 0) goto L_0x004d
            java.lang.String r5 = "dismissed"
            goto L_0x004f
        L_0x004d:
            java.lang.String r5 = "opened"
        L_0x004f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "android_notification_id = "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r13.k0(r3, r0, r1, r6)
            return r4
        L_0x006b:
            if (r5 != r2) goto L_0x00bc
            r4.close()
            java.lang.Integer r3 = D(r13, r1)
            if (r3 != 0) goto L_0x0077
            return r4
        L_0x0077:
            b.o.z2 r13 = b.o.z2.e(r21)
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r12] = r1
            java.lang.String r14 = "notification"
            java.lang.String[] r15 = b.o.n0.a     // Catch:{ all -> 0x009b }
            java.lang.String r16 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r2
            android.database.Cursor r6 = r13.S(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x009b }
            b.o.n0.c(r0, r6, r12)     // Catch:{ all -> 0x009b }
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00ae
            goto L_0x00ab
        L_0x009b:
            r0 = move-exception
            b.o.i2$k r1 = b.o.i2.k.ERROR     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Error restoring notification records! "
            b.o.i2.a(r1, r2, r0)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x00ae
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00ae
        L_0x00ab:
            r6.close()
        L_0x00ae:
            return r4
        L_0x00af:
            r0 = move-exception
            if (r6 == 0) goto L_0x00bb
            boolean r1 = r6.isClosed()
            if (r1 != 0) goto L_0x00bb
            r6.close()
        L_0x00bb:
            throw r0
        L_0x00bc:
            r4.moveToFirst()     // Catch:{ JSONException -> 0x00f2 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ JSONException -> 0x00f2 }
            long r7 = r4.getLong(r3)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x00f2 }
            r4.close()     // Catch:{ JSONException -> 0x00f2 }
            java.lang.Integer r5 = D(r13, r1)     // Catch:{ JSONException -> 0x00f2 }
            if (r5 != 0) goto L_0x00d5
            return r4
        L_0x00d5:
            b.o.h0 r5 = new b.o.h0     // Catch:{ JSONException -> 0x00f2 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00f2 }
            r5.c = r2     // Catch:{ JSONException -> 0x00f2 }
            r5.f = r3     // Catch:{ JSONException -> 0x00f2 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r2 = "grp"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f2 }
            r5.f6106b = r0     // Catch:{ JSONException -> 0x00f2 }
            android.content.Context r0 = r5.a     // Catch:{ JSONException -> 0x00f2 }
            b.o.r.s(r0)     // Catch:{ JSONException -> 0x00f2 }
            b.o.r.f(r5, r6)     // Catch:{ JSONException -> 0x00f2 }
        L_0x00f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.x.a.g.K(android.content.Context, b.o.y2, java.lang.String, boolean):android.database.Cursor");
    }

    public static boolean L(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    public static boolean M(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean N(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean O(char c) {
        if (S(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean P(@Nullable Bundle bundle) {
        String str = null;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", (String) null);
            if (string != null) {
                str = x(string);
            } else {
                i2.a(i2.k.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", (Throwable) null);
            }
        }
        return str != null;
    }

    public static boolean Q(byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean R(byte[][] bArr, int i2, int i3, int i4) {
        int min = Math.min(i4, bArr.length);
        for (int max = Math.max(i3, 0); max < min; max++) {
            if (bArr[max][i2] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean S(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    public static int T(CharSequence charSequence, int i2, int i3) {
        int i4;
        CharSequence charSequence2 = charSequence;
        int i5 = i2;
        if (i5 >= charSequence.length()) {
            return i3;
        }
        float[] fArr = new float[6];
        if (i3 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i3] = 0.0f;
        }
        int i6 = 0;
        while (true) {
            int i7 = i5 + i6;
            if (i7 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int o2 = o(fArr, iArr, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr);
                int i8 = 0;
                for (int i9 = 0; i9 < 6; i9++) {
                    i8 += bArr[i9];
                }
                if (iArr[0] == o2) {
                    return 0;
                }
                if (i8 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i8 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i8 != 1 || bArr[2] <= 0) {
                    return (i8 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i7);
            i6++;
            if (M(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (N(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (N(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (N(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (O(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (N(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                i4 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i4 = 4;
                if (N(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i6 >= i4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                o(fArr, iArr2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr2);
                int i10 = 0;
                for (int i11 = 0; i11 < 6; i11++) {
                    i10 += bArr2[i11];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i10 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i10 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i10 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i12 = i5 + i6 + 1;
                        while (i12 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i12);
                            if (!S(charAt2)) {
                                if (!O(charAt2)) {
                                    break;
                                }
                                i12++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
        return 5;
    }

    public static void U(String str, String str2, JSONObject jSONObject, l3 l3Var, int i2, String str3) {
        String str4 = str2;
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new k3(a.n("Method: ", str2, " was called from the Main Thread!"));
        } else if (str4 == null || !i2.G((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new h3(threadArr, str, str2, jSONObject, l3Var, i2, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long) (i2 + 5000));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static ParameterizedType V(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new b.C0114b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static Object W(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.class) ? Long.valueOf((long) ((Integer) obj).intValue()) : cls.equals(Float.class) ? Double.valueOf((double) ((Float) obj).floatValue()) : obj;
    }

    public static boolean X(String str, boolean z) {
        Class<CustomTabsServiceConnection> cls = CustomTabsServiceConnection.class;
        if (1 == 0) {
            return false;
        }
        return CustomTabsClient.bindCustomTabsService(i2.c, "com.android.chrome", new x2(str, z));
    }

    public static int Y(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static boolean Z(String str) {
        return f0(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }

    public static n1 a(JSONObject jSONObject) {
        i2.k kVar = i2.k.ERROR;
        n1 n1Var = new n1();
        try {
            JSONObject t = t(jSONObject);
            n1Var.a = t.optString(i.f5973b);
            n1Var.c = t.optString("ti");
            n1Var.f6209b = t.optString("tn");
            jSONObject.toString();
            n1Var.f6210e = t.optJSONObject("a");
            t.optString("u", (String) null);
            jSONObject.optString("alert", (String) null);
            n1Var.d = jSONObject.optString("title", (String) null);
            jSONObject.optString("sicon", (String) null);
            jSONObject.optString("bicon", (String) null);
            jSONObject.optString("licon", (String) null);
            jSONObject.optString("sound", (String) null);
            jSONObject.optString("grp", (String) null);
            jSONObject.optString("grp_msg", (String) null);
            jSONObject.optString("bgac", (String) null);
            jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                Integer.parseInt(optString);
            }
            jSONObject.optString("from", (String) null);
            jSONObject.optInt("pri", 0);
            boolean equals = "do_not_collapse".equals(jSONObject.optString("collapse_key", (String) null));
            try {
                i0(n1Var);
            } catch (Throwable th) {
                i2.a(kVar, "Error assigning OSNotificationPayload.actionButtons values!", th);
            }
            try {
                j0(n1Var, jSONObject);
            } catch (Throwable th2) {
                i2.a(kVar, "Error assigning OSNotificationPayload.backgroundImageLayout values!", th2);
            }
        } catch (JSONException e2) {
            i2.a(kVar, "Error assigning OSNotificationPayload values!", e2);
        }
        return n1Var;
    }

    public static void a0(String str, JSONObject jSONObject, l3 l3Var) {
        new Thread(new f3(str, jSONObject, l3Var), "OS_REST_ASYNC_POST").start();
    }

    public static void b(Context context, h hVar, g0.a aVar) {
        i2.E(context);
        try {
            String f = hVar.f("json_payload");
            g0.a aVar2 = null;
            if (f == null) {
                i2.k kVar = i2.k.ERROR;
                i2.a(kVar, "json_payload key is nonexistent from mBundle passed to ProcessFromGCMIntentService: " + hVar, (Throwable) null);
                return;
            }
            h0 h0Var = new h0(context);
            boolean z = false;
            h0Var.c = hVar.b("restoring", false);
            h0Var.f = hVar.e(BasePayload.TIMESTAMP_KEY);
            JSONObject jSONObject = new JSONObject(f);
            h0Var.f6106b = jSONObject;
            if (J(jSONObject) != null) {
                z = true;
            }
            h0Var.d = z;
            if (h0Var.c || z || !i2.x(context, h0Var.f6106b)) {
                if (hVar.g("android_notif_id")) {
                    aVar2 = new g0.a();
                    aVar2.a = hVar.d("android_notif_id");
                }
                h0Var.f6108g = aVar2;
                c(h0Var);
                if (h0Var.c) {
                    f2.v(100);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void b0(String str, JSONObject jSONObject, l3 l3Var) {
        U(str, "POST", jSONObject, l3Var, 120000, (String) null);
    }

    public static int c(h0 h0Var) {
        Notification notification;
        Integer valueOf;
        g0.a aVar;
        h0 h0Var2 = h0Var;
        i2.g gVar = i2.H;
        h0Var2.f6107e = (gVar != null && gVar.f6140e == i2.n.InAppAlert) && i2.v();
        if (!h0Var2.c && h0Var2.f6106b.has("collapse_key") && !"do_not_collapse".equals(h0Var2.f6106b.optString("collapse_key"))) {
            Cursor S = z2.e(h0Var2.a).S("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{h0Var2.f6106b.optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (S.moveToFirst() && (valueOf = Integer.valueOf(S.getInt(S.getColumnIndex("android_notification_id")))) != null && ((aVar = h0Var2.f6108g) == null || aVar.a == null)) {
                if (aVar == null) {
                    h0Var2.f6108g = new g0.a();
                }
                h0Var2.f6108g.a = valueOf;
            }
            S.close();
        }
        if (k0(h0Var2.f6106b.optString("alert"))) {
            r.s(h0Var2.a);
            Activity k2 = i2.k();
            if (h0Var2.c || !h0Var2.f6107e || k2 == null) {
                int intValue = h0Var.a().intValue();
                JSONObject jSONObject = h0Var2.f6106b;
                String optString = jSONObject.optString("grp", (String) null);
                new ArrayList();
                Context context = r.a;
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : s(context)) {
                    Notification notification2 = statusBarNotification.getNotification();
                    boolean c = i0.c(statusBarNotification);
                    boolean z = notification2.getGroup() == null || notification2.getGroup().equals("os_group_undefined");
                    if (!c && z) {
                        arrayList.add(statusBarNotification);
                    }
                }
                if (optString == null && arrayList.size() >= 3) {
                    Context context2 = r.a;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                        NotificationManagerCompat.from(context2).notify(statusBarNotification2.getId(), Notification.Builder.recoverBuilder(context2, statusBarNotification2.getNotification()).setGroup("os_group_undefined").build());
                    }
                    optString = "os_group_undefined";
                }
                r.a g2 = r.g(h0Var);
                NotificationCompat.Builder builder = g2.a;
                r.c(jSONObject, builder, intValue, (String) null);
                try {
                    r.a(jSONObject, builder);
                } catch (Throwable th) {
                    i2.a(i2.k.ERROR, "Could not set background notification image!", th);
                }
                if (h0Var2.c) {
                    r.q(builder);
                }
                int i2 = optString != null ? 2 : 1;
                Context context3 = r.a;
                String str = i0.a;
                try {
                    i0.b(context3, i2);
                } catch (Throwable unused) {
                    i0.a(context3, i2);
                }
                if (optString != null) {
                    SecureRandom secureRandom = new SecureRandom();
                    builder.setContentIntent(r.l(secureRandom.nextInt(), r.n(intValue).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", optString)));
                    builder.setDeleteIntent(r.l(secureRandom.nextInt(), r.m(intValue).putExtra("grp", optString)));
                    builder.setGroup(optString);
                    try {
                        builder.setGroupAlertBehavior(1);
                    } catch (Throwable unused2) {
                    }
                    notification = builder.build();
                    if (optString.equals("os_group_undefined")) {
                        int size = arrayList.size() + 1;
                        JSONObject jSONObject2 = h0Var2.f6106b;
                        SecureRandom secureRandom2 = new SecureRandom();
                        String str2 = size + " new messages";
                        PendingIntent l2 = r.l(secureRandom2.nextInt(), r.e(-718463522, jSONObject2, "os_group_undefined"));
                        PendingIntent l3 = r.l(secureRandom2.nextInt(), r.m(0).putExtra("summary", "os_group_undefined"));
                        NotificationCompat.Builder builder2 = r.g(h0Var).a;
                        builder2.setContentIntent(l2).setDeleteIntent(l3).setContentTitle(r.a.getPackageManager().getApplicationLabel(r.a.getApplicationInfo())).setContentText(str2).setNumber(size).setSmallIcon(r.j()).setLargeIcon(r.r(r.i("ic_onesignal_large_icon_default"))).setOnlyAlertOnce(true).setAutoCancel(false).setGroup("os_group_undefined").setGroupSummary(true);
                        try {
                            builder2.setGroupAlertBehavior(1);
                        } catch (Throwable unused3) {
                        }
                        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                        inboxStyle.setBigContentTitle(str2);
                        builder2.setStyle(inboxStyle);
                        NotificationManagerCompat.from(r.a).notify(-718463522, builder2.build());
                    } else {
                        r.f(h0Var2, g2);
                    }
                } else {
                    SecureRandom secureRandom3 = new SecureRandom();
                    builder.setContentIntent(r.l(secureRandom3.nextInt(), r.n(intValue).putExtra("onesignalData", jSONObject.toString())));
                    builder.setDeleteIntent(r.l(secureRandom3.nextInt(), r.m(intValue)));
                    notification = builder.build();
                }
                r.d(g2, notification);
                NotificationManagerCompat.from(r.a).notify(intValue, notification);
            } else {
                k2.runOnUiThread(new q(k2, h0Var2.f6106b, h0Var.a().intValue()));
            }
        }
        if (!h0Var2.c && !h0Var2.d) {
            d0(h0Var2, false);
            try {
                JSONObject jSONObject3 = new JSONObject(h0Var2.f6106b.toString());
                jSONObject3.put("androidNotificationId", h0Var.a());
                i2.t(new JSONArray().put(jSONObject3), true, h0Var2.f6107e);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return h0Var.a().intValue();
    }

    @NonNull
    public static e0 c0(Context context, Bundle bundle) {
        boolean z;
        String str;
        Context context2 = context;
        Bundle bundle2 = bundle;
        e0 e0Var = new e0();
        if (!P(bundle)) {
            return e0Var;
        }
        e0Var.a = true;
        if (bundle2.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle2.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle2.getString("o"));
                bundle2.remove("o");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String string = jSONObject3.getString(n.f437k);
                    jSONObject3.remove(n.f437k);
                    if (jSONObject3.has(i.f5973b)) {
                        String string2 = jSONObject3.getString(i.f5973b);
                        jSONObject3.remove(i.f5973b);
                        str = string2;
                    } else {
                        str = string;
                    }
                    jSONObject3.put(AnalyticsContext.Device.DEVICE_ID_KEY, str);
                    jSONObject3.put(NotificationCompat.MessagingStyle.Message.KEY_TEXT, string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle2.putString("custom", jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        JSONObject f = f(bundle);
        String J = J(f);
        if (J != null) {
            if (i2.v()) {
                e0Var.d = true;
                i2.p().i(J);
            }
            return e0Var;
        }
        Intent f2 = g0.f(context);
        if (f2 == null) {
            z = false;
        } else {
            f2.putExtra("json_payload", f(bundle).toString());
            f2.putExtra(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis() / 1000);
            JobIntentService.a(context2, f2.getComponent(), 2071862121, f2, Integer.parseInt(bundle2.getString("pri", "0")) > 9);
            e0Var.f6082b = true;
            z = true;
        }
        if (z) {
            return e0Var;
        }
        boolean x = i2.x(context2, f);
        e0Var.c = x;
        if (!x && !k0(bundle2.getString("alert"))) {
            h0 h0Var = new h0(context2);
            h0Var.f6106b = f(bundle);
            g0.a aVar = new g0.a();
            h0Var.f6108g = aVar;
            aVar.a = -1;
            d0(h0Var, true);
            new Thread(new d0(bundle2), "OS_PROC_BUNDLE").start();
        }
        return e0Var;
    }

    public static int d(b.l.f.e0.e.b bVar, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = bVar.c;
        } else {
            i2 = bVar.f5744b;
        }
        if (z) {
            i3 = bVar.f5744b;
        } else {
            i3 = bVar.c;
        }
        byte[][] bArr = bVar.a;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                byte b3 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b3 == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += (i6 - 5) + 3;
                    }
                    i6 = 1;
                    b2 = b3;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 5) + 3 + i4;
            }
        }
        return i4;
    }

    public static void d0(h0 h0Var, boolean z) {
        w1 w1Var;
        Context context = h0Var.a;
        JSONObject jSONObject = h0Var.f6106b;
        try {
            JSONObject t = t(jSONObject);
            z2 e2 = z2.e(h0Var.a);
            if (h0Var.b() != -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                e2.k0("notification", contentValues, "android_notification_id = " + h0Var.b(), (String[]) null);
                b.o.g.b(e2, context);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", t.optString(i.f5973b));
            if (jSONObject.has("grp")) {
                contentValues2.put("group_id", jSONObject.optString("grp"));
            }
            if (jSONObject.has("collapse_key") && !"do_not_collapse".equals(jSONObject.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObject.optString("collapse_key"));
            }
            contentValues2.put("opened", Integer.valueOf(z ? 1 : 0));
            if (!z) {
                contentValues2.put("android_notification_id", Integer.valueOf(h0Var.b()));
            }
            if (h0Var.d() != null) {
                contentValues2.put("title", ((String) h0Var.d()).toString());
            }
            if (h0Var.c() != null) {
                contentValues2.put("message", ((String) h0Var.c()).toString());
            }
            contentValues2.put("expire_time", Long.valueOf((jSONObject.optLong("google.sent_time", SystemClock.currentThreadTimeMillis()) / 1000) + ((long) jSONObject.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", jSONObject.toString());
            e2.N("notification", (String) null, contentValues2);
            if (!z) {
                b.o.g.b(e2, context);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        if (h0Var.b() != -1) {
            String w = w(h0Var.f6106b);
            y1 y1Var = i2.v;
            ((i1) y1Var.c).a(a.m("OneSignal SessionManager onNotificationReceived notificationId: ", w));
            if (w != null && !w.isEmpty()) {
                y1Var.a.d().n(w);
            }
            synchronized (w1.class) {
                if (w1.f6341b == null) {
                    w1.f6341b = new w1();
                }
                w1Var = w1.f6341b;
            }
            Objects.requireNonNull(w1Var);
            i2.k kVar = i2.k.DEBUG;
            String str = i2.a;
            String q2 = (str == null || str.isEmpty()) ? i2.q() : i2.a;
            String r = i2.r();
            if (!b3.b(b3.a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false)) {
                i2.a(kVar, "sendReceiveReceipt disable", (Throwable) null);
                return;
            }
            i2.a(kVar, "sendReceiveReceipt appId: " + q2 + " playerId: " + r + " notificationId: " + w, (Throwable) null);
            x1 x1Var = w1Var.a;
            v1 v1Var = new v1(w1Var, w);
            Objects.requireNonNull(x1Var);
            try {
                new Thread(new e3("notifications/" + w + "/report_received", new JSONObject().put("app_id", q2).put("player_id", r), v1Var), "OS_REST_ASYNC_PUT").start();
            } catch (JSONException e4) {
                i2.a(i2.k.ERROR, "Generating direct receive receipt:JSON Failed.", e4);
            }
        }
    }

    public static String e(String str, String str2) {
        try {
            String d = o.h.t((str + ":" + str2).getBytes("ISO-8859-1")).d();
            return "Basic " + d;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public static String e0(o oVar) {
        int indexOf = oVar.f6728i.indexOf(47, oVar.a.length() + 3);
        String str = oVar.f6728i;
        String substring = oVar.f6728i.substring(indexOf, o.e(str, indexOf, str.length(), "?#"));
        String h2 = oVar.h();
        if (h2 == null) {
            return substring;
        }
        return substring + '?' + h2;
    }

    @NonNull
    public static JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e2) {
                i2.k kVar = i2.k.ERROR;
                i2.a(kVar, "bundleAsJSONObject error for key: " + str, e2);
            }
        }
        return jSONObject;
    }

    public static boolean f0(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean g(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    public static int g0(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static void h(@Nullable String str) {
        if (!"raw".equals(str)) {
            throw new IllegalArgumentException(a.m("Unsupported resource type: ", str));
        }
    }

    public static void h0(TimerTask timerTask, String str, long j2) {
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "scheduleTrigger: " + str + " delay: " + j2, (Throwable) null);
        new Timer(a.m("trigger_timer:", str)).schedule(timerTask, j2);
    }

    public static int i(@NonNull Context context, @NonNull String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    public static void i0(n1 n1Var) {
        JSONObject jSONObject = n1Var.f6210e;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = n1Var.f6210e.getJSONArray("actionButtons");
            n1Var.f = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                n1.a aVar = new n1.a();
                jSONObject2.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
                jSONObject2.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT, (String) null);
                jSONObject2.optString("icon", (String) null);
                n1Var.f.add(aVar);
            }
            n1Var.f6210e.remove("actionId");
            n1Var.f6210e.remove("actionButtons");
        }
    }

    public static Type j(Type type, Class<?> cls) {
        Type E = E(type, cls, Collection.class);
        if (E instanceof WildcardType) {
            E = ((WildcardType) E).getUpperBounds()[0];
        }
        return E instanceof ParameterizedType ? ((ParameterizedType) E).getActualTypeArguments()[0] : Object.class;
    }

    public static void j0(n1 n1Var, JSONObject jSONObject) {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            n1Var.f6211g = new n1.b();
            jSONObject2.optString("img");
            n1.b bVar = n1Var.f6211g;
            jSONObject2.optString("tc");
            Objects.requireNonNull(bVar);
            n1.b bVar2 = n1Var.f6211g;
            jSONObject2.optString("bc");
            Objects.requireNonNull(bVar2);
        }
    }

    public static int k(int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > i3) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        int i6 = 1;
        int i7 = 1;
        while (i2 > i3) {
            i6 *= i2;
            if (i7 <= i4) {
                i6 /= i7;
                i7++;
            }
            i2--;
        }
        while (i7 <= i4) {
            i6 /= i7;
            i7++;
        }
        return i6;
    }

    public static boolean k0(String str) {
        boolean z = str != null && !"".equals(str);
        i2.g gVar = i2.H;
        boolean z2 = gVar != null && gVar.f6140e == i2.n.InAppAlert;
        boolean v = i2.v();
        if (z) {
            i2.g gVar2 = i2.H;
            if ((gVar2 == null || gVar2.f6140e == i2.n.Notification) || z2 || !v) {
                return true;
            }
        }
        return false;
    }

    public static float l(float f, float f2, float f3, float f4) {
        double d = (double) (f - f3);
        double d2 = (double) (f2 - f4);
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static void l0() {
        boolean z;
        if (f2.m()) {
            try {
                PackageManager packageManager = i2.c.getPackageManager();
                z = !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (z && !b3.b(b3.a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                f2.u(new t());
            }
        }
    }

    public static float m(int i2, int i3, int i4, int i5) {
        double d = (double) (i2 - i4);
        double d2 = (double) (i3 - i5);
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static int m0(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static boolean n(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? n(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return n(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof b.C0114b ? ((b.C0114b) parameterizedType).f6460j : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof b.C0114b ? ((b.C0114b) parameterizedType2).f6460j : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return n(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return n(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static int n0(String str, int i2) {
        while (i2 < str.length() && ((r0 = str.charAt(i2)) == ' ' || r0 == 9)) {
            i2++;
        }
        return i2;
    }

    public static int o(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil((double) fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    public static int o0(int[] iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += i3;
        }
        return i2;
    }

    public static void p(@NonNull f fVar) {
        RectF rectF;
        f.e0 e0Var = fVar.a;
        if (e0Var != null) {
            f.a aVar = e0Var.f1200o;
            if (aVar == null) {
                rectF = null;
            } else {
                rectF = new RectF(aVar.a, aVar.f1078b, aVar.a(), aVar.b());
            }
            float d = fVar.d();
            float c = fVar.c();
            if (rectF != null) {
                int i2 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
                if (i2 <= 0 && c <= 0.0f) {
                    fVar.i(rectF.width());
                    fVar.h(rectF.height());
                } else if (i2 <= 0) {
                    fVar.i((rectF.width() / rectF.height()) * c);
                } else if (c <= 0.0f) {
                    fVar.h(d / (rectF.width() / rectF.height()));
                }
            } else if (d <= 0.0f || c <= 0.0f) {
                throw new IOException("SVG must have specify 'width' & 'height' tags or 'viewbox'");
            } else {
                f.e0 e0Var2 = fVar.a;
                if (e0Var2 != null) {
                    e0Var2.f1200o = new f.a(0.0f, 0.0f, d, c);
                    return;
                }
                throw new IllegalArgumentException("SVG document is empty");
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    public static String p0(JSONArray jSONArray) {
        int i2 = 0;
        String str = "[";
        while (i2 < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i2) + "\"";
                i2++;
            } catch (JSONException unused) {
            }
        }
        return a.m(str, "]");
    }

    public static JSONObject q(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject6 = q(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject6.equals("{}")) {
                            jSONObject4 = new JSONObject(jSONObject6);
                        }
                    } else if (obj instanceof JSONArray) {
                        H(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (set == null || !set.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (!obj.equals(obj2)) {
                                if ((obj2 instanceof Integer) && !"".equals(obj)) {
                                    if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                    }
                                }
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                } else {
                    if (obj instanceof JSONArray) {
                        H(next, (JSONArray) obj, (JSONArray) null, jSONObject5);
                    }
                    jSONObject5.put(next, obj);
                }
                jSONObject5.put(next, jSONObject4);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject5;
    }

    public static void q0(Context context, y2 y2Var, String str, boolean z) {
        try {
            Cursor K = K(context, y2Var, str, z);
            if (!K.isClosed()) {
                K.close();
            }
        } catch (Throwable th) {
            i2.a(i2.k.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }

    public static void r(String str, l3 l3Var, @NonNull String str2) {
        new Thread(new g3(str, l3Var, str2), "OS_REST_ASYNC_GET").start();
    }

    public static void r0() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    @RequiresApi(api = 23)
    public static StatusBarNotification[] s(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    public static JSONObject t(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString("custom"));
    }

    public static Integer u(z2 z2Var, String str, boolean z) {
        Cursor Y = z2Var.Y("notification", (String[]) null, a.m(z ? "group_id IS NULL" : "group_id = ?", " AND dismissed = 0 AND opened = 0 AND is_summary = 0"), z ? null : new String[]{str}, (String) null, (String) null, "created_time DESC", "1");
        if (!Y.moveToFirst()) {
            Y.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(Y.getInt(Y.getColumnIndex("android_notification_id")));
        Y.close();
        return valueOf;
    }

    public static NotificationManager v(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    @Nullable
    public static String w(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return x(jSONObject.optString("custom", (String) null));
    }

    @Nullable
    public static String x(@Nullable String str) {
        i2.k kVar = i2.k.DEBUG;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(i.f5973b)) {
                return jSONObject.optString(i.f5973b, (String) null);
            }
            i2.a(kVar, "Not a OneSignal formatted JSON string. No 'i' field in custom.", (Throwable) null);
            return null;
        } catch (JSONException unused) {
            i2.a(kVar, "Not a OneSignal formatted JSON String, error parsing string as JSON.", (Throwable) null);
        }
    }

    public static String y(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder v = a.v('$');
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                v.append('[');
                v.append(iArr2[i3]);
                v.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                v.append('.');
                if (strArr[i3] != null) {
                    v.append(strArr[i3]);
                }
            }
        }
        return v.toString();
    }

    public static int z(int[] iArr, int i2, boolean z) {
        int[] iArr2 = iArr;
        int i3 = i2;
        int i4 = 0;
        for (int i5 : iArr2) {
            i4 += i5;
        }
        int length = iArr2.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = length - 1;
            if (i6 >= i9) {
                return i7;
            }
            int i10 = 1 << i6;
            i8 |= i10;
            int i11 = 1;
            while (i11 < iArr2[i6]) {
                int i12 = i4 - i11;
                int i13 = length - i6;
                int i14 = i13 - 2;
                int k2 = k(i12 - 1, i14);
                if (z && i8 == 0) {
                    int i15 = i13 - 1;
                    if (i12 - i15 >= i15) {
                        k2 -= k(i12 - i13, i14);
                    }
                }
                if (i13 - 1 > 1) {
                    int i16 = i12 - i14;
                    int i17 = 0;
                    while (i16 > i3) {
                        i17 += k((i12 - i16) - 1, i13 - 3);
                        i16--;
                        int[] iArr3 = iArr;
                    }
                    k2 -= (i9 - i6) * i17;
                } else if (i12 > i3) {
                    k2--;
                }
                i7 += k2;
                i11++;
                i8 &= ~i10;
                iArr2 = iArr;
            }
            i4 -= i11;
            i6++;
            iArr2 = iArr;
        }
    }
}
