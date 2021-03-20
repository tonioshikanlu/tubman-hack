package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.c0;

public final class jg implements ij<sk> {
    public final /* synthetic */ c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f3089b;
    public final /* synthetic */ og c;

    public jg(og ogVar, c0 c0Var, ei eiVar) {
        this.c = ogVar;
        this.a = c0Var;
        this.f3089b = eiVar;
    }

    public final void a(Object obj) {
        sk skVar = (sk) obj;
        il ilVar = new il();
        String str = skVar.f3275i;
        a.x(str);
        ilVar.f3072h = str;
        c0 c0Var = this.a;
        if (c0Var.f4943j || c0Var.f4941h != null) {
            String str2 = c0Var.f4941h;
            if (str2 == null) {
                ilVar.f3078n.f3245i.add("DISPLAY_NAME");
            } else {
                ilVar.f3073i = str2;
            }
        }
        c0 c0Var2 = this.a;
        if (c0Var2.f4944k || c0Var2.f4945l != null) {
            String str3 = c0Var2.f4942i;
            if (str3 == null) {
                ilVar.f3078n.f3245i.add("PHOTO_URL");
            } else {
                ilVar.f3077m = str3;
            }
        }
        og.c(this.c, this.f3089b, skVar, ilVar, this);
    }

    public final void d(@Nullable String str) {
        this.f3089b.f(a.T0(str));
    }
}
