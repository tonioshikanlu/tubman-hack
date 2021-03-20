package b.l.d.q.f.i;

import b.l.d.q.f.i.v;
import com.amplitude.api.Constants;
import com.amplitude.api.DatabaseHelper;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;

public final class a implements b.l.d.s.i.a {
    public static final b.l.d.s.i.a a = new a();

    /* renamed from: b.l.d.q.f.i.a$a  reason: collision with other inner class name */
    public static final class C0079a implements b.l.d.s.e<v.b> {
        public static final C0079a a = new C0079a();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5149b = b.l.d.s.d.a("key");
        public static final b.l.d.s.d c = b.l.d.s.d.a("value");

        public void a(Object obj, Object obj2) {
            v.b bVar = (v.b) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5149b, bVar.a());
            fVar.f(c, bVar.b());
        }
    }

    public static final class b implements b.l.d.s.e<v> {
        public static final b a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5150b = b.l.d.s.d.a("sdkVersion");
        public static final b.l.d.s.d c = b.l.d.s.d.a("gmpAppId");
        public static final b.l.d.s.d d = b.l.d.s.d.a(Constants.AMP_TRACKING_OPTION_PLATFORM);

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5151e = b.l.d.s.d.a("installationUuid");
        public static final b.l.d.s.d f = b.l.d.s.d.a("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        public static final b.l.d.s.d f5152g = b.l.d.s.d.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final b.l.d.s.d f5153h = b.l.d.s.d.a("session");

        /* renamed from: i  reason: collision with root package name */
        public static final b.l.d.s.d f5154i = b.l.d.s.d.a("ndkPayload");

        public void a(Object obj, Object obj2) {
            v vVar = (v) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5150b, vVar.g());
            fVar.f(c, vVar.c());
            fVar.c(d, vVar.f());
            fVar.f(f5151e, vVar.d());
            fVar.f(f, vVar.a());
            fVar.f(f5152g, vVar.b());
            fVar.f(f5153h, vVar.h());
            fVar.f(f5154i, vVar.e());
        }
    }

    public static final class c implements b.l.d.s.e<v.c> {
        public static final c a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5155b = b.l.d.s.d.a("files");
        public static final b.l.d.s.d c = b.l.d.s.d.a("orgId");

        public void a(Object obj, Object obj2) {
            v.c cVar = (v.c) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5155b, cVar.a());
            fVar.f(c, cVar.b());
        }
    }

    public static final class d implements b.l.d.s.e<v.c.a> {
        public static final d a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5156b = b.l.d.s.d.a("filename");
        public static final b.l.d.s.d c = b.l.d.s.d.a("contents");

        public void a(Object obj, Object obj2) {
            v.c.a aVar = (v.c.a) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5156b, aVar.b());
            fVar.f(c, aVar.a());
        }
    }

    public static final class e implements b.l.d.s.e<v.d.a> {
        public static final e a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5157b = b.l.d.s.d.a("identifier");
        public static final b.l.d.s.d c = b.l.d.s.d.a("version");
        public static final b.l.d.s.d d = b.l.d.s.d.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5158e = b.l.d.s.d.a("organization");
        public static final b.l.d.s.d f = b.l.d.s.d.a("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final b.l.d.s.d f5159g = b.l.d.s.d.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final b.l.d.s.d f5160h = b.l.d.s.d.a("developmentPlatformVersion");

        public void a(Object obj, Object obj2) {
            v.d.a aVar = (v.d.a) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5157b, aVar.d());
            fVar.f(c, aVar.g());
            fVar.f(d, aVar.c());
            fVar.f(f5158e, aVar.f());
            fVar.f(f, aVar.e());
            fVar.f(f5159g, aVar.a());
            fVar.f(f5160h, aVar.b());
        }
    }

    public static final class f implements b.l.d.s.e<v.d.a.C0081a> {
        public static final f a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5161b = b.l.d.s.d.a("clsId");

        public void a(Object obj, Object obj2) {
            ((b.l.d.s.f) obj2).f(f5161b, ((v.d.a.C0081a) obj).a());
        }
    }

    public static final class g implements b.l.d.s.e<v.d.c> {
        public static final g a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5162b = b.l.d.s.d.a("arch");
        public static final b.l.d.s.d c = b.l.d.s.d.a(AnalyticsContext.Device.DEVICE_MODEL_KEY);
        public static final b.l.d.s.d d = b.l.d.s.d.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5163e = b.l.d.s.d.a("ram");
        public static final b.l.d.s.d f = b.l.d.s.d.a("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final b.l.d.s.d f5164g = b.l.d.s.d.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final b.l.d.s.d f5165h = b.l.d.s.d.a("state");

        /* renamed from: i  reason: collision with root package name */
        public static final b.l.d.s.d f5166i = b.l.d.s.d.a(AnalyticsContext.Device.DEVICE_MANUFACTURER_KEY);

        /* renamed from: j  reason: collision with root package name */
        public static final b.l.d.s.d f5167j = b.l.d.s.d.a("modelClass");

        public void a(Object obj, Object obj2) {
            v.d.c cVar = (v.d.c) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.c(f5162b, cVar.a());
            fVar.f(c, cVar.e());
            fVar.c(d, cVar.b());
            fVar.b(f5163e, cVar.g());
            fVar.b(f, cVar.c());
            fVar.a(f5164g, cVar.i());
            fVar.c(f5165h, cVar.h());
            fVar.f(f5166i, cVar.d());
            fVar.f(f5167j, cVar.f());
        }
    }

    public static final class h implements b.l.d.s.e<v.d> {
        public static final h a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5168b = b.l.d.s.d.a("generator");
        public static final b.l.d.s.d c = b.l.d.s.d.a("identifier");
        public static final b.l.d.s.d d = b.l.d.s.d.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5169e = b.l.d.s.d.a("endedAt");
        public static final b.l.d.s.d f = b.l.d.s.d.a("crashed");

        /* renamed from: g  reason: collision with root package name */
        public static final b.l.d.s.d f5170g = b.l.d.s.d.a("app");

        /* renamed from: h  reason: collision with root package name */
        public static final b.l.d.s.d f5171h = b.l.d.s.d.a("user");

        /* renamed from: i  reason: collision with root package name */
        public static final b.l.d.s.d f5172i = b.l.d.s.d.a("os");

        /* renamed from: j  reason: collision with root package name */
        public static final b.l.d.s.d f5173j = b.l.d.s.d.a("device");

        /* renamed from: k  reason: collision with root package name */
        public static final b.l.d.s.d f5174k = b.l.d.s.d.a(DatabaseHelper.EVENT_TABLE_NAME);

        /* renamed from: l  reason: collision with root package name */
        public static final b.l.d.s.d f5175l = b.l.d.s.d.a("generatorType");

        public void a(Object obj, Object obj2) {
            v.d dVar = (v.d) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5168b, dVar.e());
            fVar.f(c, dVar.g().getBytes(v.a));
            fVar.b(d, dVar.i());
            fVar.f(f5169e, dVar.c());
            fVar.a(f, dVar.k());
            fVar.f(f5170g, dVar.a());
            fVar.f(f5171h, dVar.j());
            fVar.f(f5172i, dVar.h());
            fVar.f(f5173j, dVar.b());
            fVar.f(f5174k, dVar.d());
            fVar.c(f5175l, dVar.f());
        }
    }

    public static final class i implements b.l.d.s.e<v.d.C0082d.a> {
        public static final i a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5176b = b.l.d.s.d.a("execution");
        public static final b.l.d.s.d c = b.l.d.s.d.a("customAttributes");
        public static final b.l.d.s.d d = b.l.d.s.d.a("background");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5177e = b.l.d.s.d.a("uiOrientation");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a aVar = (v.d.C0082d.a) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5176b, aVar.c());
            fVar.f(c, aVar.b());
            fVar.f(d, aVar.a());
            fVar.c(f5177e, aVar.d());
        }
    }

    public static final class j implements b.l.d.s.e<v.d.C0082d.a.b.C0084a> {
        public static final j a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5178b = b.l.d.s.d.a("baseAddress");
        public static final b.l.d.s.d c = b.l.d.s.d.a("size");
        public static final b.l.d.s.d d = b.l.d.s.d.a("name");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5179e = b.l.d.s.d.a("uuid");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b.C0084a aVar = (v.d.C0082d.a.b.C0084a) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.b(f5178b, aVar.a());
            fVar.b(c, aVar.c());
            fVar.f(d, aVar.b());
            b.l.d.s.d dVar = f5179e;
            String d2 = aVar.d();
            fVar.f(dVar, d2 != null ? d2.getBytes(v.a) : null);
        }
    }

    public static final class k implements b.l.d.s.e<v.d.C0082d.a.b> {
        public static final k a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5180b = b.l.d.s.d.a("threads");
        public static final b.l.d.s.d c = b.l.d.s.d.a("exception");
        public static final b.l.d.s.d d = b.l.d.s.d.a("signal");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5181e = b.l.d.s.d.a("binaries");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b bVar = (v.d.C0082d.a.b) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5180b, bVar.d());
            fVar.f(c, bVar.b());
            fVar.f(d, bVar.c());
            fVar.f(f5181e, bVar.a());
        }
    }

    public static final class l implements b.l.d.s.e<v.d.C0082d.a.b.C0085b> {
        public static final l a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5182b = b.l.d.s.d.a("type");
        public static final b.l.d.s.d c = b.l.d.s.d.a("reason");
        public static final b.l.d.s.d d = b.l.d.s.d.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5183e = b.l.d.s.d.a("causedBy");
        public static final b.l.d.s.d f = b.l.d.s.d.a("overflowCount");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b.C0085b bVar = (v.d.C0082d.a.b.C0085b) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5182b, bVar.e());
            fVar.f(c, bVar.d());
            fVar.f(d, bVar.b());
            fVar.f(f5183e, bVar.a());
            fVar.c(f, bVar.c());
        }
    }

    public static final class m implements b.l.d.s.e<v.d.C0082d.a.b.c> {
        public static final m a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5184b = b.l.d.s.d.a("name");
        public static final b.l.d.s.d c = b.l.d.s.d.a("code");
        public static final b.l.d.s.d d = b.l.d.s.d.a("address");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b.c cVar = (v.d.C0082d.a.b.c) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5184b, cVar.c());
            fVar.f(c, cVar.b());
            fVar.b(d, cVar.a());
        }
    }

    public static final class n implements b.l.d.s.e<v.d.C0082d.a.b.C0086d> {
        public static final n a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5185b = b.l.d.s.d.a("name");
        public static final b.l.d.s.d c = b.l.d.s.d.a("importance");
        public static final b.l.d.s.d d = b.l.d.s.d.a("frames");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b.C0086d dVar = (v.d.C0082d.a.b.C0086d) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5185b, dVar.c());
            fVar.c(c, dVar.b());
            fVar.f(d, dVar.a());
        }
    }

    public static final class o implements b.l.d.s.e<v.d.C0082d.a.b.C0086d.C0087a> {
        public static final o a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5186b = b.l.d.s.d.a("pc");
        public static final b.l.d.s.d c = b.l.d.s.d.a("symbol");
        public static final b.l.d.s.d d = b.l.d.s.d.a("file");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5187e = b.l.d.s.d.a("offset");
        public static final b.l.d.s.d f = b.l.d.s.d.a("importance");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.a.b.C0086d.C0087a aVar = (v.d.C0082d.a.b.C0086d.C0087a) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.b(f5186b, aVar.d());
            fVar.f(c, aVar.e());
            fVar.f(d, aVar.a());
            fVar.b(f5187e, aVar.c());
            fVar.c(f, aVar.b());
        }
    }

    public static final class p implements b.l.d.s.e<v.d.C0082d.b> {
        public static final p a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5188b = b.l.d.s.d.a("batteryLevel");
        public static final b.l.d.s.d c = b.l.d.s.d.a("batteryVelocity");
        public static final b.l.d.s.d d = b.l.d.s.d.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5189e = b.l.d.s.d.a("orientation");
        public static final b.l.d.s.d f = b.l.d.s.d.a("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final b.l.d.s.d f5190g = b.l.d.s.d.a("diskUsed");

        public void a(Object obj, Object obj2) {
            v.d.C0082d.b bVar = (v.d.C0082d.b) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.f(f5188b, bVar.a());
            fVar.c(c, bVar.b());
            fVar.a(d, bVar.f());
            fVar.c(f5189e, bVar.d());
            fVar.b(f, bVar.e());
            fVar.b(f5190g, bVar.c());
        }
    }

    public static final class q implements b.l.d.s.e<v.d.C0082d> {
        public static final q a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5191b = b.l.d.s.d.a(BasePayload.TIMESTAMP_KEY);
        public static final b.l.d.s.d c = b.l.d.s.d.a("type");
        public static final b.l.d.s.d d = b.l.d.s.d.a("app");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5192e = b.l.d.s.d.a("device");
        public static final b.l.d.s.d f = b.l.d.s.d.a("log");

        public void a(Object obj, Object obj2) {
            v.d.C0082d dVar = (v.d.C0082d) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.b(f5191b, dVar.d());
            fVar.f(c, dVar.e());
            fVar.f(d, dVar.a());
            fVar.f(f5192e, dVar.b());
            fVar.f(f, dVar.c());
        }
    }

    public static final class r implements b.l.d.s.e<v.d.C0082d.c> {
        public static final r a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5193b = b.l.d.s.d.a("content");

        public void a(Object obj, Object obj2) {
            ((b.l.d.s.f) obj2).f(f5193b, ((v.d.C0082d.c) obj).a());
        }
    }

    public static final class s implements b.l.d.s.e<v.d.e> {
        public static final s a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5194b = b.l.d.s.d.a(Constants.AMP_TRACKING_OPTION_PLATFORM);
        public static final b.l.d.s.d c = b.l.d.s.d.a("version");
        public static final b.l.d.s.d d = b.l.d.s.d.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final b.l.d.s.d f5195e = b.l.d.s.d.a("jailbroken");

        public void a(Object obj, Object obj2) {
            v.d.e eVar = (v.d.e) obj;
            b.l.d.s.f fVar = (b.l.d.s.f) obj2;
            fVar.c(f5194b, eVar.b());
            fVar.f(c, eVar.c());
            fVar.f(d, eVar.a());
            fVar.a(f5195e, eVar.d());
        }
    }

    public static final class t implements b.l.d.s.e<v.d.f> {
        public static final t a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final b.l.d.s.d f5196b = b.l.d.s.d.a("identifier");

        public void a(Object obj, Object obj2) {
            ((b.l.d.s.f) obj2).f(f5196b, ((v.d.f) obj).a());
        }
    }

    public void a(b.l.d.s.i.b<?> bVar) {
        Class<v> cls = v.class;
        b bVar2 = b.a;
        b.l.d.s.j.e eVar = (b.l.d.s.j.e) bVar;
        eVar.a.put(cls, bVar2);
        eVar.f5291b.remove(cls);
        Class<b> cls2 = b.class;
        eVar.a.put(cls2, bVar2);
        eVar.f5291b.remove(cls2);
        Class<v.d> cls3 = v.d.class;
        h hVar = h.a;
        eVar.a.put(cls3, hVar);
        eVar.f5291b.remove(cls3);
        Class<f> cls4 = f.class;
        eVar.a.put(cls4, hVar);
        eVar.f5291b.remove(cls4);
        Class<v.d.a> cls5 = v.d.a.class;
        e eVar2 = e.a;
        eVar.a.put(cls5, eVar2);
        eVar.f5291b.remove(cls5);
        Class<g> cls6 = g.class;
        eVar.a.put(cls6, eVar2);
        eVar.f5291b.remove(cls6);
        Class<v.d.a.C0081a> cls7 = v.d.a.C0081a.class;
        f fVar = f.a;
        eVar.a.put(cls7, fVar);
        eVar.f5291b.remove(cls7);
        Class<h> cls8 = h.class;
        eVar.a.put(cls8, fVar);
        eVar.f5291b.remove(cls8);
        Class<v.d.f> cls9 = v.d.f.class;
        t tVar = t.a;
        eVar.a.put(cls9, tVar);
        eVar.f5291b.remove(cls9);
        Class<u> cls10 = u.class;
        eVar.a.put(cls10, tVar);
        eVar.f5291b.remove(cls10);
        Class<v.d.e> cls11 = v.d.e.class;
        s sVar = s.a;
        eVar.a.put(cls11, sVar);
        eVar.f5291b.remove(cls11);
        Class<t> cls12 = t.class;
        eVar.a.put(cls12, sVar);
        eVar.f5291b.remove(cls12);
        Class<v.d.c> cls13 = v.d.c.class;
        g gVar = g.a;
        eVar.a.put(cls13, gVar);
        eVar.f5291b.remove(cls13);
        Class<i> cls14 = i.class;
        eVar.a.put(cls14, gVar);
        eVar.f5291b.remove(cls14);
        Class<v.d.C0082d> cls15 = v.d.C0082d.class;
        q qVar = q.a;
        eVar.a.put(cls15, qVar);
        eVar.f5291b.remove(cls15);
        Class<j> cls16 = j.class;
        eVar.a.put(cls16, qVar);
        eVar.f5291b.remove(cls16);
        Class<v.d.C0082d.a> cls17 = v.d.C0082d.a.class;
        i iVar = i.a;
        eVar.a.put(cls17, iVar);
        eVar.f5291b.remove(cls17);
        Class<k> cls18 = k.class;
        eVar.a.put(cls18, iVar);
        eVar.f5291b.remove(cls18);
        Class<v.d.C0082d.a.b> cls19 = v.d.C0082d.a.b.class;
        k kVar = k.a;
        eVar.a.put(cls19, kVar);
        eVar.f5291b.remove(cls19);
        Class<l> cls20 = l.class;
        eVar.a.put(cls20, kVar);
        eVar.f5291b.remove(cls20);
        Class<v.d.C0082d.a.b.C0086d> cls21 = v.d.C0082d.a.b.C0086d.class;
        n nVar = n.a;
        eVar.a.put(cls21, nVar);
        eVar.f5291b.remove(cls21);
        Class<p> cls22 = p.class;
        eVar.a.put(cls22, nVar);
        eVar.f5291b.remove(cls22);
        Class<v.d.C0082d.a.b.C0086d.C0087a> cls23 = v.d.C0082d.a.b.C0086d.C0087a.class;
        o oVar = o.a;
        eVar.a.put(cls23, oVar);
        eVar.f5291b.remove(cls23);
        Class<q> cls24 = q.class;
        eVar.a.put(cls24, oVar);
        eVar.f5291b.remove(cls24);
        Class<v.d.C0082d.a.b.C0085b> cls25 = v.d.C0082d.a.b.C0085b.class;
        l lVar = l.a;
        eVar.a.put(cls25, lVar);
        eVar.f5291b.remove(cls25);
        Class<n> cls26 = n.class;
        eVar.a.put(cls26, lVar);
        eVar.f5291b.remove(cls26);
        Class<v.d.C0082d.a.b.c> cls27 = v.d.C0082d.a.b.c.class;
        m mVar = m.a;
        eVar.a.put(cls27, mVar);
        eVar.f5291b.remove(cls27);
        Class<o> cls28 = o.class;
        eVar.a.put(cls28, mVar);
        eVar.f5291b.remove(cls28);
        Class<v.d.C0082d.a.b.C0084a> cls29 = v.d.C0082d.a.b.C0084a.class;
        j jVar = j.a;
        eVar.a.put(cls29, jVar);
        eVar.f5291b.remove(cls29);
        Class<m> cls30 = m.class;
        eVar.a.put(cls30, jVar);
        eVar.f5291b.remove(cls30);
        Class<v.b> cls31 = v.b.class;
        C0079a aVar = C0079a.a;
        eVar.a.put(cls31, aVar);
        eVar.f5291b.remove(cls31);
        Class<c> cls32 = c.class;
        eVar.a.put(cls32, aVar);
        eVar.f5291b.remove(cls32);
        Class<v.d.C0082d.b> cls33 = v.d.C0082d.b.class;
        p pVar = p.a;
        eVar.a.put(cls33, pVar);
        eVar.f5291b.remove(cls33);
        Class<r> cls34 = r.class;
        eVar.a.put(cls34, pVar);
        eVar.f5291b.remove(cls34);
        Class<v.d.C0082d.c> cls35 = v.d.C0082d.c.class;
        r rVar = r.a;
        eVar.a.put(cls35, rVar);
        eVar.f5291b.remove(cls35);
        Class<s> cls36 = s.class;
        eVar.a.put(cls36, rVar);
        eVar.f5291b.remove(cls36);
        Class<v.c> cls37 = v.c.class;
        c cVar = c.a;
        eVar.a.put(cls37, cVar);
        eVar.f5291b.remove(cls37);
        Class<d> cls38 = d.class;
        eVar.a.put(cls38, cVar);
        eVar.f5291b.remove(cls38);
        Class<v.c.a> cls39 = v.c.a.class;
        d dVar = d.a;
        eVar.a.put(cls39, dVar);
        eVar.f5291b.remove(cls39);
        Class<e> cls40 = e.class;
        eVar.a.put(cls40, dVar);
        eVar.f5291b.remove(cls40);
    }
}
