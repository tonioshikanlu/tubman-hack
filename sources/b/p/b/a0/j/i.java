package b.p.b.a0.j;

import b.p.b.a0.d;
import b.p.b.a0.j.s;
import java.util.Objects;

public class i extends d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6532i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f6533j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f6534k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(d dVar, String str, Object[] objArr, int i2, a aVar) {
        super(str, objArr);
        this.f6534k = dVar;
        this.f6532i = i2;
        this.f6533j = aVar;
    }

    public void a() {
        Objects.requireNonNull((s.a) this.f6534k.f6501q);
        synchronized (this.f6534k) {
            this.f6534k.A.remove(Integer.valueOf(this.f6532i));
        }
    }
}
