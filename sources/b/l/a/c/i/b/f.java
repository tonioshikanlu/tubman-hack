package b.l.a.c.i.b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.RecyclerView;
import b.l.a.c.b.a;
import b.l.a.c.c.q.b;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class f extends f5 {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3999b;
    public e c = d.a;
    public Boolean d;

    public f(l4 l4Var) {
        super(l4Var);
    }

    public static final long A() {
        return x2.d.a(null).longValue();
    }

    public static final long i() {
        return x2.D.a(null).longValue();
    }

    public final String j(String str, String str2) {
        i3 i3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Objects.requireNonNull(str4, "null reference");
            return str4;
        } catch (ClassNotFoundException e2) {
            e = e2;
            i3Var = this.a.a().f;
            str3 = "Could not find SystemProperties class";
            i3Var.b(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            i3Var = this.a.a().f;
            str3 = "Could not find SystemProperties.get() method";
            i3Var.b(str3, e);
            return "";
        } catch (IllegalAccessException e4) {
            e = e4;
            i3Var = this.a.a().f;
            str3 = "Could not access SystemProperties.get()";
            i3Var.b(str3, e);
            return "";
        } catch (InvocationTargetException e5) {
            e = e5;
            i3Var = this.a.a().f;
            str3 = "SystemProperties.get() threw an exception";
            i3Var.b(str3, e);
            return "";
        }
    }

    public final int k() {
        k9 t = this.a.t();
        Boolean bool = t.a.z().f3932e;
        if (t.M() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int l(@Size(min = 1) String str) {
        return Math.max(Math.min(p(str, x2.I), 100), 25);
    }

    public final int m(@Size(min = 1) String str) {
        return Math.max(Math.min(p(str, x2.H), RecyclerView.MAX_SCROLL_DURATION), 500);
    }

    public final long n() {
        y9 y9Var = this.a.f;
        return 39000;
    }

    @WorkerThread
    public final long o(String str, w2<Long> w2Var) {
        if (str != null) {
            String b2 = this.c.b(str, w2Var.a);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    return w2Var.a(Long.valueOf(Long.parseLong(b2))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return w2Var.a(null).longValue();
    }

    @WorkerThread
    public final int p(String str, w2<Integer> w2Var) {
        if (str != null) {
            String b2 = this.c.b(str, w2Var.a);
            if (!TextUtils.isEmpty(b2)) {
                try {
                    return w2Var.a(Integer.valueOf(Integer.parseInt(b2))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return w2Var.a(null).intValue();
    }

    @WorkerThread
    public final int q(String str, w2<Integer> w2Var, int i2, int i3) {
        return Math.max(Math.min(p(str, w2Var), i3), i2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [b.l.a.c.i.b.w2, b.l.a.c.i.b.w2<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(java.lang.String r4, b.l.a.c.i.b.w2<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            b.l.a.c.i.b.e r1 = r3.c
            java.lang.String r2 = r5.a
            java.lang.String r4 = r1.b(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001d
            goto L_0x0003
        L_0x001d:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.f.r(java.lang.String, b.l.a.c.i.b.w2):boolean");
    }

    public final Bundle s() {
        try {
            if (this.a.a.getPackageManager() == null) {
                this.a.a().f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = b.a(this.a.a).a(this.a.a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            this.a.a().f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            this.a.a().f.b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final Boolean t(@Size(min = 1) String str) {
        a.x(str);
        Bundle s = s();
        if (s == null) {
            this.a.a().f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    public final boolean u() {
        y9 y9Var = this.a.f;
        Boolean t = t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    public final boolean v() {
        Boolean t = t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r0 = t("google_analytics_automatic_screen_reporting_enabled");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() {
        /*
            r2 = this;
            b.l.a.c.f.i.ha r0 = b.l.a.c.f.i.ha.f3593i
            b.l.a.c.f.i.ia r0 = r0.a()
            r0.a()
            r0 = 0
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.t0
            boolean r0 = r2.r(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.String r0 = "google_analytics_automatic_screen_reporting_enabled"
            java.lang.Boolean r0 = r2.t(r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.f.w():boolean");
    }

    public final boolean x(String str) {
        return "1".equals(this.c.b(str, "gaia_collection_enabled"));
    }

    public final boolean y(String str) {
        return "1".equals(this.c.b(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean z() {
        if (this.f3999b == null) {
            Boolean t = t("app_measurement_lite");
            this.f3999b = t;
            if (t == null) {
                this.f3999b = Boolean.FALSE;
            }
        }
        return this.f3999b.booleanValue() || !this.a.f4113e;
    }
}
