package b.l.a.c.i.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import b.l.a.c.c.f;
import b.l.a.c.c.i;
import b.l.a.c.c.p.c;
import b.l.a.c.c.q.b;
import b.l.a.c.f.i.m8;
import b.l.a.c.f.i.tb;
import b.l.a.c.f.i.y9;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class k9 extends g5 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f4107g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f4108h = {"_err"};
    public SecureRandom c;
    public final AtomicLong d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f4109e;
    public Integer f = null;

    public k9(l4 l4Var) {
        super(l4Var);
    }

    public static MessageDigest B() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long C(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int length = bArr.length;
        int i2 = 0;
        a.F(length > 0);
        int i3 = length - 1;
        long j2 = 0;
        while (i3 >= 0 && i3 >= bArr.length - 8) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
            i3--;
        }
        return j2;
    }

    public static boolean D(Context context) {
        Objects.requireNonNull(context, "null reference");
        return a0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static ArrayList<Bundle> W(List<b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (b next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f3911h);
            bundle.putString("origin", next.f3912i);
            bundle.putLong("creation_timestamp", next.f3914k);
            bundle.putString("name", next.f3913j.f4021i);
            a.f1(bundle, next.f3913j.V());
            bundle.putBoolean("active", next.f3915l);
            String str = next.f3916m;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            s sVar = next.f3917n;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f4248h);
                q qVar = next.f3917n.f4249i;
                if (qVar != null) {
                    bundle.putBundle("timed_out_event_params", qVar.Z());
                }
            }
            bundle.putLong("trigger_timeout", next.f3918o);
            s sVar2 = next.f3919p;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f4248h);
                q qVar2 = next.f3919p.f4249i;
                if (qVar2 != null) {
                    bundle.putBundle("triggered_event_params", qVar2.Z());
                }
            }
            bundle.putLong("triggered_timestamp", next.f3913j.f4022j);
            bundle.putLong("time_to_live", next.f3920q);
            s sVar3 = next.r;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f4248h);
                q qVar3 = next.r.f4249i;
                if (qVar3 != null) {
                    bundle.putBundle("expired_event_params", qVar3.Z());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final boolean X(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.k9.a0(android.content.Context, java.lang.String):boolean");
    }

    public static boolean b0(String str, String[] strArr) {
        for (String G : strArr) {
            if (G(str, G)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e0(String str) {
        a.x(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final void A(j9 j9Var, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        X(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        m8.f3656i.a().a();
        if (this.a.f4114g.r((String) null, x2.A0)) {
            j9Var.a(str, bundle);
            return;
        }
        l4 l4Var = this.a;
        y9 y9Var = l4Var.f;
        l4Var.s().A("auto", "_err", bundle);
    }

    @WorkerThread
    public final boolean E(String str) {
        h();
        if (b.a(this.a.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.a.a().f4095m.b("Permission not granted", str);
        return false;
    }

    public final boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String j2 = this.a.f4114g.j("debug.firebase.analytics.app", "");
        y9 y9Var = this.a.f;
        return j2.equals(str);
    }

    public final Bundle I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s = s(str, bundle.get(str));
                if (s == null) {
                    this.a.a().f4093k.b("Param value can't be null", this.a.u().q(str));
                } else {
                    z(bundle2, str, s);
                }
            }
        }
        return bundle2;
    }

    public final s J(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle t = t(str, str2, bundle2, Collections.singletonList("_o"), false);
            if (z) {
                t = I(t);
            }
            return new s(str2, new q(t), str3, j2);
        }
        this.a.a().f.b("Invalid conditional property event name", this.a.u().r(str2));
        throw new IllegalArgumentException();
    }

    public final boolean K(Context context, String str) {
        i3 i3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = b.a(context).a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e = e2;
            i3Var = this.a.a().f;
            str2 = "Error obtaining certificate";
            i3Var.b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            i3Var = this.a.a().f;
            str2 = "Package name not found";
            i3Var.b(str2, e);
            return true;
        }
    }

    public final byte[] L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int M() {
        if (this.f == null) {
            f fVar = f.f2599b;
            Context context = this.a.a;
            Objects.requireNonNull(fVar);
            boolean z = i.a;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f = Integer.valueOf(i2 / 1000);
        }
        return this.f.intValue();
    }

    public final long N(long j2, long j3) {
        return ((j3 * 60000) + j2) / 86400000;
    }

    @WorkerThread
    public final void O(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.a.a().f4091i.b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void P(tb tbVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning string value to wrapper", e2);
        }
    }

    public final void Q(tb tbVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning long value to wrapper", e2);
        }
    }

    public final void R(tb tbVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning int value to wrapper", e2);
        }
    }

    public final void S(tb tbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning byte array to wrapper", e2);
        }
    }

    public final void T(tb tbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void U(tb tbVar, Bundle bundle) {
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void V(tb tbVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning bundle list to wrapper", e2);
        }
    }

    public final Object Y(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return q(String.valueOf(obj), i2, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle I = I((Bundle) parcelable);
                    if (!I.isEmpty()) {
                        arrayList.add(I);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int Z(String str) {
        if ("_ldl".equals(str)) {
            f fVar = this.a.f4114g;
            return 2048;
        } else if ("_id".equals(str)) {
            f fVar2 = this.a.f4114g;
            return 256;
        } else if (!this.a.f4114g.r((String) null, x2.g0) || !"_lgclid".equals(str)) {
            f fVar3 = this.a.f4114g;
            return 36;
        } else {
            f fVar4 = this.a.f4114g;
            return 100;
        }
    }

    public final long c0() {
        long andIncrement;
        long j2;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nanoTime = System.nanoTime();
                Objects.requireNonNull((c) this.a.f4121n);
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i2 = this.f4109e + 1;
                this.f4109e = i2;
                j2 = nextLong + ((long) i2);
            }
            return j2;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom d0() {
        h();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final Bundle f0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString(AnimationStrength.MEDIUM, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e2) {
                this.a.a().f4091i.b("Install referrer url isn't a hierarchical URI", e2);
            }
        }
        return null;
    }

    public final boolean g0(String str, String str2) {
        if (str2 == null) {
            this.a.a().f4090h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.a().f4090h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.a.a().f4090h.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.a.a().f4090h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean h0(String str, String str2) {
        if (str2 == null) {
            this.a.a().f4090h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.a().f4090h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.a.a().f4090h.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.a.a().f4090h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean i() {
        return true;
    }

    public final boolean i0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.a().f4090h.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f4107g;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.a.a().f4090h.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !b0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && b0(str2, strArr2)) {
            return true;
        }
        this.a.a().f4090h.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @WorkerThread
    public final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.a.a().f4091i.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final boolean j0(String str, int i2, String str2) {
        if (str2 == null) {
            this.a.a().f4090h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            this.a.a().f4090h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    public final int k0(String str) {
        if (!h0("event", str)) {
            return 2;
        }
        if (!i0("event", i5.a, i5.f4055b, str)) {
            return 13;
        }
        f fVar = this.a.f4114g;
        if (!j0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final int l0(String str) {
        if (!h0("user property", str)) {
            return 6;
        }
        if (!i0("user property", k5.a, (String[]) null, str)) {
            return 15;
        }
        f fVar = this.a.f4114g;
        if (!j0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public final int m0(String str) {
        if (!g0("event param", str)) {
            return 3;
        }
        if (!i0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        f fVar = this.a.f4114g;
        if (!j0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final int n0(String str) {
        if (!h0("event param", str)) {
            return 3;
        }
        if (!i0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        f fVar = this.a.f4114g;
        if (!j0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final boolean o(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            Objects.requireNonNull(str, "null reference");
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.a.x()) {
                this.a.a().f4090h.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", k3.t(str));
            }
            return false;
        }
        y9.b();
        if (this.a.f4114g.r((String) null, x2.i0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            Objects.requireNonNull(str2, "null reference");
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            this.a.a().f4090h.b("Invalid admob_app_id. Analytics disabled.", k3.t(str2));
            return false;
        }
        if (this.a.x()) {
            this.a.a().f4090h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean o0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean p(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Objects.requireNonNull(str, "null reference");
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final boolean p0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                this.a.a().f4093k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final String q(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public final void q0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str4;
        int i3;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            f fVar = this.a.f4114g;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list2 == null || !list2.contains(str6)) {
                    i2 = z ? m0(str6) : 0;
                    if (i2 == 0) {
                        i2 = n0(str6);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    w(bundle2, i2, str6, i2 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (o0(bundle2.get(str6))) {
                        this.a.a().f4093k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i3 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i3 = r(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        w(bundle2, i3, str4, bundle2.get(str4));
                    } else if (e0(str4) && !b0(str4, j5.d) && (i4 = i4 + 1) > 0) {
                        this.a.a().f4090h.c("Item cannot contain custom parameters", this.a.u().p(str5), this.a.u().s(bundle2));
                        X(bundle2, 23);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.h()
            boolean r2 = r14.o0(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00a8
            if (r22 == 0) goto L_0x00a5
            java.lang.String[] r2 = b.l.a.c.i.b.j5.c
            boolean r2 = b0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            b.l.a.c.i.b.l4 r2 = r7.a
            b.l.a.c.i.b.b8 r2 = r2.z()
            r2.h()
            r2.i()
            boolean r5 = r2.n()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.k9 r2 = r2.t()
            int r2 = r2.M()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            b.l.a.c.i.b.l4 r2 = r7.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0052
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005d
        L_0x0052:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a8
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005d:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00a8
            b.l.a.c.i.b.l4 r9 = r7.a
            b.l.a.c.i.b.k3 r9 = r9.a()
            b.l.a.c.i.b.i3 r9 = r9.f4093k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r3, r8, r5)
            b.l.a.c.i.b.l4 r5 = r7.a
            b.l.a.c.i.b.f r5 = r5.f4114g
            if (r2 == 0) goto L_0x0088
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x00a1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a1
        L_0x0088:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a1
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x00a1
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x00a1:
            r1 = 17
            r9 = r1
            goto L_0x00a9
        L_0x00a5:
            r0 = 21
            return r0
        L_0x00a8:
            r9 = r4
        L_0x00a9:
            b.l.a.c.i.b.l4 r1 = r7.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.S
            r10 = r15
            boolean r1 = r1.r(r15, r2)
            if (r1 == 0) goto L_0x00bc
            boolean r1 = F(r16)
            if (r1 != 0) goto L_0x00c2
        L_0x00bc:
            boolean r1 = F(r17)
            if (r1 == 0) goto L_0x00c9
        L_0x00c2:
            b.l.a.c.i.b.l4 r1 = r7.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00cf
        L_0x00c9:
            b.l.a.c.i.b.l4 r1 = r7.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            r1 = 100
        L_0x00cf:
            boolean r1 = r14.p0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d6
            return r9
        L_0x00d6:
            if (r22 == 0) goto L_0x0162
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00ee
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.q0(r1, r2, r3, r4, r5, r6)
            goto L_0x0161
        L_0x00ee:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0121
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = r4
        L_0x00f7:
            if (r13 >= r12) goto L_0x0161
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010e
            b.l.a.c.i.b.l4 r1 = r7.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f4093k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L_0x014a
        L_0x010e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.q0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00f7
        L_0x0121:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0162
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = r4
        L_0x012d:
            if (r13 >= r12) goto L_0x0161
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014e
            b.l.a.c.i.b.l4 r1 = r7.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f4093k
            if (r0 == 0) goto L_0x0146
            java.lang.Class r0 = r0.getClass()
            goto L_0x0148
        L_0x0146:
            java.lang.String r0 = "null"
        L_0x0148:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
        L_0x014a:
            r1.c(r2, r0, r8)
            goto L_0x0162
        L_0x014e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.q0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x012d
        L_0x0161:
            return r9
        L_0x0162:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.k9.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Object s(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            f fVar = this.a.f4114g;
            return Y(256, obj, true, true);
        }
        if (F(str)) {
            f fVar2 = this.a.f4114g;
        } else {
            f fVar3 = this.a.f4114g;
            i2 = 100;
        }
        return Y(i2, obj, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle t(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = b.l.a.c.i.b.i5.d
            boolean r13 = b0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            int r15 = r0.k()
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.Y
            r8 = r20
            boolean r0 = r0.r(r8, r1)
            if (r0 == 0) goto L_0x0033
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0037
        L_0x0033:
            java.util.Set r0 = r22.keySet()
        L_0x0037:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x003f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0058
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r0 = r17
            goto L_0x0067
        L_0x0058:
            if (r24 == 0) goto L_0x005f
            int r0 = r9.m0(r7)
            goto L_0x0061
        L_0x005f:
            r0 = r17
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            int r0 = r9.n0(r7)
        L_0x0067:
            if (r0 == 0) goto L_0x0077
            r1 = 3
            if (r0 != r1) goto L_0x006e
            r1 = r7
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            r9.w(r14, r0, r7, r1)
            r14.remove(r7)
            goto L_0x0103
        L_0x0077:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r14
            r6 = r23
            r12 = r7
            r7 = r24
            r8 = r13
            int r0 = r0.r(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0097
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.w(r14, r1, r12, r0)
            goto L_0x00b3
        L_0x0097:
            if (r0 == 0) goto L_0x00b3
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00b3
            r1 = 21
            if (r0 != r1) goto L_0x00a7
            r7 = r10
            goto L_0x00a8
        L_0x00a7:
            r7 = r12
        L_0x00a8:
            java.lang.Object r1 = r11.get(r12)
            r9.w(r14, r0, r7, r1)
            r14.remove(r12)
            goto L_0x0103
        L_0x00b3:
            boolean r0 = e0(r12)
            if (r0 == 0) goto L_0x0103
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b.l.a.c.i.b.l4 r2 = r9.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4090h
            b.l.a.c.i.b.l4 r3 = r9.a
            b.l.a.c.i.b.f3 r3 = r3.u()
            java.lang.String r3 = r3.p(r10)
            b.l.a.c.i.b.l4 r4 = r9.a
            b.l.a.c.i.b.f3 r4 = r4.u()
            java.lang.String r4 = r4.s(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            X(r14, r1)
            r14.remove(r12)
        L_0x00fb:
            r8 = r20
            r12 = r23
            r18 = r0
            goto L_0x003f
        L_0x0103:
            r8 = r20
            r12 = r23
            goto L_0x003f
        L_0x0109:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.k9.t(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final void u(l3 l3Var, int i2) {
        Iterator it = new TreeSet(l3Var.d.keySet()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (e0(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                this.a.a().f4090h.c(sb.toString(), this.a.u().p(l3Var.a), this.a.u().s(l3Var.d));
                X(l3Var.d, 5);
                l3Var.d.remove(str);
            }
        }
    }

    public final void v(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.a.t().z(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void w(Bundle bundle, int i2, String str, Object obj) {
        if (X(bundle, i2)) {
            f fVar = this.a.f4114g;
            bundle.putString("_ev", q(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) String.valueOf(obj).length());
            }
        }
    }

    public final int x(String str, Object obj) {
        String str2;
        int i2;
        if ("_ldl".equals(str)) {
            i2 = Z(str);
            str2 = "user property referrer";
        } else {
            i2 = Z(str);
            str2 = "user property";
        }
        return p0(str2, str, i2, obj) ? 0 : 7;
    }

    public final Object y(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int Z = Z(str);
        return equals ? Y(Z, obj, true, false) : Y(Z, obj, false, false);
    }

    public final void z(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.a.a().f4093k.c("Not putting event parameter. Invalid value type. name, type", this.a.u().q(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }
}
