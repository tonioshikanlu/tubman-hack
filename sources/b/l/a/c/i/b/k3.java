package b.l.a.c.i.b;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class k3 extends g5 {
    public char c = 0;
    public long d = -1;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public String f4088e;
    public final i3 f = new i3(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final i3 f4089g = new i3(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final i3 f4090h = new i3(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final i3 f4091i = new i3(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final i3 f4092j = new i3(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    public final i3 f4093k = new i3(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final i3 f4094l = new i3(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final i3 f4095m = new i3(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    public final i3 f4096n = new i3(this, 2, false, false);

    public k3(l4 l4Var) {
        super(l4Var);
    }

    public static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new j3(str);
    }

    public static String w(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = x(z, obj);
        String x2 = x(z, obj2);
        String x3 = x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    public static String x(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String y = y(l4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && y(className).equals(y)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof j3) {
                return ((j3) obj).a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final boolean i() {
        return false;
    }

    public final i3 o() {
        return this.f;
    }

    public final i3 p() {
        return this.f4091i;
    }

    public final i3 q() {
        return this.f4093k;
    }

    public final i3 r() {
        return this.f4095m;
    }

    public final i3 s() {
        return this.f4096n;
    }

    public final void u(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(v(), i2)) {
            Log.println(i2, v(), w(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            Objects.requireNonNull(str, "null reference");
            i4 i4Var = this.a.f4117j;
            if (i4Var == null) {
                Log.println(6, v(), "Scheduler not set. Not logging error/warn");
            } else if (!i4Var.k()) {
                Log.println(6, v(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 >= 9) {
                    i2 = 8;
                }
                i4Var.q(new h3(this, i2, str, obj, obj2, obj3));
            }
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String v() {
        String str;
        synchronized (this) {
            if (this.f4088e == null) {
                l4 l4Var = this.a;
                String str2 = l4Var.d;
                if (str2 != null) {
                    this.f4088e = str2;
                } else {
                    y9 y9Var = l4Var.f4114g.a.f;
                    this.f4088e = "FA";
                }
            }
            Objects.requireNonNull(this.f4088e, "null reference");
            str = this.f4088e;
        }
        return str;
    }
}
