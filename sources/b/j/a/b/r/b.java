package b.j.a.b.r;

import b.j.a.b.i;
import b.j.a.b.j;

public abstract class b extends j {

    /* renamed from: i  reason: collision with root package name */
    public transient i f1460i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(i iVar, String str) {
        super(str, iVar == null ? null : iVar.Y());
        this.f1460i = iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(i iVar, String str, Throwable th) {
        super(str, iVar == null ? null : iVar.Y(), th);
        this.f1460i = iVar;
    }

    /* renamed from: d */
    public i c() {
        return this.f1460i;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
