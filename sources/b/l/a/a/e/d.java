package b.l.a.a.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.a.e.e.c;
import b.l.a.a.e.e.e;
import b.l.a.a.e.e.f;
import b.l.a.a.e.e.g;
import b.l.a.a.e.e.i;
import b.l.a.a.e.e.j;
import b.l.a.a.e.e.k;
import b.l.a.a.e.e.o;
import b.l.a.a.e.e.p;
import b.l.a.a.f.n.f;
import b.l.a.a.f.n.g;
import b.l.a.a.f.n.m;
import b.l.d.s.j.e;
import com.amplitude.api.Constants;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d implements m {
    public final b.l.d.s.a a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f2391b;
    public final Context c;
    public final URL d = c(a.c);

    /* renamed from: e  reason: collision with root package name */
    public final b.l.a.a.f.s.a f2392e;
    public final b.l.a.a.f.s.a f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2393g;

    public static final class a {
        public final URL a;

        /* renamed from: b  reason: collision with root package name */
        public final j f2394b;
        @Nullable
        public final String c;

        public a(URL url, j jVar, @Nullable String str) {
            this.a = url;
            this.f2394b = jVar;
            this.c = str;
        }
    }

    public static final class b {
        public final int a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final URL f2395b;
        public final long c;

        public b(int i2, @Nullable URL url, long j2) {
            this.a = i2;
            this.f2395b = url;
            this.c = j2;
        }
    }

    public d(Context context, b.l.a.a.f.s.a aVar, b.l.a.a.f.s.a aVar2) {
        e eVar = new e();
        ((b.l.a.a.e.e.b) b.l.a.a.e.e.b.a).a(eVar);
        eVar.d = true;
        this.a = new b.l.d.s.j.d(eVar);
        this.c = context;
        this.f2391b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2392e = aVar2;
        this.f = aVar;
        this.f2393g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(b.e.a.a.a.m("Invalid url: ", str), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ba, code lost:
        if (b.l.a.a.e.e.o.a.D.get(r0) != null) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.a.a.f.e a(b.l.a.a.f.e r6) {
        /*
            r5 = this;
            android.net.ConnectivityManager r0 = r5.f2391b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            b.l.a.a.f.e$a r6 = r6.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map r2 = r6.c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sdk-version"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "model"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "hardware"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "device"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "product"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.ID
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "os-uild"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "manufacturer"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "fingerprint"
            r2.put(r3, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r6.c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0090
            b.l.a.a.e.e.o$b r2 = b.l.a.a.e.e.o.b.NONE
            r2 = r1
            goto L_0x0094
        L_0x0090:
            int r2 = r0.getType()
        L_0x0094:
            java.util.Map r3 = r6.c()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "net-type"
            r3.put(r4, r2)
            r2 = 0
            if (r0 != 0) goto L_0x00a7
            b.l.a.a.e.e.o$a r0 = b.l.a.a.e.e.o.a.UNKNOWN_MOBILE_SUBTYPE
            goto L_0x00bd
        L_0x00a7:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x00b2
            b.l.a.a.e.e.o$a r0 = b.l.a.a.e.e.o.a.COMBINED
            r0 = 100
            goto L_0x00be
        L_0x00b2:
            android.util.SparseArray<b.l.a.a.e.e.o$a> r3 = b.l.a.a.e.e.o.a.D
            java.lang.Object r3 = r3.get(r0)
            b.l.a.a.e.e.o$a r3 = (b.l.a.a.e.e.o.a) r3
            if (r3 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r0 = r2
        L_0x00be:
            java.util.Map r3 = r6.c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "mobile-subtype"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "country"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "locale"
            r3.put(r4, r0)
            android.content.Context r0 = r5.c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "mcc_mnc"
            r3.put(r4, r0)
            android.content.Context r0 = r5.c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0115 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0115 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0115 }
            goto L_0x011d
        L_0x0115:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            b.a.a.n.f.e(r2, r3, r0)
        L_0x011d:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.util.Map r1 = r6.c()
            java.lang.String r2 = "application_build"
            r1.put(r2, r0)
            b.l.a.a.f.e r6 = r6.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.a.e.d.a(b.l.a.a.f.e):b.l.a.a.f.e");
    }

    public g b(f fVar) {
        g.a aVar;
        String str;
        Integer num;
        g.a aVar2;
        f.b bVar;
        g.a aVar3 = g.a.TRANSIENT_ERROR;
        HashMap hashMap = new HashMap();
        b.l.a.a.f.n.a aVar4 = (b.l.a.a.f.n.a) fVar;
        for (b.l.a.a.f.e next : aVar4.a) {
            String g2 = next.g();
            if (!hashMap.containsKey(g2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(g2, arrayList);
            } else {
                ((List) hashMap.get(g2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b.l.a.a.f.e eVar = (b.l.a.a.f.e) ((List) entry.getValue()).get(0);
                p pVar = p.DEFAULT;
                Long valueOf = Long.valueOf(this.f.a());
                Long valueOf2 = Long.valueOf(this.f2392e.a());
                b.l.a.a.e.e.e eVar2 = new b.l.a.a.e.e.e(k.a.ANDROID_FIREBASE, new c(Integer.valueOf(eVar.f("sdk-version")), eVar.a(AnalyticsContext.Device.DEVICE_MODEL_KEY), eVar.a("hardware"), eVar.a("device"), eVar.a("product"), eVar.a("os-uild"), eVar.a(AnalyticsContext.Device.DEVICE_MANUFACTURER_KEY), eVar.a("fingerprint"), eVar.a("locale"), eVar.a(Constants.AMP_TRACKING_OPTION_COUNTRY), eVar.a("mcc_mnc"), eVar.a("application_build"), (c.a) null), (e.a) null);
                try {
                    str = null;
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                } catch (NumberFormatException unused) {
                    num = null;
                    str = (String) entry.getKey();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    b.l.a.a.f.e eVar3 = (b.l.a.a.f.e) it2.next();
                    b.l.a.a.f.d d2 = eVar3.d();
                    Iterator it3 = it;
                    b.l.a.a.a aVar5 = d2.a;
                    Iterator it4 = it2;
                    String str3 = "";
                    if (aVar5.equals(new b.l.a.a.a("proto"))) {
                        byte[] bArr = d2.f2482b;
                        bVar = new f.b();
                        bVar.d = bArr;
                    } else if (aVar5.equals(new b.l.a.a.a("json"))) {
                        String str4 = new String(d2.f2482b, Charset.forName("UTF-8"));
                        bVar = new f.b();
                        bVar.f2429e = str4;
                    } else {
                        aVar2 = aVar3;
                        Log.w(b.a.a.n.f.v("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{aVar5}));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    }
                    bVar.a = Long.valueOf(eVar3.e());
                    bVar.c = Long.valueOf(eVar3.h());
                    String str5 = eVar3.b().get("tz-offset");
                    bVar.f = Long.valueOf(str5 == null ? 0 : Long.valueOf(str5).longValue());
                    aVar2 = aVar3;
                    bVar.f2430g = new i(o.b.B.get(eVar3.f("net-type")), o.a.D.get(eVar3.f("mobile-subtype")), (i.a) null);
                    if (eVar3.c() != null) {
                        bVar.f2428b = eVar3.c();
                    }
                    String str6 = bVar.a == null ? " eventTimeMs" : str3;
                    if (bVar.c == null) {
                        str6 = b.e.a.a.a.m(str6, " eventUptimeMs");
                    }
                    if (bVar.f == null) {
                        str6 = b.e.a.a.a.m(str6, " timezoneOffsetSeconds");
                    }
                    if (str6.isEmpty()) {
                        arrayList3.add(new b.l.a.a.e.e.f(bVar.a.longValue(), bVar.f2428b, bVar.c.longValue(), bVar.d, bVar.f2429e, bVar.f.longValue(), bVar.f2430g, (f.a) null));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    } else {
                        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str6));
                    }
                }
                Iterator it5 = it;
                g.a aVar6 = aVar3;
                String str7 = valueOf == null ? " requestTimeMs" : "";
                if (valueOf2 == null) {
                    str7 = b.e.a.a.a.m(str7, " requestUptimeMs");
                }
                if (str7.isEmpty()) {
                    arrayList2.add(new b.l.a.a.e.e.g(valueOf.longValue(), valueOf2.longValue(), eVar2, num, str, arrayList3, pVar, (g.a) null));
                    it = it5;
                    aVar3 = aVar6;
                } else {
                    throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str7));
                }
            } else {
                g.a aVar7 = aVar3;
                b.l.a.a.e.e.d dVar = new b.l.a.a.e.e.d(arrayList2);
                URL url = this.d;
                if (aVar4.f2491b != null) {
                    try {
                        a a2 = a.a(((b.l.a.a.f.n.a) fVar).f2491b);
                        String str8 = a2.f2390b;
                        if (str8 != null) {
                            str2 = str8;
                        }
                        String str9 = a2.a;
                        if (str9 != null) {
                            url = c(str9);
                        }
                    } catch (IllegalArgumentException unused2) {
                        return b.l.a.a.f.n.g.a();
                    }
                }
                try {
                    b bVar2 = (b) b.a.a.n.f.J(5, new a(url, dVar, str2), new b(this), c.a);
                    int i2 = bVar2.a;
                    if (i2 == 200) {
                        return new b.l.a.a.f.n.b(g.a.OK, bVar2.c);
                    }
                    if (i2 < 500) {
                        if (i2 != 404) {
                            return b.l.a.a.f.n.g.a();
                        }
                    }
                    aVar = aVar7;
                    try {
                        return new b.l.a.a.f.n.b(aVar, -1);
                    } catch (IOException e2) {
                        e = e2;
                        b.a.a.n.f.e("CctTransportBackend", "Could not make request to the backend", e);
                        return new b.l.a.a.f.n.b(aVar, -1);
                    }
                } catch (IOException e3) {
                    e = e3;
                    aVar = aVar7;
                    b.a.a.n.f.e("CctTransportBackend", "Could not make request to the backend", e);
                    return new b.l.a.a.f.n.b(aVar, -1);
                }
            }
        }
    }
}
