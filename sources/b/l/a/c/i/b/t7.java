package b.l.a.c.i.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class t7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4284h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4285i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4286j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p9 f4287k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f4288l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b8 f4289m;

    public t7(b8 b8Var, AtomicReference atomicReference, String str, String str2, p9 p9Var, boolean z) {
        this.f4289m = b8Var;
        this.f4284h = atomicReference;
        this.f4285i = str;
        this.f4286j = str2;
        this.f4287k = p9Var;
        this.f4288l = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<g9> b1;
        synchronized (this.f4284h) {
            try {
                b8 b8Var = this.f4289m;
                a3 a3Var = b8Var.d;
                if (a3Var == null) {
                    b8Var.a.a().f.d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f4285i, this.f4286j);
                    this.f4284h.set(Collections.emptyList());
                    this.f4284h.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f4287k, "null reference");
                    atomicReference2 = this.f4284h;
                    b1 = a3Var.O0(this.f4285i, this.f4286j, this.f4288l, this.f4287k);
                } else {
                    atomicReference2 = this.f4284h;
                    b1 = a3Var.b1((String) null, this.f4285i, this.f4286j, this.f4288l);
                }
                atomicReference2.set(b1);
                this.f4289m.s();
                atomicReference = this.f4284h;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f4289m.a.a().f.d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f4285i, e2);
                    this.f4284h.set(Collections.emptyList());
                    atomicReference = this.f4284h;
                } catch (Throwable th) {
                    this.f4284h.notify();
                    throw th;
                }
            }
        }
    }
}
