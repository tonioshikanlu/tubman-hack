package b.l.a.c.b;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.a.c.c.q.b;
import b.l.a.c.f.e.a3;
import b.l.a.c.f.e.aj;
import b.l.a.c.f.e.bj;
import b.l.a.c.f.e.bm;
import b.l.a.c.f.e.d1;
import b.l.a.c.f.e.ec;
import b.l.a.c.f.e.ej;
import b.l.a.c.f.e.f;
import b.l.a.c.f.e.f8;
import b.l.a.c.f.e.g0;
import b.l.a.c.f.e.i;
import b.l.a.c.f.e.ij;
import b.l.a.c.f.e.j;
import b.l.a.c.f.e.jm;
import b.l.a.c.f.e.l;
import b.l.a.c.f.e.o0;
import b.l.a.c.f.e.p8;
import b.l.a.c.f.e.pc;
import b.l.a.c.f.e.rm;
import b.l.a.c.f.e.s1;
import b.l.a.c.f.e.sl;
import b.l.a.c.f.e.sm;
import b.l.a.c.f.e.t8;
import b.l.a.c.f.e.uk;
import b.l.a.c.f.e.um;
import b.l.a.c.f.e.vg;
import b.l.a.c.f.e.vk;
import b.l.a.c.f.e.w1;
import b.l.a.c.f.e.w7;
import b.l.a.c.f.e.wk;
import b.l.a.c.f.e.zi;
import b.l.a.c.f.h.d;
import b.l.a.c.f.i.a7;
import b.l.a.c.f.i.d8;
import b.l.a.c.f.i.j4;
import b.l.a.c.f.i.n5;
import b.l.a.c.f.i.o7;
import b.l.a.c.f.i.p5;
import b.l.a.c.f.i.q5;
import b.l.a.c.f.i.q6;
import b.l.a.c.f.i.r4;
import b.l.a.c.f.i.s6;
import b.l.a.c.f.i.t3;
import b.l.a.c.f.i.t4;
import b.l.a.c.f.i.u3;
import b.l.a.c.f.i.v3;
import b.l.a.c.f.i.v5;
import b.l.a.c.f.i.w5;
import b.l.a.c.f.i.y5;
import b.l.a.c.f.i.z2;
import b.l.a.c.i.b.k3;
import b.l.a.c.i.b.y9;
import b.l.a.c.k.e0;
import b.l.a.c.k.f0;
import b.l.a.c.k.h;
import b.l.a.c.k.k;
import b.l.a.c.k.m;
import b.l.a.d.a.e.b0;
import b.l.a.d.a.e.u;
import b.l.c.a.c;
import b.l.c.b.o;
import b.l.d.a0.e;
import b.l.d.a0.g;
import b.l.d.o.a0;
import b.l.d.o.n0;
import b.l.d.o.t;
import b.l.d.o.x;
import b.l.d.o.y;
import b.l.d.o.z;
import b.l.d.p.d;
import b.l.d.p.o;
import b.l.d.p.p;
import b.l.d.p.q;
import b.l.d.p.r;
import b.l.d.p.s;
import b.l.d.q.f.g.d0;
import com.google.android.gms.common.api.Status;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;

public final class a {
    public static Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f2577b;
    public static Boolean c;
    public static Context d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f2578e;
    public static b.l.a.c.h.f.a f;

    /* renamed from: g  reason: collision with root package name */
    public static d f2579g;

    /* renamed from: h  reason: collision with root package name */
    public static y9 f2580h;

    @NonNull
    public static <T> T A(@Nullable T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    public static String A0(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    @NonNull
    public static vg A1(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(b.e.a.a.a.b(String.valueOf(str).length(), 47, String.valueOf(str2).length(), String.valueOf(message).length()));
        b.e.a.a.a.L(sb, "Failed to parse ", str, " for string [", str2);
        sb.append("] with exception: ");
        sb.append(message);
        Log.e(str, sb.toString());
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        b.e.a.a.a.L(sb2, "Failed to parse ", str, " for string [", str2);
        sb2.append("]");
        return new vg(sb2.toString(), exc);
    }

    public static int A2(o0 o0Var, byte[] bArr, int i2, int i3, int i4, jm jmVar) {
        g0 g0Var = (g0) o0Var;
        Object a2 = g0Var.a();
        int E = g0Var.E(a2, bArr, i2, i3, i4, jmVar);
        g0Var.b(a2);
        jmVar.c = a2;
        return E;
    }

    @NonNull
    public static <T> T B(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @TargetApi(19)
    public static boolean B0(Context context, int i2, String str) {
        b.l.a.c.c.q.a a2 = b.a(context);
        Objects.requireNonNull(a2);
        try {
            ((AppOpsManager) a2.a.getSystemService("appops")).checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static <T> T B1(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }

    public static int B2(a7 a7Var, byte[] bArr, int i2, int i3, int i4, j4 j4Var) {
        s6 s6Var = (s6) a7Var;
        Object r = ((p5) s6Var.f3720e).r(4, (Object) null, (Object) null);
        int A = s6Var.A(r, bArr, i2, i3, i4, j4Var);
        s6Var.h(r);
        j4Var.c = r;
        return A;
    }

    public static <T> T C(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int C0(Parcel parcel) {
        int readInt = parcel.readInt();
        int w0 = w0(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new b.l.a.c.c.m.v.b(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = w0 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new b.l.a.c.c.m.v.b(b.e.a.a.a.R(54, "Size read is invalid start=", dataPosition, " end=", i2), parcel);
    }

    public static <TResult> TResult C1(h<TResult> hVar) {
        if (hVar.n()) {
            return hVar.j();
        }
        if (hVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.i());
    }

    public static int C2(int i2, byte[] bArr, int i3, int i4, i<?> iVar, jm jmVar) {
        f fVar = (f) iVar;
        int Q0 = Q0(bArr, i3, jmVar);
        while (true) {
            fVar.l(jmVar.a);
            if (Q0 >= i4) {
                break;
            }
            int Q02 = Q0(bArr, Q0, jmVar);
            if (i2 != jmVar.a) {
                break;
            }
            Q0 = Q0(bArr, Q02, jmVar);
        }
        return Q0;
    }

    public static void D(int i2, int i3, int i4) {
        String str;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                str = f(i2, i4, "start index");
            } else if (i3 < 0 || i3 > i4) {
                str = f(i3, i4, "end index");
            } else {
                str = c.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static h<Void> D0(Collection<? extends h<?>> collection) {
        if (collection.isEmpty()) {
            return X((Object) null);
        }
        for (h requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        e0 e0Var = new e0();
        m mVar = new m(collection.size(), e0Var);
        for (h k1 : collection) {
            k1(k1, mVar);
        }
        return e0Var;
    }

    public static String D1(t8 t8Var) {
        int ordinal = t8Var.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(t8Var);
        throw new NoSuchAlgorithmException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 27), "hash unsupported for HMAC: ", valueOf));
    }

    public static int D2(int i2, byte[] bArr, int i3, int i4, v5<?> v5Var, j4 j4Var) {
        q5 q5Var = (q5) v5Var;
        int R0 = R0(bArr, i3, j4Var);
        while (true) {
            q5Var.n(j4Var.a);
            if (R0 >= i4) {
                break;
            }
            int R02 = R0(bArr, R0, j4Var);
            if (i2 != j4Var.a) {
                break;
            }
            R0 = R0(bArr, R02, j4Var);
        }
        return R0;
    }

    public static void E(boolean z) {
        if (!z) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    public static void E0(Parcel parcel, int i2, Boolean bool, boolean z) {
        if (bool != null) {
            I1(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    @Nullable
    public static final String E1(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static int E2(byte[] bArr, int i2, i<?> iVar, jm jmVar) {
        f fVar = (f) iVar;
        int Q0 = Q0(bArr, i2, jmVar);
        int i3 = jmVar.a + Q0;
        while (Q0 < i3) {
            Q0 = Q0(bArr, Q0, jmVar);
            fVar.l(jmVar.a);
        }
        if (Q0 == i3) {
            return Q0;
        }
        throw l.a();
    }

    public static void F(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void F0(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int P0 = P0(parcel, i2);
            parcel.writeBundle(bundle);
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static BigInteger F1(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static int F2(byte[] bArr, int i2, v5<?> v5Var, j4 j4Var) {
        q5 q5Var = (q5) v5Var;
        int R0 = R0(bArr, i2, j4Var);
        int i3 = j4Var.a + R0;
        while (R0 < i3) {
            R0 = R0(bArr, R0, j4Var);
            q5Var.n(j4Var.a);
        }
        if (R0 == i3) {
            return R0;
        }
        throw y5.a();
    }

    public static void G(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void G0(Parcel parcel, int i2, Float f2, boolean z) {
        if (f2 != null) {
            I1(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static List<t> G1(List<vk> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (vk next : list) {
            y yVar = null;
            if (next != null && !TextUtils.isEmpty(next.f3357h)) {
                yVar = new y(next.f3358i, next.f3359j, next.f3360k, next.f3357h);
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    public static int G2(o0<?> o0Var, int i2, byte[] bArr, int i3, int i4, i<?> iVar, jm jmVar) {
        int y2 = y2(o0Var, bArr, i3, i4, jmVar);
        while (true) {
            iVar.add(jmVar.c);
            if (y2 >= i4) {
                break;
            }
            int Q0 = Q0(bArr, y2, jmVar);
            if (i2 != jmVar.a) {
                break;
            }
            y2 = y2(o0Var, bArr, Q0, i4, jmVar);
        }
        return y2;
    }

    public static void H(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void H0(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int P0 = P0(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static void H1(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static int H2(a7<?> a7Var, int i2, byte[] bArr, int i3, int i4, v5<?> v5Var, j4 j4Var) {
        int z2 = z2(a7Var, bArr, i3, i4, j4Var);
        while (true) {
            v5Var.add(j4Var.c);
            if (z2 >= i4) {
                break;
            }
            int R0 = R0(bArr, z2, j4Var);
            if (i2 != j4Var.a) {
                break;
            }
            z2 = z2(a7Var, bArr, R0, i4, j4Var);
        }
        return z2;
    }

    public static b.l.d.p.d<?> I(String str, String str2) {
        b.l.d.a0.a aVar = new b.l.d.a0.a(str, str2);
        d.b<e> a2 = b.l.d.p.d.a(e.class);
        a2.d = 1;
        a2.c(new b.l.d.p.c(aVar));
        return a2.b();
    }

    public static void I0(Parcel parcel, int i2, Long l2, boolean z) {
        if (l2 != null) {
            I1(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static void I1(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i3);
            return;
        }
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static int I2(int i2, byte[] bArr, int i3, int i4, d1 d1Var, jm jmVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int R1 = R1(bArr, i3, jmVar);
                d1Var.c(i2, Long.valueOf(jmVar.f3100b));
                return R1;
            } else if (i5 == 1) {
                d1Var.c(i2, Long.valueOf(h2(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int Q0 = Q0(bArr, i3, jmVar);
                int i6 = jmVar.a;
                if (i6 < 0) {
                    throw l.b();
                } else if (i6 <= bArr.length - Q0) {
                    d1Var.c(i2, i6 == 0 ? um.f3344i : um.J(bArr, Q0, i6));
                    return Q0 + i6;
                } else {
                    throw l.a();
                }
            } else if (i5 == 3) {
                int i7 = (i2 & -8) | 4;
                d1 a2 = d1.a();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int Q02 = Q0(bArr, i3, jmVar);
                    int i9 = jmVar.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = Q02;
                        break;
                    }
                    int I2 = I2(i8, bArr, Q02, i4, a2, jmVar);
                    i8 = i9;
                    i3 = I2;
                }
                if (i3 > i4 || i8 != i7) {
                    throw l.f();
                }
                d1Var.c(i2, a2);
                return i3;
            } else if (i5 == 5) {
                d1Var.c(i2, Integer.valueOf(a2(bArr, i3)));
                return i3 + 4;
            } else {
                throw l.d();
            }
        } else {
            throw l.d();
        }
    }

    public static Bundle J(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w0);
        return readBundle;
    }

    public static void J0(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int P0 = P0(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static void J1(k3 k3Var, SQLiteDatabase sQLiteDatabase) {
        if (k3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                k3Var.f4091i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                k3Var.f4091i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                k3Var.f4091i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                k3Var.f4091i.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static int J2(int i2, byte[] bArr, int i3, int i4, o7 o7Var, j4 j4Var) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int S1 = S1(bArr, i3, j4Var);
                o7Var.c(i2, Long.valueOf(j4Var.f3616b));
                return S1;
            } else if (i5 == 1) {
                o7Var.c(i2, Long.valueOf(l2(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int R0 = R0(bArr, i3, j4Var);
                int i6 = j4Var.a;
                if (i6 < 0) {
                    throw y5.b();
                } else if (i6 <= bArr.length - R0) {
                    o7Var.c(i2, i6 == 0 ? t4.f3759i : t4.H(bArr, R0, i6));
                    return R0 + i6;
                } else {
                    throw y5.a();
                }
            } else if (i5 == 3) {
                int i7 = (i2 & -8) | 4;
                o7 a2 = o7.a();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int R02 = R0(bArr, i3, j4Var);
                    int i9 = j4Var.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = R02;
                        break;
                    }
                    int J2 = J2(i8, bArr, R02, i4, a2, j4Var);
                    i8 = i9;
                    i3 = J2;
                }
                if (i3 > i4 || i8 != i7) {
                    throw y5.c();
                }
                o7Var.c(i2, a2);
                return i3;
            } else if (i5 == 5) {
                o7Var.c(i2, Integer.valueOf(f2(bArr, i3)));
                return i3 + 4;
            } else {
                throw new y5("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new y5("Protocol message contained an invalid tag (zero).");
        }
    }

    public static <T extends Parcelable> T K(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w0);
        return t;
    }

    public static void K0(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int P0 = P0(parcel, i2);
            parcel.writeString(str);
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static final void K1(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object K1 : (List) obj) {
                K1(sb, i2, str, K1);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry K12 : ((Map) obj).entrySet()) {
                K1(sb, i2, str, K12);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                um umVar = um.f3344i;
                sb.append(b1(new rm(((String) obj).getBytes(j.a))));
                sb.append('\"');
            } else if (obj instanceof um) {
                sb.append(": \"");
                sb.append(b1((um) obj));
                sb.append('\"');
            } else if (obj instanceof b.l.a.c.f.e.e) {
                sb.append(" {");
                V1((b.l.a.c.f.e.e) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                K1(sb, i5, "key", entry.getKey());
                K1(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static String L(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w0);
        return readString;
    }

    public static void L0(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list != null) {
            int P0 = P0(parcel, i2);
            parcel.writeStringList(list);
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static void L1(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }

    public static ArrayList<String> M(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w0);
        return createStringArrayList;
    }

    public static <T extends Parcelable> void M0(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int P0 = P0(parcel, i2);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    h1(parcel, t, i3);
                }
            }
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static boolean M1(String str) {
        int i2 = wk.a;
        return str == null || str.isEmpty();
    }

    public static <T> T[] N(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w0);
        return createTypedArray;
    }

    public static <T extends Parcelable> void N0(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int P0 = P0(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    h1(parcel, parcelable, 0);
                }
            }
            H1(parcel, P0);
        } else if (z) {
            I1(parcel, i2, 0);
        }
    }

    public static byte[] N1(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static <T> ArrayList<T> O(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w0);
        return createTypedArrayList;
    }

    public static byte O0(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    public static byte[] O1(byte[]... bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int length2 = bArr[i2].length;
            if (i3 <= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - length2) {
                i3 += length2;
                i2++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        for (byte[] bArr3 : bArr) {
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i4, length3);
            i4 += length3;
        }
        return bArr2;
    }

    public static <T> void P(T t, Object obj) {
        Objects.requireNonNull(t, (String) obj);
    }

    public static int P0(Parcel parcel, int i2) {
        parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void P1(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object P1 : (List) obj) {
                P1(sb, i2, str, P1);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry P12 : ((Map) obj).entrySet()) {
                P1(sb, i2, str, P12);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                t4 t4Var = t4.f3759i;
                sb.append(c1(new r4(((String) obj).getBytes(w5.a))));
                sb.append('\"');
            } else if (obj instanceof t4) {
                sb.append(": \"");
                sb.append(c1((t4) obj));
                sb.append('\"');
            } else if (obj instanceof p5) {
                sb.append(" {");
                W1((p5) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                P1(sb, i5, "key", entry.getKey());
                P1(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static void Q(List<b.l.d.p.d<?>> list) {
        Set<p> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<b.l.d.p.d<?>> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                b.l.d.p.d next = it.next();
                p pVar = new p(next);
                Iterator<Class<? super T>> it2 = next.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        q qVar = new q(next2, !next.b(), (o) null);
                        if (!hashMap.containsKey(qVar)) {
                            hashMap.put(qVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(qVar);
                        if (set2.isEmpty() || qVar.f5045b) {
                            set2.add(pVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<p> it3 : hashMap.values()) {
                    for (p pVar2 : it3) {
                        for (r next3 : pVar2.a.f5030b) {
                            if ((next3.c == 0) && (set = (Set) hashMap.get(new q(next3.a, next3.a(), (o) null))) != null) {
                                for (p pVar3 : set) {
                                    pVar2.f5044b.add(pVar3);
                                    pVar3.c.add(pVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    p pVar4 = (p) it4.next();
                    if (pVar4.a()) {
                        hashSet2.add(pVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    p pVar5 = (p) hashSet2.iterator().next();
                    hashSet2.remove(pVar5);
                    i2++;
                    for (p next4 : pVar5.f5044b) {
                        next4.c.remove(pVar5);
                        if (next4.a()) {
                            hashSet2.add(next4);
                        }
                    }
                }
                if (i2 != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        p pVar6 = (p) it5.next();
                        if (!pVar6.a() && !pVar6.f5044b.isEmpty()) {
                            arrayList.add(pVar6.a);
                        }
                    }
                    throw new s(arrayList);
                }
                return;
            }
        }
    }

    public static int Q0(byte[] bArr, int i2, jm jmVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return w1(b2, bArr, i3, jmVar);
        }
        jmVar.a = b2;
        return i3;
    }

    public static int Q1(p8 p8Var) {
        int ordinal = p8Var.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(p8Var);
                throw new GeneralSecurityException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 20), "unknown curve type: ", valueOf));
            }
        }
        return i2;
    }

    public static String R(String str, String str2) {
        return b.e.a.a.a.r(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static int R0(byte[] bArr, int i2, j4 j4Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return x1(b2, bArr, i3, j4Var);
        }
        j4Var.a = b2;
        return i3;
    }

    public static int R1(byte[] bArr, int i2, jm jmVar) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 < 0) {
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
            int i5 = 7;
            while (b2 < 0) {
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                i5 += 7;
                j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
                int i7 = i6;
                b2 = b3;
                i4 = i7;
            }
            jmVar.f3100b = j3;
            return i4;
        }
        jmVar.f3100b = j2;
        return i3;
    }

    public static void S(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new b.l.a.c.c.m.v.b(b.e.a.a.a.Q(37, "Overread allowed size end=", i2), parcel);
        }
    }

    public static long S0(String str) {
        byte[] bArr;
        x(str);
        List<String> b2 = new w1(new sm(new pc())).b(str);
        if (b2.size() < 2) {
            throw new RuntimeException(str.length() != 0 ? "Invalid idToken ".concat(str) : new String("Invalid idToken "));
        }
        String str2 = b2.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            uk a2 = uk.a(new String(bArr, "UTF-8"));
            return a2.f3333b.longValue() - a2.a.longValue();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }

    public static int S1(byte[] bArr, int i2, j4 j4Var) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 < 0) {
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
            int i5 = 7;
            while (b2 < 0) {
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                i5 += 7;
                j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
                int i7 = i6;
                b2 = b3;
                i4 = i7;
            }
            j4Var.f3616b = j3;
            return i4;
        }
        j4Var.f3616b = j2;
        return i3;
    }

    public static boolean T(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @NonNull
    public static Status T0(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? z1((String) asList.get(0), (String) asList.get(1)) : z1((String) asList.get(0), (String) null);
    }

    public static String T1(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
                    b.e.a.a.a.L(sb3, "<", sb2, " threw ", name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i3] = str2;
            i3++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                sb4.append(str, i4, str.length());
            } else {
                sb4.append(str, i4, indexOf);
                sb4.append(objArr[i2]);
                i4 = indexOf + 2;
                i2++;
            }
        }
        sb4.append(str, i4, str.length());
        if (i2 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static boolean U(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @NonNull
    public static sl U0(b.l.d.o.c cVar, @Nullable String str) {
        if (b.l.d.o.s.class.isAssignableFrom(cVar.getClass())) {
            b.l.d.o.s sVar = (b.l.d.o.s) cVar;
            return new sl(sVar.f5014h, sVar.f5015i, "google.com", (String) null, (String) null, str, (String) null, (String) null);
        } else if (b.l.d.o.e.class.isAssignableFrom(cVar.getClass())) {
            return new sl((String) null, ((b.l.d.o.e) cVar).f4951h, "facebook.com", (String) null, (String) null, str, (String) null, (String) null);
        } else {
            if (a0.class.isAssignableFrom(cVar.getClass())) {
                a0 a0Var = (a0) cVar;
                return new sl((String) null, a0Var.f4937h, "twitter.com", a0Var.f4938i, (String) null, str, (String) null, (String) null);
            } else if (b.l.d.o.r.class.isAssignableFrom(cVar.getClass())) {
                return new sl((String) null, ((b.l.d.o.r) cVar).f5011h, "github.com", (String) null, (String) null, str, (String) null, (String) null);
            } else {
                if (z.class.isAssignableFrom(cVar.getClass())) {
                    return new sl((String) null, (String) null, "playgames.google.com", (String) null, ((z) cVar).f5028h, str, (String) null, (String) null);
                }
                if (n0.class.isAssignableFrom(cVar.getClass())) {
                    n0 n0Var = (n0) cVar;
                    sl slVar = n0Var.f5006k;
                    if (slVar != null) {
                        return slVar;
                    }
                    return new sl(n0Var.f5004i, n0Var.f5005j, n0Var.f5003h, n0Var.f5008m, (String) null, str, n0Var.f5007l, n0Var.f5009n);
                }
                throw new IllegalArgumentException("Unsupported credential type.");
            }
        }
    }

    public static /* synthetic */ void U1(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || u2(b3)) {
            throw l.g();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static String V(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(b.e.a.a.a.b(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        b.e.a.a.a.L(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    public static bm V0(x xVar) {
        if (!TextUtils.isEmpty(xVar.f5022m)) {
            String str = xVar.f5020k;
            String str2 = xVar.f5022m;
            boolean z = xVar.f5021l;
            bm bmVar = new bm();
            x(str);
            bmVar.f2869h = str;
            x(str2);
            bmVar.f2872k = str2;
            bmVar.f2874m = z;
            return bmVar;
        }
        String str3 = xVar.f5017h;
        String str4 = xVar.f5018i;
        boolean z2 = xVar.f5021l;
        bm bmVar2 = new bm();
        x(str3);
        bmVar2.f2870i = str3;
        x(str4);
        bmVar2.f2871j = str4;
        bmVar2.f2874m = z2;
        return bmVar2;
    }

    public static void V1(b.l.a.c.f.e.e0 e0Var, StringBuilder sb, int i2) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : e0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    K1(sb, i2, b2(concat), b.l.a.c.f.e.e.d(method2, e0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    K1(sb, i2, b2(concat2), b.l.a.c.f.e.e.d(method3, e0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object d2 = b.l.a.c.f.e.e.d(method4, e0Var, new Object[0]);
                    if (method5 == null) {
                        if (d2 instanceof Boolean) {
                            if (!((Boolean) d2).booleanValue()) {
                            }
                        } else if (d2 instanceof Integer) {
                            if (((Integer) d2).intValue() == 0) {
                            }
                        } else if (d2 instanceof Float) {
                            if (((Float) d2).floatValue() == 0.0f) {
                            }
                        } else if (!(d2 instanceof Double)) {
                            if (d2 instanceof String) {
                                obj = "";
                            } else if (d2 instanceof um) {
                                obj = um.f3344i;
                            } else if (d2 instanceof b.l.a.c.f.e.e0) {
                                if (d2 == ((b.l.a.c.f.e.e0) d2).q()) {
                                }
                            } else if ((d2 instanceof Enum) && ((Enum) d2).ordinal() == 0) {
                            }
                            if (d2.equals(obj)) {
                            }
                        } else if (((Double) d2).doubleValue() == ShadowDrawableWrapper.COS_45) {
                        }
                    } else if (!((Boolean) b.l.a.c.f.e.e.d(method5, e0Var, new Object[0])).booleanValue()) {
                    }
                    K1(sb, i2, b2(concat3), d2);
                }
            }
        }
        if (!(e0Var instanceof b.l.a.c.f.e.c)) {
            d1 d1Var = ((b.l.a.c.f.e.e) e0Var).zzc;
            if (d1Var != null) {
                for (int i3 = 0; i3 < d1Var.a; i3++) {
                    K1(sb, i2, String.valueOf(d1Var.f2903b[i3] >>> 3), d1Var.c[i3]);
                }
                return;
            }
            return;
        }
        b.l.a.c.f.e.c cVar = (b.l.a.c.f.e.c) e0Var;
        throw null;
    }

    public static <TResult> h<TResult> W(@NonNull Exception exc) {
        e0 e0Var = new e0();
        e0Var.p(exc);
        return e0Var;
    }

    public static <T> t3<T> W0(t3<T> t3Var) {
        return ((t3Var instanceof v3) || (t3Var instanceof u3)) ? t3Var : t3Var instanceof Serializable ? new u3(t3Var) : new v3(t3Var);
    }

    public static void W1(q6 q6Var, StringBuilder sb, int i2) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : q6Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    P1(sb, i2, g2(concat), p5.j(method2, q6Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    P1(sb, i2, g2(concat2), p5.j(method3, q6Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object j2 = p5.j(method4, q6Var, new Object[0]);
                    if (method5 == null) {
                        if (j2 instanceof Boolean) {
                            if (!((Boolean) j2).booleanValue()) {
                            }
                        } else if (j2 instanceof Integer) {
                            if (((Integer) j2).intValue() == 0) {
                            }
                        } else if (j2 instanceof Float) {
                            if (((Float) j2).floatValue() == 0.0f) {
                            }
                        } else if (!(j2 instanceof Double)) {
                            if (j2 instanceof String) {
                                obj = "";
                            } else if (j2 instanceof t4) {
                                obj = t4.f3759i;
                            } else if (j2 instanceof q6) {
                                if (j2 == ((q6) j2).d()) {
                                }
                            } else if ((j2 instanceof Enum) && ((Enum) j2).ordinal() == 0) {
                            }
                            if (j2.equals(obj)) {
                            }
                        } else if (((Double) j2).doubleValue() == ShadowDrawableWrapper.COS_45) {
                        }
                    } else if (!((Boolean) p5.j(method5, q6Var, new Object[0])).booleanValue()) {
                    }
                    P1(sb, i2, g2(concat3), j2);
                }
            }
        }
        if (!(q6Var instanceof n5)) {
            o7 o7Var = ((p5) q6Var).zzc;
            if (o7Var != null) {
                for (int i3 = 0; i3 < o7Var.a; i3++) {
                    P1(sb, i2, String.valueOf(o7Var.f3675b[i3] >>> 3), o7Var.c[i3]);
                }
                return;
            }
            return;
        }
        n5 n5Var = (n5) q6Var;
        throw null;
    }

    public static <TResult> h<TResult> X(TResult tresult) {
        e0 e0Var = new e0();
        e0Var.q(tresult);
        return e0Var;
    }

    public static Boolean X0(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final byte[] X1(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    public static b.l.d.p.d<?> Y(String str, g<Context> gVar) {
        d.b<e> a2 = b.l.d.p.d.a(e.class);
        a2.d = 1;
        a2.a(new r(Context.class, 1, 0));
        a2.c(new b.l.d.a0.f(str, gVar));
        return a2.b();
    }

    public static <V> V Y0(z2<V> z2Var) {
        long clearCallingIdentity;
        try {
            return z2Var.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = z2Var.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static /* synthetic */ void Y1(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || v2(b3)) {
            throw y5.d();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    @NonNull
    public static String Z(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                return b.e.a.a.a.Q(32, "unknown status code: ", i2);
        }
    }

    public static String Z0() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        L1(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            L1(sb, locale2);
        }
        return sb.toString();
    }

    public static int Z1(w7 w7Var) {
        int ordinal = w7Var.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(w7Var);
                throw new GeneralSecurityException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 22), "unknown point format: ", valueOf));
            }
        }
        return i2;
    }

    public static Object a(o.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.m();
    }

    public static DateFormat a0(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else if (i2 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.g("Unknown DateFormat style: ", i2));
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else if (i3 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.g("Unknown DateFormat style: ", i3));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static String a1(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int a2(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & ExifInterface.MARKER) << 24) | (bArr[i2] & ExifInterface.MARKER) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 16);
    }

    public static <TResult> TResult b(@NonNull h<TResult> hVar) {
        z("Must not be called on the main application thread");
        B(hVar, "Task must not be null");
        if (hVar.m()) {
            return C1(hVar);
        }
        k kVar = new k((f0) null);
        k1(hVar, kVar);
        kVar.a.await();
        return C1(hVar);
    }

    public static void b0(PackageManager packageManager, ComponentName componentName, int i2) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i2 | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    loop0:
                    while (true) {
                        if (i3 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                componentInfo = componentInfoArr2[i4];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i3++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static String b1(um umVar) {
        String str;
        StringBuilder sb = new StringBuilder(umVar.l());
        for (int i2 = 0; i2 < umVar.l(); i2++) {
            int d2 = umVar.d(i2);
            if (d2 == 34) {
                str = "\\\"";
            } else if (d2 == 39) {
                str = "\\'";
            } else if (d2 != 92) {
                switch (d2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d2 < 32 || d2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((d2 >>> 6) & 3) + 48));
                            sb.append((char) (((d2 >>> 3) & 7) + 48));
                            d2 = (d2 & 7) + 48;
                        }
                        sb.append((char) d2);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static final String b2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static <TResult> TResult c(@NonNull h<TResult> hVar, long j2, @NonNull TimeUnit timeUnit) {
        z("Must not be called on the main application thread");
        B(hVar, "Task must not be null");
        B(timeUnit, "TimeUnit must not be null");
        if (hVar.m()) {
            return C1(hVar);
        }
        k kVar = new k((f0) null);
        k1(hVar, kVar);
        if (kVar.a.await(j2, timeUnit)) {
            return C1(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <T> void c0(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static String c1(t4 t4Var) {
        String str;
        StringBuilder sb = new StringBuilder(t4Var.l());
        for (int i2 = 0; i2 < t4Var.l(); i2++) {
            int d2 = t4Var.d(i2);
            if (d2 == 34) {
                str = "\\\"";
            } else if (d2 == 39) {
                str = "\\'";
            } else if (d2 != 92) {
                switch (d2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d2 < 32 || d2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((d2 >>> 6) & 3) + 48));
                            sb.append((char) (((d2 >>> 3) & 7) + 48));
                            d2 = (d2 & 7) + 48;
                        }
                        sb.append((char) d2);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static BigInteger c2(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger F1 = F1(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(F1);
        if (F1.signum() == 1) {
            BigInteger mod2 = mod.mod(F1);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!F1.testBit(0) || !F1.testBit(1)) {
                    if (F1.testBit(0) && !F1.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = F1.subtract(bigInteger3).shiftRight(1);
                        int i2 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(F1);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, F1);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(F1)) {
                                BigInteger shiftRight2 = F1.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(F1).multiply(mod3)).mod(F1);
                                    BigInteger mod4 = multiply.add(multiply).mod(F1);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(F1);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(F1);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i2++;
                                if (i2 == 128 && !F1.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(F1.add(BigInteger.ONE).shiftRight(2), F1);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(F1).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z != bigInteger3.testBit(0) ? F1.subtract(bigInteger3).mod(F1) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static <ResultT> ResultT d(@NonNull b.l.a.d.a.i.r<ResultT> rVar) {
        boolean z;
        P(rVar, "Task must not be null");
        synchronized (rVar.a) {
            z = rVar.c;
        }
        if (z) {
            return h(rVar);
        }
        b.l.a.d.a.i.s sVar = new b.l.a.d.a.i.s((byte[]) null);
        Executor executor = b.l.a.d.a.i.e.f4689b;
        rVar.c(executor, sVar);
        rVar.b(executor, sVar);
        sVar.a.await();
        return h(rVar);
    }

    public static boolean d0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static String d1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b2 : bArr) {
            byte b3 = b2 & ExifInterface.MARKER;
            sb.append("0123456789abcdef".charAt(b3 >> 4));
            sb.append("0123456789abcdef".charAt(b3 & 15));
        }
        return sb.toString();
    }

    public static final void d2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static String e(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static boolean e0(Context context, int i2) {
        if (!B0(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            b.l.a.c.c.j a2 = b.l.a.c.c.j.a(context);
            Objects.requireNonNull(a2);
            if (packageInfo == null) {
                return false;
            }
            if (!b.l.a.c.c.j.d(packageInfo, false)) {
                if (!b.l.a.c.c.j.d(packageInfo, true)) {
                    return false;
                }
                if (!b.l.a.c.c.i.a(a2.a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @NonNull
    public static List<String> e1(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
        }
        return arrayList;
    }

    public static void e2(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) ((int) (255 & j2));
            i3++;
            j2 >>= 8;
        }
    }

    public static String f(int i2, int i3, String str) {
        if (i2 < 0) {
            return c.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        } else if (i3 >= 0) {
            return c.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.g("negative size: ", i3));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean f0(android.content.Context r4) {
        /*
            java.lang.Class<b.l.a.c.b.a> r0 = b.l.a.c.b.a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004a }
            android.content.Context r2 = d     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0017
            java.lang.Boolean r3 = f2578e     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0017
            if (r2 != r1) goto L_0x0017
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x0017:
            r2 = 0
            f2578e = r2     // Catch:{ all -> 0x004a }
            boolean r2 = d0()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x002f
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004a }
        L_0x002c:
            f2578e = r4     // Catch:{ all -> 0x004a }
            goto L_0x0040
        L_0x002f:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003d }
            f2578e = r4     // Catch:{ ClassNotFoundException -> 0x003d }
            goto L_0x0040
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004a }
            goto L_0x002c
        L_0x0040:
            d = r1     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = f2578e     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x004a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.b.a.f0(android.content.Context):boolean");
    }

    public static void f1(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static int f2(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & ExifInterface.MARKER) << 24) | (bArr[i2] & ExifInterface.MARKER) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 16);
    }

    public static ExecutorService g(String str) {
        String str2 = str;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new d0(str2, new AtomicLong(1)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new b.l.d.q.f.g.e0(str, unconfigurableExecutorService, 2, TimeUnit.SECONDS), b.e.a.a.a.m("Crashlytics Shutdown Hook for ", str2)));
        return unconfigurableExecutorService;
    }

    public static boolean g0(String str) {
        int i2 = b.l.c.a.b.a;
        return str == null || str.isEmpty();
    }

    public static void g1(Parcel parcel, int i2, int i3) {
        int w0 = w0(parcel, i2);
        if (w0 != i3) {
            String hexString = Integer.toHexString(w0);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(w0);
            throw new b.l.a.c.c.m.v.b(b.e.a.a.a.r(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static final String g2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static <ResultT> ResultT h(b.l.a.d.a.i.r<ResultT> rVar) {
        Exception exc;
        if (rVar.g()) {
            return rVar.f();
        }
        synchronized (rVar.a) {
            exc = rVar.f4702e;
        }
        throw new ExecutionException(exc);
    }

    @TargetApi(20)
    public static boolean h0(Context context) {
        if (a == null) {
            a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    public static <T extends Parcelable> void h1(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static long h2(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static <TResult> h<TResult> i(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        B(executor, "Executor must not be null");
        B(callable, "Callback must not be null");
        e0 e0Var = new e0();
        executor.execute(new f0(e0Var, callable));
        return e0Var;
    }

    @TargetApi(26)
    public static boolean i0(Context context) {
        if (!h0(context)) {
            return false;
        }
        if (f2577b == null) {
            f2577b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f2577b.booleanValue() && !d0();
    }

    public static void i1(f8 f8Var) {
        i2(Q1(f8Var.s().s()));
        D1(f8Var.s().t());
        if (f8Var.u() != w7.UNKNOWN_FORMAT) {
            a3.c(f8Var.t().s());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static ECParameterSpec i2(int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3 = i2 - 1;
        if (i3 == 0) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i3 != 1) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        }
        return t2(str, str2, str3, str4, str5);
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void j0(b.l.a.d.a.e.t tVar, InputStream inputStream, OutputStream outputStream, long j2) {
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new b.l.a.d.a.e.s(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j3 = 0;
            while (true) {
                long j4 = j2 - j3;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                k0(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                k0(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m0(bArr, tVar, outputStream, readUnsignedShort, read2, j4);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m0(bArr, tVar, outputStream, readUnsignedShort2, read2, j4);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m0(bArr, tVar, outputStream, readUnsignedShort3, read2, j4);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m0(bArr, tVar, outputStream, readInt2, read2, j4);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m0(bArr, tVar, outputStream, readInt3, read2, j4);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m0(bArr, tVar, outputStream, readInt4, read2, j4);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m0(bArr, tVar, outputStream, readLong, read2, j4);
                                break;
                            default:
                                k0(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                        }
                        j3 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            throw new b.l.a.d.a.e.s(b.e.a.a.a.Q(30, "Unexpected version=", read));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }, LOOP:1: B:31:0x00bb->B:36:0x00cd, LOOP_START, PHI: r13 
      PHI: (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:30:0x00b9, B:36:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[Catch:{  }, RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j1(b.l.a.c.i.b.k3 r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) {
        /*
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto L_0x00fa
            r13 = 0
            r14 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r6[r13] = r11     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002d }
            r2.close()
            if (r0 != 0) goto L_0x0045
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            goto L_0x00f4
        L_0x0032:
            r0 = move-exception
            r2 = r14
        L_0x0034:
            b.l.a.c.i.b.i3 r3 = r1.f4091i     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Error querying for table"
            r3.c(r4, r11, r0)     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0040
            r2.close()
        L_0x0040:
            r2 = r18
            r10.execSQL(r2)
        L_0x0045:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            android.database.Cursor r2 = r10.rawQuery(r2, r14)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00e4 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00e4 }
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00e9 }
            r4 = r13
        L_0x007e:
            if (r4 >= r3) goto L_0x00b9
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r6 == 0) goto L_0x008b
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008b:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00b9:
            if (r12 == 0) goto L_0x00d0
        L_0x00bb:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00e9 }
            if (r13 >= r2) goto L_0x00d0
            r2 = r12[r13]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00cd
            int r2 = r13 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00e9 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00cd:
            int r13 = r13 + 2
            goto L_0x00bb
        L_0x00d0:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00e3
            b.l.a.c.i.b.i3 r2 = r1.f4091i     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00e9 }
            r2.c(r3, r11, r0)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.b(r2, r11)
            throw r0
        L_0x00f2:
            r0 = move-exception
            r14 = r2
        L_0x00f4:
            if (r14 == 0) goto L_0x00f9
            r14.close()
        L_0x00f9:
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.b.a.j1(b.l.a.c.i.b.k3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static /* synthetic */ void j2(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!u2(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!u2(b4)) {
                cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw l.g();
    }

    public static void k(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void k0(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i2) <= j2) {
            while (i2 > 0) {
                try {
                    int min = Math.min(i2, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i2 -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    public static void k1(h<?> hVar, b.l.a.c.k.l lVar) {
        Executor executor = b.l.a.c.k.j.f4426b;
        hVar.e(executor, lVar);
        hVar.d(executor, lVar);
        hVar.a(executor, lVar);
    }

    public static final byte[] k2(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return X1(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void l(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(c.a(str, Character.valueOf(c2)));
        }
    }

    public static RuntimeException l0(Throwable th) {
        Object obj = b.l.c.a.d.a;
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        } else {
            throw ((Error) th);
        }
    }

    public static void l1(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", (intent.getExtras() == null || !b.l.d.z.c.h(intent.getExtras())) ? "data" : "display");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 22);
            sb.append("Sending event=");
            sb.append(str);
            sb.append(" params=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        b.l.d.d c2 = b.l.d.d.c();
        c2.a();
        b.l.d.n.a.a aVar = (b.l.d.n.a.a) c2.d.a(b.l.d.n.a.a.class);
        if (aVar != null) {
            aVar.c("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static long l2(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static void m(boolean z, String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(c.a(str, Integer.valueOf(i2)));
        }
    }

    public static void m0(byte[] bArr, b.l.a.d.a.e.t tVar, OutputStream outputStream, long j2, int i2, long j3) {
        InputStream e2;
        Throwable th;
        byte[] bArr2 = bArr;
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException("copyLength negative");
        } else if (j2 >= 0) {
            long j4 = (long) i3;
            if (j4 <= j3) {
                u uVar = new u(tVar, j2, j4);
                synchronized (uVar) {
                    e2 = uVar.e(0, uVar.b());
                }
                while (i3 > 0) {
                    try {
                        int min = Math.min(i3, 16384);
                        int i4 = 0;
                        while (i4 < min) {
                            int read = e2.read(bArr, i4, min - i4);
                            if (read != -1) {
                                i4 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        OutputStream outputStream2 = outputStream;
                        outputStream.write(bArr, 0, min);
                        i3 -= min;
                    } catch (EOFException e3) {
                        throw new IOException("patch underrun", e3);
                    } catch (Throwable th2) {
                        b0.a.a(th, th2);
                    }
                }
                e2.close();
                return;
            }
            throw new IOException("Output length overrun");
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    public static void m1(String str, aj ajVar, ij ijVar, Type type, ej ejVar) {
        String str2;
        BufferedOutputStream bufferedOutputStream;
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            boolean z = true;
            httpURLConnection.setDoOutput(true);
            byte[] bytes = ajVar.a().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            ejVar.a(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (responseCode < 200 || responseCode >= 300) {
                z = false;
            }
            if (!z) {
                ijVar.d((String) zi.a(sb2, String.class));
                return;
            } else {
                ijVar.a((bj) zi.a(sb2, type));
                return;
            }
            throw th;
            throw th;
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            ijVar.d(str2);
        } catch (vg | IOException | JSONException e2) {
            str2 = e2.getMessage();
            ijVar.d(str2);
        } catch (Throwable th) {
            ec.a.a(th, th);
        }
    }

    public static /* synthetic */ void m2(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!v2(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!v2(b4)) {
                cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw y5.d();
    }

    public static void n(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean n0(Parcel parcel, int i2) {
        g1(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static void n1(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger F1 = F1(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(F1) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(F1) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(F1).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(F1))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static int n2(byte[] bArr, int i2, jm jmVar) {
        int Q0 = Q0(bArr, i2, jmVar);
        int i3 = jmVar.a;
        if (i3 < 0) {
            throw l.b();
        } else if (i3 == 0) {
            jmVar.c = "";
            return Q0;
        } else {
            jmVar.c = new String(bArr, Q0, i3, j.a);
            return Q0 + i3;
        }
    }

    public static void o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static Boolean o0(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        if (w0 == 0) {
            return null;
        }
        v1(parcel, w0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static boolean o1() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int o2(byte[] bArr, int i2, j4 j4Var) {
        int R0 = R0(bArr, i2, j4Var);
        int i3 = j4Var.a;
        if (i3 < 0) {
            throw y5.b();
        } else if (i3 == 0) {
            j4Var.c = "";
            return R0;
        } else {
            j4Var.c = new String(bArr, R0, i3, w5.a);
            return R0 + i3;
        }
    }

    public static void p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(c.a(str, objArr));
        }
    }

    public static byte p0(Parcel parcel, int i2) {
        g1(parcel, i2, 4);
        return (byte) parcel.readInt();
    }

    public static /* synthetic */ boolean p1(byte b2) {
        return b2 >= 0;
    }

    public static /* synthetic */ void p2(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!u2(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !u2(b4) && !u2(b5)) {
                byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((b6 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((b6 & ExifInterface.MARKER) + 56320);
                return;
            }
        }
        throw l.g();
    }

    public static void q(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static float q0(Parcel parcel, int i2) {
        g1(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static final boolean q1(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
            byte b2 = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                b2 |= bArr[i2] ^ bArr2[i2];
            }
            if (b2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void q2(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!v2(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !v2(b4) && !v2(b5)) {
                byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((b6 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((b6 & ExifInterface.MARKER) + 56320);
                return;
            }
        }
        throw y5.d();
    }

    public static void r(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static Float r0(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        if (w0 == 0) {
            return null;
        }
        v1(parcel, w0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static byte[] r1(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                byte b2 = bArr[i2];
                byte b3 = (byte) ((b2 + b2) & 254);
                bArr2[i2] = b3;
                if (i2 < 15) {
                    bArr2[i2] = (byte) (((bArr[i2 + 1] >> 7) & 1) | b3);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static int r2(byte[] bArr, int i2, jm jmVar) {
        int Q0 = Q0(bArr, i2, jmVar);
        int i3 = jmVar.a;
        if (i3 < 0) {
            throw l.b();
        } else if (i3 == 0) {
            jmVar.c = "";
            return Q0;
        } else {
            jmVar.c = s1.a.b(bArr, Q0, i3);
            return Q0 + i3;
        }
    }

    public static int s(int i2, int i3) {
        String str;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            str = c.a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i3 >= 0) {
            str = c.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.g("negative size: ", i3));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static IBinder s0(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (w0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w0);
        return readStrongBinder;
    }

    public static byte[] s1(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            byte b2 = 0;
            long y1 = (y1(bArr3, 0) >> 0) & 67108863;
            long y12 = (y1(bArr3, 3) >> 2) & 67108863 & 67108611;
            long y13 = (y1(bArr3, 6) >> 4) & 67108863 & 67092735;
            long y14 = (y1(bArr3, 9) >> 6) & 67108863 & 66076671;
            long y15 = (y1(bArr3, 12) >> 8) & 67108863 & 1048575;
            long j2 = y12 * 5;
            long j3 = y13 * 5;
            long j4 = y14 * 5;
            long j5 = y15 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j6 = 0;
            int i3 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            while (true) {
                int length = bArr4.length;
                if (i3 < length) {
                    int min = Math.min(16, length - i3);
                    System.arraycopy(bArr4, i3, bArr5, b2, min);
                    bArr5[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr5, min + 1, i2, b2);
                    }
                    long y16 = j10 + ((y1(bArr5, b2) >> b2) & 67108863);
                    long y17 = j6 + ((y1(bArr5, 3) >> 2) & 67108863);
                    long y18 = j7 + ((y1(bArr5, 6) >> 4) & 67108863);
                    long y19 = j8 + ((y1(bArr5, 9) >> 6) & 67108863);
                    long y110 = j9 + (((y1(bArr5, 12) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
                    long j11 = (y110 * j2) + (y19 * j3) + (y18 * j4) + (y17 * j5) + (y16 * y1);
                    long j12 = (y110 * j3) + (y19 * j4) + (y18 * j5) + (y17 * y1) + (y16 * y12) + (j11 >> 26);
                    long j13 = (y110 * j4) + (y19 * j5) + (y18 * y1) + (y17 * y12) + (y16 * y13) + (j12 >> 26);
                    long j14 = (y110 * j5) + (y19 * y1) + (y18 * y12) + (y17 * y13) + (y16 * y14) + (j13 >> 26);
                    long j15 = y19 * y12;
                    long j16 = y110 * y1;
                    long j17 = j16 + j15 + (y18 * y13) + (y17 * y14) + (y16 * y15) + (j14 >> 26);
                    long j18 = ((j17 >> 26) * 5) + (j11 & 67108863);
                    j10 = j18 & 67108863;
                    long j19 = (j12 & 67108863) + (j18 >> 26);
                    i3 += 16;
                    j9 = j17 & 67108863;
                    j8 = j14 & 67108863;
                    j7 = j13 & 67108863;
                    j6 = j19;
                    b2 = 0;
                    i2 = 17;
                } else {
                    long j20 = j7 + (j6 >> 26);
                    long j21 = j20 & 67108863;
                    long j22 = j8 + (j20 >> 26);
                    long j23 = j22 & 67108863;
                    long j24 = j9 + (j22 >> 26);
                    long j25 = j24 & 67108863;
                    long j26 = ((j24 >> 26) * 5) + j10;
                    long j27 = j26 & 67108863;
                    long j28 = (j6 & 67108863) + (j26 >> 26);
                    long j29 = j27 + 5;
                    long j30 = j28 + (j29 >> 26);
                    long j31 = j21 + (j30 >> 26);
                    long j32 = j23 + (j31 >> 26);
                    long j33 = (j25 + (j32 >> 26)) - 67108864;
                    long j34 = j33 >> 63;
                    long j35 = j27;
                    long j36 = ~j34;
                    long j37 = (j28 & j34) | (j30 & 67108863 & j36);
                    long j38 = (j21 & j34) | (j31 & 67108863 & j36);
                    long j39 = (j23 & j34) | (j32 & 67108863 & j36);
                    long y111 = y1(bArr3, 16) + (((j35 & j34) | (j29 & 67108863 & j36) | (j37 << 26)) & 4294967295L);
                    long y112 = y1(bArr3, 20) + (((j37 >> 6) | (j38 << 20)) & 4294967295L) + (y111 >> 32);
                    long y113 = y1(bArr3, 24) + (((j38 >> 12) | (j39 << 14)) & 4294967295L) + (y112 >> 32);
                    byte[] bArr6 = new byte[16];
                    long y114 = y1(bArr3, 28);
                    e2(bArr6, y111 & 4294967295L, 0);
                    e2(bArr6, y112 & 4294967295L, 4);
                    e2(bArr6, y113 & 4294967295L, 8);
                    e2(bArr6, ((((j39 >> 18) | (((j25 & j34) | (j33 & j36)) << 8)) & 4294967295L) + y114 + (y113 >> 32)) & 4294967295L, 12);
                    return bArr6;
                }
            }
        } else {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
    }

    public static int s2(byte[] bArr, int i2, j4 j4Var) {
        int R0 = R0(bArr, i2, j4Var);
        int i3 = j4Var.a;
        if (i3 < 0) {
            throw y5.b();
        } else if (i3 == 0) {
            j4Var.c = "";
            return R0;
        } else {
            j4Var.c = d8.a.b(bArr, R0, i3);
            return R0 + i3;
        }
    }

    public static void t(Handler handler) {
        String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
        String name2 = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 36);
        sb.append("Must be called on ");
        sb.append(name2);
        sb.append(" thread, but got ");
        sb.append(name);
        sb.append(".");
        u(handler, sb.toString());
    }

    public static int t0(Parcel parcel, int i2) {
        g1(parcel, i2, 4);
        return parcel.readInt();
    }

    @Nullable
    public static String t1(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ECParameterSpec t2(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static void u(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static long u0(Parcel parcel, int i2) {
        g1(parcel, i2, 8);
        return parcel.readLong();
    }

    public static /* synthetic */ boolean u1(byte b2) {
        return b2 >= 0;
    }

    public static boolean u2(byte b2) {
        return b2 > -65;
    }

    public static void v(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    public static Long v0(Parcel parcel, int i2) {
        int w0 = w0(parcel, i2);
        if (w0 == 0) {
            return null;
        }
        v1(parcel, w0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static void v1(Parcel parcel, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            throw new b.l.a.c.c.m.v.b(b.e.a.a.a.r(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static boolean v2(byte b2) {
        return b2 > -65;
    }

    public static int w(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static int w0(Parcel parcel, int i2) {
        return (i2 & SupportMenu.CATEGORY_MASK) != -65536 ? (i2 >> 16) & 65535 : parcel.readInt();
    }

    public static int w1(int i2, byte[] bArr, int i3, jm jmVar) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i5 = b3 << 14;
            } else {
                i6 = i8 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i8 = i6 | ((b4 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i5 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] < 0) {
                                i9 = i11;
                            } else {
                                jmVar.a = i10;
                                return i11;
                            }
                        }
                    }
                }
            }
            jmVar.a = i8 | i5;
            return i9;
        }
        jmVar.a = i6 | i4;
        return i7;
    }

    public static int w2(byte[] bArr, int i2, jm jmVar) {
        int Q0 = Q0(bArr, i2, jmVar);
        int i3 = jmVar.a;
        if (i3 < 0) {
            throw l.b();
        } else if (i3 > bArr.length - Q0) {
            throw l.a();
        } else if (i3 == 0) {
            jmVar.c = um.f3344i;
            return Q0;
        } else {
            jmVar.c = um.J(bArr, Q0, i3);
            return Q0 + i3;
        }
    }

    public static String x(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static int x0(long j2) {
        if (j2 > 2147483647L) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static int x1(int i2, byte[] bArr, int i3, j4 j4Var) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i4 = b2 << 7;
        } else {
            int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i5 = b3 << 14;
            } else {
                i6 = i8 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i4 = b4 << 21;
                } else {
                    i8 = i6 | ((b4 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i5 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] < 0) {
                                i9 = i11;
                            } else {
                                j4Var.a = i10;
                                return i11;
                            }
                        }
                    }
                }
            }
            j4Var.a = i8 | i5;
            return i9;
        }
        j4Var.a = i6 | i4;
        return i7;
    }

    public static int x2(byte[] bArr, int i2, j4 j4Var) {
        int R0 = R0(bArr, i2, j4Var);
        int i3 = j4Var.a;
        if (i3 < 0) {
            throw y5.b();
        } else if (i3 > bArr.length - R0) {
            throw y5.a();
        } else if (i3 == 0) {
            j4Var.c = t4.f3759i;
            return R0;
        } else {
            j4Var.c = t4.H(bArr, R0, i3);
            return R0 + i3;
        }
    }

    public static String y(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static boolean y0(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static long y1(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & ExifInterface.MARKER) << 24) | (bArr[i2] & ExifInterface.MARKER) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 16))) & 4294967295L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int y2(b.l.a.c.f.e.o0 r6, byte[] r7, int r8, int r9, b.l.a.c.f.e.jm r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = w1(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            r6.b(r9)
            r10.c = r9
            return r8
        L_0x0025:
            b.l.a.c.f.e.l r6 = b.l.a.c.f.e.l.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.b.a.y2(b.l.a.c.f.e.o0, byte[], int, int, b.l.a.c.f.e.jm):int");
    }

    public static void z(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void z0(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + w0(parcel, i2));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.Status z1(java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
        /*
            int r0 = r6.hashCode()
            r1 = 1
            switch(r0) {
                case -2130504259: goto L_0x031e;
                case -2065866930: goto L_0x0313;
                case -2014808264: goto L_0x0308;
                case -2005236790: goto L_0x02fd;
                case -2001169389: goto L_0x02f3;
                case -1944433728: goto L_0x02e8;
                case -1800638118: goto L_0x02dd;
                case -1774756919: goto L_0x02d2;
                case -1587614300: goto L_0x02c7;
                case -1583894766: goto L_0x02bb;
                case -1458751677: goto L_0x02af;
                case -1421414571: goto L_0x02a3;
                case -1345867105: goto L_0x0297;
                case -1340100504: goto L_0x028b;
                case -1232010689: goto L_0x027f;
                case -1202691903: goto L_0x0273;
                case -1112393964: goto L_0x0268;
                case -1063710844: goto L_0x025c;
                case -974503964: goto L_0x0250;
                case -863830559: goto L_0x0244;
                case -828507413: goto L_0x0239;
                case -749743758: goto L_0x022d;
                case -736207500: goto L_0x0221;
                case -646022241: goto L_0x0215;
                case -595928767: goto L_0x0209;
                case -333672188: goto L_0x01fd;
                case -294485423: goto L_0x01f1;
                case -217128228: goto L_0x01e5;
                case -122667194: goto L_0x01d9;
                case -75433118: goto L_0x01cd;
                case -40686718: goto L_0x01c1;
                case 15352275: goto L_0x01b5;
                case 210308040: goto L_0x01a9;
                case 269327773: goto L_0x019d;
                case 278802867: goto L_0x0191;
                case 408411681: goto L_0x0185;
                case 423563023: goto L_0x0179;
                case 483847807: goto L_0x016d;
                case 491979549: goto L_0x0161;
                case 492072102: goto L_0x0155;
                case 542728406: goto L_0x0149;
                case 582457886: goto L_0x013d;
                case 605031096: goto L_0x0131;
                case 745638750: goto L_0x0125;
                case 786916712: goto L_0x0119;
                case 799258561: goto L_0x010d;
                case 819646646: goto L_0x0102;
                case 844240628: goto L_0x00f6;
                case 886186878: goto L_0x00ea;
                case 895302372: goto L_0x00de;
                case 922685102: goto L_0x00d2;
                case 989000548: goto L_0x00c6;
                case 1034932393: goto L_0x00bb;
                case 1072360691: goto L_0x00b0;
                case 1094975491: goto L_0x00a4;
                case 1107081238: goto L_0x0098;
                case 1141576252: goto L_0x008c;
                case 1199811910: goto L_0x0080;
                case 1226505451: goto L_0x0074;
                case 1388786705: goto L_0x0069;
                case 1433767024: goto L_0x005e;
                case 1442968770: goto L_0x0052;
                case 1494923453: goto L_0x0046;
                case 1497901284: goto L_0x003a;
                case 1803454477: goto L_0x002e;
                case 1898790704: goto L_0x0022;
                case 2063209097: goto L_0x0016;
                case 2082564316: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0329
        L_0x000a:
            java.lang.String r0 = "UNSUPPORTED_TENANT_OPERATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 49
            goto L_0x032a
        L_0x0016:
            java.lang.String r0 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 63
            goto L_0x032a
        L_0x0022:
            java.lang.String r0 = "MISSING_SESSION_INFO"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 35
            goto L_0x032a
        L_0x002e:
            java.lang.String r0 = "MISSING_CONTINUE_URI"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 44
            goto L_0x032a
        L_0x003a:
            java.lang.String r0 = "TOO_MANY_ATTEMPTS_TRY_LATER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 21
            goto L_0x032a
        L_0x0046:
            java.lang.String r0 = "INVALID_APP_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 19
            goto L_0x032a
        L_0x0052:
            java.lang.String r0 = "INVALID_PHONE_NUMBER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 32
            goto L_0x032a
        L_0x005e:
            java.lang.String r0 = "USER_DISABLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 5
            goto L_0x032a
        L_0x0069:
            java.lang.String r0 = "INVALID_IDENTIFIER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 6
            goto L_0x032a
        L_0x0074:
            java.lang.String r0 = "FEDERATED_USER_ID_ALREADY_LINKED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 12
            goto L_0x032a
        L_0x0080:
            java.lang.String r0 = "MISSING_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 33
            goto L_0x032a
        L_0x008c:
            java.lang.String r0 = "SESSION_EXPIRED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 38
            goto L_0x032a
        L_0x0098:
            java.lang.String r0 = "<<Network Error>>"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 15
            goto L_0x032a
        L_0x00a4:
            java.lang.String r0 = "INVALID_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 11
            goto L_0x032a
        L_0x00b0:
            java.lang.String r0 = "INVALID_CUSTOM_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 2
            goto L_0x032a
        L_0x00bb:
            java.lang.String r0 = "INVALID_PENDING_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 3
            goto L_0x032a
        L_0x00c6:
            java.lang.String r0 = "RESET_PASSWORD_EXCEED_LIMIT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 22
            goto L_0x032a
        L_0x00d2:
            java.lang.String r0 = "INVALID_MESSAGE_PAYLOAD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 26
            goto L_0x032a
        L_0x00de:
            java.lang.String r0 = "MISSING_CLIENT_IDENTIFIER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 65
            goto L_0x032a
        L_0x00ea:
            java.lang.String r0 = "REQUIRES_SECOND_FACTOR_AUTH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 53
            goto L_0x032a
        L_0x00f6:
            java.lang.String r0 = "WEB_CONTEXT_CANCELED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 48
            goto L_0x032a
        L_0x0102:
            java.lang.String r0 = "CREDENTIAL_MISMATCH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = r1
            goto L_0x032a
        L_0x010d:
            java.lang.String r0 = "INVALID_PROVIDER_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 46
            goto L_0x032a
        L_0x0119:
            java.lang.String r0 = "INVALID_VERIFICATION_PROOF"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 37
            goto L_0x032a
        L_0x0125:
            java.lang.String r0 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 56
            goto L_0x032a
        L_0x0131:
            java.lang.String r0 = "REJECTED_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 52
            goto L_0x032a
        L_0x013d:
            java.lang.String r0 = "UNVERIFIED_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 59
            goto L_0x032a
        L_0x0149:
            java.lang.String r0 = "PASSWORD_LOGIN_DISABLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 18
            goto L_0x032a
        L_0x0155:
            java.lang.String r0 = "WEB_STORAGE_UNSUPPORTED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 43
            goto L_0x032a
        L_0x0161:
            java.lang.String r0 = "INVALID_ID_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 13
            goto L_0x032a
        L_0x016d:
            java.lang.String r0 = "EMAIL_EXISTS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 10
            goto L_0x032a
        L_0x0179:
            java.lang.String r0 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 54
            goto L_0x032a
        L_0x0185:
            java.lang.String r0 = "INVALID_DYNAMIC_LINK_DOMAIN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 51
            goto L_0x032a
        L_0x0191:
            java.lang.String r0 = "MISSING_PHONE_NUMBER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 31
            goto L_0x032a
        L_0x019d:
            java.lang.String r0 = "INVALID_SENDER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 27
            goto L_0x032a
        L_0x01a9:
            java.lang.String r0 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 62
            goto L_0x032a
        L_0x01b5:
            java.lang.String r0 = "EMAIL_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 8
            goto L_0x032a
        L_0x01c1:
            java.lang.String r0 = "WEAK_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 16
            goto L_0x032a
        L_0x01cd:
            java.lang.String r0 = "USER_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 9
            goto L_0x032a
        L_0x01d9:
            java.lang.String r0 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 55
            goto L_0x032a
        L_0x01e5:
            java.lang.String r0 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 61
            goto L_0x032a
        L_0x01f1:
            java.lang.String r0 = "WEB_INTERNAL_ERROR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 42
            goto L_0x032a
        L_0x01fd:
            java.lang.String r0 = "OPERATION_NOT_ALLOWED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 17
            goto L_0x032a
        L_0x0209:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 14
            goto L_0x032a
        L_0x0215:
            java.lang.String r0 = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 20
            goto L_0x032a
        L_0x0221:
            java.lang.String r0 = "MISSING_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 30
            goto L_0x032a
        L_0x022d:
            java.lang.String r0 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 57
            goto L_0x032a
        L_0x0239:
            java.lang.String r0 = "NO_SUCH_PROVIDER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 0
            goto L_0x032a
        L_0x0244:
            java.lang.String r0 = "INVALID_CERT_HASH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 40
            goto L_0x032a
        L_0x0250:
            java.lang.String r0 = "MISSING_OR_INVALID_NONCE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 66
            goto L_0x032a
        L_0x025c:
            java.lang.String r0 = "ADMIN_ONLY_OPERATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 58
            goto L_0x032a
        L_0x0268:
            java.lang.String r0 = "INVALID_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 7
            goto L_0x032a
        L_0x0273:
            java.lang.String r0 = "SECOND_FACTOR_EXISTS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 60
            goto L_0x032a
        L_0x027f:
            java.lang.String r0 = "INVALID_SESSION_INFO"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 36
            goto L_0x032a
        L_0x028b:
            java.lang.String r0 = "INVALID_TENANT_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 50
            goto L_0x032a
        L_0x0297:
            java.lang.String r0 = "TOKEN_EXPIRED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 23
            goto L_0x032a
        L_0x02a3:
            java.lang.String r0 = "INVALID_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 34
            goto L_0x032a
        L_0x02af:
            java.lang.String r0 = "MISSING_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 29
            goto L_0x032a
        L_0x02bb:
            java.lang.String r0 = "INVALID_OOB_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 24
            goto L_0x032a
        L_0x02c7:
            java.lang.String r0 = "EXPIRED_OOB_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 25
            goto L_0x032a
        L_0x02d2:
            java.lang.String r0 = "WEB_NETWORK_REQUEST_FAILED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 41
            goto L_0x032a
        L_0x02dd:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 39
            goto L_0x032a
        L_0x02e8:
            java.lang.String r0 = "DYNAMIC_LINK_NOT_ACTIVATED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 45
            goto L_0x032a
        L_0x02f3:
            java.lang.String r0 = "INVALID_IDP_RESPONSE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 4
            goto L_0x032a
        L_0x02fd:
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 64
            goto L_0x032a
        L_0x0308:
            java.lang.String r0 = "WEB_CONTEXT_ALREADY_PRESENTED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 47
            goto L_0x032a
        L_0x0313:
            java.lang.String r0 = "INVALID_RECIPIENT_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 28
            goto L_0x032a
        L_0x031e:
            java.lang.String r0 = "USER_CANCELLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 67
            goto L_0x032a
        L_0x0329:
            r0 = -1
        L_0x032a:
            r2 = 17499(0x445b, float:2.4521E-41)
            switch(r0) {
                case 0: goto L_0x040d;
                case 1: goto L_0x040a;
                case 2: goto L_0x0407;
                case 3: goto L_0x0404;
                case 4: goto L_0x0404;
                case 5: goto L_0x0401;
                case 6: goto L_0x03fe;
                case 7: goto L_0x03fe;
                case 8: goto L_0x03fb;
                case 9: goto L_0x03fb;
                case 10: goto L_0x03f8;
                case 11: goto L_0x03f5;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03ef;
                case 14: goto L_0x03ec;
                case 15: goto L_0x03ec;
                case 16: goto L_0x03e9;
                case 17: goto L_0x03e6;
                case 18: goto L_0x03e6;
                case 19: goto L_0x03e3;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03dd;
                case 22: goto L_0x03dd;
                case 23: goto L_0x03da;
                case 24: goto L_0x03d7;
                case 25: goto L_0x03d4;
                case 26: goto L_0x03d1;
                case 27: goto L_0x03ce;
                case 28: goto L_0x03cb;
                case 29: goto L_0x03c8;
                case 30: goto L_0x03c5;
                case 31: goto L_0x03c2;
                case 32: goto L_0x03be;
                case 33: goto L_0x03ba;
                case 34: goto L_0x03b6;
                case 35: goto L_0x03b2;
                case 36: goto L_0x03ae;
                case 37: goto L_0x03aa;
                case 38: goto L_0x03a6;
                case 39: goto L_0x03a2;
                case 40: goto L_0x039e;
                case 41: goto L_0x039a;
                case 42: goto L_0x0396;
                case 43: goto L_0x0392;
                case 44: goto L_0x038e;
                case 45: goto L_0x038a;
                case 46: goto L_0x0386;
                case 47: goto L_0x0382;
                case 48: goto L_0x037e;
                case 49: goto L_0x037a;
                case 50: goto L_0x0376;
                case 51: goto L_0x0372;
                case 52: goto L_0x036e;
                case 53: goto L_0x036a;
                case 54: goto L_0x0366;
                case 55: goto L_0x0362;
                case 56: goto L_0x035e;
                case 57: goto L_0x035a;
                case 58: goto L_0x0356;
                case 59: goto L_0x0352;
                case 60: goto L_0x034e;
                case 61: goto L_0x034a;
                case 62: goto L_0x0346;
                case 63: goto L_0x0342;
                case 64: goto L_0x033e;
                case 65: goto L_0x033a;
                case 66: goto L_0x0336;
                case 67: goto L_0x0332;
                default: goto L_0x032f;
            }
        L_0x032f:
            r0 = r2
            goto L_0x040f
        L_0x0332:
            r0 = 18001(0x4651, float:2.5225E-41)
            goto L_0x040f
        L_0x0336:
            r0 = 17094(0x42c6, float:2.3954E-41)
            goto L_0x040f
        L_0x033a:
            r0 = 17093(0x42c5, float:2.3952E-41)
            goto L_0x040f
        L_0x033e:
            r0 = 17091(0x42c3, float:2.395E-41)
            goto L_0x040f
        L_0x0342:
            r0 = 17090(0x42c2, float:2.3948E-41)
            goto L_0x040f
        L_0x0346:
            r0 = 17089(0x42c1, float:2.3947E-41)
            goto L_0x040f
        L_0x034a:
            r0 = 17088(0x42c0, float:2.3945E-41)
            goto L_0x040f
        L_0x034e:
            r0 = 17087(0x42bf, float:2.3944E-41)
            goto L_0x040f
        L_0x0352:
            r0 = 17086(0x42be, float:2.3943E-41)
            goto L_0x040f
        L_0x0356:
            r0 = 17085(0x42bd, float:2.3941E-41)
            goto L_0x040f
        L_0x035a:
            r0 = 17084(0x42bc, float:2.394E-41)
            goto L_0x040f
        L_0x035e:
            r0 = 17083(0x42bb, float:2.3938E-41)
            goto L_0x040f
        L_0x0362:
            r0 = 17082(0x42ba, float:2.3937E-41)
            goto L_0x040f
        L_0x0366:
            r0 = 17081(0x42b9, float:2.3936E-41)
            goto L_0x040f
        L_0x036a:
            r0 = 17078(0x42b6, float:2.3931E-41)
            goto L_0x040f
        L_0x036e:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x040f
        L_0x0372:
            r0 = 17074(0x42b2, float:2.3926E-41)
            goto L_0x040f
        L_0x0376:
            r0 = 17079(0x42b7, float:2.3933E-41)
            goto L_0x040f
        L_0x037a:
            r0 = 17073(0x42b1, float:2.3924E-41)
            goto L_0x040f
        L_0x037e:
            r0 = 17058(0x42a2, float:2.3903E-41)
            goto L_0x040f
        L_0x0382:
            r0 = 17057(0x42a1, float:2.3902E-41)
            goto L_0x040f
        L_0x0386:
            r0 = 17071(0x42af, float:2.3922E-41)
            goto L_0x040f
        L_0x038a:
            r0 = 17068(0x42ac, float:2.3917E-41)
            goto L_0x040f
        L_0x038e:
            r0 = 17040(0x4290, float:2.3878E-41)
            goto L_0x040f
        L_0x0392:
            r0 = 17065(0x42a9, float:2.3913E-41)
            goto L_0x040f
        L_0x0396:
            r0 = 17062(0x42a6, float:2.3909E-41)
            goto L_0x040f
        L_0x039a:
            r0 = 17061(0x42a5, float:2.3908E-41)
            goto L_0x040f
        L_0x039e:
            r0 = 17064(0x42a8, float:2.3912E-41)
            goto L_0x040f
        L_0x03a2:
            r0 = 17052(0x429c, float:2.3895E-41)
            goto L_0x040f
        L_0x03a6:
            r0 = 17051(0x429b, float:2.3894E-41)
            goto L_0x040f
        L_0x03aa:
            r0 = 17049(0x4299, float:2.3891E-41)
            goto L_0x040f
        L_0x03ae:
            r0 = 17046(0x4296, float:2.3887E-41)
            goto L_0x040f
        L_0x03b2:
            r0 = 17045(0x4295, float:2.3885E-41)
            goto L_0x040f
        L_0x03b6:
            r0 = 17044(0x4294, float:2.3884E-41)
            goto L_0x040f
        L_0x03ba:
            r0 = 17043(0x4293, float:2.3882E-41)
            goto L_0x040f
        L_0x03be:
            r0 = 17042(0x4292, float:2.3881E-41)
            goto L_0x040f
        L_0x03c2:
            r0 = 17041(0x4291, float:2.388E-41)
            goto L_0x040f
        L_0x03c5:
            r0 = 17035(0x428b, float:2.3871E-41)
            goto L_0x040f
        L_0x03c8:
            r0 = 17034(0x428a, float:2.387E-41)
            goto L_0x040f
        L_0x03cb:
            r0 = 17033(0x4289, float:2.3868E-41)
            goto L_0x040f
        L_0x03ce:
            r0 = 17032(0x4288, float:2.3867E-41)
            goto L_0x040f
        L_0x03d1:
            r0 = 17031(0x4287, float:2.3866E-41)
            goto L_0x040f
        L_0x03d4:
            r0 = 17029(0x4285, float:2.3863E-41)
            goto L_0x040f
        L_0x03d7:
            r0 = 17030(0x4286, float:2.3864E-41)
            goto L_0x040f
        L_0x03da:
            r0 = 17021(0x427d, float:2.3852E-41)
            goto L_0x040f
        L_0x03dd:
            r0 = 17010(0x4272, float:2.3836E-41)
            goto L_0x040f
        L_0x03e0:
            r0 = 17014(0x4276, float:2.3842E-41)
            goto L_0x040f
        L_0x03e3:
            r0 = 17028(0x4284, float:2.3861E-41)
            goto L_0x040f
        L_0x03e6:
            r0 = 17006(0x426e, float:2.383E-41)
            goto L_0x040f
        L_0x03e9:
            r0 = 17026(0x4282, float:2.3859E-41)
            goto L_0x040f
        L_0x03ec:
            r0 = 17020(0x427c, float:2.385E-41)
            goto L_0x040f
        L_0x03ef:
            r0 = 17017(0x4279, float:2.3846E-41)
            goto L_0x040f
        L_0x03f2:
            r0 = 17025(0x4281, float:2.3857E-41)
            goto L_0x040f
        L_0x03f5:
            r0 = 17009(0x4271, float:2.3835E-41)
            goto L_0x040f
        L_0x03f8:
            r0 = 17007(0x426f, float:2.3832E-41)
            goto L_0x040f
        L_0x03fb:
            r0 = 17011(0x4273, float:2.3837E-41)
            goto L_0x040f
        L_0x03fe:
            r0 = 17008(0x4270, float:2.3833E-41)
            goto L_0x040f
        L_0x0401:
            r0 = 17005(0x426d, float:2.3829E-41)
            goto L_0x040f
        L_0x0404:
            r0 = 17004(0x426c, float:2.3828E-41)
            goto L_0x040f
        L_0x0407:
            r0 = 17000(0x4268, float:2.3822E-41)
            goto L_0x040f
        L_0x040a:
            r0 = 17002(0x426a, float:2.3825E-41)
            goto L_0x040f
        L_0x040d:
            r0 = 17016(0x4278, float:2.3844E-41)
        L_0x040f:
            if (r0 != r2) goto L_0x0434
            if (r7 == 0) goto L_0x042e
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r3 = r6.length()
            int r4 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + r1
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r1 = ":"
            java.lang.String r6 = b.e.a.a.a.r(r5, r6, r1, r7)
            r0.<init>(r2, r6)
            return r0
        L_0x042e:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r7.<init>(r2, r6)
            return r7
        L_0x0434:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r6.<init>(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.b.a.z1(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int z2(b.l.a.c.f.i.a7 r6, byte[] r7, int r8, int r9, b.l.a.c.f.i.j4 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = x1(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.i(r1, r2, r3, r4, r5)
            r6.h(r9)
            r10.c = r9
            return r8
        L_0x0025:
            b.l.a.c.f.i.y5 r6 = b.l.a.c.f.i.y5.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.b.a.z2(b.l.a.c.f.i.a7, byte[], int, int, b.l.a.c.f.i.j4):int");
    }
}
