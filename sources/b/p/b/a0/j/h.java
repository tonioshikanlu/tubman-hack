package b.p.b.a0.j;

import b.p.b.a0.d;
import b.p.b.a0.j.s;
import java.io.IOException;
import java.util.Objects;
import o.e;

public class h extends d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6527i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f6528j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6529k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f6530l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f6531m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(d dVar, String str, Object[] objArr, int i2, e eVar, int i3, boolean z) {
        super(str, objArr);
        this.f6531m = dVar;
        this.f6527i = i2;
        this.f6528j = eVar;
        this.f6529k = i3;
        this.f6530l = z;
    }

    public void a() {
        try {
            s sVar = this.f6531m.f6501q;
            e eVar = this.f6528j;
            int i2 = this.f6529k;
            Objects.requireNonNull((s.a) sVar);
            eVar.skip((long) i2);
            this.f6531m.y.s(this.f6527i, a.CANCEL);
            synchronized (this.f6531m) {
                this.f6531m.A.remove(Integer.valueOf(this.f6527i));
            }
        } catch (IOException unused) {
        }
    }
}
