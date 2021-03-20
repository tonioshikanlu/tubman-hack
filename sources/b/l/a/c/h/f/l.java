package b.l.a.c.h.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.h;
import com.google.android.gms.dynamite.DynamiteModule;

public class l {
    public static final String a = "l";
    @SuppressLint({"StaticFieldLeak"})
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static Context f3870b;
    public static m c;

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.a.c.h.f.m a(android.content.Context r3) {
        /*
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            b.l.a.c.h.f.m r1 = c
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r2 = b.l.a.c.c.h.f2601e
            int r1 = b.l.a.c.c.i.b(r3, r1)
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = a
            java.lang.String r2 = "Making Creator dynamically"
            android.util.Log.i(r1, r2)
            android.content.Context r1 = c(r3)
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.String r2 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.util.Objects.requireNonNull(r1, r0)     // Catch:{ ClassNotFoundException -> 0x006a }
            java.lang.Class r0 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x006a }
            java.lang.Object r0 = b(r0)     // Catch:{ ClassNotFoundException -> 0x006a }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0037
            r0 = 0
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof b.l.a.c.h.f.m
            if (r2 == 0) goto L_0x0045
            r0 = r1
            b.l.a.c.h.f.m r0 = (b.l.a.c.h.f.m) r0
            goto L_0x004b
        L_0x0045:
            b.l.a.c.h.f.n r1 = new b.l.a.c.h.f.n
            r1.<init>(r0)
            r0 = r1
        L_0x004b:
            c = r0
            android.content.Context r3 = c(r3)     // Catch:{ RemoteException -> 0x0063 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0063 }
            b.l.a.c.d.d r1 = new b.l.a.c.d.d     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x0063 }
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0.x0(r1, r3)     // Catch:{ RemoteException -> 0x0063 }
            b.l.a.c.h.f.m r3 = c
            return r3
        L_0x0063:
            r3 = move-exception
            b.l.a.c.h.g.d r0 = new b.l.a.c.h.g.d
            r0.<init>(r3)
            throw r0
        L_0x006a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to find dynamic class "
            java.lang.String r0 = r0.concat(r2)
            r3.<init>(r0)
            throw r3
        L_0x0076:
            b.l.a.c.c.g r3 = new b.l.a.c.c.g
            r3.<init>(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.h.f.l.a(android.content.Context):b.l.a.c.h.f.m");
    }

    public static <T> T b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
        }
    }

    @Nullable
    public static Context c(Context context) {
        Context context2;
        Context context3 = f3870b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = DynamiteModule.c(context, DynamiteModule.f7280i, "com.google.android.gms.maps_dynamite").a;
        } catch (Exception e2) {
            Log.e(a, "Failed to load maps module, use legacy", e2);
            int i2 = h.f2601e;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        f3870b = context2;
        return context2;
    }
}
