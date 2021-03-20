package b.a.a.b;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.c;
import b.h.a.f;
import b.h.a.h;
import b.h.a.j;
import b.h.a.m.m;
import b.h.a.m.o;
import b.h.a.m.t;
import b.h.a.m.v.k;
import b.h.a.m.x.c.l;
import b.h.a.q.a;
import b.h.a.q.d;
import java.util.ArrayList;

public class i<TranscodeType> extends h<TranscodeType> implements Cloneable {
    public i(@NonNull c cVar, @NonNull b.h.a.i iVar, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(cVar, iVar, cls, context);
    }

    @CheckResult
    @NonNull
    public h A(@NonNull a aVar) {
        return (i) super.a(aVar);
    }

    @CheckResult
    @NonNull
    public h F(@Nullable Object obj) {
        this.M = obj;
        this.P = true;
        return this;
    }

    @CheckResult
    @NonNull
    public h G(@Nullable String str) {
        this.M = str;
        this.P = true;
        return this;
    }

    @CheckResult
    @NonNull
    public h J(@NonNull j jVar) {
        super.J(jVar);
        return this;
    }

    @CheckResult
    @NonNull
    public i<TranscodeType> K(@NonNull a<?> aVar) {
        return (i) super.a(aVar);
    }

    @CheckResult
    /* renamed from: L */
    public i<TranscodeType> d() {
        return (i) super.d();
    }

    @CheckResult
    @NonNull
    public a a(@NonNull a aVar) {
        return (i) super.a(aVar);
    }

    @CheckResult
    @NonNull
    public a c() {
        return (i) w(l.c, new b.h.a.m.x.c.i());
    }

    @CheckResult
    @NonNull
    public a f(@NonNull Class cls) {
        return (i) super.f(cls);
    }

    @CheckResult
    @NonNull
    public a g(@NonNull k kVar) {
        return (i) super.g(kVar);
    }

    @CheckResult
    @NonNull
    public a h(@NonNull l lVar) {
        return (i) super.h(lVar);
    }

    @CheckResult
    @NonNull
    public a k() {
        return (i) super.k();
    }

    @CheckResult
    @NonNull
    public a l() {
        return (i) super.l();
    }

    @CheckResult
    @NonNull
    public a m() {
        return (i) super.m();
    }

    @CheckResult
    @NonNull
    public a o(int i2, int i3) {
        return (i) super.o(i2, i3);
    }

    @CheckResult
    @NonNull
    public a p(@NonNull f fVar) {
        return (i) super.p(fVar);
    }

    @CheckResult
    @NonNull
    public a r(@NonNull o oVar, @NonNull Object obj) {
        return (i) super.r(oVar, obj);
    }

    @CheckResult
    @NonNull
    public a s(@NonNull m mVar) {
        return (i) super.s(mVar);
    }

    @CheckResult
    @NonNull
    public a t(boolean z) {
        return (i) super.t(z);
    }

    @CheckResult
    @NonNull
    public a u(@NonNull t tVar) {
        return (i) v(tVar, true);
    }

    @CheckResult
    @NonNull
    public a y(boolean z) {
        return (i) super.y(z);
    }

    @CheckResult
    @NonNull
    public h z(@Nullable d dVar) {
        if (dVar != null) {
            if (this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(dVar);
        }
        return this;
    }
}
