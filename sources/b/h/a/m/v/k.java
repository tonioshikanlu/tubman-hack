package b.h.a.m.v;

public abstract class k {
    public static final k a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k f717b = new b();
    public static final k c = new c();

    public class a extends k {
        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(b.h.a.m.a aVar) {
            return false;
        }

        public boolean d(boolean z, b.h.a.m.a aVar, b.h.a.m.c cVar) {
            return false;
        }
    }

    public class b extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(b.h.a.m.a aVar) {
            return (aVar == b.h.a.m.a.DATA_DISK_CACHE || aVar == b.h.a.m.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z, b.h.a.m.a aVar, b.h.a.m.c cVar) {
            return false;
        }
    }

    public class c extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(b.h.a.m.a aVar) {
            return aVar == b.h.a.m.a.REMOTE;
        }

        public boolean d(boolean z, b.h.a.m.a aVar, b.h.a.m.c cVar) {
            return ((z && aVar == b.h.a.m.a.DATA_DISK_CACHE) || aVar == b.h.a.m.a.LOCAL) && cVar == b.h.a.m.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(b.h.a.m.a aVar);

    public abstract boolean d(boolean z, b.h.a.m.a aVar, b.h.a.m.c cVar);
}
