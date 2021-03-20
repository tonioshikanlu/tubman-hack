package com.appfoundry.previewer.activities;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.h.m;
import com.airbnb.lottie.LottieAnimationView;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.JsonApp;
import com.karumi.dexter.BuildConfig;
import e.a.a.a.y0.m.o1.c;
import e.r;
import e.v.d;
import e.v.f;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;
import java.util.HashMap;
import kotlin.Metadata;
import n.c0;
import n.e0;
import n.h0;
import n.j0;
import q.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/appfoundry/previewer/activities/InitActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "", "unlink", "b", "(Z)V", "c", "h", "Z", "scanNewAppProcess", "", "j", "Ljava/lang/String;", "newAppUrl", "i", "fromUnlink", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class InitActivity extends AppCompatActivity {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f7016l = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7017h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7018i;

    /* renamed from: j  reason: collision with root package name */
    public String f7019j;

    /* renamed from: k  reason: collision with root package name */
    public HashMap f7020k;

    /* compiled from: java-style lambda group */
    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f7021h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Object f7022i;

        public a(int i2, Object obj) {
            this.f7021h = i2;
            this.f7022i = obj;
        }

        public final void run() {
            int i2 = this.f7021h;
            if (i2 == 0) {
                BravoApp.b bVar = BravoApp.Q;
                FrameLayout frameLayout = (FrameLayout) ((InitActivity) this.f7022i).a(R.id.splash_parent);
                i.d(frameLayout, "splash_parent");
                BravoApp.M = frameLayout.getHeight();
            } else if (i2 == 1) {
                InitActivity initActivity = (InitActivity) this.f7022i;
                initActivity.b(initActivity.f7018i);
            } else {
                throw null;
            }
        }
    }

    @e(c = "com.appfoundry.previewer.activities.InitActivity$start$1", f = "InitActivity.kt", l = {109, 110, 111, 125}, m = "invokeSuspend")
    public static final class b extends h implements p<z, e.v.d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f7023l;

        /* renamed from: m  reason: collision with root package name */
        public Object f7024m;

        /* renamed from: n  reason: collision with root package name */
        public Object f7025n;

        /* renamed from: o  reason: collision with root package name */
        public Object f7026o;

        /* renamed from: p  reason: collision with root package name */
        public Object f7027p;

        /* renamed from: q  reason: collision with root package name */
        public Object f7028q;
        public Object r;
        public Object s;
        public int t;
        public final /* synthetic */ InitActivity u;

        @e(c = "com.appfoundry.previewer.activities.InitActivity$start$1$1$fontTask$1", f = "InitActivity.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h implements p<z, e.v.d<? super Boolean>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f7029l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Asset f7030m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Asset asset, e.v.d dVar) {
                super(2, dVar);
                this.f7030m = asset;
            }

            public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                i.e(dVar, "completion");
                a aVar = new a(this.f7030m, dVar);
                aVar.f7029l = (z) obj;
                return aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
                r4 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                b.q.a.a.A(r3, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
                throw r4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
                r3 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                b.q.a.a.A(r0, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
                throw r3;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(java.lang.Object r6) {
                /*
                    r5 = this;
                    b.q.a.a.c3(r6)
                    com.appfoundry.previewer.model.Asset r6 = r5.f7030m
                    java.lang.String r0 = "$this$download"
                    e.x.c.i.e(r6, r0)
                    java.lang.String r0 = r6.f7065b
                    r1 = 0
                    if (r0 == 0) goto L_0x0069
                    java.lang.String r6 = b.f.a.e.p0(r6)
                    java.lang.String r2 = "$this$saveTo"
                    e.x.c.i.e(r0, r2)
                    java.lang.String r2 = "path"
                    e.x.c.i.e(r6, r2)
                    r2 = 1
                    java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0050 }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x0050 }
                    java.io.InputStream r0 = r3.openStream()     // Catch:{ Exception -> 0x0050 }
                    java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0049 }
                    java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0049 }
                    r4.<init>(r6)     // Catch:{ all -> 0x0049 }
                    r3.<init>(r4)     // Catch:{ all -> 0x0049 }
                    java.lang.String r4 = "input"
                    e.x.c.i.d(r0, r4)     // Catch:{ all -> 0x0042 }
                    r4 = 8192(0x2000, float:1.14794E-41)
                    b.q.a.a.O(r0, r3, r4)     // Catch:{ all -> 0x0042 }
                    b.q.a.a.A(r3, r1)     // Catch:{ all -> 0x0049 }
                    b.q.a.a.A(r0, r1)     // Catch:{ Exception -> 0x0050 }
                    goto L_0x0065
                L_0x0042:
                    r1 = move-exception
                    throw r1     // Catch:{ all -> 0x0044 }
                L_0x0044:
                    r4 = move-exception
                    b.q.a.a.A(r3, r1)     // Catch:{ all -> 0x0049 }
                    throw r4     // Catch:{ all -> 0x0049 }
                L_0x0049:
                    r1 = move-exception
                    throw r1     // Catch:{ all -> 0x004b }
                L_0x004b:
                    r3 = move-exception
                    b.q.a.a.A(r0, r1)     // Catch:{ Exception -> 0x0050 }
                    throw r3     // Catch:{ Exception -> 0x0050 }
                L_0x0050:
                    r0 = move-exception
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r3 = 0
                    r1[r3] = r6
                    java.lang.String r6 = r0.getLocalizedMessage()
                    r1[r2] = r6
                    q.a.a$b r6 = q.a.a.d
                    java.lang.String r0 = "saveTo: Error downloading %s: %s"
                    r6.b(r0, r1)
                    r2 = r3
                L_0x0065:
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
                L_0x0069:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.InitActivity.b.a.d(java.lang.Object):java.lang.Object");
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                i.e(dVar, "completion");
                a aVar = new a(this.f7030m, dVar);
                aVar.f7029l = (z) obj;
                return aVar.d(r.a);
            }
        }

        @e(c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$1", f = "InitActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.activities.InitActivity$b$b  reason: collision with other inner class name */
        public static final class C0122b extends h implements p<z, e.v.d<? super JsonApp>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f7031l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ b f7032m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0122b(b bVar, e.v.d dVar) {
                super(2, dVar);
                this.f7032m = bVar;
            }

            public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                i.e(dVar, "completion");
                C0122b bVar = new C0122b(this.f7032m, dVar);
                bVar.f7031l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.a.a.n.c.n(this.f7032m.u.f7019j);
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                i.e(dVar, "completion");
                b bVar = this.f7032m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                return b.a.a.n.c.n(bVar.u.f7019j);
            }
        }

        @e(c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$2", f = "InitActivity.kt", l = {}, m = "invokeSuspend")
        public static final class c extends h implements p<z, e.v.d<? super JsonApp>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f7033l;

            public c(e.v.d dVar) {
                super(2, dVar);
            }

            public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                i.e(dVar, "completion");
                c cVar = new c(dVar);
                cVar.f7033l = (z) obj;
                return cVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                q.a.a.d.a("USER APP (Not Bravo Vision) with id: %s", b.f.a.e.d());
                BravoApp.b bVar = BravoApp.Q;
                JsonApp jsonApp = BravoApp.f6915o;
                if (jsonApp != null) {
                    return jsonApp;
                }
                SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                i.e("current_json", "key");
                String string = sharedPreferences.getString("current_json", "");
                if (string == null || !m.h(string)) {
                    StringBuilder y = b.e.a.a.a.y("https://apps-service.bravostudio.app/devices/apps/");
                    y.append(b.f.a.e.d());
                    return b.a.a.n.c.n(y.toString());
                }
                b.a.a.m.b bVar2 = b.a.a.m.b.f349m;
                return b.a.a.m.b.a.b(string);
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                i.e(dVar, "completion");
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                q.a.a.d.a("USER APP (Not Bravo Vision) with id: %s", b.f.a.e.d());
                BravoApp.b bVar = BravoApp.Q;
                JsonApp jsonApp = BravoApp.f6915o;
                if (jsonApp != null) {
                    return jsonApp;
                }
                SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                i.e("current_json", "key");
                String string = sharedPreferences.getString("current_json", "");
                if (string == null || !m.h(string)) {
                    StringBuilder y = b.e.a.a.a.y("https://apps-service.bravostudio.app/devices/apps/");
                    y.append(b.f.a.e.d());
                    return b.a.a.n.c.n(y.toString());
                }
                b.a.a.m.b bVar2 = b.a.a.m.b.f349m;
                return b.a.a.m.b.a.b(string);
            }
        }

        @e(c = "com.appfoundry.previewer.activities.InitActivity$start$1$parsedJson$3", f = "InitActivity.kt", l = {}, m = "invokeSuspend")
        public static final class d extends h implements p<z, e.v.d<? super JsonApp>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f7034l;

            public d(e.v.d dVar) {
                super(2, dVar);
            }

            public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
                i.e(dVar, "completion");
                d dVar2 = new d(dVar);
                dVar2.f7034l = (z) obj;
                return dVar2;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                BravoApp.b bVar = BravoApp.Q;
                if (BravoApp.f6915o != null && !b.f.a.e.f()) {
                    return BravoApp.f6915o;
                }
                SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                i.e("current_json", "key");
                String string = sharedPreferences.getString("current_json", "");
                if (string == null || !m.h(string) || b.f.a.e.f()) {
                    try {
                        String str = "https://apps-service.bravostudio.app/devices/apps/" + b.f.a.e.d();
                        c0 c = bVar.c();
                        i.e(str, "url");
                        e0.a aVar = new e0.a();
                        aVar.g(str);
                        h0 h2 = ((n.m0.g.e) c.a(aVar.b())).h();
                        j0 j0Var = h2.f10106n;
                        return h2.f10103k != 200 ? b.a.a.n.c.h() : b.a.a.n.c.u(j0Var != null ? j0Var.z() : null);
                    } catch (Exception unused) {
                        return b.a.a.n.c.h();
                    }
                } else {
                    b.a.a.m.b bVar2 = b.a.a.m.b.f349m;
                    return b.a.a.m.b.a.b(string);
                }
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                i.e(dVar, "completion");
                d dVar2 = new d(dVar);
                dVar2.f7034l = (z) obj;
                return dVar2.d(r.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(InitActivity initActivity, e.v.d dVar) {
            super(2, dVar);
            this.u = initActivity;
        }

        public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
            i.e(dVar, "completion");
            b bVar = new b(this.u, dVar);
            bVar.f7023l = (z) obj;
            return bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.appfoundry.previewer.model.Asset} */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r7v1 */
        /* JADX WARNING: type inference failed for: r7v8, types: [boolean] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01f8  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0228  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                e.v.i.a r1 = e.v.i.a.COROUTINE_SUSPENDED
                int r2 = r0.t
                r3 = 0
                r4 = 4
                r5 = 2
                r6 = 1
                r7 = 0
                r8 = 3
                if (r2 == 0) goto L_0x004a
                if (r2 == r6) goto L_0x0040
                if (r2 == r5) goto L_0x0040
                if (r2 == r8) goto L_0x0040
                if (r2 != r4) goto L_0x0038
                java.lang.Object r2 = r0.s
                g.a.d0 r2 = (g.a.d0) r2
                java.lang.Object r2 = r0.r
                com.appfoundry.previewer.model.Asset r2 = (com.appfoundry.previewer.model.Asset) r2
                java.lang.Object r3 = r0.f7027p
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r6 = r0.f7026o
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.lang.Object r7 = r0.f7025n
                com.appfoundry.previewer.model.JsonApp r7 = (com.appfoundry.previewer.model.JsonApp) r7
                java.lang.Object r8 = r0.f7024m
                g.a.z r8 = (g.a.z) r8
                b.q.a.a.c3(r19)
                r14 = r0
                r15 = r8
                r8 = r7
                r7 = r19
                goto L_0x01b3
            L_0x0038:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0040:
                java.lang.Object r2 = r0.f7024m
                g.a.z r2 = (g.a.z) r2
                b.q.a.a.c3(r19)
                r8 = r19
                goto L_0x0091
            L_0x004a:
                b.q.a.a.c3(r19)
                g.a.z r2 = r0.f7023l
                com.appfoundry.previewer.activities.InitActivity r9 = r0.u
                boolean r9 = r9.f7017h
                if (r9 == 0) goto L_0x0067
                g.a.x r8 = g.a.i0.f9955b
                com.appfoundry.previewer.activities.InitActivity$b$b r9 = new com.appfoundry.previewer.activities.InitActivity$b$b
                r9.<init>(r0, r3)
                r0.f7024m = r2
                r0.t = r6
                java.lang.Object r8 = e.a.a.a.y0.m.o1.c.u0(r8, r9, r0)
                if (r8 != r1) goto L_0x0091
                return r1
            L_0x0067:
                boolean r9 = b.a.a.n.c.a()
                if (r9 == 0) goto L_0x007f
                g.a.x r8 = g.a.i0.f9955b
                com.appfoundry.previewer.activities.InitActivity$b$c r9 = new com.appfoundry.previewer.activities.InitActivity$b$c
                r9.<init>(r3)
                r0.f7024m = r2
                r0.t = r5
                java.lang.Object r8 = e.a.a.a.y0.m.o1.c.u0(r8, r9, r0)
                if (r8 != r1) goto L_0x0091
                return r1
            L_0x007f:
                g.a.x r9 = g.a.i0.f9955b
                com.appfoundry.previewer.activities.InitActivity$b$d r10 = new com.appfoundry.previewer.activities.InitActivity$b$d
                r10.<init>(r3)
                r0.f7024m = r2
                r0.t = r8
                java.lang.Object r8 = e.a.a.a.y0.m.o1.c.u0(r9, r10, r0)
                if (r8 != r1) goto L_0x0091
                return r1
            L_0x0091:
                com.appfoundry.previewer.model.JsonApp r8 = (com.appfoundry.previewer.model.JsonApp) r8
                if (r8 == 0) goto L_0x00a0
                com.appfoundry.previewer.model.App r9 = r8.d
                if (r9 == 0) goto L_0x00a0
                com.appfoundry.previewer.model.Data r9 = r9.f7062e
                if (r9 == 0) goto L_0x00a0
                java.util.List<com.appfoundry.previewer.model.Page> r9 = r9.f7108b
                goto L_0x00a1
            L_0x00a0:
                r9 = r3
            L_0x00a1:
                if (r9 == 0) goto L_0x00b2
                com.appfoundry.previewer.model.App r9 = r8.d
                com.appfoundry.previewer.model.Data r9 = r9.f7062e
                java.util.List<com.appfoundry.previewer.model.Page> r9 = r9.f7108b
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x00b0
                goto L_0x00b2
            L_0x00b0:
                r9 = r6
                goto L_0x00bc
            L_0x00b2:
                java.lang.Object[] r9 = new java.lang.Object[r7]
                q.a.a$b r10 = q.a.a.d
                java.lang.String r11 = "Json App is null or App does not have pages"
                r10.b(r11, r9)
                r9 = r7
            L_0x00bc:
                if (r9 == 0) goto L_0x024b
                if (r8 == 0) goto L_0x00c3
                java.lang.String r9 = r8.a
                goto L_0x00c4
            L_0x00c3:
                r9 = r3
            L_0x00c4:
                java.lang.String r10 = "appId"
                b.o.i2.C(r10, r9)
                com.appfoundry.previewer.BravoApp$b r9 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.activities.InitActivity r10 = r0.u
                java.lang.String r10 = r10.f7019j
                if (r10 == 0) goto L_0x00dc
                boolean r10 = b.a.a.h.m.h(r10)
                if (r10 != r6) goto L_0x00dc
                com.appfoundry.previewer.activities.InitActivity r6 = r0.u
                java.lang.String r6 = r6.f7019j
                goto L_0x00ef
            L_0x00dc:
                java.lang.String r6 = "https://apps-service.bravostudio.app/devices/apps/"
                java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
                if (r8 == 0) goto L_0x00e7
                java.lang.String r10 = r8.a
                goto L_0x00e8
            L_0x00e7:
                r10 = r3
            L_0x00e8:
                r6.append(r10)
                java.lang.String r6 = r6.toString()
            L_0x00ef:
                r9.e(r8, r6)
                com.appfoundry.previewer.activities.InitActivity r6 = r0.u
                android.content.Intent r9 = r6.getIntent()
                java.lang.String r10 = "from_scanning"
                boolean r9 = r9.getBooleanExtra(r10, r7)
                if (r9 == 0) goto L_0x012e
                b.a.a.e.a r9 = b.a.a.e.a.f235b
                java.lang.String r6 = r6.f7019j
                android.content.Context r9 = b.f.a.e.c()
                com.segment.analytics.Analytics r9 = com.segment.analytics.Analytics.with(r9)
                java.lang.String r10 = b.a.a.e.a.c()
                java.util.UUID r11 = java.util.UUID.randomUUID()
                java.lang.String r11 = r11.toString()
                java.lang.String r12 = "java.util.UUID.randomUUID().toString()"
                e.x.c.i.d(r11, r12)
                com.segment.analytics.Properties r10 = b.a.a.e.a.b(r10, r11)
                java.lang.String r11 = "url"
                com.segment.analytics.Properties r6 = r10.putValue((java.lang.String) r11, (java.lang.Object) r6)
                java.lang.String r10 = "Slack"
                java.lang.String r11 = "QR Loaded"
                b.e.a.a.a.K(r10, r7, r9, r11, r6)
            L_0x012e:
                if (r8 == 0) goto L_0x022a
                com.appfoundry.previewer.model.App r6 = r8.d
                if (r6 == 0) goto L_0x022a
                java.util.List<com.appfoundry.previewer.model.Asset> r6 = r6.a
                if (r6 == 0) goto L_0x022a
                java.util.Iterator r9 = r6.iterator()
                r14 = r0
                r15 = r2
                r2 = r3
                r3 = r9
            L_0x0140:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x0228
                java.lang.Object r13 = r3.next()
                r12 = r13
                com.appfoundry.previewer.model.Asset r12 = (com.appfoundry.previewer.model.Asset) r12
                java.lang.String r9 = "$this$shouldDownload"
                e.x.c.i.e(r12, r9)
                java.lang.String r9 = "$this$exists"
                e.x.c.i.e(r12, r9)
                java.io.File r9 = new java.io.File
                java.lang.String r10 = b.f.a.e.p0(r12)
                r9.<init>(r10)
                boolean r9 = r9.exists()
                java.lang.String r10 = "figma"
                java.lang.String r11 = "$this$customFont"
                if (r9 != 0) goto L_0x017b
                e.x.c.i.e(r12, r11)
                java.lang.String r9 = r12.f7065b
                if (r9 == 0) goto L_0x0176
                boolean r9 = e.c0.h.d(r9, r10, r7, r5)
                goto L_0x0177
            L_0x0176:
                r9 = r7
            L_0x0177:
                if (r9 != 0) goto L_0x017b
                r9 = 1
                goto L_0x017c
            L_0x017b:
                r9 = r7
            L_0x017c:
                if (r9 == 0) goto L_0x01ea
                g.a.x r10 = g.a.i0.f9955b
                r11 = 0
                com.appfoundry.previewer.activities.InitActivity$b$a r7 = new com.appfoundry.previewer.activities.InitActivity$b$a
                r7.<init>(r12, r2)
                r2 = 2
                r16 = 0
                r9 = r15
                r17 = r12
                r12 = r7
                r7 = r13
                r13 = r2
                r2 = r14
                r14 = r16
                g.a.d0 r9 = e.a.a.a.y0.m.o1.c.k(r9, r10, r11, r12, r13, r14)
                r2.f7024m = r15
                r2.f7025n = r8
                r2.f7026o = r6
                r2.f7027p = r3
                r2.f7028q = r7
                r13 = r17
                r2.r = r13
                r2.s = r9
                r2.t = r4
                g.a.f0 r9 = (g.a.f0) r9
                java.lang.Object r7 = g.a.f0.P(r9, r2)
                if (r7 != r1) goto L_0x01b1
                return r1
            L_0x01b1:
                r14 = r2
                r2 = r13
            L_0x01b3:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                com.appfoundry.previewer.activities.InitActivity r9 = r14.u
                int r10 = com.appfoundry.previewer.activities.InitActivity.f7016l
                java.util.Objects.requireNonNull(r9)
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                boolean r7 = e.x.c.i.a(r7, r9)
                if (r7 == 0) goto L_0x01da
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.String r9 = r2.f7065b
                r10 = 0
                r7[r10] = r9
                java.lang.String r2 = b.f.a.e.p0(r2)
                r9 = 1
                r7[r9] = r2
                q.a.a$b r2 = q.a.a.d
                java.lang.String r9 = "FONTS: Downloaded font %s to path %s "
                r2.a(r9, r7)
                goto L_0x0224
            L_0x01da:
                r7 = 1
                r9 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r2 = r2.f7065b
                r7[r9] = r2
                q.a.a$b r2 = q.a.a.d
                java.lang.String r9 = "FONTS: Error downloading %s"
                r2.b(r9, r7)
                goto L_0x0224
            L_0x01ea:
                r13 = r12
                r2 = r14
                java.lang.String r9 = "$this$logWhyNotDownloaded"
                e.x.c.i.e(r13, r9)
                e.x.c.i.e(r13, r11)
                java.lang.String r9 = r13.f7065b
                if (r9 == 0) goto L_0x01fd
                boolean r9 = e.c0.h.d(r9, r10, r7, r5)
                goto L_0x01fe
            L_0x01fd:
                r9 = r7
            L_0x01fe:
                if (r9 == 0) goto L_0x020f
                r9 = 1
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.String r10 = r13.f7065b
                r9[r7] = r10
                q.a.a$b r7 = q.a.a.d
                java.lang.String r10 = "FONTS: Font is custom (can't be downloaded): %s"
                r7.b(r10, r9)
                goto L_0x0223
            L_0x020f:
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r5]
                java.lang.String r11 = r13.f7065b
                r10[r7] = r11
                java.lang.String r7 = b.f.a.e.p0(r13)
                r10[r9] = r7
                q.a.a$b r7 = q.a.a.d
                java.lang.String r9 = "Font with url: %s already exists in path: %s"
                r7.a(r9, r10)
            L_0x0223:
                r14 = r2
            L_0x0224:
                r2 = 0
                r7 = 0
                goto L_0x0140
            L_0x0228:
                r2 = r14
                goto L_0x022b
            L_0x022a:
                r14 = r0
            L_0x022b:
                com.appfoundry.previewer.activities.InitActivity r1 = r14.u
                android.content.Intent r2 = new android.content.Intent
                com.appfoundry.previewer.activities.InitActivity r3 = r14.u
                java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r4 = com.appfoundry.previewer.activities.BravoActivity.class
                r2.<init>(r3, r4)
                com.appfoundry.previewer.activities.InitActivity r3 = r14.u
                boolean r3 = r3.f7018i
                java.lang.String r4 = "unlink"
                android.content.Intent r2 = r2.putExtra(r4, r3)
                r1.startActivity(r2)
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
                r1.d()
                com.appfoundry.previewer.activities.InitActivity r1 = r14.u
                goto L_0x02a7
            L_0x024b:
                if (r8 == 0) goto L_0x028c
                java.lang.String r1 = "$this$returnedError"
                e.x.c.i.e(r8, r1)
                java.lang.Integer r1 = r8.f7122e
                if (r1 == 0) goto L_0x0265
                r2 = 200(0xc8, float:2.8E-43)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0265
                r1 = 1
                r2 = 1
                goto L_0x0267
            L_0x0265:
                r1 = 1
                r2 = 0
            L_0x0267:
                if (r2 != r1) goto L_0x028c
                com.appfoundry.previewer.activities.InitActivity r1 = r0.u
                java.lang.String r2 = "Error "
                java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
                java.lang.Integer r3 = r8.f7122e
                r2.append(r3)
                java.lang.String r3 = ". "
                r2.append(r3)
                java.lang.String r3 = r8.f
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 0
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
                r1.show()
            L_0x028c:
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.model.JsonApp r2 = b.a.a.n.c.h()
                com.appfoundry.previewer.BravoApp.f6915o = r2
                com.appfoundry.previewer.activities.InitActivity r2 = r0.u
                android.content.Intent r3 = new android.content.Intent
                com.appfoundry.previewer.activities.InitActivity r4 = r0.u
                java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r5 = com.appfoundry.previewer.activities.BravoActivity.class
                r3.<init>(r4, r5)
                r2.startActivity(r3)
                r1.d()
                com.appfoundry.previewer.activities.InitActivity r1 = r0.u
            L_0x02a7:
                r1.finish()
                e.r r1 = e.r.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.InitActivity.b.d(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            i.e(dVar, "completion");
            b bVar = new b(this.u, dVar);
            bVar.f7023l = (z) obj;
            return bVar.d(r.a);
        }
    }

    public View a(int i2) {
        if (this.f7020k == null) {
            this.f7020k = new HashMap();
        }
        View view = (View) this.f7020k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7020k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void b(boolean z) {
        if (z) {
            ImageView imageView = (ImageView) a(R.id.splash_image);
            i.d(imageView, "splash_image");
            imageView.setAlpha(0.0f);
            TextView textView = (TextView) a(R.id.version);
            i.d(textView, "version");
            textView.setAlpha(0.0f);
        } else {
            ViewPropertyAnimator alpha = ((ImageView) a(R.id.splash_image)).animate().alpha(0.0f);
            i.d(alpha, "splash_image.animate().alpha(0f)");
            alpha.setDuration(500);
            ViewPropertyAnimator alpha2 = ((TextView) a(R.id.version)).animate().alpha(0.0f);
            i.d(alpha2, "version.animate().alpha(0f)");
            alpha2.setDuration(500);
        }
        c();
    }

    public final void c() {
        g.a.p c = c.c((y0) null, 1, (Object) null);
        x xVar = i0.a;
        c.S(c.b(g.a.a.m.f9916b.plus(c)), (f) null, (a0) null, new b(this, (d) null), 3, (Object) null);
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        b.f.a.e.A0(this);
        b.f.a.e.f0(this);
        Resources resources = getResources();
        i.d(resources, "resources");
        Object[] objArr = {Float.valueOf(resources.getDisplayMetrics().density)};
        a.b bVar = q.a.a.d;
        bVar.a("SCREEN DENSITY = %s", objArr);
        setContentView((int) R.layout.activity_init);
        ((FrameLayout) a(R.id.splash_parent)).post(new a(0, this));
        TextView textView = (TextView) a(R.id.version);
        i.d(textView, "version");
        textView.setText(BuildConfig.VERSION_NAME);
        this.f7017h = getIntent().getBooleanExtra("scan_new_app", false);
        BravoApp.b bVar2 = BravoApp.Q;
        if (BravoApp.P == null) {
            BravoApp.P = Boolean.valueOf(getIntent().getBooleanExtra("IS_APPIUM_UI_TEST", false));
        }
        bVar.a("COMES FROM APPIUM = %b", BravoApp.P);
        bVar.a("COMES FROM APPIUM, SKIP INTRO = %b", Boolean.valueOf(getIntent().getBooleanExtra("IS_APPIUM_SKIP_INTRO", false)));
        bVar.a("scanNewAppProcess = %s", String.valueOf(this.f7017h));
        this.f7019j = getIntent().getStringExtra("new_app_url");
        this.f7018i = getIntent().getBooleanExtra("unlink", false);
        boolean booleanExtra = getIntent().getBooleanExtra("new_json", false);
        if (this.f7017h || booleanExtra) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) a(R.id.lottie_loading);
            i.d(lottieAnimationView, "lottie_loading");
            lottieAnimationView.setAlpha(1.0f);
            ((LottieAnimationView) a(R.id.lottie_loading)).playAnimation();
            ImageView imageView = (ImageView) a(R.id.splash_image);
            i.d(imageView, "splash_image");
            imageView.setAlpha(0.0f);
            TextView textView2 = (TextView) a(R.id.version);
            i.d(textView2, "version");
            textView2.setAlpha(0.0f);
            c();
            return;
        }
        boolean z = this.f7018i;
        if (z) {
            b(z);
        } else {
            new Handler().postDelayed(new a(1, this), 800);
        }
    }
}
