package b.p.b.a0.j;

import b.p.b.a0.d;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class f extends d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6520i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List f6521j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f6522k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, Object[] objArr, int i2, List list) {
        super(str, objArr);
        this.f6522k = dVar;
        this.f6520i = i2;
        this.f6521j = list;
    }

    public void a() {
        Objects.requireNonNull(this.f6522k.f6501q);
        try {
            this.f6522k.y.s(this.f6520i, a.CANCEL);
            synchronized (this.f6522k) {
                this.f6522k.A.remove(Integer.valueOf(this.f6520i));
            }
        } catch (IOException unused) {
        }
    }
}
