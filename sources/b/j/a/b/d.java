package b.j.a.b;

import b.j.a.b.f;
import b.j.a.b.i;
import b.j.a.b.u.b;
import b.j.a.b.w.e;
import b.j.a.b.w.l;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

public class d extends p implements Serializable {

    /* renamed from: p  reason: collision with root package name */
    public static final int f1382p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1383q;
    public static final int r = f.a.d();
    public static final o s = e.f1560o;

    /* renamed from: h  reason: collision with root package name */
    public final transient b f1384h;

    /* renamed from: i  reason: collision with root package name */
    public final transient b.j.a.b.u.a f1385i;

    /* renamed from: j  reason: collision with root package name */
    public int f1386j = f1382p;

    /* renamed from: k  reason: collision with root package name */
    public int f1387k = f1383q;

    /* renamed from: l  reason: collision with root package name */
    public int f1388l = r;

    /* renamed from: m  reason: collision with root package name */
    public m f1389m;

    /* renamed from: n  reason: collision with root package name */
    public o f1390n = s;

    /* renamed from: o  reason: collision with root package name */
    public final char f1391o;

    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1397h;

        /* access modifiers changed from: public */
        a(boolean z) {
            this.f1397h = z;
        }

        public boolean d(int i2) {
            return (i2 & (1 << ordinal())) != 0;
        }
    }

    static {
        a[] values = a.values();
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            a aVar = values[i3];
            if (aVar.f1397h) {
                i2 |= 1 << aVar.ordinal();
            }
        }
        f1382p = i2;
        i.a[] values2 = i.a.values();
        int i4 = 0;
        for (int i5 = 0; i5 < 14; i5++) {
            i.a aVar2 = values2[i5];
            if (aVar2.f1425h) {
                i4 |= aVar2.f1426i;
            }
        }
        f1383q = i4;
    }

    public d(m mVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f1384h = new b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f1385i = new b.j.a.b.u.a(64, true, (((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1, true);
        this.f1389m = mVar;
        this.f1391o = '\"';
    }

    public f a(Writer writer, b.j.a.b.s.b bVar) {
        b.j.a.b.t.i iVar = new b.j.a.b.t.i(bVar, this.f1388l, this.f1389m, writer, this.f1391o);
        o oVar = this.f1390n;
        if (oVar != s) {
            iVar.f1506q = oVar;
        }
        return iVar;
    }

    public b.j.a.b.w.a b() {
        SoftReference softReference;
        if (!a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.d(this.f1386j)) {
            return new b.j.a.b.w.a();
        }
        SoftReference softReference2 = b.j.a.b.w.b.f1549b.get();
        b.j.a.b.w.a aVar = softReference2 == null ? null : (b.j.a.b.w.a) softReference2.get();
        if (aVar == null) {
            aVar = new b.j.a.b.w.a();
            l lVar = b.j.a.b.w.b.a;
            if (lVar != null) {
                softReference = new SoftReference(aVar, lVar.f1584b);
                lVar.a.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) lVar.f1584b.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    lVar.a.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(aVar);
            }
            b.j.a.b.w.b.f1549b.set(softReference);
        }
        return aVar;
    }

    public i c(Reader reader) {
        return new b.j.a.b.t.f(new b.j.a.b.s.b(b(), reader, false), this.f1387k, reader, this.f1389m, this.f1384h.d(this.f1386j));
    }

    public i d(String str) {
        int length = str.length();
        if (length > 32768) {
            return c(new StringReader(str));
        }
        b.j.a.b.s.b bVar = new b.j.a.b.s.b(b(), str, true);
        bVar.a(bVar.f1470h);
        char[] b2 = bVar.d.b(0, length);
        bVar.f1470h = b2;
        str.getChars(0, length, b2, 0);
        return new b.j.a.b.t.f(bVar, this.f1387k, (Reader) null, this.f1389m, this.f1384h.d(this.f1386j), b2, 0, 0 + length, true);
    }

    public m e() {
        return this.f1389m;
    }
}
