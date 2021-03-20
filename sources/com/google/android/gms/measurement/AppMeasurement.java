package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import b.l.a.c.b.a;
import b.l.a.c.c.p.c;
import b.l.a.c.i.b.a6;
import b.l.a.c.i.b.c2;
import b.l.a.c.i.b.f;
import b.l.a.c.i.b.g9;
import b.l.a.c.i.b.i3;
import b.l.a.c.i.b.k9;
import b.l.a.c.i.b.l4;
import b.l.a.c.i.b.m6;
import b.l.a.c.i.b.n6;
import b.l.a.c.i.b.t6;
import b.l.a.c.i.b.y9;
import b.l.a.c.i.b.z5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement c;
    public final l4 a;

    /* renamed from: b  reason: collision with root package name */
    public final n6 f7318b;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @RecentlyNonNull
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @RecentlyNonNull
        @Keep
        public String mExpiredEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mExpiredEventParams;
        @RecentlyNonNull
        @Keep
        public String mName;
        @RecentlyNonNull
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @RecentlyNonNull
        @Keep
        public String mTimedOutEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @RecentlyNonNull
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @RecentlyNonNull
        @Keep
        public String mTriggeredEventName;
        @RecentlyNonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @RecentlyNonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(@NonNull Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            Objects.requireNonNull(bundle, "null reference");
            this.mAppId = (String) a.B1(bundle, "app_id", cls2, null);
            this.mOrigin = (String) a.B1(bundle, "origin", cls2, null);
            this.mName = (String) a.B1(bundle, "name", cls2, null);
            this.mValue = a.B1(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) a.B1(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) a.B1(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) a.B1(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) a.B1(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) a.B1(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) a.B1(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) a.B1(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) a.B1(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) a.B1(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) a.B1(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) a.B1(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) a.B1(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                a.f1(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(l4 l4Var) {
        Objects.requireNonNull(l4Var, "null reference");
        this.a = l4Var;
        this.f7318b = null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.RecentlyNonNull
    @androidx.annotation.Keep
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.RecentlyNonNull android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = c
            if (r0 != 0) goto L_0x005d
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = c     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            b.l.a.c.i.b.n6 r2 = (b.l.a.c.i.b.n6) r2     // Catch:{  }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r14.<init>((b.l.a.c.i.b.n6) r2)     // Catch:{ all -> 0x005a }
            c = r14     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x003d:
            b.l.a.c.f.i.zb r13 = new b.l.a.c.f.i.zb     // Catch:{ all -> 0x005a }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005a }
            b.l.a.c.i.b.l4 r14 = b.l.a.c.i.b.l4.h(r14, r13, r1)     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r1.<init>((b.l.a.c.i.b.l4) r14)     // Catch:{ all -> 0x005a }
            c = r1     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r14
        L_0x005d:
            com.google.android.gms.measurement.AppMeasurement r14 = c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(@RecentlyNonNull @Size(min = 1) String str) {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            n6Var.m(str);
            return;
        }
        Objects.requireNonNull(this.a, "null reference");
        c2 g2 = this.a.g();
        Objects.requireNonNull((c) this.a.f4121n);
        g2.i(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public void clearConditionalUserProperty(@RecentlyNonNull @Size(max = 24, min = 1) String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            n6Var.a(str, str2, bundle);
            return;
        }
        Objects.requireNonNull(this.a, "null reference");
        this.a.s().r(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@RecentlyNonNull @Size(min = 1) String str) {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            n6Var.k(str);
            return;
        }
        Objects.requireNonNull(this.a, "null reference");
        c2 g2 = this.a.g();
        Objects.requireNonNull((c) this.a.f4121n);
        g2.j(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public long generateEventId() {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.j();
        }
        Objects.requireNonNull(this.a, "null reference");
        return this.a.t().c0();
    }

    @RecentlyNonNull
    @Keep
    public String getAppInstanceId() {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.f();
        }
        Objects.requireNonNull(this.a, "null reference");
        return this.a.s().f4149g.get();
    }

    @RecentlyNonNull
    @WorkerThread
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@RecentlyNonNull String str, @RecentlyNonNull @Size(max = 23, min = 1) String str2) {
        List<Bundle> list;
        n6 n6Var = this.f7318b;
        int i2 = 0;
        if (n6Var != null) {
            list = n6Var.b(str, str2);
        } else {
            Objects.requireNonNull(this.a, "null reference");
            m6 s = this.a.s();
            if (s.a.d().o()) {
                s.a.a().f.a("Cannot get conditional user properties from analytics worker thread");
                list = new ArrayList<>(0);
            } else {
                y9 y9Var = s.a.f;
                if (y9.a()) {
                    s.a.a().f.a("Cannot get conditional user properties from main thread");
                    list = new ArrayList<>(0);
                } else {
                    AtomicReference atomicReference = new AtomicReference();
                    s.a.d().r(atomicReference, 5000, "get conditional user properties", new z5(s, atomicReference, str, str2));
                    List list2 = (List) atomicReference.get();
                    if (list2 == null) {
                        s.a.a().f.b("Timed out waiting for get conditional user properties", (Object) null);
                        list = new ArrayList<>();
                    } else {
                        list = k9.W(list2);
                    }
                }
            }
        }
        if (list != null) {
            i2 = list.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenClass() {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.g();
        }
        Objects.requireNonNull(this.a, "null reference");
        t6 t6Var = this.a.s().a.y().c;
        if (t6Var != null) {
            return t6Var.f4282b;
        }
        return null;
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenName() {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.r();
        }
        Objects.requireNonNull(this.a, "null reference");
        t6 t6Var = this.a.s().a.y().c;
        if (t6Var != null) {
            return t6Var.a;
        }
        return null;
    }

    @RecentlyNonNull
    @Keep
    public String getGmpAppId() {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.h();
        }
        Objects.requireNonNull(this.a, "null reference");
        return this.a.s().s();
    }

    @WorkerThread
    @Keep
    public int getMaxUserProperties(@RecentlyNonNull @Size(min = 1) String str) {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.d(str);
        }
        Objects.requireNonNull(this.a, "null reference");
        m6 s = this.a.s();
        Objects.requireNonNull(s);
        a.x(str);
        f fVar = s.a.f4114g;
        return 25;
    }

    @RecentlyNonNull
    @WorkerThread
    @Keep
    public Map<String, Object> getUserProperties(@RecentlyNonNull String str, @RecentlyNonNull @Size(max = 24, min = 1) String str2, boolean z) {
        String str3;
        i3 i3Var;
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            return n6Var.e(str, str2, z);
        }
        Objects.requireNonNull(this.a, "null reference");
        m6 s = this.a.s();
        if (s.a.d().o()) {
            i3Var = s.a.a().f;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            y9 y9Var = s.a.f;
            if (y9.a()) {
                i3Var = s.a.a().f;
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                s.a.d().r(atomicReference, 5000, "get user properties", new a6(s, atomicReference, str, str2, z));
                List<g9> list = (List) atomicReference.get();
                if (list == null) {
                    s.a.a().f.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                ArrayMap arrayMap = new ArrayMap(list.size());
                for (g9 g9Var : list) {
                    Object V = g9Var.V();
                    if (V != null) {
                        arrayMap.put(g9Var.f4021i, V);
                    }
                }
                return arrayMap;
            }
        }
        i3Var.a(str3);
        return Collections.emptyMap();
    }

    @Keep
    public void logEventInternal(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            n6Var.i(str, str2, bundle);
            return;
        }
        Objects.requireNonNull(this.a, "null reference");
        this.a.s().A(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@RecentlyNonNull ConditionalUserProperty conditionalUserProperty) {
        Objects.requireNonNull(conditionalUserProperty, "null reference");
        n6 n6Var = this.f7318b;
        if (n6Var != null) {
            n6Var.c(conditionalUserProperty.a());
            return;
        }
        Objects.requireNonNull(this.a, "null reference");
        m6 s = this.a.s();
        Bundle a2 = conditionalUserProperty.a();
        Objects.requireNonNull((c) s.a.f4121n);
        s.q(a2, System.currentTimeMillis());
    }

    public AppMeasurement(n6 n6Var) {
        Objects.requireNonNull(n6Var, "null reference");
        this.f7318b = n6Var;
        this.a = null;
    }
}
