package com.appfoundry.previewer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import b.a.a.i.g;
import b.a.a.i.h;
import b.a.a.i.i;
import b.l.d.q.e;
import b.l.d.q.f.g.q;
import b.l.d.q.f.g.r;
import b.l.d.q.f.g.v;
import com.appfoundry.previewer.fragments.BottomSheetFragment;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import com.google.firebase.auth.FirebaseAuth;
import com.karumi.dexter.BuildConfig;
import com.solidstategroup.bullettrain.BulletTrainClient;
import e.x.b.p;
import g.a.i0;
import g.a.x;
import g.a.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.a0;
import n.c0;
import n.e0;
import n.h0;
import n.n0.a;
import q.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/appfoundry/previewer/BravoApp;", "Landroid/app/Application;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Le/r;", "onCreate", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "<init>", "Q", "b", "c", "app_release"}, k = 1, mv = {1, 1, 15})
public final class BravoApp extends Application implements Application.ActivityLifecycleCallbacks {
    public static boolean A;
    public static boolean B;
    public static b.a.a.k.b C;
    public static FirebaseAuth D;
    public static Map<String, List<b.a.a.i.d>> E = new LinkedHashMap();
    public static Map<String, List<b.a.a.i.a>> F = new LinkedHashMap();
    public static g G;
    public static boolean H;
    public static Map<String, List<h>> I = new LinkedHashMap();
    public static boolean J;
    public static String K = "";
    public static boolean L;
    public static int M;
    public static int N;
    public static String O;
    public static Boolean P;
    public static final b Q = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static BravoApp f6908h;

    /* renamed from: i  reason: collision with root package name */
    public static int f6909i;

    /* renamed from: j  reason: collision with root package name */
    public static List<String> f6910j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public static Activity f6911k;

    /* renamed from: l  reason: collision with root package name */
    public static List<WebView> f6912l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public static c0 f6913m;

    /* renamed from: n  reason: collision with root package name */
    public static JsonApp f6914n;

    /* renamed from: o  reason: collision with root package name */
    public static JsonApp f6915o;

    /* renamed from: p  reason: collision with root package name */
    public static Map<String, Page> f6916p;

    /* renamed from: q  reason: collision with root package name */
    public static Map<String, Style> f6917q;
    public static Map<String, Asset> r;
    public static Map<String, String> s = new LinkedHashMap();
    public static BottomSheetFragment t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    public static boolean x;
    public static String y;
    public static List<i> z = new ArrayList();

    public static final class a implements a0 {
        public final h0 a(a0.a aVar) {
            e.x.c.i.e(aVar, "chain");
            n.m0.h.g gVar = (n.m0.h.g) aVar;
            e0 e0Var = gVar.f;
            Objects.requireNonNull(e0Var);
            e0.a aVar2 = new e0.a(e0Var);
            aVar2.c("User-Agent", b.a.a.n.c.m());
            aVar2.c("Accept-Version", BuildConfig.VERSION_NAME);
            return gVar.c(aVar2.b());
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a() {
            f();
            BravoApp.G = null;
            BravoApp.F.clear();
            BravoApp.I.clear();
            BravoApp.s.clear();
            for (WebView destroy : BravoApp.f6912l) {
                destroy.destroy();
            }
            BravoApp.f6912l.clear();
            BravoApp.L = false;
        }

        public final Context b() {
            BravoApp bravoApp = BravoApp.f6908h;
            e.x.c.i.c(bravoApp);
            Context applicationContext = bravoApp.getApplicationContext();
            e.x.c.i.d(applicationContext, "instance!!.applicationContext");
            return applicationContext;
        }

        public final c0 c() {
            c0 c0Var = BravoApp.f6913m;
            if (c0Var != null) {
                return c0Var;
            }
            e.x.c.i.m("okHttpClient");
            throw null;
        }

        public final void d() {
            BravoApp.f6909i = 0;
            BravoApp.f6910j.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
            r0 = (r0 = r8.d).f7062e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(com.appfoundry.previewer.model.JsonApp r8, java.lang.String r9) {
            /*
                r7 = this;
                com.appfoundry.previewer.BravoApp.f6915o = r8
                java.lang.String r0 = "value"
                java.lang.String r1 = "key"
                java.lang.String r2 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
                r3 = 0
                java.lang.String r4 = "com.appfoundry.previewerLoaded"
                if (r9 == 0) goto L_0x002d
                com.appfoundry.previewer.BravoApp.y = r9
                android.content.Context r5 = b.f.a.e.c()
                android.content.SharedPreferences r5 = r5.getSharedPreferences(r4, r3)
                e.x.c.i.d(r5, r2)
                java.lang.String r6 = "current_app_url"
                e.x.c.i.e(r6, r1)
                e.x.c.i.e(r9, r0)
                android.content.SharedPreferences$Editor r5 = r5.edit()
                android.content.SharedPreferences$Editor r9 = r5.putString(r6, r9)
                r9.apply()
            L_0x002d:
                android.content.Context r9 = b.f.a.e.c()
                android.content.SharedPreferences r9 = r9.getSharedPreferences(r4, r3)
                e.x.c.i.d(r9, r2)
                java.lang.String r2 = "current_json"
                b.a.a.m.b r3 = b.a.a.m.b.f349m
                b.p.a.l<com.appfoundry.previewer.model.JsonApp> r3 = b.a.a.m.b.a
                com.appfoundry.previewer.model.JsonApp r4 = com.appfoundry.previewer.BravoApp.f6915o
                java.lang.String r3 = r3.d(r4)
                java.lang.String r4 = "Moshify.instance.toJson(jsonApp)"
                e.x.c.i.d(r3, r4)
                e.x.c.i.e(r2, r1)
                e.x.c.i.e(r3, r0)
                android.content.SharedPreferences$Editor r9 = r9.edit()
                android.content.SharedPreferences$Editor r9 = r9.putString(r2, r3)
                r9.apply()
                r9 = 0
                if (r8 == 0) goto L_0x0068
                com.appfoundry.previewer.model.App r0 = r8.d
                if (r0 == 0) goto L_0x0068
                com.appfoundry.previewer.model.Data r0 = r0.f7062e
                if (r0 == 0) goto L_0x0068
                java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
                goto L_0x0069
            L_0x0068:
                r0 = r9
            L_0x0069:
                r1 = 16
                r2 = 10
                if (r0 == 0) goto L_0x009b
                int r3 = b.q.a.a.C(r0, r2)
                int r3 = b.q.a.a.q2(r3)
                if (r3 >= r1) goto L_0x007a
                r3 = r1
            L_0x007a:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x0083:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0095
                java.lang.Object r3 = r0.next()
                com.appfoundry.previewer.model.Page r3 = (com.appfoundry.previewer.model.Page) r3
                java.lang.String r5 = r3.a
                r4.put(r5, r3)
                goto L_0x0083
            L_0x0095:
                java.util.Map r0 = e.t.g.b0(r4)
                com.appfoundry.previewer.BravoApp.f6916p = r0
            L_0x009b:
                if (r8 == 0) goto L_0x00a4
                com.appfoundry.previewer.model.App r0 = r8.d
                if (r0 == 0) goto L_0x00a4
                java.util.List<com.appfoundry.previewer.model.Style> r0 = r0.f
                goto L_0x00a5
            L_0x00a4:
                r0 = r9
            L_0x00a5:
                if (r0 == 0) goto L_0x00cf
                int r3 = b.q.a.a.C(r0, r2)
                int r3 = b.q.a.a.q2(r3)
                if (r3 >= r1) goto L_0x00b2
                r3 = r1
            L_0x00b2:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x00bb:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00cd
                java.lang.Object r3 = r0.next()
                com.appfoundry.previewer.model.Style r3 = (com.appfoundry.previewer.model.Style) r3
                java.lang.String r5 = r3.a
                r4.put(r5, r3)
                goto L_0x00bb
            L_0x00cd:
                com.appfoundry.previewer.BravoApp.f6917q = r4
            L_0x00cf:
                if (r8 == 0) goto L_0x00d7
                com.appfoundry.previewer.model.App r8 = r8.d
                if (r8 == 0) goto L_0x00d7
                java.util.List<com.appfoundry.previewer.model.Asset> r9 = r8.f7061b
            L_0x00d7:
                if (r9 == 0) goto L_0x0106
                int r8 = b.q.a.a.C(r9, r2)
                int r8 = b.q.a.a.q2(r8)
                if (r8 >= r1) goto L_0x00e4
                goto L_0x00e5
            L_0x00e4:
                r1 = r8
            L_0x00e5:
                java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
                r8.<init>(r1)
                java.util.Iterator r9 = r9.iterator()
            L_0x00ee:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x0100
                java.lang.Object r0 = r9.next()
                com.appfoundry.previewer.model.Asset r0 = (com.appfoundry.previewer.model.Asset) r0
                java.lang.String r1 = r0.a
                r8.put(r1, r0)
                goto L_0x00ee
            L_0x0100:
                java.util.Map r8 = e.t.g.b0(r8)
                com.appfoundry.previewer.BravoApp.r = r8
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.BravoApp.b.e(com.appfoundry.previewer.model.JsonApp, java.lang.String):void");
        }

        public final void f() {
            Handler handler;
            MediaPlayer mediaPlayer;
            g gVar = BravoApp.G;
            if (gVar != null && !gVar.f317e) {
                MediaPlayer mediaPlayer2 = gVar.c;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
                g gVar2 = BravoApp.G;
                if (!(gVar2 == null || (mediaPlayer = gVar2.c) == null)) {
                    mediaPlayer.seekTo(0);
                }
                g gVar3 = BravoApp.G;
                if (gVar3 != null && (handler = gVar3.d) != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
            }
        }
    }

    public static final class c extends a.b {
        public void c(int i2, String str, String str2, Throwable th) {
            e.x.c.i.e(str2, "message");
            if (i2 == 5) {
                b.a.a.e.a aVar = b.a.a.e.a.f235b;
                e.x.c.i.e(str2, "message");
                b.a.a.e.a.e("Warn", str, str2);
            } else if (i2 == 6) {
                b.a.a.e.a aVar2 = b.a.a.e.a.f235b;
                e.x.c.i.e(str2, "message");
                b.a.a.e.a.e("Error", str, str2);
            }
            b.l.d.d c = b.l.d.d.c();
            c.a();
            e eVar = (e) c.d.a(e.class);
            Objects.requireNonNull(eVar, "FirebaseCrashlytics component is not present.");
            v vVar = eVar.a;
            Objects.requireNonNull(vVar);
            q qVar = vVar.f;
            qVar.d.b(new r(qVar, System.currentTimeMillis() - vVar.c, str2));
        }
    }

    @e.v.j.a.e(c = "com.appfoundry.previewer.BravoApp$onCreate$1", f = "BravoApp.kt", l = {303}, m = "invokeSuspend")
    public static final class d extends e.v.j.a.h implements p<z, e.v.d<? super e.r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f6918l;

        /* renamed from: m  reason: collision with root package name */
        public Object f6919m;

        /* renamed from: n  reason: collision with root package name */
        public int f6920n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ BravoApp f6921o;

        @e.v.j.a.e(c = "com.appfoundry.previewer.BravoApp$onCreate$1$1", f = "BravoApp.kt", l = {}, m = "invokeSuspend")
        public static final class a extends e.v.j.a.h implements p<z, e.v.d<? super e.r>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6922l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ d f6923m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, e.v.d dVar2) {
                super(2, dVar2);
                this.f6923m = dVar;
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                a aVar = new a(this.f6923m, dVar);
                aVar.f6922l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                BravoApp bravoApp = this.f6923m.f6921o;
                BravoApp bravoApp2 = BravoApp.f6908h;
                Objects.requireNonNull(bravoApp);
                BulletTrainClient build = BulletTrainClient.newBuilder().setApiKey("kLSY62HBXFAMCsjnqn53RL").build();
                BravoApp.A = build != null ? build.hasFeatureFlag("use_notch_space") : false;
                if (build != null) {
                    build.hasFeatureFlag("test_logout");
                }
                if (build != null) {
                    build.hasFeatureFlag("force_auto_update");
                }
                BravoApp.B = build != null ? build.hasFeatureFlag("in_app_updates") : true;
                return e.r.a;
            }

            public final Object invoke(Object obj, Object obj2) {
                e.r rVar = e.r.a;
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                d dVar2 = this.f6923m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(rVar);
                BravoApp bravoApp = dVar2.f6921o;
                BravoApp bravoApp2 = BravoApp.f6908h;
                Objects.requireNonNull(bravoApp);
                BulletTrainClient build = BulletTrainClient.newBuilder().setApiKey("kLSY62HBXFAMCsjnqn53RL").build();
                BravoApp.A = build != null ? build.hasFeatureFlag("use_notch_space") : false;
                if (build != null) {
                    build.hasFeatureFlag("test_logout");
                }
                if (build != null) {
                    build.hasFeatureFlag("force_auto_update");
                }
                BravoApp.B = build != null ? build.hasFeatureFlag("in_app_updates") : true;
                return rVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(BravoApp bravoApp, e.v.d dVar) {
            super(2, dVar);
            this.f6921o = bravoApp;
        }

        public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            d dVar2 = new d(this.f6921o, dVar);
            dVar2.f6918l = (z) obj;
            return dVar2;
        }

        public final Object d(Object obj) {
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f6920n;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f6918l;
                x xVar = i0.f9955b;
                a aVar2 = new a(this, (e.v.d) null);
                this.f6919m = zVar;
                this.f6920n = 1;
                if (e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f6919m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return e.r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            e.x.c.i.e(dVar, "completion");
            d dVar2 = new d(this.f6921o, dVar);
            dVar2.f6918l = (z) obj;
            return dVar2.d(e.r.a);
        }
    }

    public BravoApp() {
        f6908h = this;
        c0.a aVar = new c0.a();
        a aVar2 = new a();
        e.x.c.i.e(aVar2, "interceptor");
        aVar.d.add(aVar2);
        n.n0.a aVar3 = new n.n0.a((a.b) null, 1);
        a.C0238a aVar4 = a.C0238a.BODY;
        e.x.c.i.e(aVar4, "level");
        aVar3.f10405b = aVar4;
        e.x.c.i.e(aVar3, "interceptor");
        aVar.c.add(aVar3);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.a(60, timeUnit);
        aVar.b(60, timeUnit);
        aVar.c(60, timeUnit);
        f6913m = new c0(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityCreated - %s", activity.getLocalClassName());
    }

    public void onActivityDestroyed(Activity activity) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityDestroyed - %s", activity.getLocalClassName());
    }

    public void onActivityPaused(Activity activity) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityPaused - %s", activity.getLocalClassName());
    }

    public void onActivityResumed(Activity activity) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityResumed - %s", activity.getLocalClassName());
        f6911k = activity;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        e.x.c.i.e(bundle, "outState");
        q.a.a.d.a("onActivitySaveInstanceState - %s", activity.getLocalClassName());
    }

    public void onActivityStarted(Activity activity) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityStarted - %s", activity.getLocalClassName());
    }

    public void onActivityStopped(Activity activity) {
        e.x.c.i.e(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        q.a.a.d.a("onActivityStopped - %s", activity.getLocalClassName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01de, code lost:
        if (e.c0.h.C(r8, "generic", false, 2) == false) goto L_0x01e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r17 = this;
            r1 = r17
            super.onCreate()
            r1.registerActivityLifecycleCallbacks(r1)
            boolean r0 = b.o.i2.N
            r2 = 1
            b.o.i2.N = r2
            b.o.i2$g r0 = new b.o.i2$g
            r3 = 0
            r0.<init>(r1, r3)
            b.o.i2$n r4 = b.o.i2.n.Notification
            r0.f6140e = r4
            b.a.a.j.b r4 = new b.a.a.j.b
            r4.<init>()
            r0.c = r4
            b.a.a.j.a r4 = new b.a.a.j.a
            r4.<init>()
            r0.f6139b = r4
            r0.d = r2
            b.o.i2$g r4 = b.o.i2.H
            java.util.Objects.requireNonNull(r4)
            b.o.i2.H = r0
            android.content.Context r4 = r0.a
            r0.a = r3
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = r4.getPackageName()     // Catch:{ all -> 0x0065 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r6)     // Catch:{ all -> 0x0065 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "onesignal_google_project_number"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0055
            int r6 = r5.length()     // Catch:{ all -> 0x0065 }
            r7 = 4
            if (r6 <= r7) goto L_0x0055
            java.lang.String r5 = r5.substring(r7)     // Catch:{ all -> 0x0065 }
        L_0x0055:
            java.lang.String r6 = "onesignal_app_id"
            java.lang.String r0 = r0.getString(r6)     // Catch:{ all -> 0x0065 }
            b.o.i2$g r6 = b.o.i2.H     // Catch:{ all -> 0x0065 }
            b.o.i2$l r7 = r6.f6139b     // Catch:{ all -> 0x0065 }
            b.o.i2$m r6 = r6.c     // Catch:{ all -> 0x0065 }
            b.o.i2.u(r4, r5, r0, r7, r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0069:
            java.lang.String r0 = b.f.a.e.d()
            java.lang.String r4 = "appId"
            b.o.i2.C(r4, r0)
            java.lang.String r0 = "true"
            b.o.i2.C(r4, r0)
            com.appfoundry.previewer.BravoApp$c r0 = new com.appfoundry.previewer.BravoApp$c
            r0.<init>()
            q.a.a$b[] r4 = q.a.a.a
            q.a.a$b r4 = q.a.a.d
            if (r0 == r4) goto L_0x024b
            java.util.List<q.a.a$b> r4 = q.a.a.f10534b
            monitor-enter(r4)
            r4.add(r0)     // Catch:{ all -> 0x0248 }
            int r0 = r4.size()     // Catch:{ all -> 0x0248 }
            q.a.a$b[] r0 = new q.a.a.b[r0]     // Catch:{ all -> 0x0248 }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ all -> 0x0248 }
            q.a.a$b[] r0 = (q.a.a.b[]) r0     // Catch:{ all -> 0x0248 }
            q.a.a.c = r0     // Catch:{ all -> 0x0248 }
            monitor-exit(r4)     // Catch:{ all -> 0x0248 }
            i.a.a.e.a r0 = i.a.a.c.f8043b
            i.a.a.e.a r4 = new i.a.a.e.a
            r4.<init>()
            int r5 = r0.f8045h
            r4.f8045h = r5
            boolean r5 = r0.f8046i
            r4.f8046i = r5
            boolean r5 = r0.f8047j
            r4.f8047j = r5
            boolean r5 = r0.f8048k
            r4.f8048k = r5
            boolean r5 = r0.f8049l
            r4.f8049l = r5
            boolean r5 = r0.f8050m
            r4.f8050m = r5
            int r5 = r0.f8051n
            r4.f8051n = r5
            java.lang.Integer r5 = r0.f8052o
            r4.f8052o = r5
            java.lang.Class<? extends android.app.Activity> r5 = r0.f8053p
            r4.f8053p = r5
            java.lang.Class<? extends android.app.Activity> r5 = r0.f8054q
            r4.f8054q = r5
            i.a.a.c$a r0 = r0.r
            r4.r = r0
            r0 = 0
            r4.f8045h = r0
            r5 = 2000(0x7d0, float:2.803E-42)
            r4.f8051n = r5
            java.lang.Class<com.appfoundry.previewer.activities.CrashActivity> r5 = com.appfoundry.previewer.activities.CrashActivity.class
            r4.f8053p = r5
            i.a.a.c.f8043b = r4
            com.segment.analytics.Analytics$Builder r4 = new com.segment.analytics.Analytics$Builder
            com.appfoundry.previewer.BravoApp r5 = f6908h
            e.x.c.i.c(r5)
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "instance!!.applicationContext"
            e.x.c.i.d(r5, r6)
            java.lang.String r6 = "6KP64Xa1OaKKo1525noEQZcNYC2gFxkv"
            r4.<init>(r5, r6)
            com.segment.analytics.integrations.Integration$Factory r5 = com.segment.analytics.android.integrations.amplitude.AmplitudeIntegration.FACTORY
            com.segment.analytics.Analytics$Builder r4 = r4.use(r5)
            com.segment.analytics.Analytics r4 = r4.build()
            com.segment.analytics.Analytics.setSingletonInstance(r4)
            g.a.x r4 = g.a.i0.a
            g.a.h1 r4 = g.a.a.m.f9916b
            g.a.p r2 = e.a.a.a.y0.m.o1.c.c(r3, r2, r3)
            e.v.f r2 = r4.plus(r2)
            g.a.z r4 = e.a.a.a.y0.m.o1.c.b(r2)
            r5 = 0
            r6 = 0
            com.appfoundry.previewer.BravoApp$d r7 = new com.appfoundry.previewer.BravoApp$d
            r7.<init>(r1, r3)
            r8 = 3
            r9 = 0
            e.a.a.a.y0.m.o1.c.S(r4, r5, r6, r7, r8, r9)
            b.a.a.e.a r2 = b.a.a.e.a.f235b
            android.content.Context r2 = b.f.a.e.c()
            java.lang.String r3 = "com.appfoundry.previewerLoaded"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            java.lang.String r4 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
            e.x.c.i.d(r2, r4)
            java.lang.String r5 = "device_registered"
            java.lang.String r6 = "key"
            e.x.c.i.e(r5, r6)
            boolean r2 = r2.getBoolean(r5, r0)
            if (r2 != 0) goto L_0x0247
            android.content.Context r2 = b.f.a.e.c()
            com.segment.analytics.Analytics r2 = com.segment.analytics.Analytics.with(r2)
            java.lang.String r7 = b.f.a.e.d()
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "java.util.UUID.randomUUID().toString()"
            e.x.c.i.d(r8, r9)
            com.segment.analytics.Properties r7 = b.a.a.e.a.b(r7, r8)
            java.lang.String r8 = android.os.Build.VERSION.RELEASE
            java.lang.String r9 = "os"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r9, (java.lang.Object) r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "version"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r9, (java.lang.Object) r8)
            java.lang.String r8 = android.os.Build.BRAND
            java.lang.String r9 = "brand"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r9, (java.lang.Object) r8)
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = "Build.MODEL"
            e.x.c.i.d(r9, r10)
            java.lang.String r11 = "model"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r11, (java.lang.Object) r9)
            java.lang.String r11 = android.os.Build.PRODUCT
            java.lang.String r12 = "model_identifier"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r12, (java.lang.Object) r11)
            java.lang.String r12 = android.os.Build.FINGERPRINT
            java.lang.String r13 = "Build.FINGERPRINT"
            e.x.c.i.d(r12, r13)
            java.lang.String r14 = "generic"
            r15 = 2
            boolean r16 = e.c0.h.C(r12, r14, r0, r15)
            if (r16 != 0) goto L_0x01e9
            e.x.c.i.d(r12, r13)
            java.lang.String r13 = "unknown"
            boolean r12 = e.c0.h.C(r12, r13, r0, r15)
            if (r12 != 0) goto L_0x01e9
            e.x.c.i.d(r9, r10)
            java.lang.String r12 = "google_sdk"
            boolean r13 = e.c0.h.d(r9, r12, r0, r15)
            if (r13 != 0) goto L_0x01e9
            e.x.c.i.d(r9, r10)
            java.lang.String r13 = "Emulator"
            boolean r13 = e.c0.h.d(r9, r13, r0, r15)
            if (r13 != 0) goto L_0x01e9
            e.x.c.i.d(r9, r10)
            java.lang.String r13 = "Android SDK built for x86"
            boolean r13 = e.c0.h.d(r9, r13, r0, r15)
            if (r13 != 0) goto L_0x01e9
            e.x.c.i.d(r9, r10)
            java.lang.String r10 = "Genymotion"
            boolean r9 = e.c0.h.d(r9, r10, r0, r15)
            if (r9 != 0) goto L_0x01e9
            java.lang.String r9 = "Build.BRAND"
            e.x.c.i.d(r8, r9)
            boolean r8 = e.c0.h.C(r8, r14, r0, r15)
            if (r8 == 0) goto L_0x01e0
            java.lang.String r8 = android.os.Build.DEVICE
            java.lang.String r9 = "Build.DEVICE"
            e.x.c.i.d(r8, r9)
            boolean r8 = e.c0.h.C(r8, r14, r0, r15)
            if (r8 != 0) goto L_0x01e9
        L_0x01e0:
            boolean r8 = e.x.c.i.a(r12, r11)
            if (r8 == 0) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r8 = r0
            goto L_0x01ea
        L_0x01e9:
            r8 = 1
        L_0x01ea:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "is_simulator"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r9, (java.lang.Object) r8)
            java.lang.String r8 = "run_mode"
            java.lang.String r9 = "Release"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r8, (java.lang.Object) r9)
            java.lang.String r8 = "bundle_id"
            java.lang.String r9 = "app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r8, (java.lang.Object) r9)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r9 = "Locale.getDefault()"
            e.x.c.i.d(r8, r9)
            java.lang.String r8 = r8.getDisplayLanguage()
            java.lang.String r10 = "lang"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r10, (java.lang.Object) r8)
            java.util.Locale r8 = java.util.Locale.getDefault()
            e.x.c.i.d(r8, r9)
            java.lang.String r8 = r8.getDisplayCountry()
            java.lang.String r9 = "country"
            com.segment.analytics.Properties r7 = r7.putValue((java.lang.String) r9, (java.lang.Object) r8)
            java.lang.String r8 = "App Installed"
            r2.track(r8, r7)
            android.content.Context r2 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r3, r0)
            e.x.c.i.d(r0, r4)
            e.x.c.i.e(r5, r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r2)
            r0.apply()
        L_0x0247:
            return
        L_0x0248:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0248 }
            throw r0
        L_0x024b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot plant Timber into itself."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.BravoApp.onCreate():void");
    }
}
