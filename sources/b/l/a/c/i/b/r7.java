package b.l.a.c.i.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class r7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4242h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4243i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4244j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p9 f4245k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b8 f4246l;

    public r7(b8 b8Var, AtomicReference atomicReference, String str, String str2, p9 p9Var) {
        this.f4246l = b8Var;
        this.f4242h = atomicReference;
        this.f4243i = str;
        this.f4244j = str2;
        this.f4245k = p9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<b> R0;
        synchronized (this.f4242h) {
            try {
                b8 b8Var = this.f4246l;
                a3 a3Var = b8Var.d;
                if (a3Var == null) {
                    b8Var.a.a().f.d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f4243i, this.f4244j);
                    this.f4242h.set(Collections.emptyList());
                    this.f4242h.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Objects.requireNonNull(this.f4245k, "null reference");
                    atomicReference2 = this.f4242h;
                    R0 = a3Var.r(this.f4243i, this.f4244j, this.f4245k);
                } else {
                    atomicReference2 = this.f4242h;
                    R0 = a3Var.R0((String) null, this.f4243i, this.f4244j);
                }
                atomicReference2.set(R0);
                this.f4246l.s();
                atomicReference = this.f4242h;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.f4246l.a.a().f.d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f4243i, e2);
                    this.f4242h.set(Collections.emptyList());
                    atomicReference = this.f4242h;
                } catch (Throwable th) {
                    this.f4242h.notify();
                    throw th;
                }
            }
        }
    }
}
