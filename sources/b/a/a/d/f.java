package b.a.a.d;

import b.a.a.h.m;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend;
import e.r;
import e.v.d;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import e.x.c.u;
import g.a.z;
import n.b0;
import n.c0;
import n.e0;
import n.g0;
import n.h0;
import n.j0;
import q.a.a;

@e(c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1", f = "BravoActivity.kt", l = {2040, 2045}, m = "invokeSuspend")
public final class f extends h implements p<z, d<? super r>, Object> {

    /* renamed from: l  reason: collision with root package name */
    public z f216l;

    /* renamed from: m  reason: collision with root package name */
    public Object f217m;

    /* renamed from: n  reason: collision with root package name */
    public Object f218n;

    /* renamed from: o  reason: collision with root package name */
    public Object f219o;

    /* renamed from: p  reason: collision with root package name */
    public int f220p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ BravoActivity f221q;
    public final /* synthetic */ String r;

    @e(c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1$bravoIdTokenResponse$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super BravoIdTokenResponseFromBackend>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f222l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ u f223m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, d dVar) {
            super(2, dVar);
            this.f223m = uVar;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f223m, dVar);
            aVar.f222l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            b.q.a.a.c3(obj);
            try {
                b.a.a.m.b bVar = b.a.a.m.b.f349m;
                return b.a.a.m.b.f.b((String) this.f223m.f7989h);
            } catch (Exception e2) {
                q.a.a.d.b("Exception parsing bravo id token with backend: %s", e2.toString());
                return null;
            }
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            u uVar = this.f223m;
            dVar.getContext();
            z zVar = (z) obj;
            b.q.a.a.c3(r.a);
            try {
                b.a.a.m.b bVar = b.a.a.m.b.f349m;
                return b.a.a.m.b.f.b((String) uVar.f7989h);
            } catch (Exception e2) {
                q.a.a.d.b("Exception parsing bravo id token with backend: %s", e2.toString());
                return null;
            }
        }
    }

    @e(c = "com.appfoundry.previewer.activities.BravoActivity$getBravoIdTokenFromBackend$1$responseJsonAsString$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<z, d<? super String>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f224l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ f f225m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, d dVar) {
            super(2, dVar);
            this.f225m = fVar;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            b bVar = new b(this.f225m, dVar);
            bVar.f224l = (z) obj;
            return bVar;
        }

        public final Object d(Object obj) {
            b.q.a.a.c3(obj);
            String str = this.f225m.r;
            StringBuilder sb = new StringBuilder();
            BravoApp.b bVar = BravoApp.Q;
            String str2 = BravoApp.y;
            sb.append(str2 != null ? m.d(str2) : null);
            sb.append(b.a.a.n.f.g());
            sb.append("/");
            sb.append("idtoken");
            String sb2 = sb.toString();
            a.b bVar2 = q.a.a.d;
            bVar2.a("URL for bravo token: %s", sb2);
            g0 c = g0.a.c(g0.a, new byte[0], (b0) null, 0, 0, 7);
            c0 c2 = bVar.c();
            e0.a aVar = new e0.a();
            if (str == null) {
                str = "";
            }
            aVar.c("X-App-Authorization", str);
            aVar.g(sb2);
            aVar.e(c);
            h0 h2 = ((n.m0.g.e) c2.a(aVar.b())).h();
            int i2 = h2.f10103k;
            if (i2 == 200 || i2 == 201) {
                j0 j0Var = h2.f10106n;
                if (j0Var != null) {
                    return j0Var.z();
                }
                return null;
            }
            bVar2.b("getBravoIDTokenResponse FAILED: %s", String.valueOf(h2.f10103k) + ": " + b.f.a.e.D(h2));
            return null;
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            b bVar = new b(this.f225m, dVar);
            bVar.f224l = (z) obj;
            return bVar.d(r.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(BravoActivity bravoActivity, String str, d dVar) {
        super(2, dVar);
        this.f221q = bravoActivity;
        this.r = str;
    }

    public final d<r> a(Object obj, d<?> dVar) {
        i.e(dVar, "completion");
        f fVar = new f(this.f221q, this.r, dVar);
        fVar.f216l = (z) obj;
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(T r9) {
        /*
            r8 = this;
            e.v.i.a r0 = e.v.i.a.COROUTINE_SUSPENDED
            int r1 = r8.f220p
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.lang.Object r0 = r8.f218n
            e.x.c.u r0 = (e.x.c.u) r0
            java.lang.Object r0 = r8.f217m
            g.a.z r0 = (g.a.z) r0
            b.q.a.a.c3(r9)
            goto L_0x0071
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0022:
            java.lang.Object r1 = r8.f219o
            e.x.c.u r1 = (e.x.c.u) r1
            java.lang.Object r4 = r8.f218n
            e.x.c.u r4 = (e.x.c.u) r4
            java.lang.Object r6 = r8.f217m
            g.a.z r6 = (g.a.z) r6
            b.q.a.a.c3(r9)
            goto L_0x0053
        L_0x0032:
            b.q.a.a.c3(r9)
            g.a.z r6 = r8.f216l
            e.x.c.u r1 = new e.x.c.u
            r1.<init>()
            g.a.x r9 = g.a.i0.f9955b
            b.a.a.d.f$b r7 = new b.a.a.d.f$b
            r7.<init>(r8, r5)
            r8.f217m = r6
            r8.f218n = r1
            r8.f219o = r1
            r8.f220p = r4
            java.lang.Object r9 = e.a.a.a.y0.m.o1.c.u0(r9, r7, r8)
            if (r9 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r4 = r1
        L_0x0053:
            java.lang.String r9 = (java.lang.String) r9
            r1.f7989h = r9
            T r9 = r4.f7989h
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x00c0
            g.a.x r9 = g.a.i0.f9955b
            b.a.a.d.f$a r1 = new b.a.a.d.f$a
            r1.<init>(r4, r5)
            r8.f217m = r6
            r8.f218n = r4
            r8.f220p = r3
            java.lang.Object r9 = e.a.a.a.y0.m.o1.c.u0(r9, r1, r8)
            if (r9 != r0) goto L_0x0071
            return r0
        L_0x0071:
            com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend r9 = (com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend) r9
            if (r9 == 0) goto L_0x0077
            java.lang.String r5 = r9.d
        L_0x0077:
            if (r5 == 0) goto L_0x00c9
            android.content.Context r0 = b.f.a.e.c()
            java.lang.String r1 = "com.appfoundry.previewerLoaded"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
            e.x.c.i.d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = b.f.a.e.c()
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r2 = b.a.a.n.f.g()
            r1.append(r2)
            java.lang.String r2 = "bravo_id_token"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r9 = r9.d
            java.lang.String r2 = "key"
            e.x.c.i.e(r1, r2)
            java.lang.String r2 = "value"
            e.x.c.i.e(r9, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r9 = r0.putString(r1, r9)
            r9.apply()
            goto L_0x00c9
        L_0x00c0:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            q.a.a$b r0 = q.a.a.d
            java.lang.String r1 = "getBravoIDTokenResponse returned null. Proceeding with login, but without bravo id token..."
            r0.b(r1, r9)
        L_0x00c9:
            com.appfoundry.previewer.activities.BravoActivity r9 = r8.f221q
            com.appfoundry.previewer.activities.BravoActivity.d(r9)
            e.r r9 = e.r.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.d.f.d(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) obj2;
        i.e(dVar, "completion");
        f fVar = new f(this.f221q, this.r, dVar);
        fVar.f216l = (z) obj;
        return fVar.d(r.a);
    }
}
