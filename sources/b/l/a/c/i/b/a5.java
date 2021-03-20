package b.l.a.c.i.b;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a5 {
    public long A;
    public long B;
    @Nullable
    public String C;
    public boolean D;
    public long E;
    public long F;
    public final l4 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3888b;
    public String c;
    @Nullable
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f3889e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public long f3890g;

    /* renamed from: h  reason: collision with root package name */
    public long f3891h;

    /* renamed from: i  reason: collision with root package name */
    public long f3892i;

    /* renamed from: j  reason: collision with root package name */
    public String f3893j;

    /* renamed from: k  reason: collision with root package name */
    public long f3894k;

    /* renamed from: l  reason: collision with root package name */
    public String f3895l;

    /* renamed from: m  reason: collision with root package name */
    public long f3896m;

    /* renamed from: n  reason: collision with root package name */
    public long f3897n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3898o;

    /* renamed from: p  reason: collision with root package name */
    public long f3899p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3900q;
    @Nullable
    public String r;
    public Boolean s;
    public long t;
    @Nullable
    public List<String> u;
    @Nullable
    public String v;
    public long w;
    public long x;
    public long y;
    public long z;

    @WorkerThread
    public a5(l4 l4Var, String str) {
        Objects.requireNonNull(l4Var, "null reference");
        a.x(str);
        this.a = l4Var;
        this.f3888b = str;
        l4Var.d().h();
    }

    @WorkerThread
    public final void A(String str) {
        this.a.d().h();
        this.D |= !k9.G(this.c, str);
        this.c = str;
    }

    @WorkerThread
    @Nullable
    public final String B() {
        this.a.d().h();
        return this.d;
    }

    @WorkerThread
    public final void C(@Nullable String str) {
        this.a.d().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ k9.G(this.d, str);
        this.d = str;
    }

    @WorkerThread
    @Nullable
    public final String D() {
        this.a.d().h();
        return this.r;
    }

    @WorkerThread
    public final void E(@Nullable String str) {
        this.a.d().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ k9.G(this.r, str);
        this.r = str;
    }

    @WorkerThread
    @Nullable
    public final String F() {
        this.a.d().h();
        return this.v;
    }

    @WorkerThread
    public final void G(@Nullable String str) {
        this.a.d().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ k9.G(this.v, str);
        this.v = str;
    }

    @WorkerThread
    public final String H() {
        this.a.d().h();
        return this.f3889e;
    }

    @WorkerThread
    public final void I(String str) {
        this.a.d().h();
        this.D |= !k9.G(this.f3889e, str);
        this.f3889e = str;
    }

    @WorkerThread
    public final String J() {
        this.a.d().h();
        return this.f;
    }

    @WorkerThread
    public final void K(String str) {
        this.a.d().h();
        this.D |= !k9.G(this.f, str);
        this.f = str;
    }

    @WorkerThread
    public final long L() {
        this.a.d().h();
        return this.f3891h;
    }

    @WorkerThread
    public final void M(long j2) {
        this.a.d().h();
        this.D |= this.f3891h != j2;
        this.f3891h = j2;
    }

    @WorkerThread
    public final long N() {
        this.a.d().h();
        return this.f3892i;
    }

    @WorkerThread
    public final void O(long j2) {
        this.a.d().h();
        this.D |= this.f3892i != j2;
        this.f3892i = j2;
    }

    @WorkerThread
    public final String P() {
        this.a.d().h();
        return this.f3893j;
    }

    @WorkerThread
    public final void Q(String str) {
        this.a.d().h();
        this.D |= !k9.G(this.f3893j, str);
        this.f3893j = str;
    }

    @WorkerThread
    public final long R() {
        this.a.d().h();
        return this.f3894k;
    }

    @WorkerThread
    public final void S(long j2) {
        this.a.d().h();
        this.D |= this.f3894k != j2;
        this.f3894k = j2;
    }

    @WorkerThread
    public final String T() {
        this.a.d().h();
        return this.f3895l;
    }

    @WorkerThread
    public final void U(String str) {
        this.a.d().h();
        this.D |= !k9.G(this.f3895l, str);
        this.f3895l = str;
    }

    @WorkerThread
    public final long V() {
        this.a.d().h();
        return this.f3896m;
    }

    @WorkerThread
    public final void a(long j2) {
        this.a.d().h();
        this.D |= this.f3896m != j2;
        this.f3896m = j2;
    }

    @WorkerThread
    public final long b() {
        this.a.d().h();
        return this.f3897n;
    }

    @WorkerThread
    public final void c(long j2) {
        this.a.d().h();
        this.D |= this.f3897n != j2;
        this.f3897n = j2;
    }

    @WorkerThread
    public final long d() {
        this.a.d().h();
        return this.t;
    }

    @WorkerThread
    public final void e(long j2) {
        this.a.d().h();
        this.D |= this.t != j2;
        this.t = j2;
    }

    @WorkerThread
    public final boolean f() {
        this.a.d().h();
        return this.f3898o;
    }

    @WorkerThread
    public final void g(boolean z2) {
        this.a.d().h();
        this.D |= this.f3898o != z2;
        this.f3898o = z2;
    }

    @WorkerThread
    public final void h(long j2) {
        boolean z2 = true;
        a.j(j2 >= 0);
        this.a.d().h();
        boolean z3 = this.D;
        if (this.f3890g == j2) {
            z2 = false;
        }
        this.D = z3 | z2;
        this.f3890g = j2;
    }

    @WorkerThread
    public final long i() {
        this.a.d().h();
        return this.f3890g;
    }

    @WorkerThread
    public final long j() {
        this.a.d().h();
        return this.E;
    }

    @WorkerThread
    public final void k(long j2) {
        this.a.d().h();
        this.D |= this.E != j2;
        this.E = j2;
    }

    @WorkerThread
    public final long l() {
        this.a.d().h();
        return this.F;
    }

    @WorkerThread
    public final void m(long j2) {
        this.a.d().h();
        this.D |= this.F != j2;
        this.F = j2;
    }

    @WorkerThread
    public final void n() {
        this.a.d().h();
        long j2 = this.f3890g + 1;
        if (j2 > 2147483647L) {
            this.a.a().f4091i.b("Bundle index overflow. appId", k3.t(this.f3888b));
            j2 = 0;
        }
        this.D = true;
        this.f3890g = j2;
    }

    @WorkerThread
    @Nullable
    public final String o() {
        this.a.d().h();
        String str = this.C;
        p((String) null);
        return str;
    }

    @WorkerThread
    public final void p(@Nullable String str) {
        this.a.d().h();
        this.D |= !k9.G(this.C, str);
        this.C = str;
    }

    @WorkerThread
    public final long q() {
        this.a.d().h();
        return this.f3899p;
    }

    @WorkerThread
    public final void r(long j2) {
        this.a.d().h();
        this.D |= this.f3899p != j2;
        this.f3899p = j2;
    }

    @WorkerThread
    public final boolean s() {
        this.a.d().h();
        return this.f3900q;
    }

    @WorkerThread
    public final void t(boolean z2) {
        this.a.d().h();
        this.D |= this.f3900q != z2;
        this.f3900q = z2;
    }

    @WorkerThread
    public final Boolean u() {
        this.a.d().h();
        return this.s;
    }

    @WorkerThread
    public final void v(Boolean bool) {
        this.a.d().h();
        boolean z2 = this.D;
        Boolean bool2 = this.s;
        this.D = z2 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.s = bool;
    }

    @WorkerThread
    @Nullable
    public final List<String> w() {
        this.a.d().h();
        return this.u;
    }

    @WorkerThread
    public final void x(@Nullable List<String> list) {
        this.a.d().h();
        List<String> list2 = this.u;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.D = true;
                this.u = list != null ? new ArrayList(list) : null;
            }
        }
    }

    @WorkerThread
    @Nullable
    public final String y() {
        this.a.d().h();
        return this.f3888b;
    }

    @WorkerThread
    public final String z() {
        this.a.d().h();
        return this.c;
    }
}
