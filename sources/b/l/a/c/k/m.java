package b.l.a.c.k;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

public final class m implements l {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f4428b;
    public final e0<Void> c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f4429e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f4430g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4431h;

    public m(int i2, e0<Void> e0Var) {
        this.f4428b = i2;
        this.c = e0Var;
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            this.d++;
            c();
        }
    }

    public final void b(@NonNull Exception exc) {
        synchronized (this.a) {
            this.f4429e++;
            this.f4430g = exc;
            c();
        }
    }

    public final void c() {
        if (this.d + this.f4429e + this.f != this.f4428b) {
            return;
        }
        if (this.f4430g != null) {
            e0<Void> e0Var = this.c;
            int i2 = this.f4429e;
            int i3 = this.f4428b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            e0Var.p(new ExecutionException(sb.toString(), this.f4430g));
        } else if (this.f4431h) {
            this.c.r();
        } else {
            this.c.q(null);
        }
    }

    public final void d() {
        synchronized (this.a) {
            this.f++;
            this.f4431h = true;
            c();
        }
    }
}
