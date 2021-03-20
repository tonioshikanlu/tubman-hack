package b.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.o.i2;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class b3 {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, HashMap<String, Object>> f6020b;
    public static a c = new a("OSH_WritePrefs");

    public static class a extends HandlerThread {
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public Handler f6021h;

        /* renamed from: i  reason: collision with root package name */
        public long f6022i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6023j;

        /* renamed from: b.o.b3$a$a  reason: collision with other inner class name */
        public class C0107a implements Runnable {
            public C0107a() {
            }

            public void run() {
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                for (String next : b3.f6020b.keySet()) {
                    SharedPreferences.Editor edit = b3.e(next).edit();
                    HashMap hashMap = b3.f6020b.get(next);
                    synchronized (hashMap) {
                        for (String str : hashMap.keySet()) {
                            Object obj = hashMap.get(str);
                            if (obj instanceof String) {
                                edit.putString(str, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(str, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Integer) {
                                edit.putInt(str, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(str, ((Long) obj).longValue());
                            } else if (obj instanceof Set) {
                                edit.putStringSet(str, (Set) obj);
                            }
                        }
                        hashMap.clear();
                    }
                    edit.apply();
                }
                aVar.f6022i = System.currentTimeMillis();
            }
        }

        public a(String str) {
            super(str);
        }

        public final synchronized void a() {
            Handler handler = this.f6021h;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                if (this.f6022i == 0) {
                    this.f6022i = System.currentTimeMillis();
                }
                C0107a aVar = new C0107a();
                this.f6021h.postDelayed(aVar, (this.f6022i - System.currentTimeMillis()) + 200);
            }
        }

        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f6021h = new Handler(getLooper());
            a();
        }
    }

    static {
        String simpleName = i2.class.getSimpleName();
        a = simpleName;
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        f6020b = hashMap;
        hashMap.put(simpleName, new HashMap());
        f6020b.put("GTPlayerPurchases", new HashMap());
        f6020b.put("OneSignalTriggers", new HashMap());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r4 = e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6.equals(java.lang.String.class) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return r4.getString(r5, (java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r6.equals(java.lang.Boolean.class) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        return java.lang.Boolean.valueOf(r4.getBoolean(r5, ((java.lang.Boolean) r7).booleanValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r6.equals(java.lang.Integer.class) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        return java.lang.Integer.valueOf(r4.getInt(r5, ((java.lang.Integer) r7).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r6.equals(java.lang.Long.class) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        return java.lang.Long.valueOf(r4.getLong(r5, ((java.lang.Long) r7).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r6.equals(java.util.Set.class) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        return r4.getStringSet(r5, (java.util.Set) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r6.equals(r0) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        return java.lang.Boolean.valueOf(r4.contains(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        return r7;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(java.lang.String r4, java.lang.String r5, java.lang.Class r6, java.lang.Object r7) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r1 = f6020b
            java.lang.Object r1 = r1.get(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            monitor-enter(r1)
            boolean r2 = r6.equals(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r4
        L_0x001b:
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x00a5
            boolean r3 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0029
            goto L_0x00a5
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            android.content.SharedPreferences r4 = e(r4)
            if (r4 == 0) goto L_0x00a4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r4.getString(r5, r7)
            return r4
        L_0x003f:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0056
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            boolean r4 = r4.getBoolean(r5, r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x0056:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x006d
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r4 = r4.getInt(r5, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x006d:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0084
            java.lang.Long r7 = (java.lang.Long) r7
            long r6 = r7.longValue()
            long r4 = r4.getLong(r5, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L_0x0084:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0093
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r4 = r4.getStringSet(r5, r7)
            return r4
        L_0x0093:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a2
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x00a2:
            r4 = 0
            return r4
        L_0x00a4:
            return r7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x00a7:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.b3.a(java.lang.String, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static boolean b(String str, String str2, boolean z) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    public static int c(String str, String str2, int i2) {
        return ((Integer) a(str, str2, Integer.class, Integer.valueOf(i2))).intValue();
    }

    public static long d(String str, String str2, long j2) {
        return ((Long) a(str, str2, Long.class, Long.valueOf(j2))).longValue();
    }

    public static synchronized SharedPreferences e(String str) {
        synchronized (b3.class) {
            Context context = i2.c;
            if (context == null) {
                i2.a(i2.k.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            return sharedPreferences;
        }
    }

    public static String f(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    @Nullable
    public static Set<String> g(@NonNull String str, @NonNull String str2, @Nullable Set<String> set) {
        return (Set) a(str, str2, Set.class, set);
    }

    public static void h(String str, String str2, Object obj) {
        HashMap hashMap = f6020b.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        k();
    }

    public static void i(String str, String str2, boolean z) {
        h(str, str2, Boolean.valueOf(z));
    }

    public static void j(String str, String str2, long j2) {
        h(str, str2, Long.valueOf(j2));
    }

    public static void k() {
        a aVar = c;
        synchronized (aVar) {
            if (i2.c != null) {
                if (!aVar.f6023j) {
                    aVar.start();
                    aVar.f6023j = true;
                }
                aVar.a();
            }
        }
    }
}
