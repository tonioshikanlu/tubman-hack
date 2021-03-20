package e.v;

import com.segment.analytics.integrations.BasePayload;
import e.v.f;
import e.x.b.p;
import e.x.c.i;
import e.x.c.k;
import java.io.Serializable;
import java.util.Objects;

public final class c implements f, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final f f7945h;

    /* renamed from: i  reason: collision with root package name */
    public final f.a f7946i;

    public static final class a extends k implements p<String, f.a, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f7947h = new a();

        public a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            f.a aVar = (f.a) obj2;
            i.e(str, "acc");
            i.e(aVar, "element");
            if (str.length() == 0) {
                return aVar.toString();
            }
            return str + ", " + aVar;
        }
    }

    public c(f fVar, f.a aVar) {
        i.e(fVar, "left");
        i.e(aVar, "element");
        this.f7945h = fVar;
        this.f7946i = aVar;
    }

    public final int a() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f7945h;
            if (!(fVar instanceof c)) {
                fVar = null;
            }
            cVar = (c) fVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a() != a()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.f7946i;
                if (i.a(cVar.get(aVar.getKey()), aVar)) {
                    f fVar = cVar2.f7945h;
                    if (!(fVar instanceof c)) {
                        Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.a aVar2 = (f.a) fVar;
                        z = i.a(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar2 = (c) fVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return pVar.invoke(this.f7945h.fold(r, pVar), this.f7946i);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        c cVar = this;
        while (true) {
            E e2 = cVar.f7946i.get(bVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar.f7945h;
            if (!(fVar instanceof c)) {
                return fVar.get(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public int hashCode() {
        return this.f7946i.hashCode() + this.f7945h.hashCode();
    }

    public f minusKey(f.b<?> bVar) {
        i.e(bVar, "key");
        if (this.f7946i.get(bVar) != null) {
            return this.f7945h;
        }
        f minusKey = this.f7945h.minusKey(bVar);
        return minusKey == this.f7945h ? this : minusKey == h.f7949h ? this.f7946i : new c(minusKey, this.f7946i);
    }

    public f plus(f fVar) {
        i.e(fVar, BasePayload.CONTEXT_KEY);
        i.e(fVar, BasePayload.CONTEXT_KEY);
        return fVar == h.f7949h ? this : (f) fVar.fold(this, g.f7948h);
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("["), (String) fold("", a.f7947h), "]");
    }
}
