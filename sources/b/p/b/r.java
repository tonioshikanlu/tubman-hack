package b.p.b;

import androidx.appcompat.widget.ActivityChooserView;
import b.p.b.a0.b;
import b.p.b.a0.c;
import b.p.b.a0.g;
import b.p.b.a0.i;
import b.p.b.a0.j.d;
import b.p.b.a0.j.t;
import b.p.b.a0.k.p;
import java.lang.ref.WeakReference;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class r implements Cloneable {
    public static final List<s> E = i.i(s.HTTP_2, s.SPDY_3, s.HTTP_1_1);
    public static final List<j> F = i.i(j.f, j.f6717g, j.f6718h);
    public static SSLSocketFactory G;
    public boolean A;
    public int B;
    public int C;
    public int D;

    /* renamed from: h  reason: collision with root package name */
    public final g f6740h;

    /* renamed from: i  reason: collision with root package name */
    public k f6741i;

    /* renamed from: j  reason: collision with root package name */
    public Proxy f6742j;

    /* renamed from: k  reason: collision with root package name */
    public List<s> f6743k;

    /* renamed from: l  reason: collision with root package name */
    public List<j> f6744l;

    /* renamed from: m  reason: collision with root package name */
    public final List<p> f6745m;

    /* renamed from: n  reason: collision with root package name */
    public final List<p> f6746n;

    /* renamed from: o  reason: collision with root package name */
    public ProxySelector f6747o;

    /* renamed from: p  reason: collision with root package name */
    public CookieHandler f6748p;

    /* renamed from: q  reason: collision with root package name */
    public c f6749q;
    public SocketFactory r;
    public SSLSocketFactory s;
    public HostnameVerifier t;
    public f u;
    public b v;
    public i w;
    public l x;
    public boolean y;
    public boolean z;

    public static class a extends b {
        public b.p.b.a0.l.a a(i iVar, a aVar, p pVar) {
            int i2;
            for (b.p.b.a0.l.a next : iVar.f6714e) {
                int size = next.f6678j.size();
                d dVar = next.f;
                if (dVar != null) {
                    synchronized (dVar) {
                        t tVar = dVar.u;
                        i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                        if ((tVar.a & 16) != 0) {
                            i2 = tVar.d[4];
                        }
                    }
                } else {
                    i2 = 1;
                }
                if (size < i2 && aVar.equals(next.a.a) && !next.f6679k) {
                    next.f6678j.add(new WeakReference(pVar));
                    return next;
                }
            }
            return null;
        }
    }

    static {
        b.f6471b = new a();
    }

    public r() {
        this.f6745m = new ArrayList();
        this.f6746n = new ArrayList();
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = 10000;
        this.C = 10000;
        this.D = 10000;
        this.f6740h = new g();
        this.f6741i = new k();
    }

    public r(r rVar) {
        ArrayList arrayList = new ArrayList();
        this.f6745m = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6746n = arrayList2;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = 10000;
        this.C = 10000;
        this.D = 10000;
        this.f6740h = rVar.f6740h;
        this.f6741i = rVar.f6741i;
        this.f6742j = rVar.f6742j;
        this.f6743k = rVar.f6743k;
        this.f6744l = rVar.f6744l;
        arrayList.addAll(rVar.f6745m);
        arrayList2.addAll(rVar.f6746n);
        this.f6747o = rVar.f6747o;
        this.f6748p = rVar.f6748p;
        this.f6749q = rVar.f6749q;
        this.r = rVar.r;
        this.s = rVar.s;
        this.t = rVar.t;
        this.u = rVar.u;
        this.v = rVar.v;
        this.w = rVar.w;
        this.x = rVar.x;
        this.y = rVar.y;
        this.z = rVar.z;
        this.A = rVar.A;
        this.B = rVar.B;
        this.C = rVar.C;
        this.D = rVar.D;
    }

    public Object clone() {
        return new r(this);
    }
}
