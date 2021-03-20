package e.a.a.a.y0.d.b.w;

import e.a.a.a.y0.e.a0.b.c;
import e.a.a.a.y0.e.a0.b.f;
import e.x.c.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a {
    public final C0184a a;

    /* renamed from: b  reason: collision with root package name */
    public final f f8658b;
    public final String[] c;
    public final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f8659e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8660g;

    /* renamed from: e.a.a.a.y0.d.b.w.a$a  reason: collision with other inner class name */
    public enum C0184a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: p  reason: collision with root package name */
        public static final Map<Integer, C0184a> f8668p = null;

        /* renamed from: q  reason: collision with root package name */
        public static final C0185a f8669q = null;

        /* renamed from: h  reason: collision with root package name */
        public final int f8670h;

        /* renamed from: e.a.a.a.y0.d.b.w.a$a$a  reason: collision with other inner class name */
        public static final class C0185a {
            public C0185a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* access modifiers changed from: public */
        static {
            int i2;
            f8669q = new C0185a((DefaultConstructorMarker) null);
            C0184a[] values = values();
            int q2 = b.q.a.a.q2(6);
            if (q2 < 16) {
                q2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(q2);
            for (C0184a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f8670h), aVar);
            }
            f8668p = linkedHashMap;
        }

        /* access modifiers changed from: public */
        C0184a(int i2) {
            this.f8670h = i2;
        }
    }

    public a(C0184a aVar, f fVar, c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i2, String str2) {
        i.e(aVar, "kind");
        i.e(fVar, "metadataVersion");
        i.e(cVar, "bytecodeVersion");
        this.a = aVar;
        this.f8658b = fVar;
        this.c = strArr;
        this.d = strArr2;
        this.f8659e = strArr3;
        this.f = str;
        this.f8660g = i2;
    }

    public final String a() {
        String str = this.f;
        if (this.a == C0184a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public String toString() {
        return this.a + " version=" + this.f8658b;
    }
}
