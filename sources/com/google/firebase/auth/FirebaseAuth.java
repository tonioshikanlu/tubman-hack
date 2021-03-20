package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.f.e.ci;
import b.l.a.c.f.e.hi;
import b.l.a.c.f.e.sk;
import b.l.a.c.f.e.zg;
import b.l.a.c.k.h;
import b.l.d.d;
import b.l.d.o.e0.k;
import b.l.d.o.e0.n;
import b.l.d.o.e0.s;
import b.l.d.o.e0.u;
import b.l.d.o.e0.v;
import b.l.d.o.e0.x;
import b.l.d.o.p;
import b.l.d.o.q;
import b.l.d.o.r0;
import b.l.d.o.s0;
import b.l.d.o.t0;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Objects;

public abstract class FirebaseAuth implements b.l.d.o.e0.b {
    public d a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f7332b;
    public final List<b.l.d.o.e0.a> c;
    public List<a> d;

    /* renamed from: e  reason: collision with root package name */
    public ci f7333e;
    public p f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7334g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f7335h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public String f7336i;

    /* renamed from: j  reason: collision with root package name */
    public final s f7337j;

    /* renamed from: k  reason: collision with root package name */
    public final x f7338k;

    /* renamed from: l  reason: collision with root package name */
    public u f7339l;

    /* renamed from: m  reason: collision with root package name */
    public v f7340m;

    public interface a {
        void a(@NonNull FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016a, code lost:
        if (r7.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0306  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(b.l.d.d r11) {
        /*
            r10 = this;
            r11.a()
            b.l.d.l r0 = r11.c
            java.lang.String r0 = r0.a
            b.l.a.c.b.a.x(r0)
            b.l.a.c.f.e.xi r1 = new b.l.a.c.f.e.xi
            r1.<init>(r0)
            r11.a()
            android.content.Context r0 = r11.a
            b.l.a.c.c.l.a$g<b.l.a.c.f.e.fi> r2 = b.l.a.c.f.e.yi.a
            b.l.a.c.f.e.ci r2 = new b.l.a.c.f.e.ci
            r2.<init>(r0, r1)
            b.l.d.o.e0.s r0 = new b.l.d.o.e0.s
            r11.a()
            android.content.Context r1 = r11.a
            java.lang.String r3 = r11.e()
            r0.<init>(r1, r3)
            b.l.d.o.e0.x r1 = b.l.d.o.e0.x.f5000b
            r10.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r10.f7334g = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r10.f7335h = r3
            r10.a = r11
            r10.f7333e = r2
            r10.f7337j = r0
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r1, r11)
            r10.f7338k = r1
            java.util.concurrent.CopyOnWriteArrayList r11 = new java.util.concurrent.CopyOnWriteArrayList
            r11.<init>()
            r10.f7332b = r11
            java.util.concurrent.CopyOnWriteArrayList r11 = new java.util.concurrent.CopyOnWriteArrayList
            r11.<init>()
            r10.c = r11
            java.util.concurrent.CopyOnWriteArrayList r11 = new java.util.concurrent.CopyOnWriteArrayList
            r11.<init>()
            r10.d = r11
            b.l.d.o.e0.v r11 = b.l.d.o.e0.v.f4998i
            r10.f7340m = r11
            java.lang.String r11 = "type"
            android.content.SharedPreferences r1 = r0.c
            java.lang.String r2 = "com.google.firebase.auth.FIREBASE_USER"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x008f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008f }
            boolean r1 = r2.has(r11)     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            java.lang.String r11 = r2.optString(r11)     // Catch:{ Exception -> 0x008f }
            boolean r11 = r1.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x008f }
            if (r11 == 0) goto L_0x008f
            b.l.d.o.e0.j0 r11 = r0.a(r2)     // Catch:{ Exception -> 0x008f }
            goto L_0x0090
        L_0x008f:
            r11 = r3
        L_0x0090:
            r10.f = r11
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x00be
            b.l.d.o.e0.s r2 = r10.f7337j
            java.util.Objects.requireNonNull(r2)
            android.content.SharedPreferences r2 = r2.c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            b.l.d.o.e0.g0 r11 = r11.f4979i
            java.lang.String r11 = r11.f4968h
            r4[r1] = r11
            java.lang.String r11 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.String r11 = r2.getString(r11, r3)
            if (r11 == 0) goto L_0x00b6
            b.l.a.c.f.e.sk r11 = b.l.a.c.f.e.sk.X(r11)
            goto L_0x00b7
        L_0x00b6:
            r11 = r3
        L_0x00b7:
            if (r11 == 0) goto L_0x00be
            b.l.d.o.p r2 = r10.f
            r10.c(r2, r11, r1, r1)
        L_0x00be:
            b.l.d.o.e0.x r11 = r10.f7338k
            b.l.d.o.e0.r r11 = r11.a
            java.util.Objects.requireNonNull(r11)
            b.l.d.d r11 = r10.a
            r11.a()
            android.content.Context r11 = r11.a
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r2, r1)
            java.lang.String r2 = "firebaseAppName"
            java.lang.String r4 = ""
            java.lang.String r2 = r11.getString(r2, r4)
            b.l.d.d r4 = r10.a
            r4.a()
            java.lang.String r4 = r4.f4912b
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00e9
            goto L_0x0411
        L_0x00e9:
            java.lang.String r2 = "verifyAssertionRequest"
            boolean r2 = r11.contains(r2)
            r4 = -1
            r5 = 0
            if (r2 == 0) goto L_0x03b5
            java.lang.String r2 = "verifyAssertionRequest"
            java.lang.String r7 = ""
            java.lang.String r2 = r11.getString(r2, r7)
            android.os.Parcelable$Creator<b.l.a.c.f.e.sl> r7 = b.l.a.c.f.e.sl.CREATOR
            if (r2 != 0) goto L_0x0102
            r2 = r3
            goto L_0x0108
        L_0x0102:
            r8 = 10
            byte[] r2 = android.util.Base64.decode(r2, r8)
        L_0x0108:
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)
            android.os.Parcel r8 = android.os.Parcel.obtain()
            int r9 = r2.length
            r8.unmarshall(r2, r1, r9)
            r8.setDataPosition(r1)
            java.lang.Object r2 = r7.createFromParcel(r8)
            b.l.a.c.c.m.v.c r2 = (b.l.a.c.c.m.v.c) r2
            r8.recycle()
            b.l.a.c.f.e.sl r2 = (b.l.a.c.f.e.sl) r2
            java.lang.String r7 = "operation"
            java.lang.String r8 = ""
            java.lang.String r7 = r11.getString(r7, r8)
            java.lang.String r8 = "tenantId"
            java.lang.String r3 = r11.getString(r8, r3)
            java.lang.String r8 = "firebaseUserUid"
            java.lang.String r9 = ""
            java.lang.String r8 = r11.getString(r8, r9)
            java.lang.String r9 = "timestamp"
            r11.getLong(r9, r5)
            if (r3 == 0) goto L_0x014f
            b.l.a.c.b.a.x(r3)
            java.lang.Object r5 = r10.f7335h
            monitor-enter(r5)
            r10.f7336i = r3     // Catch:{ all -> 0x014c }
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            r2.u = r3
            goto L_0x014f
        L_0x014c:
            r11 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            throw r11
        L_0x014f:
            int r3 = r7.hashCode()
            r5 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r6 = 2
            if (r3 == r5) goto L_0x0177
            r5 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r3 == r5) goto L_0x016d
            r5 = 1450464913(0x56745691, float:6.7163159E13)
            if (r3 == r5) goto L_0x0164
            goto L_0x0181
        L_0x0164:
            java.lang.String r3 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0181
            goto L_0x0182
        L_0x016d:
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0181
            r1 = r0
            goto L_0x0182
        L_0x0177:
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0181
            r1 = r6
            goto L_0x0182
        L_0x0181:
            r1 = r4
        L_0x0182:
            r3 = 17072(0x42b0, float:2.3923E-41)
            if (r1 == 0) goto L_0x0306
            if (r1 == r0) goto L_0x0278
            if (r1 == r6) goto L_0x018c
            goto L_0x03e1
        L_0x018c:
            b.l.d.o.p r0 = r10.f
            java.lang.String r0 = r0.Z()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x03e1
            b.l.d.o.p r0 = r10.f
            b.l.d.o.n0 r1 = b.l.d.o.n0.W(r2)
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            b.l.d.o.c r1 = r1.V()
            boolean r2 = r1 instanceof b.l.d.o.d
            if (r2 == 0) goto L_0x0223
            b.l.d.o.d r1 = (b.l.d.o.d) r1
            java.lang.String r2 = r1.f4947i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "password"
            if (r2 != 0) goto L_0x01b9
            r2 = r4
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r2 = "emailLink"
        L_0x01bb:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01eb
            b.l.a.c.f.e.ci r2 = r10.f7333e
            b.l.d.d r3 = r10.a
            java.lang.String r4 = r1.f4946h
            java.lang.String r1 = r1.f4947i
            java.lang.String r5 = r0.Y()
            b.l.d.o.v0 r6 = new b.l.d.o.v0
            r6.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.f.e.nh r7 = new b.l.a.c.f.e.nh
            r7.<init>(r4, r1, r5)
            r7.d(r3)
            r7.e(r0)
            r7.f(r6)
            r7.g(r6)
            r2.b(r7)
            goto L_0x03e1
        L_0x01eb:
            java.lang.String r2 = r1.f4948j
            boolean r2 = r10.b(r2)
            if (r2 == 0) goto L_0x0201
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3)
            b.l.d.i r0 = b.l.a.c.f.e.hi.a(r0)
            b.l.a.c.b.a.W(r0)
            goto L_0x03e1
        L_0x0201:
            b.l.a.c.f.e.ci r2 = r10.f7333e
            b.l.d.d r3 = r10.a
            b.l.d.o.v0 r4 = new b.l.d.o.v0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.f.e.lh r5 = new b.l.a.c.f.e.lh
            r5.<init>(r1)
            r5.d(r3)
            r5.e(r0)
            r5.f(r4)
            r5.g(r4)
            r2.b(r5)
            goto L_0x03e1
        L_0x0223:
            boolean r2 = r1 instanceof b.l.d.o.x
            if (r2 == 0) goto L_0x0252
            b.l.a.c.f.e.ci r2 = r10.f7333e
            b.l.d.d r3 = r10.a
            b.l.d.o.x r1 = (b.l.d.o.x) r1
            java.lang.String r4 = r10.f7336i
            b.l.d.o.v0 r5 = new b.l.d.o.v0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            java.util.Map<java.lang.String, java.lang.Object> r6 = b.l.a.c.f.e.mj.a
            r6.clear()
            b.l.a.c.f.e.ph r6 = new b.l.a.c.f.e.ph
            r6.<init>(r1, r4)
            r6.d(r3)
            r6.e(r0)
            r6.f(r5)
            r6.g(r5)
            r2.b(r6)
            goto L_0x03e1
        L_0x0252:
            b.l.a.c.f.e.ci r2 = r10.f7333e
            b.l.d.d r3 = r10.a
            java.lang.String r4 = r0.Y()
            b.l.d.o.v0 r5 = new b.l.d.o.v0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.f.e.jh r6 = new b.l.a.c.f.e.jh
            r6.<init>(r1, r4)
            r6.d(r3)
            r6.e(r0)
            r6.f(r5)
            r6.g(r5)
            r2.b(r6)
            goto L_0x03e1
        L_0x0278:
            b.l.d.o.p r1 = r10.f
            java.lang.String r1 = r1.Z()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x03e1
            b.l.d.o.p r1 = r10.f
            b.l.d.o.n0 r2 = b.l.d.o.n0.W(r2)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            b.l.a.c.f.e.ci r4 = r10.f7333e
            b.l.d.d r5 = r10.a
            b.l.d.o.c r2 = r2.V()
            b.l.d.o.v0 r6 = new b.l.d.o.v0
            r6.<init>(r10)
            java.util.Objects.requireNonNull(r4)
            java.util.Objects.requireNonNull(r5, r3)
            java.util.List r3 = r1.b0()
            if (r3 == 0) goto L_0x02c4
            r7 = r2
            b.l.d.o.n0 r7 = (b.l.d.o.n0) r7
            java.lang.String r7 = r7.f5003h
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x02b4
            goto L_0x02c4
        L_0x02b4:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17015(0x4277, float:2.3843E-41)
            r0.<init>(r1)
            b.l.d.i r0 = b.l.a.c.f.e.hi.a(r0)
            b.l.a.c.b.a.W(r0)
            goto L_0x03e1
        L_0x02c4:
            boolean r3 = r2 instanceof b.l.d.o.d
            if (r3 == 0) goto L_0x02df
            b.l.d.o.d r2 = (b.l.d.o.d) r2
            java.lang.String r3 = r2.f4948j
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0 = r0 ^ r3
            if (r0 != 0) goto L_0x02d9
            b.l.a.c.f.e.bh r0 = new b.l.a.c.f.e.bh
            r0.<init>(r2)
            goto L_0x02f5
        L_0x02d9:
            b.l.a.c.f.e.hh r0 = new b.l.a.c.f.e.hh
            r0.<init>(r2)
            goto L_0x02f5
        L_0x02df:
            boolean r0 = r2 instanceof b.l.d.o.x
            if (r0 == 0) goto L_0x02f0
            b.l.d.o.x r2 = (b.l.d.o.x) r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = b.l.a.c.f.e.mj.a
            r0.clear()
            b.l.a.c.f.e.fh r0 = new b.l.a.c.f.e.fh
            r0.<init>(r2)
            goto L_0x02f5
        L_0x02f0:
            b.l.a.c.f.e.dh r0 = new b.l.a.c.f.e.dh
            r0.<init>(r2)
        L_0x02f5:
            r0.d(r5)
            r0.e(r1)
            r0.f(r6)
            r0.g(r6)
            r4.b(r0)
            goto L_0x03e1
        L_0x0306:
            b.l.d.o.n0 r1 = b.l.d.o.n0.W(r2)
            b.l.d.o.c r1 = r1.V()
            boolean r2 = r1 instanceof b.l.d.o.d
            if (r2 == 0) goto L_0x0370
            b.l.d.o.d r1 = (b.l.d.o.d) r1
            java.lang.String r2 = r1.f4948j
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x033f
            b.l.a.c.f.e.ci r0 = r10.f7333e
            b.l.d.d r2 = r10.a
            java.lang.String r3 = r1.f4946h
            java.lang.String r1 = r1.f4947i
            java.lang.String r4 = r10.f7336i
            b.l.d.o.u0 r5 = new b.l.d.o.u0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.f.e.wh r6 = new b.l.a.c.f.e.wh
            r6.<init>(r3, r1, r4)
            r6.d(r2)
            r6.f(r5)
            r0.b(r6)
            goto L_0x03e1
        L_0x033f:
            java.lang.String r0 = r1.f4948j
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0355
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3)
            b.l.d.i r0 = b.l.a.c.f.e.hi.a(r0)
            b.l.a.c.b.a.W(r0)
            goto L_0x03e1
        L_0x0355:
            b.l.a.c.f.e.ci r0 = r10.f7333e
            b.l.d.d r2 = r10.a
            b.l.d.o.u0 r3 = new b.l.d.o.u0
            r3.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.f.e.yh r4 = new b.l.a.c.f.e.yh
            r4.<init>(r1)
            r4.d(r2)
            r4.f(r3)
            r0.b(r4)
            goto L_0x03e1
        L_0x0370:
            boolean r0 = r1 instanceof b.l.d.o.x
            if (r0 == 0) goto L_0x0398
            b.l.d.o.x r1 = (b.l.d.o.x) r1
            b.l.a.c.f.e.ci r0 = r10.f7333e
            b.l.d.d r2 = r10.a
            java.lang.String r3 = r10.f7336i
            b.l.d.o.u0 r4 = new b.l.d.o.u0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            java.util.Map<java.lang.String, java.lang.Object> r5 = b.l.a.c.f.e.mj.a
            r5.clear()
            b.l.a.c.f.e.ai r5 = new b.l.a.c.f.e.ai
            r5.<init>(r1, r3)
            r5.d(r2)
            r5.f(r4)
            r0.b(r5)
            goto L_0x03e1
        L_0x0398:
            b.l.a.c.f.e.ci r0 = r10.f7333e
            b.l.d.d r2 = r10.a
            java.lang.String r3 = r10.f7336i
            b.l.d.o.u0 r4 = new b.l.d.o.u0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.f.e.uh r5 = new b.l.a.c.f.e.uh
            r5.<init>(r1, r3)
            r5.d(r2)
            r5.f(r4)
            r0.b(r5)
            goto L_0x03e1
        L_0x03b5:
            java.lang.String r0 = "recaptchaToken"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x03e5
            java.lang.String r0 = "recaptchaToken"
            java.lang.String r1 = ""
            java.lang.String r0 = r11.getString(r0, r1)
            java.lang.String r1 = "operation"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.getString(r1, r2)
            java.lang.String r2 = "timestamp"
            r11.getLong(r2, r5)
            r1.hashCode()
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03de
            goto L_0x03e1
        L_0x03de:
            b.l.a.c.b.a.X(r0)
        L_0x03e1:
            b.l.d.o.e0.r.a(r11)
            goto L_0x0411
        L_0x03e5:
            java.lang.String r0 = "statusCode"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = "statusCode"
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r0 = r11.getInt(r0, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.getString(r1, r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r0, r1)
            java.lang.String r0 = "timestamp"
            r11.getLong(r0, r5)
            b.l.d.o.e0.r.a(r11)
            b.l.d.i r11 = b.l.a.c.f.e.hi.a(r2)
            b.l.a.c.b.a.W(r11)
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(b.l.d.d):void");
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        d c2 = d.c();
        c2.a();
        return (FirebaseAuth) c2.d.a(FirebaseAuth.class);
    }

    public void a() {
        p pVar = this.f;
        if (pVar != null) {
            s sVar = this.f7337j;
            sVar.c.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{pVar.Z()})).apply();
            this.f = null;
        }
        this.f7337j.c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        d((p) null);
        e((p) null);
        u uVar = this.f7339l;
        if (uVar != null) {
            k kVar = uVar.a;
            kVar.f.removeCallbacks(kVar.f4991g);
        }
    }

    public final boolean b(String str) {
        b.l.d.o.b bVar;
        int i2 = b.l.d.o.b.f4939e;
        b.l.a.c.b.a.x(str);
        try {
            bVar = new b.l.d.o.b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        return bVar != null && !TextUtils.equals(this.f7336i, bVar.d);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void c(b.l.d.o.p r17, b.l.a.c.f.e.sk r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            b.l.d.o.p r3 = r1.f
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = r17.Z()
            b.l.d.o.p r6 = r1.f
            java.lang.String r6 = r6.Z()
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0028
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            if (r3 != 0) goto L_0x002f
            if (r20 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            return
        L_0x002f:
            b.l.d.o.p r6 = r1.f
            if (r6 != 0) goto L_0x0036
            r3 = r5
            r6 = r3
            goto L_0x004b
        L_0x0036:
            b.l.a.c.f.e.sk r6 = r6.f0()
            java.lang.String r6 = r6.f3275i
            java.lang.String r7 = r2.f3275i
            boolean r6 = r6.equals(r7)
            r6 = r6 ^ r5
            if (r3 == 0) goto L_0x0049
            if (r6 != 0) goto L_0x0049
            r6 = r4
            goto L_0x004a
        L_0x0049:
            r6 = r5
        L_0x004a:
            r3 = r3 ^ r5
        L_0x004b:
            b.l.d.o.p r7 = r1.f
            if (r7 != 0) goto L_0x0052
            r1.f = r0
            goto L_0x0071
        L_0x0052:
            java.util.List r8 = r17.X()
            r7.c0(r8)
            boolean r7 = r17.a0()
            if (r7 != 0) goto L_0x0064
            b.l.d.o.p r7 = r1.f
            r7.d0()
        L_0x0064:
            b.l.d.o.e0.d r7 = r17.W()
            java.util.List r7 = r7.a()
            b.l.d.o.p r8 = r1.f
            r8.j0(r7)
        L_0x0071:
            if (r19 == 0) goto L_0x0181
            b.l.d.o.e0.s r7 = r1.f7337j
            b.l.d.o.p r8 = r1.f
            java.util.Objects.requireNonNull(r7)
            java.lang.String r9 = "null reference"
            java.util.Objects.requireNonNull(r8, r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.Class<b.l.d.o.e0.j0> r10 = b.l.d.o.e0.j0.class
            java.lang.Class r11 = r8.getClass()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L_0x016b
            b.l.d.o.e0.j0 r8 = (b.l.d.o.e0.j0) r8
            java.lang.String r10 = "cachedTokenState"
            java.lang.String r11 = r8.h0()     // Catch:{ Exception -> 0x0155 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r10 = "applicationName"
            java.lang.String r11 = r8.f4980j     // Catch:{ Exception -> 0x0155 }
            b.l.d.d r11 = b.l.d.d.d(r11)     // Catch:{ Exception -> 0x0155 }
            r11.a()     // Catch:{ Exception -> 0x0155 }
            java.lang.String r11 = r11.f4912b     // Catch:{ Exception -> 0x0155 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r10 = "type"
            java.lang.String r11 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0155 }
            java.util.List<b.l.d.o.e0.g0> r10 = r8.f4982l     // Catch:{ Exception -> 0x0155 }
            if (r10 == 0) goto L_0x00d9
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x0155 }
            r10.<init>()     // Catch:{ Exception -> 0x0155 }
            java.util.List<b.l.d.o.e0.g0> r11 = r8.f4982l     // Catch:{ Exception -> 0x0155 }
            r12 = r4
        L_0x00be:
            int r13 = r11.size()     // Catch:{ Exception -> 0x0155 }
            if (r12 >= r13) goto L_0x00d4
            java.lang.Object r13 = r11.get(r12)     // Catch:{ Exception -> 0x0155 }
            b.l.d.o.e0.g0 r13 = (b.l.d.o.e0.g0) r13     // Catch:{ Exception -> 0x0155 }
            java.lang.String r13 = r13.V()     // Catch:{ Exception -> 0x0155 }
            r10.put(r13)     // Catch:{ Exception -> 0x0155 }
            int r12 = r12 + 1
            goto L_0x00be
        L_0x00d4:
            java.lang.String r11 = "userInfos"
            r9.put(r11, r10)     // Catch:{ Exception -> 0x0155 }
        L_0x00d9:
            java.lang.String r10 = "anonymous"
            boolean r11 = r8.a0()     // Catch:{ Exception -> 0x0155 }
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r10 = "version"
            java.lang.String r11 = "2"
            r9.put(r10, r11)     // Catch:{ Exception -> 0x0155 }
            b.l.d.o.e0.l0 r10 = r8.f4986p     // Catch:{ Exception -> 0x0155 }
            if (r10 == 0) goto L_0x0105
            java.lang.String r11 = "userMetadata"
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x0155 }
            r12.<init>()     // Catch:{ Exception -> 0x0155 }
            java.lang.String r13 = "lastSignInTimestamp"
            long r14 = r10.f4992h     // Catch:{ JSONException -> 0x0102 }
            r12.put(r13, r14)     // Catch:{ JSONException -> 0x0102 }
            java.lang.String r13 = "creationTimestamp"
            long r14 = r10.f4993i     // Catch:{ JSONException -> 0x0102 }
            r12.put(r13, r14)     // Catch:{ JSONException -> 0x0102 }
        L_0x0102:
            r9.put(r11, r12)     // Catch:{ Exception -> 0x0155 }
        L_0x0105:
            b.l.d.o.e0.p r8 = r8.s     // Catch:{ Exception -> 0x0155 }
            if (r8 == 0) goto L_0x0124
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0155 }
            r10.<init>()     // Catch:{ Exception -> 0x0155 }
            java.util.List<b.l.d.o.y> r8 = r8.f4994h     // Catch:{ Exception -> 0x0155 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0155 }
        L_0x0114:
            boolean r11 = r8.hasNext()     // Catch:{ Exception -> 0x0155 }
            if (r11 == 0) goto L_0x0129
            java.lang.Object r11 = r8.next()     // Catch:{ Exception -> 0x0155 }
            b.l.d.o.y r11 = (b.l.d.o.y) r11     // Catch:{ Exception -> 0x0155 }
            r10.add(r11)     // Catch:{ Exception -> 0x0155 }
            goto L_0x0114
        L_0x0124:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0155 }
            r10.<init>()     // Catch:{ Exception -> 0x0155 }
        L_0x0129:
            boolean r8 = r10.isEmpty()     // Catch:{ Exception -> 0x0155 }
            if (r8 != 0) goto L_0x0150
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0155 }
            r8.<init>()     // Catch:{ Exception -> 0x0155 }
            r11 = r4
        L_0x0135:
            int r12 = r10.size()     // Catch:{ Exception -> 0x0155 }
            if (r11 >= r12) goto L_0x014b
            java.lang.Object r12 = r10.get(r11)     // Catch:{ Exception -> 0x0155 }
            b.l.d.o.t r12 = (b.l.d.o.t) r12     // Catch:{ Exception -> 0x0155 }
            org.json.JSONObject r12 = r12.V()     // Catch:{ Exception -> 0x0155 }
            r8.put(r12)     // Catch:{ Exception -> 0x0155 }
            int r11 = r11 + 1
            goto L_0x0135
        L_0x014b:
            java.lang.String r10 = "userMultiFactorInfo"
            r9.put(r10, r8)     // Catch:{ Exception -> 0x0155 }
        L_0x0150:
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x0155 }
            goto L_0x016c
        L_0x0155:
            r0 = move-exception
            b.l.a.c.c.n.a r2 = r7.d
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = r2.a
            java.lang.String r5 = "Failed to turn object into JSON"
            java.lang.String r2 = r2.c(r5, r3)
            android.util.Log.wtf(r4, r2, r0)
            b.l.a.c.f.e.fc r2 = new b.l.a.c.f.e.fc
            r2.<init>(r0)
            throw r2
        L_0x016b:
            r8 = 0
        L_0x016c:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0181
            android.content.SharedPreferences r7 = r7.c
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r9 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r7 = r7.putString(r9, r8)
            r7.apply()
        L_0x0181:
            if (r6 == 0) goto L_0x018f
            b.l.d.o.p r6 = r1.f
            if (r6 == 0) goto L_0x018a
            r6.g0(r2)
        L_0x018a:
            b.l.d.o.p r6 = r1.f
            r1.d(r6)
        L_0x018f:
            if (r3 == 0) goto L_0x0196
            b.l.d.o.p r3 = r1.f
            r1.e(r3)
        L_0x0196:
            if (r19 == 0) goto L_0x01bc
            b.l.d.o.e0.s r3 = r1.f7337j
            java.util.Objects.requireNonNull(r3)
            android.content.SharedPreferences r3 = r3.c
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = r17.Z()
            r5[r4] = r0
            java.lang.String r0 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            java.lang.String r2 = r18.W()
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r2)
            r0.apply()
        L_0x01bc:
            monitor-enter(r16)
            b.l.d.o.e0.u r0 = r1.f7339l     // Catch:{ all -> 0x0205 }
            if (r0 != 0) goto L_0x01d1
            b.l.d.o.e0.u r0 = new b.l.d.o.e0.u     // Catch:{ all -> 0x0205 }
            b.l.d.d r2 = r1.a     // Catch:{ all -> 0x0205 }
            r0.<init>(r2)     // Catch:{ all -> 0x0205 }
            monitor-enter(r16)     // Catch:{ all -> 0x0205 }
            r1.f7339l = r0     // Catch:{ all -> 0x01cd }
            monitor-exit(r16)     // Catch:{ all -> 0x0205 }
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)     // Catch:{ all -> 0x0205 }
            throw r2     // Catch:{ all -> 0x0205 }
        L_0x01d1:
            b.l.d.o.e0.u r0 = r1.f7339l     // Catch:{ all -> 0x0205 }
            monitor-exit(r16)
            b.l.d.o.p r2 = r1.f
            b.l.a.c.f.e.sk r2 = r2.f0()
            java.util.Objects.requireNonNull(r0)
            if (r2 != 0) goto L_0x01e0
            goto L_0x0204
        L_0x01e0:
            java.lang.Long r3 = r2.f3276j
            r4 = 0
            if (r3 != 0) goto L_0x01e8
            r6 = r4
            goto L_0x01ec
        L_0x01e8:
            long r6 = r3.longValue()
        L_0x01ec:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x01f2
            r6 = 3600(0xe10, double:1.7786E-320)
        L_0x01f2:
            java.lang.Long r2 = r2.f3278l
            long r2 = r2.longValue()
            b.l.d.o.e0.k r0 = r0.a
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r4
            long r6 = r6 + r2
            r0.f4989b = r6
            r2 = -1
            r0.c = r2
        L_0x0204:
            return
        L_0x0205:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.c(b.l.d.o.p, b.l.a.c.f.e.sk, boolean, boolean):void");
    }

    public final void d(@Nullable p pVar) {
        String str;
        if (pVar != null) {
            String Z = pVar.Z();
            StringBuilder sb = new StringBuilder(String.valueOf(Z).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(Z);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        b.l.d.y.b bVar = new b.l.d.y.b(pVar != null ? pVar.i0() : null);
        this.f7340m.f4999h.post(new r0(this, bVar));
    }

    public final void e(@Nullable p pVar) {
        String str;
        if (pVar != null) {
            String Z = pVar.Z();
            StringBuilder sb = new StringBuilder(String.valueOf(Z).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(Z);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        v vVar = this.f7340m;
        vVar.f4999h.post(new s0(this));
    }

    @NonNull
    public final h<q> f(@Nullable p pVar, boolean z) {
        if (pVar == null) {
            return b.l.a.c.b.a.W(hi.a(new Status(17495)));
        }
        sk f0 = pVar.f0();
        if (f0.V() && !z) {
            return b.l.a.c.b.a.X(n.a(f0.f3275i));
        }
        ci ciVar = this.f7333e;
        d dVar = this.a;
        String str = f0.f3274h;
        t0 t0Var = new t0(this);
        Objects.requireNonNull(ciVar);
        zg zgVar = new zg(str);
        zgVar.d(dVar);
        zgVar.e(pVar);
        zgVar.f(t0Var);
        zgVar.g(t0Var);
        return ciVar.c().a.e(0, zgVar.b());
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull d dVar) {
        dVar.a();
        return (FirebaseAuth) dVar.d.a(FirebaseAuth.class);
    }
}
