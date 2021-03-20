package b.h.a;

import b.h.a.j;
import b.h.a.q.i.c;
import b.h.a.q.i.e;

public abstract class j<CHILD extends j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public e<? super TranscodeType> f517h = c.f1000b;

    public final CHILD a() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Object clone() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
