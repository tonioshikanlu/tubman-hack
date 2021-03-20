package b.a.a.d;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.JsonApp;
import e.r;
import e.v.d;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.i0;
import g.a.x;
import g.a.z;

@e(c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1", f = "BravoActivity.kt", l = {1615}, m = "invokeSuspend")
public final class c extends h implements p<z, d<? super r>, Object> {

    /* renamed from: l  reason: collision with root package name */
    public z f202l;

    /* renamed from: m  reason: collision with root package name */
    public Object f203m;

    /* renamed from: n  reason: collision with root package name */
    public int f204n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ BravoActivity f205o;

    @e(c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1$1", f = "BravoActivity.kt", l = {1619}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f206l;

        /* renamed from: m  reason: collision with root package name */
        public Object f207m;

        /* renamed from: n  reason: collision with root package name */
        public Object f208n;

        /* renamed from: o  reason: collision with root package name */
        public int f209o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ c f210p;

        /* renamed from: b.a.a.d.c$a$a  reason: collision with other inner class name */
        public static final class C0013a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ a f211h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ JsonApp f212i;

            public C0013a(a aVar, JsonApp jsonApp) {
                this.f211h = aVar;
                this.f212i = jsonApp;
            }

            public final void run() {
                BravoActivity bravoActivity = this.f211h.f210p.f205o;
                String str = this.f212i.f;
                i.e(bravoActivity, "$this$showStopperAlert");
                AlertDialog.Builder builder = new AlertDialog.Builder(bravoActivity);
                builder.setTitle(bravoActivity.getTitle());
                builder.setCancelable(false);
                if (str == null) {
                    str = "An error occurred, please contact support";
                }
                builder.setMessage((CharSequence) str);
                builder.setPositiveButton((CharSequence) "Close", (DialogInterface.OnClickListener) new b.a.a.h.c(bravoActivity));
                AlertDialog create = builder.create();
                i.d(create, "builder.create()");
                create.requestWindowFeature(0);
                create.show();
            }
        }

        @e(c = "com.appfoundry.previewer.activities.BravoActivity$checkIfNewJsonAvailable$1$1$jsonTask$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends h implements p<z, d<? super JsonApp>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f213l;

            public b(d dVar) {
                super(2, dVar);
            }

            public final d<r> a(Object obj, d<?> dVar) {
                i.e(dVar, "completion");
                b bVar = new b(dVar);
                bVar.f213l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.a.a.n.c.n("https://apps-service.bravostudio.app/devices/apps/" + b.f.a.e.d());
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = (d) obj2;
                i.e(dVar, "completion");
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                return b.a.a.n.c.n("https://apps-service.bravostudio.app/devices/apps/" + b.f.a.e.d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, d dVar) {
            super(2, dVar);
            this.f210p = cVar;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f210p, dVar);
            aVar.f206l = (z) obj;
            return aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            r0 = r11.f7122e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if ((!e.x.c.i.a(r0, r2)) != false) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(java.lang.Object r11) {
            /*
                r10 = this;
                e.v.i.a r0 = e.v.i.a.COROUTINE_SUSPENDED
                int r1 = r10.f209o
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r3) goto L_0x0016
                java.lang.Object r0 = r10.f208n
                g.a.d0 r0 = (g.a.d0) r0
                java.lang.Object r0 = r10.f207m
                g.a.z r0 = (g.a.z) r0
                b.q.a.a.c3(r11)
                goto L_0x0041
            L_0x0016:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001e:
                b.q.a.a.c3(r11)
                g.a.z r11 = r10.f206l
                g.a.x r5 = g.a.i0.f9955b
                r6 = 0
                b.a.a.d.c$a$b r7 = new b.a.a.d.c$a$b
                r7.<init>(r2)
                r8 = 2
                r9 = 0
                r4 = r11
                g.a.d0 r1 = e.a.a.a.y0.m.o1.c.k(r4, r5, r6, r7, r8, r9)
                r10.f207m = r11
                r10.f208n = r1
                r10.f209o = r3
                g.a.f0 r1 = (g.a.f0) r1
                java.lang.Object r11 = g.a.f0.P(r1, r10)
                if (r11 != r0) goto L_0x0041
                return r0
            L_0x0041:
                com.appfoundry.previewer.model.JsonApp r11 = (com.appfoundry.previewer.model.JsonApp) r11
                if (r11 == 0) goto L_0x00b8
                java.lang.String r0 = "$this$isDeletedAppOrPolicyViolation"
                e.x.c.i.e(r11, r0)
                java.lang.Integer r0 = r11.f7122e
                r1 = 0
                if (r0 == 0) goto L_0x0066
                r4 = 404(0x194, float:5.66E-43)
                int r0 = r0.intValue()
                if (r0 == r4) goto L_0x0064
                java.lang.Integer r0 = r11.f7122e
                r4 = 451(0x1c3, float:6.32E-43)
                if (r0 != 0) goto L_0x005e
                goto L_0x0066
            L_0x005e:
                int r0 = r0.intValue()
                if (r0 != r4) goto L_0x0066
            L_0x0064:
                r0 = r3
                goto L_0x0067
            L_0x0066:
                r0 = r1
            L_0x0067:
                if (r0 == 0) goto L_0x0076
                b.a.a.d.c r0 = r10.f210p
                com.appfoundry.previewer.activities.BravoActivity r0 = r0.f205o
                b.a.a.d.c$a$a r1 = new b.a.a.d.c$a$a
                r1.<init>(r10, r11)
                r0.runOnUiThread(r1)
                goto L_0x00b8
            L_0x0076:
                java.lang.String r0 = "$this$isNewVersion"
                e.x.c.i.e(r11, r0)
                java.lang.String r0 = r11.c
                if (r0 == 0) goto L_0x008f
                com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.model.JsonApp r4 = com.appfoundry.previewer.BravoApp.f6915o
                if (r4 == 0) goto L_0x0087
                java.lang.String r2 = r4.c
            L_0x0087:
                boolean r0 = e.x.c.i.a(r0, r2)
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x008f
                goto L_0x0090
            L_0x008f:
                r3 = r1
            L_0x0090:
                if (r3 == 0) goto L_0x00b8
                java.lang.Object[] r0 = new java.lang.Object[r1]
                q.a.a$b r1 = q.a.a.d
                java.lang.String r2 = "JSON IS NEWER"
                r1.a(r2, r0)
                boolean r0 = b.a.a.n.c.b()
                if (r0 == 0) goto L_0x00a8
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.BravoApp.f6915o = r11
                com.appfoundry.previewer.BravoApp.f6914n = r11
                goto L_0x00ac
            L_0x00a8:
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.BravoApp.f6915o = r11
            L_0x00ac:
                p.a.a.c r11 = p.a.a.c.b()
                b.a.a.g.w r0 = new b.a.a.g.w
                r0.<init>()
                r11.g(r0)
            L_0x00b8:
                e.r r11 = e.r.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.d.c.a.d(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            a aVar = new a(this.f210p, dVar);
            aVar.f206l = (z) obj;
            return aVar.d(r.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(BravoActivity bravoActivity, d dVar) {
        super(2, dVar);
        this.f205o = bravoActivity;
    }

    public final d<r> a(Object obj, d<?> dVar) {
        i.e(dVar, "completion");
        c cVar = new c(this.f205o, dVar);
        cVar.f202l = (z) obj;
        return cVar;
    }

    public final Object d(Object obj) {
        e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
        int i2 = this.f204n;
        if (i2 == 0) {
            b.q.a.a.c3(obj);
            z zVar = this.f202l;
            x xVar = i0.f9955b;
            a aVar2 = new a(this, (d) null);
            this.f203m = zVar;
            this.f204n = 1;
            if (e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            z zVar2 = (z) this.f203m;
            b.q.a.a.c3(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) obj2;
        i.e(dVar, "completion");
        c cVar = new c(this.f205o, dVar);
        cVar.f202l = (z) obj;
        return cVar.d(r.a);
    }
}
