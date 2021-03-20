package n;

import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import n.k;
import n.m0.c;

public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final k[] f10400e;
    public static final k[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f10401g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f10402h = new n(false, false, (String[]) null, (String[]) null);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10403b;
    public final String[] c;
    public final String[] d;

    public static final class a {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f10404b;
        public String[] c;
        public boolean d;

        public a(n nVar) {
            i.e(nVar, "connectionSpec");
            this.a = nVar.a;
            this.f10404b = nVar.c;
            this.c = nVar.d;
            this.d = nVar.f10403b;
        }

        public a(boolean z) {
            this.a = z;
        }

        public final n a() {
            return new n(this.a, this.d, this.f10404b, this.c);
        }

        public final a b(String... strArr) {
            i.e(strArr, "cipherSuites");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f10404b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(k... kVarArr) {
            i.e(kVarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(kVarArr.length);
                for (k kVar : kVarArr) {
                    arrayList.add(kVar.a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            i.e(strArr, "tlsVersions");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(l0... l0VarArr) {
            i.e(l0VarArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(l0VarArr.length);
                for (l0 l0Var : l0VarArr) {
                    arrayList.add(l0Var.f10148h);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    static {
        k kVar = k.f10139q;
        k kVar2 = k.r;
        k kVar3 = k.s;
        k kVar4 = k.f10133k;
        k kVar5 = k.f10135m;
        k kVar6 = k.f10134l;
        k kVar7 = k.f10136n;
        k kVar8 = k.f10138p;
        k kVar9 = k.f10137o;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9};
        f10400e = kVarArr;
        k[] kVarArr2 = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, k.f10131i, k.f10132j, k.f10129g, k.f10130h, k.f10128e, k.f, k.d};
        f = kVarArr2;
        a aVar = new a(true);
        aVar.c((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        l0 l0Var = l0.TLS_1_3;
        l0 l0Var2 = l0.TLS_1_2;
        aVar.f(l0Var, l0Var2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        aVar2.f(l0Var, l0Var2);
        aVar2.d(true);
        f10401g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c((k[]) Arrays.copyOf(kVarArr2, kVarArr2.length));
        aVar3.f(l0Var, l0Var2, l0.TLS_1_1, l0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    public n(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.f10403b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List<k> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b2 : strArr) {
            arrayList.add(k.t.b(b2));
        }
        return g.W(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !c.j(strArr, sSLSocket.getEnabledProtocols(), e.u.a.f7942h)) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        k.b bVar = k.t;
        Comparator<String> comparator = k.f10127b;
        if (!c.j(strArr2, enabledCipherSuites, k.f10127b)) {
            return false;
        }
        return true;
    }

    public final List<l0> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(l0.f10147o.a(a2));
        }
        return g.W(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        n nVar = (n) obj;
        if (z != nVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, nVar.c) && Arrays.equals(this.d, nVar.d) && this.f10403b == nVar.f10403b);
    }

    public int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int i2 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i2) * 31) + (this.f10403b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder B = b.e.a.a.a.B("ConnectionSpec(", "cipherSuites=");
        B.append(Objects.toString(a(), "[all enabled]"));
        B.append(", ");
        B.append("tlsVersions=");
        B.append(Objects.toString(c(), "[all enabled]"));
        B.append(", ");
        B.append("supportsTlsExtensions=");
        B.append(this.f10403b);
        B.append(')');
        return B.toString();
    }
}
