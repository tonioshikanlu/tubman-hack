package b.j.a.c.e0;

import b.j.a.a.f;
import b.j.a.c.e0.i0;
import java.io.Serializable;

public interface i0<T extends i0<T>> {

    public static class a implements i0<a>, Serializable {

        /* renamed from: m  reason: collision with root package name */
        public static final a f1915m;

        /* renamed from: h  reason: collision with root package name */
        public final f.a f1916h;

        /* renamed from: i  reason: collision with root package name */
        public final f.a f1917i;

        /* renamed from: j  reason: collision with root package name */
        public final f.a f1918j;

        /* renamed from: k  reason: collision with root package name */
        public final f.a f1919k;

        /* renamed from: l  reason: collision with root package name */
        public final f.a f1920l;

        static {
            f.a aVar = f.a.PUBLIC_ONLY;
            f.a aVar2 = f.a.ANY;
            f1915m = new a(aVar, aVar, aVar2, aVar2, aVar);
        }

        public a(f.a aVar, f.a aVar2, f.a aVar3, f.a aVar4, f.a aVar5) {
            this.f1916h = aVar;
            this.f1917i = aVar2;
            this.f1918j = aVar3;
            this.f1919k = aVar4;
            this.f1920l = aVar5;
        }

        public final f.a a(f.a aVar, f.a aVar2) {
            return aVar2 == f.a.DEFAULT ? aVar : aVar2;
        }

        public a b(f.a aVar, f.a aVar2, f.a aVar3, f.a aVar4, f.a aVar5) {
            return (aVar == this.f1916h && aVar2 == this.f1917i && aVar3 == this.f1918j && aVar4 == this.f1919k && aVar5 == this.f1920l) ? this : new a(aVar, aVar2, aVar3, aVar4, aVar5);
        }

        public boolean c(h hVar) {
            return this.f1919k.d(hVar.j());
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this.f1916h, this.f1917i, this.f1918j, this.f1919k, this.f1920l});
        }
    }
}
