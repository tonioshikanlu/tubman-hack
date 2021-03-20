package b.a.a.a;

import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b.a.a.g.s;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.k.i;
import b.l.b.a.a.b.f;
import b.p.a.l;
import com.appfoundry.previewer.model.AuthInfoFromBackend;
import com.appfoundry.previewer.model.ExchangeResponse;
import com.appfoundry.previewer.model.Page;
import e.r;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.u;
import g.a.a.m;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;

@e(c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1", f = "BravoFragment.kt", l = {121, 123}, m = "invokeSuspend")
public final class a extends h implements p<z, e.v.d<? super r>, Object> {

    /* renamed from: l  reason: collision with root package name */
    public z f55l;

    /* renamed from: m  reason: collision with root package name */
    public Object f56m;

    /* renamed from: n  reason: collision with root package name */
    public Object f57n;

    /* renamed from: o  reason: collision with root package name */
    public Object f58o;

    /* renamed from: p  reason: collision with root package name */
    public int f59p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ h f60q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ RelativeLayout s;

    /* renamed from: b.a.a.a.a$a  reason: collision with other inner class name */
    public static final class C0001a implements i {
        public final /* synthetic */ a a;

        @e(c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$1$withNewCredential$1", f = "BravoFragment.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: b.a.a.a.a$a$a  reason: collision with other inner class name */
        public static final class C0002a extends h implements p<z, e.v.d<? super r>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f61l;

            /* renamed from: m  reason: collision with root package name */
            public Object f62m;

            /* renamed from: n  reason: collision with root package name */
            public Object f63n;

            /* renamed from: o  reason: collision with root package name */
            public int f64o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ C0001a f65p;

            /* renamed from: b.a.a.a.a$a$a$a  reason: collision with other inner class name */
            /* compiled from: java-style lambda group */
            public static final class C0003a implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ int f66h;

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ Object f67i;

                public C0003a(int i2, Object obj) {
                    this.f66h = i2;
                    this.f67i = obj;
                }

                public final void run() {
                    int i2 = this.f66h;
                    if (i2 == 0) {
                        RelativeLayout relativeLayout = ((C0002a) this.f67i).f65p.a.s;
                        e.x.c.i.d(relativeLayout, "loading");
                        o.e(relativeLayout);
                    } else if (i2 == 1) {
                        SwipeRefreshLayout swipeRefreshLayout = ((C0002a) this.f67i).f65p.a.f60q.f107m;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    } else {
                        throw null;
                    }
                }
            }

            @e(c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$1$withNewCredential$1$1", f = "BravoFragment.kt", l = {}, m = "invokeSuspend")
            /* renamed from: b.a.a.a.a$a$a$b */
            public static final class b extends h implements p<z, e.v.d<? super Page>, Object> {

                /* renamed from: l  reason: collision with root package name */
                public z f68l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ C0002a f69m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(C0002a aVar, e.v.d dVar) {
                    super(2, dVar);
                    this.f69m = aVar;
                }

                public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                    e.x.c.i.e(dVar, "completion");
                    b bVar = new b(this.f69m, dVar);
                    bVar.f68l = (z) obj;
                    return bVar;
                }

                public final Object d(Object obj) {
                    b.q.a.a.c3(obj);
                    j i2 = b.a.a.n.c.i(this.f69m.f65p.a.f60q.f74h, false, 2);
                    if (i2 != null) {
                        return i2.a;
                    }
                    return null;
                }

                public final Object invoke(Object obj, Object obj2) {
                    e.v.d dVar = (e.v.d) obj2;
                    e.x.c.i.e(dVar, "completion");
                    C0002a aVar = this.f69m;
                    dVar.getContext();
                    z zVar = (z) obj;
                    b.q.a.a.c3(r.a);
                    j i2 = b.a.a.n.c.i(aVar.f65p.a.f60q.f74h, false, 2);
                    if (i2 != null) {
                        return i2.a;
                    }
                    return null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0002a(C0001a aVar, e.v.d dVar) {
                super(2, dVar);
                this.f65p = aVar;
            }

            public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                C0002a aVar = new C0002a(this.f65p, dVar);
                aVar.f61l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                h hVar;
                FragmentActivity fragmentActivity;
                C0003a aVar;
                e.v.i.a aVar2 = e.v.i.a.COROUTINE_SUSPENDED;
                int i2 = this.f64o;
                if (i2 == 0) {
                    b.q.a.a.c3(obj);
                    z zVar = this.f61l;
                    h hVar2 = this.f65p.a.f60q;
                    x xVar = i0.f9955b;
                    b bVar = new b(this, (e.v.d) null);
                    this.f62m = zVar;
                    this.f63n = hVar2;
                    this.f64o = 1;
                    obj = e.a.a.a.y0.m.o1.c.u0(xVar, bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    hVar = hVar2;
                } else if (i2 == 1) {
                    hVar = (h) this.f63n;
                    z zVar2 = (z) this.f62m;
                    b.q.a.a.c3(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar.f74h = (Page) obj;
                a aVar3 = this.f65p.a;
                h hVar3 = aVar3.f60q;
                if (hVar3.f74h == null) {
                    p.a.a.c.b().g(new s(false, 1));
                } else {
                    if (!aVar3.r) {
                        fragmentActivity = hVar3.getActivity();
                        if (fragmentActivity != null) {
                            aVar = new C0003a(0, this);
                        }
                        h hVar4 = this.f65p.a.f60q;
                        int i3 = h.f104p;
                        hVar4.g();
                    } else {
                        fragmentActivity = hVar3.getActivity();
                        if (fragmentActivity != null) {
                            aVar = new C0003a(1, this);
                        }
                        h hVar42 = this.f65p.a.f60q;
                        int i32 = h.f104p;
                        hVar42.g();
                    }
                    fragmentActivity.runOnUiThread(aVar);
                    h hVar422 = this.f65p.a.f60q;
                    int i322 = h.f104p;
                    hVar422.g();
                }
                return r.a;
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                C0002a aVar = new C0002a(this.f65p, dVar);
                aVar.f61l = (z) obj;
                return aVar.d(r.a);
            }
        }

        public C0001a(a aVar) {
            this.a = aVar;
        }

        public void a(String str) {
            q.a.a.d.b("Error refreshing: %s", str);
        }

        public void b(f fVar) {
            Object[] objArr = new Object[1];
            objArr[0] = fVar != null ? fVar.getAccessToken() : null;
            q.a.a.d.a("AuthHandler: AuthToken: = %s", objArr);
            b.f.a.e.v0(fVar);
            x xVar = i0.a;
            e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (a0) null, new C0002a(this, (e.v.d) null), 3, (Object) null);
        }
    }

    public static final class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f70h;

        public b(a aVar) {
            this.f70h = aVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f70h.s;
            e.x.c.i.d(relativeLayout, "loading");
            o.e(relativeLayout);
        }
    }

    @e(c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$authInfo$1", f = "BravoFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends h implements p<z, e.v.d<? super AuthInfoFromBackend>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f71l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ u f72m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(u uVar, e.v.d dVar) {
            super(2, dVar);
            this.f72m = uVar;
        }

        public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            c cVar = new c(this.f72m, dVar);
            cVar.f71l = (z) obj;
            return cVar;
        }

        public final Object d(Object obj) {
            b.q.a.a.c3(obj);
            try {
                b.a.a.m.b bVar = b.a.a.m.b.f349m;
                l<AuthInfoFromBackend> lVar = b.a.a.m.b.d;
                String str = ((ExchangeResponse) this.f72m.f7989h).f7111b;
                if (str == null) {
                    str = "";
                }
                return lVar.b(str);
            } catch (Exception e2) {
                q.a.a.d.b("Exception parsing secrets with backend: %s", e2.toString());
                return null;
            }
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            e.x.c.i.e(dVar, "completion");
            u uVar = this.f72m;
            dVar.getContext();
            z zVar = (z) obj;
            b.q.a.a.c3(r.a);
            try {
                b.a.a.m.b bVar = b.a.a.m.b.f349m;
                l<AuthInfoFromBackend> lVar = b.a.a.m.b.d;
                String str = ((ExchangeResponse) uVar.f7989h).f7111b;
                if (str == null) {
                    str = "";
                }
                return lVar.b(str);
            } catch (Exception e2) {
                q.a.a.d.b("Exception parsing secrets with backend: %s", e2.toString());
                return null;
            }
        }
    }

    @e(c = "com.appfoundry.previewer.fragments.BravoFragment$getAuthSecretsAndRefreshCredentials$1$exchangeResponse$1", f = "BravoFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends h implements p<z, e.v.d<? super ExchangeResponse>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f73l;

        public d(e.v.d dVar) {
            super(2, dVar);
        }

        public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            d dVar2 = new d(dVar);
            dVar2.f73l = (z) obj;
            return dVar2;
        }

        public final Object d(Object obj) {
            b.q.a.a.c3(obj);
            return b.f.a.e.E();
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            e.x.c.i.e(dVar, "completion");
            dVar.getContext();
            z zVar = (z) obj;
            b.q.a.a.c3(r.a);
            return b.f.a.e.E();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(h hVar, boolean z, RelativeLayout relativeLayout, e.v.d dVar) {
        super(2, dVar);
        this.f60q = hVar;
        this.r = z;
        this.s = relativeLayout;
    }

    public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
        e.x.c.i.e(dVar, "completion");
        a aVar = new a(this.f60q, this.r, this.s, dVar);
        aVar.f55l = (z) obj;
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(T r12) {
        /*
            r11 = this;
            e.v.i.a r0 = e.v.i.a.COROUTINE_SUSPENDED
            int r1 = r11.f59p
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r11.f57n
            e.x.c.u r0 = (e.x.c.u) r0
            java.lang.Object r0 = r11.f56m
            g.a.z r0 = (g.a.z) r0
            b.q.a.a.c3(r12)
            goto L_0x0074
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.f58o
            e.x.c.u r1 = (e.x.c.u) r1
            java.lang.Object r3 = r11.f57n
            e.x.c.u r3 = (e.x.c.u) r3
            java.lang.Object r5 = r11.f56m
            g.a.z r5 = (g.a.z) r5
            b.q.a.a.c3(r12)
            goto L_0x0052
        L_0x0031:
            b.q.a.a.c3(r12)
            g.a.z r5 = r11.f55l
            e.x.c.u r1 = new e.x.c.u
            r1.<init>()
            g.a.x r12 = g.a.i0.f9955b
            b.a.a.a.a$d r6 = new b.a.a.a.a$d
            r6.<init>(r4)
            r11.f56m = r5
            r11.f57n = r1
            r11.f58o = r1
            r11.f59p = r3
            java.lang.Object r12 = e.a.a.a.y0.m.o1.c.u0(r12, r6, r11)
            if (r12 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r3 = r1
        L_0x0052:
            com.appfoundry.previewer.model.ExchangeResponse r12 = (com.appfoundry.previewer.model.ExchangeResponse) r12
            r1.f7989h = r12
            T r12 = r3.f7989h
            com.appfoundry.previewer.model.ExchangeResponse r12 = (com.appfoundry.previewer.model.ExchangeResponse) r12
            int r12 = r12.a
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 != r1) goto L_0x00cd
            g.a.x r12 = g.a.i0.f9955b
            b.a.a.a.a$c r1 = new b.a.a.a.a$c
            r1.<init>(r3, r4)
            r11.f56m = r5
            r11.f57n = r3
            r11.f59p = r2
            java.lang.Object r12 = e.a.a.a.y0.m.o1.c.u0(r12, r1, r11)
            if (r12 != r0) goto L_0x0074
            return r0
        L_0x0074:
            com.appfoundry.previewer.model.AuthInfoFromBackend r12 = (com.appfoundry.previewer.model.AuthInfoFromBackend) r12
            b.a.a.a.h r0 = r11.f60q
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x00f5
            b.a.a.a.h r0 = r11.f60q
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x00f5
            b.a.a.k.b r0 = new b.a.a.k.b
            b.a.a.a.h r1 = r11.f60q
            android.content.Context r6 = r1.getContext()
            e.x.c.i.c(r6)
            java.lang.String r1 = "context!!"
            e.x.c.i.d(r6, r1)
            b.a.a.a.h r1 = r11.f60q
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            e.x.c.i.c(r1)
            java.lang.String r2 = "activity!!"
            e.x.c.i.d(r1, r2)
            androidx.fragment.app.FragmentManager r7 = r1.getSupportFragmentManager()
            java.lang.String r1 = "activity!!.supportFragmentManager"
            e.x.c.i.d(r7, r1)
            if (r12 == 0) goto L_0x00b1
            com.appfoundry.previewer.model.AuthSettings r4 = r12.d
        L_0x00b1:
            r8 = r4
            r9 = 0
            r10 = 8
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.BravoApp.C = r0
            b.a.a.k.c r12 = new b.a.a.k.c
            r12.<init>(r0)
            android.os.AsyncTask.execute(r12)
            b.a.a.a.a$a r12 = new b.a.a.a.a$a
            r12.<init>(r11)
            r0.d = r12
            goto L_0x00f5
        L_0x00cd:
            b.a.a.a.h r12 = r11.f60q
            androidx.fragment.app.FragmentActivity r12 = r12.getActivity()
            if (r12 == 0) goto L_0x00dd
            b.a.a.a.a$b r0 = new b.a.a.a.a$b
            r0.<init>(r11)
            r12.runOnUiThread(r0)
        L_0x00dd:
            b.a.a.a.h r12 = r11.f60q
            androidx.fragment.app.FragmentActivity r12 = r12.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.appfoundry.previewer.activities.BravoActivity"
            java.util.Objects.requireNonNull(r12, r0)
            com.appfoundry.previewer.activities.BravoActivity r12 = (com.appfoundry.previewer.activities.BravoActivity) r12
            T r0 = r3.f7989h
            com.appfoundry.previewer.model.ExchangeResponse r0 = (com.appfoundry.previewer.model.ExchangeResponse) r0
            java.lang.String r0 = r0.f7111b
            r1 = 0
            r2 = 6
            b.f.a.e.J0(r12, r0, r4, r1, r2)
        L_0x00f5:
            e.r r12 = e.r.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.a.d(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        e.v.d dVar = (e.v.d) obj2;
        e.x.c.i.e(dVar, "completion");
        a aVar = new a(this.f60q, this.r, this.s, dVar);
        aVar.f55l = (z) obj;
        return aVar.d(r.a);
    }
}
