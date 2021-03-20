package e.a.a.a.y0.a.p;

import e.a.a.a.y0.b.b1.c;
import e.a.a.a.y0.b.c1.a0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.l;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;

public final class g extends e.a.a.a.y0.a.g {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ l[] f7729p = {v.c(new q(v.a(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};

    /* renamed from: m  reason: collision with root package name */
    public w f7730m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7731n = true;

    /* renamed from: o  reason: collision with root package name */
    public final i f7732o;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public static final class b extends k implements e.x.b.a<k> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f7737h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ m f7738i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, m mVar) {
            super(0);
            this.f7737h = gVar;
            this.f7738i = mVar;
        }

        public Object e() {
            a0 a0Var = this.f7737h.a;
            if (a0Var != null) {
                e.x.c.i.d(a0Var, "builtInsModule");
                return new k(a0Var, this.f7738i, new h(this), new i(this));
            }
            e.a.a.a.y0.a.g.a(6);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(m mVar, a aVar) {
        super(mVar);
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(aVar, "kind");
        this.f7732o = ((e) mVar).a(new b(this, mVar));
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            d(false);
        } else if (ordinal == 2) {
            d(true);
        }
    }

    public final k P() {
        return (k) b.q.a.a.j1(this.f7732o, f7729p[0]);
    }

    public e.a.a.a.y0.b.b1.a e() {
        return P();
    }

    public Iterable k() {
        Iterable<e.a.a.a.y0.b.b1.b> k2 = super.k();
        e.x.c.i.d(k2, "super.getClassDescriptorFactories()");
        m mVar = this.d;
        if (mVar != null) {
            e.x.c.i.d(mVar, "storageManager");
            a0 a0Var = this.a;
            if (a0Var != null) {
                e.x.c.i.d(a0Var, "builtInsModule");
                return e.t.g.H(k2, new e(mVar, a0Var, (e.x.b.l) null, 4));
            }
            e.a.a.a.y0.a.g.a(6);
            throw null;
        }
        e.a.a.a.y0.a.g.a(5);
        throw null;
    }

    public c q() {
        return P();
    }
}
