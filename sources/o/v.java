package o;

import e.x.c.i;
import java.util.concurrent.atomic.AtomicReference;

public final class v {
    public static final u a = new u(new byte[0], 0, 0, false, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f10492b;
    public static final AtomicReference<u>[] c;
    public static final v d = new v();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10492b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        i.e(uVar, "segment");
        if (!(uVar.f == null && uVar.f10491g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!uVar.d) {
            Thread currentThread = Thread.currentThread();
            i.d(currentThread, "Thread.currentThread()");
            AtomicReference<u> atomicReference = c[(int) (currentThread.getId() & (((long) f10492b) - 1))];
            u uVar2 = atomicReference.get();
            if (uVar2 != a) {
                int i2 = uVar2 != null ? uVar2.c : 0;
                if (i2 < 65536) {
                    uVar.f = uVar2;
                    uVar.f10489b = 0;
                    uVar.c = i2 + 8192;
                    if (!atomicReference.compareAndSet(uVar2, uVar)) {
                        uVar.f = null;
                    }
                }
            }
        }
    }

    public static final u b() {
        Thread currentThread = Thread.currentThread();
        i.d(currentThread, "Thread.currentThread()");
        AtomicReference<u> atomicReference = c[(int) (currentThread.getId() & (((long) f10492b) - 1))];
        u uVar = a;
        u andSet = atomicReference.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            atomicReference.set((Object) null);
            return new u();
        }
        atomicReference.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
