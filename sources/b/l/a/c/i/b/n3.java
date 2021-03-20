package b.l.a.c.i.b;

import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@WorkerThread
public final class n3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final m3 f4165h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4166i;

    /* renamed from: j  reason: collision with root package name */
    public final Throwable f4167j;

    /* renamed from: k  reason: collision with root package name */
    public final byte[] f4168k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4169l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<String, List<String>> f4170m;

    public n3(String str, m3 m3Var, int i2, Throwable th, byte[] bArr, Map map) {
        Objects.requireNonNull(m3Var, "null reference");
        this.f4165h = m3Var;
        this.f4166i = i2;
        this.f4167j = th;
        this.f4168k = bArr;
        this.f4169l = str;
        this.f4170m = map;
    }

    public final void run() {
        this.f4165h.a(this.f4169l, this.f4166i, this.f4167j, this.f4168k, this.f4170m);
    }
}
