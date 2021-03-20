package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.e0.z.j;
import b.l.e.f0.a;
import b.l.e.g0.c;
import b.l.e.k;
import java.lang.reflect.Field;

public class i extends j.b {
    public final /* synthetic */ Field d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f5470e;
    public final /* synthetic */ b0 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k f5471g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f5472h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f5473i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, boolean z, boolean z2, Field field, boolean z3, b0 b0Var, k kVar, a aVar, boolean z4) {
        super(str, z, z2);
        this.d = field;
        this.f5470e = z3;
        this.f = b0Var;
        this.f5471g = kVar;
        this.f5472h = aVar;
        this.f5473i = z4;
    }

    public void a(b.l.e.g0.a aVar, Object obj) {
        Object a = this.f.a(aVar);
        if (a != null || !this.f5473i) {
            this.d.set(obj, a);
        }
    }

    public void b(c cVar, Object obj) {
        b0 b0Var;
        Object obj2 = this.d.get(obj);
        if (this.f5470e) {
            b0Var = this.f;
        } else {
            b0Var = new n(this.f5471g, this.f, this.f5472h.f5519b);
        }
        b0Var.b(cVar, obj2);
    }

    public boolean c(Object obj) {
        return this.f5480b && this.d.get(obj) != obj;
    }
}
