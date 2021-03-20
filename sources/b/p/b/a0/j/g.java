package b.p.b.a0.j;

import b.p.b.a0.d;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class g extends d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6523i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List f6524j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f6525k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ d f6526l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, String str, Object[] objArr, int i2, List list, boolean z) {
        super(str, objArr);
        this.f6526l = dVar;
        this.f6523i = i2;
        this.f6524j = list;
        this.f6525k = z;
    }

    public void a() {
        Objects.requireNonNull(this.f6526l.f6501q);
        try {
            this.f6526l.y.s(this.f6523i, a.CANCEL);
            synchronized (this.f6526l) {
                this.f6526l.A.remove(Integer.valueOf(this.f6523i));
            }
        } catch (IOException unused) {
        }
    }
}
