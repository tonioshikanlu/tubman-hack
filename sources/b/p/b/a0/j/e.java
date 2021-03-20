package b.p.b.a0.j;

import b.p.b.a0.d;
import java.io.IOException;

public class e extends d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f6515i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f6516j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f6517k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r f6518l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f6519m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, String str, Object[] objArr, boolean z, int i2, int i3, r rVar) {
        super(str, objArr);
        this.f6519m = dVar;
        this.f6515i = z;
        this.f6516j = i2;
        this.f6517k = i3;
        this.f6518l = rVar;
    }

    public void a() {
        try {
            d dVar = this.f6519m;
            boolean z = this.f6515i;
            int i2 = this.f6516j;
            int i3 = this.f6517k;
            r rVar = this.f6518l;
            synchronized (dVar.y) {
                if (rVar != null) {
                    if (rVar.a == -1) {
                        rVar.a = System.nanoTime();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                dVar.y.c(z, i2, i3);
            }
        } catch (IOException unused) {
        }
    }
}
