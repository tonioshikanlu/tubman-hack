package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.e.e;
import b.l.a.c.e.g;
import b.l.a.c.e.h;
import b.l.a.c.e.i;
import b.l.a.c.e.j;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f7276b = null;
    public static h c = null;
    public static j d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f7277e = null;
    public static int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<c> f7278g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    public static final b.C0124b f7279h = new b.l.a.c.e.a();

    /* renamed from: i  reason: collision with root package name */
    public static final b f7280i = new b.l.a.c.e.c();

    /* renamed from: j  reason: collision with root package name */
    public static final b f7281j = new b.l.a.c.e.b();

    /* renamed from: k  reason: collision with root package name */
    public static final b f7282k = new b.l.a.c.e.d();

    /* renamed from: l  reason: collision with root package name */
    public static final b f7283l = new e();
    public final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public a(String str, b.l.a.c.e.a aVar) {
            super(str);
        }

        public a(String str, Throwable th, b.l.a.c.e.a aVar) {
            super(str, th);
        }
    }

    public interface b {

        public static class a {
            public int a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f7284b = 0;
            public int c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface C0124b {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        a a(Context context, String str, C0124b bVar);
    }

    public static class c {
        public Cursor a;

        public c() {
        }

        public c(b.l.a.c.e.a aVar) {
        }
    }

    public static class d implements b.C0124b {
        public final int a;

        public d(int i2) {
            this.a = i2;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int b(Context context, String str, boolean z) {
            return 0;
        }
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, b bVar, String str) {
        b.a a2;
        ThreadLocal<c> threadLocal = f7278g;
        c cVar = threadLocal.get();
        c cVar2 = new c((b.l.a.c.e.a) null);
        threadLocal.set(cVar2);
        try {
            a2 = bVar.a(context, str, f7279h);
            int i2 = a2.a;
            int i3 = a2.f7284b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a2.c;
            if (i4 == 0 || ((i4 == -1 && a2.a == 0) || (i4 == 1 && a2.f7284b == 0))) {
                int i5 = a2.a;
                int i6 = a2.f7284b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new a(sb2.toString(), (b.l.a.c.e.a) null);
            } else if (i4 == -1) {
                DynamiteModule j2 = j(context, str);
                Cursor cursor = cVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(cVar);
                return j2;
            } else if (i4 == 1) {
                DynamiteModule e2 = e(context, str, a2.f7284b);
                Cursor cursor2 = cVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(cVar);
                return e2;
            } else {
                int i7 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i7);
                throw new a(sb3.toString(), (b.l.a.c.e.a) null);
            }
        } catch (a e3) {
            String valueOf = String.valueOf(e3.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            int i8 = a2.a;
            if (i8 == 0 || bVar.a(context, str, new d(i8)).c != -1) {
                throw new a("Remote load failed. No local fallback found.", e3, (b.l.a.c.e.a) null);
            }
            DynamiteModule j3 = j(context, str);
            Cursor cursor3 = cVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f7278g.set(cVar);
            return j3;
        } catch (Throwable th) {
            Cursor cursor4 = cVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f7278g.set(cVar);
            throw th;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch:{ all -> 0x00ef }
            java.lang.Boolean r3 = f7276b     // Catch:{ all -> 0x00ec }
            if (r3 != 0) goto L_0x00b9
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            java.lang.Class r3 = r3.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
            r5 = 0
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x008e }
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0038
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008e }
            if (r6 != r4) goto L_0x0034
            goto L_0x008a
        L_0x0034:
            f(r6)     // Catch:{ a -> 0x008b }
            goto L_0x008b
        L_0x0038:
            java.lang.String r6 = "com.google.android.gms"
            android.content.Context r7 = r10.getApplicationContext()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x008e }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x004d
        L_0x0048:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x008e }
            goto L_0x0087
        L_0x004d:
            int r6 = i(r10, r11, r12)     // Catch:{ a -> 0x0048 }
            java.lang.String r7 = f7277e     // Catch:{ a -> 0x0048 }
            if (r7 == 0) goto L_0x0084
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x0048 }
            if (r7 == 0) goto L_0x005c
            goto L_0x0084
        L_0x005c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0048 }
            r8 = 29
            if (r7 < r8) goto L_0x006e
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0048 }
            java.lang.String r8 = f7277e     // Catch:{ a -> 0x0048 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0048 }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x0048 }
            goto L_0x0079
        L_0x006e:
            b.l.a.c.e.f r7 = new b.l.a.c.e.f     // Catch:{ a -> 0x0048 }
            java.lang.String r8 = f7277e     // Catch:{ a -> 0x0048 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0048 }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x0048 }
        L_0x0079:
            f(r7)     // Catch:{ a -> 0x0048 }
            r4.set(r5, r7)     // Catch:{ a -> 0x0048 }
            f7276b = r0     // Catch:{ a -> 0x0048 }
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            return r6
        L_0x0084:
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            return r6
        L_0x0087:
            r4.set(r5, r0)     // Catch:{ all -> 0x008e }
        L_0x008a:
            r0 = r1
        L_0x008b:
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            r1 = r0
            goto L_0x00b6
        L_0x008e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0095, IllegalAccessException -> 0x0093, NoSuchFieldException -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            goto L_0x0096
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ec }
            int r4 = r0.length()     // Catch:{ all -> 0x00ec }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r5.<init>(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x00ec }
            r5.append(r0)     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x00ec }
        L_0x00b6:
            f7276b = r1     // Catch:{ all -> 0x00ec }
            r3 = r1
        L_0x00b9:
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e7
            int r10 = i(r10, r11, r12)     // Catch:{ a -> 0x00c5 }
            return r10
        L_0x00c5:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00ef }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ef }
            int r1 = r11.length()     // Catch:{ all -> 0x00ef }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x00ef }
            goto L_0x00e2
        L_0x00dd:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x00ef }
            r11.<init>(r0)     // Catch:{ all -> 0x00ef }
        L_0x00e2:
            android.util.Log.w(r12, r11)     // Catch:{ all -> 0x00ef }
            r10 = 0
            return r10
        L_0x00e7:
            int r10 = g(r10, r11, r12)     // Catch:{ all -> 0x00ef }
            return r10
        L_0x00ec:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            throw r11     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r11 = move-exception
            java.lang.String r12 = "null reference"
            java.util.Objects.requireNonNull(r10, r12)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00fe
        L_0x00f6:
            r10 = move-exception
            java.lang.String r12 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r12, r0, r10)
        L_0x00fe:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule e(Context context, String str, int i2) {
        Boolean bool;
        b.l.a.c.d.b bVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f7276b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (b.l.a.c.e.a) null);
            } else if (bool.booleanValue()) {
                return h(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                h k2 = k(context);
                if (k2 != null) {
                    if (k2.Q0() >= 2) {
                        bVar = k2.f0(new b.l.a.c.d.d(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        bVar = k2.y0(new b.l.a.c.d.d(context), str, i2);
                    }
                    if (b.l.a.c.d.d.n(bVar) != null) {
                        return new DynamiteModule((Context) b.l.a.c.d.d.n(bVar));
                    }
                    throw new a("Failed to load remote module.", (b.l.a.c.e.a) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (b.l.a.c.e.a) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, (b.l.a.c.e.a) null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            try {
                Objects.requireNonNull(context, "null reference");
            } catch (Exception e4) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
            }
            throw new a("Failed to load remote module.", th, (b.l.a.c.e.a) null);
        }
    }

    public static void f(ClassLoader classLoader) {
        j jVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new i(iBinder);
            }
            d = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, (b.l.a.c.e.a) null);
        }
    }

    public static int g(Context context, String str, boolean z) {
        h k2 = k(context);
        if (k2 == null) {
            return 0;
        }
        try {
            if (k2.Q0() >= 2) {
                return k2.q(new b.l.a.c.d.d(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return k2.X(new b.l.a.c.d.d(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    public static DynamiteModule h(Context context, String str, int i2) {
        j jVar;
        Boolean valueOf;
        b.l.a.c.d.b bVar;
        Class<DynamiteModule> cls = DynamiteModule.class;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (cls) {
            jVar = d;
        }
        if (jVar != null) {
            c cVar = f7278g.get();
            if (cVar == null || cVar.a == null) {
                throw new a("No result cursor", (b.l.a.c.e.a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.a;
            new b.l.a.c.d.d(null);
            synchronized (cls) {
                valueOf = Boolean.valueOf(f >= 2);
            }
            if (valueOf.booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                bVar = jVar.V(new b.l.a.c.d.d(applicationContext), str, i2, new b.l.a.c.d.d(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                bVar = jVar.R(new b.l.a.c.d.d(applicationContext), str, i2, new b.l.a.c.d.d(cursor));
            }
            Context context2 = (Context) b.l.a.c.d.d.n(bVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (b.l.a.c.e.a) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (b.l.a.c.e.a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f7277e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f7278g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.i(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule j(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static h k(Context context) {
        h hVar;
        synchronized (DynamiteModule.class) {
            h hVar2 = c;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new g(iBinder);
                }
                if (hVar != null) {
                    c = hVar;
                    return hVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2, (b.l.a.c.e.a) null);
        }
    }
}
