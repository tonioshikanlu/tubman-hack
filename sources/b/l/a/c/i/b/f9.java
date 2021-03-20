package b.l.a.c.i.b;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import b.e.a.a.a;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.c2;
import b.l.a.c.f.i.c5;
import b.l.a.c.f.i.e2;
import b.l.a.c.f.i.f2;
import b.l.a.c.f.i.f4;
import b.l.a.c.f.i.g2;
import b.l.a.c.f.i.g6;
import b.l.a.c.f.i.j1;
import b.l.a.c.f.i.k5;
import b.l.a.c.f.i.l1;
import b.l.a.c.f.i.m0;
import b.l.a.c.f.i.m5;
import b.l.a.c.f.i.n1;
import b.l.a.c.f.i.o1;
import b.l.a.c.f.i.r0;
import b.l.a.c.f.i.r1;
import b.l.a.c.f.i.s1;
import b.l.a.c.f.i.t0;
import b.l.a.c.f.i.u1;
import b.l.a.c.f.i.v1;
import b.l.a.c.f.i.w1;
import b.l.a.c.f.i.x0;
import com.amplitude.api.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

public final class f9 extends u8 {
    public f9(d9 d9Var) {
        super(d9Var);
    }

    public static boolean A(List<Long> list, int i2) {
        if (i2 >= ((g6) list).f3570j * 64) {
            return false;
        }
        return ((1 << (i2 % 64)) & ((Long) ((g6) list).get(i2 / 64)).longValue()) != 0;
    }

    public static List<Long> B(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static <Builder extends f4> Builder G(Builder builder, byte[] bArr) {
        Class<c5> cls = c5.class;
        c5 c5Var = c5.c;
        if (c5Var == null) {
            synchronized (cls) {
                c5Var = c5.c;
                if (c5Var == null) {
                    c5Var = k5.b(cls);
                    c5.c = c5Var;
                }
            }
        }
        if (c5Var != null) {
            Objects.requireNonNull(builder);
            Builder builder2 = (m5) builder;
            builder2.i(bArr, 0, bArr.length, c5Var);
            return builder2;
        }
        Objects.requireNonNull(builder);
        Builder builder3 = (m5) builder;
        builder3.i(bArr, 0, bArr.length, c5.a());
        return builder3;
    }

    public static int H(v1 v1Var, String str) {
        for (int i2 = 0; i2 < ((w1) v1Var.f3654i).m1(); i2++) {
            if (str.equals(((w1) v1Var.f3654i).n1(i2).u())) {
                return i2;
            }
        }
        return -1;
    }

    public static List<s1> I(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                r1 E = s1.E();
                for (String str : bundle.keySet()) {
                    r1 E2 = s1.E();
                    E2.m(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        E2.o(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        E2.n((String) obj);
                    } else if (obj instanceof Double) {
                        E2.p(((Double) obj).doubleValue());
                    }
                    if (E.f3655j) {
                        E.j();
                        E.f3655j = false;
                    }
                    s1.N((s1) E.f3654i, (s1) E2.g());
                }
                if (((s1) E.f3654i).D() > 0) {
                    arrayList.add((s1) E.g());
                }
            }
        }
        return arrayList;
    }

    public static final void J(n1 n1Var, String str, Object obj) {
        List<s1> m2 = n1Var.m();
        int i2 = 0;
        while (true) {
            if (i2 >= m2.size()) {
                i2 = -1;
                break;
            } else if (str.equals(m2.get(i2).t())) {
                break;
            } else {
                i2++;
            }
        }
        r1 E = s1.E();
        E.m(str);
        if (obj instanceof Long) {
            E.o(((Long) obj).longValue());
        } else if (obj instanceof String) {
            E.n((String) obj);
        } else if (obj instanceof Double) {
            E.p(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<s1> I = I((Bundle[]) obj);
            if (E.f3655j) {
                E.j();
                E.f3655j = false;
            }
            s1.O((s1) E.f3654i, I);
        }
        if (i2 >= 0) {
            if (n1Var.f3655j) {
                n1Var.j();
                n1Var.f3655j = false;
            }
            o1.E((o1) n1Var.f3654i, i2, (s1) E.g());
            return;
        }
        n1Var.q(E);
    }

    @WorkerThread
    public static final boolean K(s sVar, p9 p9Var) {
        Objects.requireNonNull(sVar, "null reference");
        return !TextUtils.isEmpty(p9Var.f4219i) || !TextUtils.isEmpty(p9Var.x);
    }

    public static final s1 L(o1 o1Var, String str) {
        for (s1 next : o1Var.s()) {
            if (next.t().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static final Object l(o1 o1Var, String str) {
        s1 L = L(o1Var, str);
        if (L == null) {
            return null;
        }
        if (L.u()) {
            return L.v();
        }
        if (L.w()) {
            return Long.valueOf(L.x());
        }
        if (L.A()) {
            return Double.valueOf(L.B());
        }
        if (L.D() <= 0) {
            return null;
        }
        List<s1> C = L.C();
        ArrayList arrayList = new ArrayList();
        for (s1 next : C) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (s1 next2 : next.C()) {
                    if (next2.u()) {
                        bundle.putString(next2.t(), next2.v());
                    } else if (next2.w()) {
                        bundle.putLong(next2.t(), next2.x());
                    } else if (next2.A()) {
                        bundle.putDouble(next2.t(), next2.B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void o(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    public static final String p(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void q(StringBuilder sb, int i2, String str, c2 c2Var, String str2) {
        if (c2Var != null) {
            o(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (c2Var.v() != 0) {
                o(sb, 4);
                sb.append("results: ");
                int i3 = 0;
                for (Long next : c2Var.u()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (c2Var.t() != 0) {
                o(sb, 4);
                sb.append("status: ");
                int i5 = 0;
                for (Long next2 : c2Var.s()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i5 = i6;
                }
                sb.append(10);
            }
            if (c2Var.x() != 0) {
                o(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i7 = 0;
                for (l1 next3 : c2Var.w()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.s() ? Integer.valueOf(next3.t()) : null);
                    sb.append(":");
                    sb.append(next3.u() ? Long.valueOf(next3.v()) : null);
                    i7 = i8;
                }
                sb.append("}\n");
            }
            if (c2Var.A() != 0) {
                o(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i9 = 0;
                for (e2 next4 : c2Var.z()) {
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.s() ? Integer.valueOf(next4.t()) : null);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : next4.u()) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i9 = i10;
                }
                sb.append("}\n");
            }
            o(sb, 3);
            sb.append("}\n");
        }
    }

    public static final void r(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            o(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void s(StringBuilder sb, int i2, String str, r0 r0Var) {
        if (r0Var != null) {
            o(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            if (r0Var.s()) {
                r(sb, i2, "comparison_type", r0Var.t().name());
            }
            if (r0Var.u()) {
                r(sb, i2, "match_as_float", Boolean.valueOf(r0Var.v()));
            }
            if (r0Var.w()) {
                r(sb, i2, "comparison_value", r0Var.x());
            }
            if (r0Var.y()) {
                r(sb, i2, "min_comparison_value", r0Var.z());
            }
            if (r0Var.A()) {
                r(sb, i2, "max_comparison_value", r0Var.B());
            }
            o(sb, i2);
            sb.append("}\n");
        }
    }

    public static boolean z(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public final List<Long> C(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.a.a().f4091i.b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.a.a().f4091i.c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    public final boolean D(long j2, long j3) {
        if (j2 == 0 || j3 <= 0) {
            return true;
        }
        Objects.requireNonNull((c) this.a.f4121n);
        return Math.abs(System.currentTimeMillis() - j2) > j3;
    }

    @WorkerThread
    public final long E(byte[] bArr) {
        this.a.t().h();
        MessageDigest B = k9.B();
        if (B != null) {
            return k9.C(B.digest(bArr));
        }
        this.a.a().f.a("Failed to get MD5");
        return 0;
    }

    public final byte[] F(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.a.a().f.b("Failed to gzip content", e2);
            throw e2;
        }
    }

    public final boolean k() {
        return false;
    }

    public final void m(StringBuilder sb, int i2, List<s1> list) {
        if (list != null) {
            int i3 = i2 + 1;
            for (s1 next : list) {
                if (next != null) {
                    o(sb, i3);
                    sb.append("param {\n");
                    Double d = null;
                    r(sb, i3, "name", next.s() ? this.a.u().q(next.t()) : null);
                    r(sb, i3, "string_value", next.u() ? next.v() : null);
                    r(sb, i3, "int_value", next.w() ? Long.valueOf(next.x()) : null);
                    if (next.A()) {
                        d = Double.valueOf(next.B());
                    }
                    r(sb, i3, "double_value", d);
                    if (next.D() > 0) {
                        m(sb, i3, next.C());
                    }
                    o(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void n(StringBuilder sb, int i2, m0 m0Var) {
        if (m0Var != null) {
            o(sb, i2);
            sb.append("filter {\n");
            if (m0Var.w()) {
                r(sb, i2, "complement", Boolean.valueOf(m0Var.x()));
            }
            if (m0Var.y()) {
                r(sb, i2, "param_name", this.a.u().q(m0Var.z()));
            }
            if (m0Var.s()) {
                int i3 = i2 + 1;
                x0 t = m0Var.t();
                if (t != null) {
                    o(sb, i3);
                    sb.append("string_filter {\n");
                    if (t.s()) {
                        r(sb, i3, "match_type", t.t().name());
                    }
                    if (t.u()) {
                        r(sb, i3, "expression", t.v());
                    }
                    if (t.w()) {
                        r(sb, i3, "case_sensitive", Boolean.valueOf(t.x()));
                    }
                    if (t.z() > 0) {
                        o(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        for (String append : t.y()) {
                            o(sb, i3 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    o(sb, i3);
                    sb.append("}\n");
                }
            }
            if (m0Var.u()) {
                s(sb, i2 + 1, "number_filter", m0Var.v());
            }
            o(sb, i2);
            sb.append("}\n");
        }
    }

    public final void t(f2 f2Var, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (f2Var.f3655j) {
            f2Var.j();
            f2Var.f3655j = false;
        }
        g2.G((g2) f2Var.f3654i);
        if (f2Var.f3655j) {
            f2Var.j();
            f2Var.f3655j = false;
        }
        g2.I((g2) f2Var.f3654i);
        if (f2Var.f3655j) {
            f2Var.j();
            f2Var.f3655j = false;
        }
        g2.K((g2) f2Var.f3654i);
        if (obj instanceof String) {
            String str = (String) obj;
            if (f2Var.f3655j) {
                f2Var.j();
                f2Var.f3655j = false;
            }
            g2.F((g2) f2Var.f3654i, str);
        } else if (obj instanceof Long) {
            f2Var.o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (f2Var.f3655j) {
                f2Var.j();
                f2Var.f3655j = false;
            }
            g2.J((g2) f2Var.f3654i, doubleValue);
        } else {
            this.a.a().f.b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void u(r1 r1Var, Object obj) {
        if (r1Var.f3655j) {
            r1Var.j();
            r1Var.f3655j = false;
        }
        s1.I((s1) r1Var.f3654i);
        if (r1Var.f3655j) {
            r1Var.j();
            r1Var.f3655j = false;
        }
        s1.K((s1) r1Var.f3654i);
        if (r1Var.f3655j) {
            r1Var.j();
            r1Var.f3655j = false;
        }
        s1.M((s1) r1Var.f3654i);
        if (r1Var.f3655j) {
            r1Var.j();
            r1Var.f3655j = false;
        }
        s1.P((s1) r1Var.f3654i);
        if (obj instanceof String) {
            r1Var.n((String) obj);
        } else if (obj instanceof Long) {
            r1Var.o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            r1Var.p(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<s1> I = I((Bundle[]) obj);
            if (r1Var.f3655j) {
                r1Var.j();
                r1Var.f3655j = false;
            }
            s1.O((s1) r1Var.f3654i, I);
        } else {
            this.a.a().f.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final o1 v(n nVar) {
        n1 C = o1.C();
        long j2 = nVar.f4164e;
        if (C.f3655j) {
            C.j();
            C.f3655j = false;
        }
        o1.L((o1) C.f3654i, j2);
        for (String str : nVar.f.f4228h.keySet()) {
            r1 E = s1.E();
            E.m(str);
            Object V = nVar.f.V(str);
            Objects.requireNonNull(V, "null reference");
            u(E, V);
            C.q(E);
        }
        return (o1) C.g();
    }

    public final String w(u1 u1Var) {
        StringBuilder y = a.y("\nbatch {\n");
        for (w1 next : u1Var.s()) {
            if (next != null) {
                o(y, 1);
                y.append("bundle {\n");
                if (next.S()) {
                    r(y, 1, "protocol_version", Integer.valueOf(next.S0()));
                }
                r(y, 1, Constants.AMP_TRACKING_OPTION_PLATFORM, next.y1());
                if (next.u()) {
                    r(y, 1, "gmp_version", Long.valueOf(next.v()));
                }
                if (next.w()) {
                    r(y, 1, "uploading_gmp_version", Long.valueOf(next.x()));
                }
                if (next.x0()) {
                    r(y, 1, "dynamite_version", Long.valueOf(next.y0()));
                }
                if (next.O()) {
                    r(y, 1, "config_version", Long.valueOf(next.P()));
                }
                r(y, 1, "gmp_app_id", next.H());
                r(y, 1, "admob_app_id", next.w0());
                r(y, 1, "app_id", next.s());
                r(y, 1, "app_version", next.t());
                if (next.M()) {
                    r(y, 1, "app_version_major", Integer.valueOf(next.N()));
                }
                r(y, 1, "firebase_instance_id", next.L());
                if (next.C()) {
                    r(y, 1, "dev_cert_hash", Long.valueOf(next.D()));
                }
                r(y, 1, "app_store", next.E1());
                if (next.o1()) {
                    r(y, 1, "upload_timestamp_millis", Long.valueOf(next.p1()));
                }
                if (next.q1()) {
                    r(y, 1, "start_timestamp_millis", Long.valueOf(next.r1()));
                }
                if (next.s1()) {
                    r(y, 1, "end_timestamp_millis", Long.valueOf(next.t1()));
                }
                if (next.u1()) {
                    r(y, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.v1()));
                }
                if (next.w1()) {
                    r(y, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.x1()));
                }
                r(y, 1, "app_instance_id", next.B());
                r(y, 1, "resettable_device_id", next.y());
                r(y, 1, "ds_id", next.t0());
                if (next.z()) {
                    r(y, 1, "limited_ad_tracking", Boolean.valueOf(next.A()));
                }
                r(y, 1, Constants.AMP_TRACKING_OPTION_OS_VERSION, next.z1());
                r(y, 1, Constants.AMP_TRACKING_OPTION_DEVICE_MODEL, next.A1());
                r(y, 1, "user_default_language", next.B1());
                if (next.C1()) {
                    r(y, 1, "time_zone_offset_minutes", Integer.valueOf(next.D1()));
                }
                if (next.E()) {
                    r(y, 1, "bundle_sequential_index", Integer.valueOf(next.F()));
                }
                if (next.I()) {
                    r(y, 1, "service_upload", Boolean.valueOf(next.J()));
                }
                r(y, 1, "health_monitor", next.G());
                if (!this.a.f4114g.r((String) null, x2.v0) && next.Q() && next.R() != 0) {
                    r(y, 1, "android_id", Long.valueOf(next.R()));
                }
                if (next.u0()) {
                    r(y, 1, "retry_counter", Integer.valueOf(next.v0()));
                }
                if (next.A0()) {
                    r(y, 1, "consent_signals", next.B0());
                }
                List<g2> l1 = next.l1();
                if (l1 != null) {
                    for (g2 next2 : l1) {
                        if (next2 != null) {
                            o(y, 2);
                            y.append("user_property {\n");
                            r(y, 2, "set_timestamp_millis", next2.s() ? Long.valueOf(next2.t()) : null);
                            r(y, 2, "name", this.a.u().r(next2.u()));
                            r(y, 2, "string_value", next2.w());
                            r(y, 2, "int_value", next2.x() ? Long.valueOf(next2.y()) : null);
                            r(y, 2, "double_value", next2.z() ? Double.valueOf(next2.A()) : null);
                            o(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                List<j1> K = next.K();
                String s = next.s();
                if (K != null) {
                    for (j1 next3 : K) {
                        if (next3 != null) {
                            o(y, 2);
                            y.append("audience_membership {\n");
                            if (next3.s()) {
                                r(y, 2, "audience_id", Integer.valueOf(next3.t()));
                            }
                            if (next3.x()) {
                                r(y, 2, "new_audience", Boolean.valueOf(next3.y()));
                            }
                            q(y, 2, "current_data", next3.u(), s);
                            if (next3.v()) {
                                q(y, 2, "previous_data", next3.w(), s);
                            }
                            o(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                List<o1> i1 = next.i1();
                if (i1 != null) {
                    for (o1 next4 : i1) {
                        if (next4 != null) {
                            o(y, 2);
                            y.append("event {\n");
                            r(y, 2, "name", this.a.u().p(next4.v()));
                            if (next4.w()) {
                                r(y, 2, "timestamp_millis", Long.valueOf(next4.x()));
                            }
                            if (next4.y()) {
                                r(y, 2, "previous_timestamp_millis", Long.valueOf(next4.z()));
                            }
                            if (next4.A()) {
                                r(y, 2, "count", Integer.valueOf(next4.B()));
                            }
                            if (next4.t() != 0) {
                                m(y, 2, next4.s());
                            }
                            o(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                o(y, 1);
                y.append("}\n");
            }
        }
        y.append("}\n");
        return y.toString();
    }

    public final String x(t0 t0Var) {
        StringBuilder y = a.y("\nproperty_filter {\n");
        if (t0Var.s()) {
            r(y, 0, "filter_id", Integer.valueOf(t0Var.t()));
        }
        r(y, 0, "property_name", this.a.u().r(t0Var.u()));
        String p2 = p(t0Var.w(), t0Var.x(), t0Var.z());
        if (!p2.isEmpty()) {
            r(y, 0, "filter_type", p2);
        }
        n(y, 1, t0Var.v());
        y.append("}\n");
        return y.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.a.a().f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T y(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ b -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ b -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ b -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ b -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ b -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            b.l.a.c.i.b.l4 r5 = r4.a     // Catch:{ all -> 0x001a }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ all -> 0x001a }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.f9.y(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
