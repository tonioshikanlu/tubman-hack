package b.h.a.m.v.c0;

import b.h.a.m.v.c0.l;
import b.h.a.s.j;
import java.util.ArrayDeque;
import java.util.Queue;

public abstract class c<T extends l> {
    public final Queue<T> a = new ArrayDeque(20);

    public c() {
        char[] cArr = j.a;
    }

    public abstract T a();

    public T b() {
        T t = (l) this.a.poll();
        return t == null ? a() : t;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
